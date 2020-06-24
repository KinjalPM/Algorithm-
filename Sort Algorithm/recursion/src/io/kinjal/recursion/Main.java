package io.kinjal.recursion;

public class Main {

    public static void main(String[] args) {

        int n = 4;
       System.out.println(recurisveFactorial(n));
        System.out.println(iterativeFactorial(n));
    }

    public static int recurisveFactorial(int n){
        if(n==0){
            return 1;
        }
        return n * recurisveFactorial(n-1);
    }
    public static int iterativeFactorial(int n){
        if(n==0){
            return 1;
        }
            int fact = 1;
            // iterative method
            for (int i=1; i<=n;i++){
                fact*=i;
            }
        return fact;
    }


}
