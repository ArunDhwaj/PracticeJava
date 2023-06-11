package org.sbp;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.sbp.lambda.LambdaTest;
import org.sbp.multithreads.AnotherThread;
import org.sbp.multithreads.MyRunnable;
import org.sbp.multithreads.ThreadCountExperment;
import org.sbp.multithreads.ThreadExperiment;
import org.sbp.oop.collections.MyDeque;
import org.sbp.oop.inheritance.Employee;
import org.sbp.qa.MyList;
import org.sbp.lambda.Product;

import static org.sbp.multithreads.ThreadColor.ANSI_BLUE;
import static org.sbp.multithreads.ThreadColor.ANSI_PURPLE;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Inheritance practice
//        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
//        System.out.println(tim);
//        System.out.println("Age = " + tim.getAge());
//        System.out.println("Pay = " + tim.collectPay());
//
//        Employee joe = new Employee("Joe", "11/11/1990",
//                "03/03/2020");
//        System.out.println(joe);
//
//        Employee aarush = new Employee("Aarush", "07/05/2008",
//                "16/04/2023");
//        System.out.println(aarush);

        /*
        // Collections practice
        MyDeque myDeque = new MyDeque();
        myDeque.demo();
        */

        /*
        //Generic test of List
        MyList myList = new MyList();
//        myList.demo1();
//        myList.demo2();
        myList.demo5();
        */

        //Lambda Test
//        LambdaTest lambdaTest = new LambdaTest();
//        //lambdaTest.compratorDemo();
//        lambdaTest.eventListner();
//
//        ThreadExperiment threadExperiment = new ThreadExperiment();
//        threadExperiment.experiment();

        ThreadCountExperment threadCountExperment = new ThreadCountExperment();
        threadCountExperment.experiment();
    }
}
