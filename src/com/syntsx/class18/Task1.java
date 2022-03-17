package com.syntsx.class18;

public class Task1 {

    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.

     */

int sum;
    int sumOfElements (int[] i){
        for(int a=0;a<i.length;a++){
            sum+=i[a];


        }


        return sum;


    }

    public static void main(String[] args) {
        int []i={10,10,10};
        Task1 obj=new Task1();
        System.out.println(obj.sumOfElements(i));
    }


}
