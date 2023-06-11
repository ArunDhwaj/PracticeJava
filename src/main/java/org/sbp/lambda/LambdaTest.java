package org.sbp.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaTest {

    public LambdaTest()
    {

    }

    public void compratorDemo() {

        List<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + ", " + p.name + " , " + p.price);
        }
    }

    public void eventListner()
    {
        JTextField tf = new JTextField();
        tf.setBounds(50, 50,400,20);
        JButton b = new JButton("click");
        b.setBounds(80,100,200,30);

        // lambda expression implementing here.
        b.addActionListener(e-> {tf.setText("hello swing");});

        JFrame f = new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(600, 500);
        f.setVisible(true);
    }
}
