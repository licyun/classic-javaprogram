/*
 *Author: Create by 李呈云
 *Description: 判断101-200之间有多少个素数，并输出所有素数。
 *Date: 2016-9-4 下午4:35:31  
 */

public class Prime {
	public static void main(String[] args){
		//素数的个数
		int iPrime = 0;
		for(int i = 101; i < 200; i++){
			//判断是否为素数
			boolean isPrime = true;
			for(int j = 2; j < (i/2); j++){
				//不为素数跳出循环，并置isPrime 为false
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			//但结果为素数时输出并将iprime个数加一
			if(isPrime){
				System.out.println(i);
				iPrime++;
			}
		}
		System.out.println("素数的个数为:"+ iPrime);
	}
}
