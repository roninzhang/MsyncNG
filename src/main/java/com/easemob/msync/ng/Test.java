package com.easemob.msync.ng;

public class Test {
	private static String MR = "==MR==>"; //]
	private static String ML = "<==ML=="; //[
	private static String LR = "==LR==>"; //}
	private static String LL = "<==LL=="; //{
	public static void main(String[] args) {
		 
        String str = "<==ML==<==LL==speed,5000==LR==>,<==LL==member_num_to_down_speed,<==ML==<==LL==0,1000==LR==>,<==LL==1000,30==LR==>,<==LL==3000,10==LR==>==MR==>==LR==>,<==LL==rate_list,<==ML==<==LL==0,0==LR==>,<==LL==2000,0==LR==>,<==LL==2001,80==LR==>==MR==>==LR==>,<==LL==read, true==LR==>,<==LL==refresh_interval, 60000==LR==>==LR==>,<==LL==sleep_time, 1000==LR==>,<==LL==statistics_expire_time, 1000==MR==>";

        String result = str.replace(MR, "]").replace(ML, "[").replace(LR, "}").replace(LL, "{");
    	System.out.println("=========>" + result);
    }
 
    public static void sortString(String[] arr) {
 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
 
                if(arr[i].compareTo(arr[j])>0)//字符串比较用compareTo方法
                    swap(arr,i,j);
            }
        }
    }
 
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i] + "]");
        }
    }
}
