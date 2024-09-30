package examples;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<Integer> employeeSalaryList = new ArrayList<>();
        employeeSalaryList.add(10000);
        employeeSalaryList.add(12000);
        employeeSalaryList.add(8000);
        employeeSalaryList.add(16500);
        employeeSalaryList.add(6000);

        /* Get the number of employees with more than 10 000 salary */

        // Using for loop
        int count = 0;
        for (Integer salary : employeeSalaryList) {
            if(salary > 10000) count++;
        }

        System.out.println("No of Employees (Without using stream) : " + count);


        // Using Stream
        long employCount = employeeSalaryList.stream().filter(salary -> salary > 10000).count();
        System.out.println("No of Employees (Using stream) : " + employCount);

    }
}
