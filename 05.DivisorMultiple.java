/*
 *Author: Create by 李呈云
 *Description: 输入两个正整数m和n，求其最大公约数和最小公倍数。
 *Date: 2016-9-4 下午7:28:48  
 */

public class DivisorMultiple {
	public static void main(String[] args){
		int a = 15;
		int b = 40;
		DivisorMultiple dm = new DivisorMultiple();
		System.out.println("两数的最小公约数：" + dm.lMultiple(a, b));
		System.out.println("两数的最大公倍数：" + dm.gDivisor(a, b));
	}
	/*
	 * 方法说明：最大公约数
	 */
	public int lMultiple(int a, int b){
		//返回值
		int gdivisor = 1;
		int iTemp;
		if(a > b){
			iTemp = b;
		}else{
			iTemp = a;
		}
		for(int i = 2; i < iTemp; i++){
			if((a % i == 0) && (b % i == 0)){
				gdivisor = i;
			}
		}
		return gdivisor;
	}
	/*
	 * 方法说明：最大公倍数
	 */
	public int gDivisor(int a, int b){
		//初始的最大公倍数
		int lmultiple = a * b;
		//a的倍数
		int ai = 2;
		int aTemp = a;
		//b的倍数
		int bi = 2;
		int bTemp = b;
		//for循环求出最大公倍数
		for(int i = 0; i < a * b; i++){
			if(aTemp == bTemp){
				lmultiple = aTemp;
				break;
			}else if(aTemp > bTemp){
				bTemp = b * bi;
				bi++;
			}else{
				aTemp = a * ai;
				ai++;
			}
		}
		return lmultiple;
	}
}
