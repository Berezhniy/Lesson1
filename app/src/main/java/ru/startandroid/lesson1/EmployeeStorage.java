package ru.startandroid.lesson1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage {
    ArrayList<Employee> employeeList = new ArrayList<>();


    public void createEmployees() {
        for (int i = 1; i <= 100; i++) {
            employeeList.add(new Employee("name" + i, i * 1000));
        }
    }





//    Employee employee1 = new Employee("name1",1000);
//    Employee employee2 = new Employee("name2",2000);
//    Employee employee3 = new Employee("name3",3000);
//    Employee employee4 = new Employee("name4",4000);
//    Employee employee5 = new Employee("name5",5000);
//    Employee employee6 = new Employee("name6",6000);
//    Employee employee7 = new Employee("name7",7000);
//    Employee employee8 = new Employee("name8",8000);
//    Employee employee9 = new Employee("name9",8000);
//    Employee employee10 = new Employee("name10",10000);
//    Employee employee11 = new Employee("name11",11000);
//    Employee employee12 = new Employee("name12",12000);
//    Employee employee13 = new Employee("name13",13000);
//    Employee employee14 = new Employee("name14",14000);
//    Employee employee15 = new Employee("name15",15000);
//    Employee employee16 = new Employee("name16",16000);
//    Employee employee17 = new Employee("name17",17000);
//    Employee employee18 = new Employee("name18",18000);
//    Employee employee19 = new Employee("name19",19000);
//    Employee employee20 = new Employee("name20",20000);
//    Employee employee21 = new Employee("name21",21000);
//    Employee employee22 = new Employee("name22",22000);
//    Employee employee23 = new Employee("name23",23000);
//    Employee employee24 = new Employee("name24",24000);
//    Employee employee25 = new Employee("name25",25000);
//    Employee employee26 = new Employee("name26",26000);
//    Employee employee27 = new Employee("name27",27000);
//    Employee employee28 = new Employee("name28",28000);
//    Employee employee29 = new Employee("name29",29000);
//    Employee employee30 = new Employee("name30",30000);
//    Employee employee31 = new Employee("name31",31000);
//    Employee employee32 = new Employee("name32",32000);
//    Employee employee33 = new Employee("name33",33000);
//    Employee employee34 = new Employee("name34",34000);
//    Employee employee35 = new Employee("name35",35000);
//    Employee employee36 = new Employee("name36",36000);
//    Employee employee37 = new Employee("name37",37000);
//    Employee employee38 = new Employee("name38",38000);
//    Employee employee39 = new Employee("name39",39000);
//    Employee employee40 = new Employee("name40",40000);

}
