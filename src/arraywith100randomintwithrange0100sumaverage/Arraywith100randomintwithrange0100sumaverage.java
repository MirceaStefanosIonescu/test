/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraywith100randomintwithrange0100sumaverage;

import java.util.Random;

/**
 *
 * @author Mircea
 */
public class Arraywith100randomintwithrange0100sumaverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [] array;
    int randomNumber;
     array= new int[100];
        Random rand= new Random();
        int sum=0;
        double average;
    for (int i=0; i<100; i=i+1){
        array[i]=randomNumber= rand.nextInt((100-0)+1)+0;
        System.out.println(array[i]);
        sum=sum+array[i];
        
    }
average= sum/100;
        System.out.println("The sum of the numbers in the array is: "+sum);
        System.out.println("Tha average of the numbers in tha array is: "+average);
    }
}

    
