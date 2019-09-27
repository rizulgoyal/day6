package com.lambton;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {



        int a = 100;
        int b=10;
        int c;
        String name = "Hello";

        int x[] = {1,2,3};
        System.out.println("START");

        Student s1= new Student(1,"Pritesh");
        System.out.println(s1);

        try {

            x[2] = 1000;
            c = a / b;
            System.out.println("C :" + c);


        if (b != 10) {
        throw new ArithmeticException("Don't Divide by 10");
        }

        if(name.length()<10)
        {
            throw new NameLengthException("Name must have 10  characters");

        }
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.toString());
            //System.out.println("Divisible by zero not possible");
        }
        catch (ArrayIndexOutOfBoundsException aob)
        {
            System.out.println("Array index is not available");
        }

        catch (NameLengthException nae)
        {
            System.out.println(nae.toString());
        }
        finally {
            System.out.println("I am in Finally Block");
        }



        System.out.println("END");

        //System.gc();

        try {
            s1.display();
        } catch (NameLengthException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
