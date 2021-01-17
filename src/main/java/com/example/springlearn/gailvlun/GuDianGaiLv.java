package com.example.springlearn.gailvlun;

import java.util.HashMap;
import java.util.Map;

public class GuDianGaiLv {
    //1.1同时抛2枚均匀的骰子，求抛出的2个数字之和为奇数的概率
    public static float getProbability(Integer spaceNum){
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
        System.out.println(divisibleProbability(1l,2000l,new Long[]{6l,8l}));
    }

    //在1~2000的整数中随机地取一个数，问取到的整数即不能为6整除，又不能被8整除的概率是多少？
    public static ResultDivisible divisibleProbability(Long beginNum, Long endNum, Long divisibleNum){
        Long num = endNum + 1 - beginNum;
        Long count = num/divisibleNum;
        return new ResultDivisible(num,count);
    }

    public static double divisibleProbability(Long beginNum,Long endNum,Long[] divisibleNum){
        //1-pa-pb+pab=1-(pa+pb-pab)
        ResultDivisible pa=divisibleProbability(beginNum,endNum,divisibleNum[0]);
        ResultDivisible pb=divisibleProbability(beginNum,endNum,divisibleNum[1]);
        ResultDivisible pTemp=Utils.addResultDivisible(pa,pb);
        //获取最小公倍数的算法
        ResultDivisible pTemp2=divisibleProbability(beginNum,endNum,Utils.leastCommonMultiple(divisibleNum[0],divisibleNum[1]));
        return 1-pTemp.getValue()+pTemp2.getValue();
    }
}
