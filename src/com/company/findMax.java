package com.company;

import java.util.Arrays;
import java.util.Random;

public class findMax  {
    int [] data;


    public findMax(int size){
        Random rand = new Random();
        data = new int [size];
        for (int i = 0; i<data.length-1; i++) {
            data[i]= rand.nextInt(10000);
        }

    }
    public findMax(int[] data){
        this.data = data;
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }


    public int [] bruteForce (int size){
        int res[] = new int [size];
        int temp[] = new int [size];
        int arr[] = data.clone();

        res[0]=arr[0];
        for(int ii = 0; ii<size; ii++)
        for (int i =0 ; i< arr.length; i++){

            if (res[ii]<arr[i] && !contains(temp, i)){
                res[ii]=arr[i];
                temp[ii]=i;
            }
        }
        for (int i = 0; i<res.length; i++) {
            System.out.println(res[i]);
        }
        return res;
    }

    public int [] search(int size) {
        int res [] = new int [size];
        int arr[] = data.clone();
        int exit = 0;
        res[0] = arr[0];
        for(int i = 0; i<arr.length; i++){
            for(int j = arr.length/2 - i/2; j>=0 ;j--){
                if (2*j+2 <= arr.length-1-i) {
                    if (arr[2*j+1] > arr[2*j+2]) {
                        if (arr[j] < arr[2*j+1]) {
                            swap(arr,j, 2*j+1);
                        }
                    }
                    else
                    if (arr[j] < arr[2*j+2]) {
                        swap(arr,j, 2*j+2);
                    }
                }
                else
                if (2 * j + 1 <= arr.length - 1-i)
                    if (arr[j] < arr[2 * j + 1])
                        swap(arr,j, 2 * j + 1);
            }
            swap(arr,0, arr.length-1-i);
            res[exit]=arr[arr.length-1-i];
            exit++;
            if(exit == size)
                break;
        }
        for (int i = 0; i<res.length; i++) {
            System.out.println(res[i]);
        }
        return res;
    }


    public void swap (int[] arr, int ind, int secInd ){
        int temp = arr[ind];
        arr[ind] = arr[secInd];
        arr[secInd]=temp;
    }


}
