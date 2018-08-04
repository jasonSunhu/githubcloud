package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/2.
 * 实现字符串多个空格转换一个空格
 */
public class ReplaceWithSingleCharacter {
    public static void main(String[] args) {
        String r = repaceWhiteSapce("Hello   world I  come from      china");
        System.out.println(r);
    }
    public static String repaceWhiteSapce(String original){
        StringBuilder sb = new StringBuilder();
        boolean isFirstSpace = false;//标记是否是第一个空格
//        original = original.trim();//如果考虑开头和结尾有空格的情形
        char c;
        for(int i = 0; i < original.length(); i++){
            c = original.charAt(i);
            if(c == ' ' || c == '\t')//遇到空格字符时,先判断是不是第一个空格字符
            {
                if(!isFirstSpace)
                {
                    sb.append(c);
                    isFirstSpace = true;
                }
            }
            else{//遇到非空格字符时
                sb.append(c);
                isFirstSpace = false;
            }
        }
        return sb.toString();
    }
}
