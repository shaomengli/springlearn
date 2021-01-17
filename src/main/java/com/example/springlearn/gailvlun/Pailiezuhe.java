package com.example.springlearn.gailvlun;

public class Pailiezuhe {
    public static void main(String[] args){
        System.out.println("拿到4张牌的点数相同的概率");
        C c1=new C(52l,5l);//52张中取出5张,c(52,5)
        double huase=52/4.0;
        C c2=new C(52-4l,1l);//c(52-4,1)
        double result1=huase*C.getResult(c2.getN(),c2.getR())/C.getResult(c1.getN(),c1.getR());
    }
}
