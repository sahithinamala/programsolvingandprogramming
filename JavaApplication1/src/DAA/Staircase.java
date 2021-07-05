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
public class Staircase{
    public static boolean IsIn(int g[][],int a[]){
        int temp=0;
        for(int i=0;i<g.length;i++){
            if(rowNUm(g,a,i)){
              temp=1;
            }
        }
        if(temp==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean rowNUm(int g[][],int a[],int b){
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=g[b][i]){
                temp=1;
            }
        }
        if(temp==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void Stair(int n){
        int g[]=new int[n];
        for(int i=0;i<n;i++){
            g[i]=1;
            System.out.print("1");
        }
        System.out.println();
           int x=0;
            for(int i=0;i<n/2;i++){
                g[i]=g[i]+1;
                x=x+1;
                g[n-x]=g[n-x]-1;
                comb(g,0,n-i);
            }
    }
    static ArrayList<Integer> d=new ArrayList<Integer>();
    public static void comb(int a[],int l,int r){
        int temp=0;
        if(l==r){
          for(int i=0;i<a.length;i++) {
              if (a[i] != 0) {
                  // System.out.print(a[i]);
                  temp = temp * 10 + a[i];
              }
              if (i == a.length - 1 && !d.contains(temp)) {
                  System.out.println(temp);
                  d.add(temp);
                  temp = 0;
              }
          }
        }
        else{
          for(int i=l;i<r;i++){
                  swap(a, l, i);
                  comb(a, l + 1, r);
                  swap(a, l, i);
          }
        }
    }
    public static void swap(int a[],int b,int c){
      int temp=a[b];
      a[b]=a[c];
      a[c]=temp;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of steps");
        Scanner ob=new Scanner(System.in);
        int st=ob.nextInt();
        Stair(st);
    }
 }

       
    