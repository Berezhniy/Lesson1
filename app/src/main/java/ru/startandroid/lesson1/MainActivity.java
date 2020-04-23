package ru.startandroid.lesson1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView recyclerView;
    private EmployeeAdapter adapter;
    private Executor executor;
    private DiffUtil.ItemCallback<Employee> DIFF_CALLBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// DataSource
        MyPositionalDataSource dataSource = new MyPositionalDataSource(new EmployeeStorage());


        // PagedList
        PagedList.Config config = new PagedList.Config.Builder()
                .setEnablePlaceholders(false)
                .setPageSize(10)
                .build();

        PagedList<Employee> pagedList = new PagedList.Builder<>(dataSource, config)
                .setFetchExecutor(executor)
                .build();


// Adapter
        adapter = new EmployeeAdapter(DIFF_CALLBACK);
        adapter.submitList(pagedList);


// RecyclerView
        recyclerView.setAdapter(adapter);
    }



}

