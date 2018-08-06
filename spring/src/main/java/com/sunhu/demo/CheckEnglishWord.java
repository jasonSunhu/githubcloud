package com.sunhu.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/8/5.
 * 检查字符串回文，实现英文中单词个数和单词次数统计
 */
public class CheckEnglishWord {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> wordMap=new HashMap<String,Integer>();
        System.out.println("Please input a String ...");
        String testString=sc.nextLine();
        sc.close();
        String[] stringArray=testString.split(" ");

        String word=null;
        for(String e:stringArray){
            word=e.trim();
            if(word.equals("")) continue;
            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word)+1);
            }else{
                wordMap.put(word,1);
            }
        }
        for(String e:wordMap.keySet()){
            System.out.printf("The String contains word %s %s times.\n",e,wordMap.get(e));
        }
    }
}
