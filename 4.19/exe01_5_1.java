package com.itheima;
public class exe01_5_1{
    public static void main(String[]args){
        int result=divide(4,0);
        System.out.println(result);
    }
    public static int divide(int x,int y){
        int result=x/y;
        return result;
    }
}