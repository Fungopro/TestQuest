package com.company;

import java.math.BigInteger;
import java.util.Random;

import static java.lang.Math.abs;

public class getSumma {
    int integer;
    BigInteger bigInteger;

    public getSumma(int data){
        integer = abs(data);
        bigInteger = BigInteger.valueOf(data).abs();
    }

    public getSumma(){
        Random rand = new Random();
        integer = rand.nextInt(100000000);
    }

    public int imporovization (){
        int res;
        String str = String.valueOf(abs(integer));
        res = str.chars().map(Character::getNumericValue).sum();
        return res;
    }

    public int imporovizationBigInt (){
        int res;
        String str = bigInteger.toString();
        res = str.chars().map(Character::getNumericValue).sum();
        return res;
    }

    public int normal (){
        int res=0;
        while (integer%10!=0){
            res+=integer%10;
            integer/=10;
        }
        return res;
    }
    public int normalBigInt (){
        int res=0;
        while (bigInteger.mod(BigInteger.valueOf(10)).intValue() != 0){
            res+=bigInteger.mod(BigInteger.valueOf(10)).intValue();
            bigInteger=bigInteger.divide(BigInteger.valueOf(10));
        }
        return res;
    }

}
