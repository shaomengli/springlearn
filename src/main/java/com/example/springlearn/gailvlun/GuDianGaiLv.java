package com.example.springlearn.gailvlun;

public class GuDianGaiLv {
    //1.1同时抛2枚均匀的骰子，求抛出的2个数字之和为奇数的概率
    public float getProbability(Integer spaceNum){
        float totalConditionNum=0f;
        for(int x=1;x<=spaceNum;x++){
            for(int y=1;y<=spaceNum;y++){
                if((x+y)%2==1)
                {
                    totalConditionNum++;
                }
            }
        }
        return totalConditionNum/(spaceNum*spaceNum);
    }
    public static void main(String[] args){
        GuDianGaiLv guDianGaiLv=new GuDianGaiLv();
        System.out.println(guDianGaiLv.getProbability(6));
    }
}
