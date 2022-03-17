package com.enumqq;

public class EnumTest {
    public static void main(String[] args) {
        Result r=divide(19,0);
        System.out.println(r==Result.SUCCESS ?"计算成功":"计算失败" );
    }
    public static Result divide(int a,int b){
        try{
            int c=a/b;
            return Result.SUCCESS;
        }
        catch (Exception e){
            return Result.FAIL;
        }
    }
}
enum Result{
    SUCCESS,FAIL
        }
