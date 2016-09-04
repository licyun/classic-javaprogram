/*
 *Author: Create by 李呈云
 *Description: 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *Date: 2016-9-4 下午3:58:01  
 */

public class Rabbit {
	public static void main(String[] args){
		int i;
		int arr[] = new int[36];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		System.out.println("第1个月有兔子1对,总数是2");
		System.out.println("第2个月有兔子1对,总数是2");
		System.out.println("第3个月有兔子2对,总数是4");
		for(i = 3; i < 36; i ++){
			arr[i] = arr[i-2] + arr[i-1];
			System.out.println("第"+ (i+1) +"个月有兔子"+ arr[i] +"对,总数是"+ 2*arr[i] );
		}
	}
}
