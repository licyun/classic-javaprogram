/*
 *Author: Create by 李呈云
 *Description: 将一个正整数分解质因数
 *Date: 2016-9-4 下午5:33:52  
 */

import java.util.*; 

public class PrimeFactor {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个大于5的正整数:");
		int x = in.nextInt();
		PrimeFactor pf = new PrimeFactor();
		pf.primeFactor(x);
	}
	/*
	 * 方法说明：将一个整数分解质因数
	 */
	public void primeFactor(int i){
		//判断最后的质数是否能被整除
		boolean canRe = true;
		//能被整除则继续循环
		while(canRe){
			for(int j = 2; j < i/2; j++){
				if((i % j) == 0){
					//将质数赋值给i
					i = i / j;
					//输出因数
					System.out.print(j +"*");
					//判断质数是否为素数
					canRe = !isPrime(i);
					//当质数为最后一位时输出本身
					if(!canRe) System.out.print(i );
					break;
				}
			}
		}
	}
	/*
	 * 方法说明：判断一个数是否为素数
	 */
	public boolean isPrime(int i){
		boolean isPrime = true;
		for(int j = 2; j < (i/2); j++){
			//不为素数跳出循环，并置isPrime 为false
			if(i%j == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
