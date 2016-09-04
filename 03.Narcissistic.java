/*
 *Author: Create by 李呈云
 *Description: 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
 *其各位数字立方和等于该数本身
 *Date: 2016-9-4 下午4:54:48  
 */


public class Narcissistic {
	public static void main(String[] args){
		for(int i = 100; i < 1000; i ++){
			int iTemp;
			//获取个位
			int one = i % 10;
			iTemp = i / 10;
			//获取十位
			int ten = iTemp % 10;
			//获取百位
			int hundred = iTemp / 10;
			//各位数字立方和
			int sum = one*one*one + ten*ten*ten + hundred*hundred*hundred;
			if(sum == i){
				System.out.println(i);
			}
		}
	}
}
