package com.easemob.msync.ng;

public class Test2 {
	public static void main(String[] args) {
		String ss ="{speed,5000},{read, true},{sleep_time, 1000},{rate_list,<==ML==<==LL==0,0==LR==>,<==LL==2000,0==LR==>,<==LL==2001,80==LR==>==MR==>},{member_num_to_down_speed,<==ML==<==LL==0,1000==LR==>,<==LL==1000,30==LR==>,<==LL==3000,10==LR==>==MR==>},{statistics_expire_time, 1000},{refresh_interval, 60000}";
		String[] kvStr = ss.split("},\\{");
		System.out.println(kvStr.length);
	}
}
