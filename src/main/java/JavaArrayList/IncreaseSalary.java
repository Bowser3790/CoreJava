package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class IncreaseSalary {
    public static void main(String[] args) {
        // Create a salary list and increase the salary 10% if the salary is less than $5000
        // note that this means we are changing the element that is less than 5000
        // in this case we should use the set method.
        // to multiply an integer by a percentage (10%) you need to multiply by 1.10 which is a double

        List<Double> salaries = new ArrayList<>();
        salaries.add(22000.0);
        salaries.add(4000.0);
        salaries.add(1900.0);
        salaries.add(8000.0);

        // Way #1)
        for (Double w : salaries){
            if (w<5000){
                salaries.set(salaries.indexOf(w), w*1.1);
            }

        }
        System.out.println(salaries);

        // Way #2

        for (Double w : salaries){
            if(w>5000){
                continue;
            }else{
                salaries.set(salaries.indexOf(w), w*1.1);
            }
        }
        System.out.println(salaries);

    }
}
