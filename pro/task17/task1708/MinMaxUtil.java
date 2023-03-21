package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/



public class MinMaxUtil {
    public static void main(String[]args){
        min(48,22,34,12);

        max(15,22,38);
    }

    public static int max(int a,int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        System.out.println(result);
        return result;
    }

    public static int max(int a,int b,int c){
        int result=Integer.MIN_VALUE;
        int[]arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        for (int number:arr){
            if(number>result){
                result=number;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int max(int a,int b,int c,int d){
        int result=Integer.MIN_VALUE;
        int[]arr=new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        for (int number:arr){
            if(number>result){
                result=number;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int max(int a,int b,int c,int d,int e){
        int result=Integer.MIN_VALUE;
        int[]arr=new int[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        for (int number:arr){
            if(number>result){
                result=number;
            }
        }
        System.out.println(result);
        return result;
    }


   public static int min(int a,int b){
       int result=0;
       if (a<b){
           result=a;
       }else{result=b;}
       System.out.println(result);
       return result;

   }
   public static int min(int a,int b,int c){
       int result=Integer.MAX_VALUE;
       int[]arr=new int[3];
       arr[0]=a;
       arr[1]=b;
       arr[2]=c;
       for (int number:arr){
           if(number<result){
               result=number;
           }
       }
       System.out.println(result);
       return result;
   }

    public static int min(int a,int b,int c,int d){
        int result=Integer.MAX_VALUE;
        int[]arr=new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        for (int number:arr){
            if(number<result){
                result=number;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int min(int a,int b,int c,int d,int e){
        int result=Integer.MAX_VALUE;
        int[]arr=new int[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        for (int number:arr){
            if(number<result){
                result=number;
            }
        }
        System.out.println(result);
        return result;
    }
}
