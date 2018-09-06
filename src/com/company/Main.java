package com.company;

//FunctionalInterface annotation is used to ensure that the functional interface can't have more than one
//abstract method. In case more than one abstract methods are present, the compiler flags
//an 'Unexpected @FunctionalInterface annotation' message.
@FunctionalInterface
interface Square
{
    int calculate(int x);
}

public class Main {

    public static void main(String[] args) {
	    int a = 3;

	    // Lambda expression to definite the calculate method
        Square s = (int x)->x*x;

        int answer = s.calculate(a);
        System.out.println(answer);
    }
}
