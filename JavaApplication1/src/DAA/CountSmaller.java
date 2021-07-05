/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAA;


/**
 *
 * @author namal
 */

import java.util.*;


public class CountSmaller{
    public static void Sub(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            String a="";
            if(str.charAt(i)=='A'){
                for(int j=i;j<str.length();j++){
                    a=a+str.charAt(j);
                    if(str.charAt(j)=='B'){
                        count=count+1;
                        System.out.println(a);
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        Sub(s);

    }
}