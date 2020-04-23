package ru.startandroid.lesson1;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;

import java.util.List;

import static android.content.ContentValues.TAG;

class MyPositionalDataSource extends PositionalDataSource<Employee> {

    private final EmployeeStorage employeeStorage;

    public MyPositionalDataSource(EmployeeStorage employeeStorage) {
        this.employeeStorage = employeeStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Employee> callback) {
        List<Employee> result = employeeStorage.getData(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(result, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Employee> callback) {
        List<Employee> result = employeeStorage.getData(params.startPosition, params.loadSize);
        callback.onResult(result);
    }

}
