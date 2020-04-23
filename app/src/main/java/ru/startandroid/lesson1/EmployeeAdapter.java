package ru.startandroid.lesson1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class EmployeeAdapter extends PagedListAdapter<Employee, EmployeeAdapter.EmployeeViewHolder> {
    private List<Employee> employeeList = new ArrayList<>();

    class EmployeeViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView salary;

        public EmployeeViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            salary = itemView.findViewById(R.id.tv_salary);
        }

        public void bind(Employee employee) {
            name.setText(employee.getName());
            salary.setText(employee.getSalary());
        }


    }
    protected EmployeeAdapter(DiffUtil.ItemCallback<Employee> diffUtilCallback) {
        super(diffUtilCallback);
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//создание ViewHolder
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new EmployeeViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final EmployeeViewHolder holder, final int position) {
        holder.bind(employeeList.get(position));
    }

    @Override
    public int getItemCount() {
        return employeeList.size();//размер списка
    }

    public void setItems(Collection<Employee> employees) {//добавление списка
        employeeList.addAll(employees);
        notifyDataSetChanged();
    }


}