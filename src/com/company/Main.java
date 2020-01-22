package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            f(0);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Here I am after the NP exception");
        }

        System.out.println();

        try {
            f(8);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Again reached");
        }
    }

    public static void f(int index) throws Exc1, Exc2 {
        String[] arr = new String[2];
        if (index > arr.length)
        {
            throw new Exc1("out of the bounds");
        }
        else if (arr[index] == null)
        {
            throw new Exc2("NPE");
        }

    }
}
