package com.recursion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(iterativeFactorial(3));
    }

    public static int iterativeFactorial(int num) {
        int factorial = 1;

        if (num == 0) { return 1; }
        for (int i = 0; i <= num; i++) {factorial *= i;}

        return factorial;
    }
}
