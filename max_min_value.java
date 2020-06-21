import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//隨機創造一整數陣列，取出最大值、最小值，並計算平均。

public class max_min_value {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] x = new int[10];
		int max,min;
		int ave;
		max = Integer.MAX_VALUE +1;
		min = Integer.MIN_VALUE -1;
		for (int i=0 ; i<x.length ; i++) {
			x[i] = rand.nextInt(100)+1;
			if(x[i] > max) {
				max = x[i];
			}
			if(x[i] < min) {
				min = x[i];
			}
		}
		Arrays.sort(x);
		System.out.println("Array is : \n" + Arrays.toString(x));
		System.out.println("Max is:" + max + "\n" + "Min is:" + min);
		ave = ((max + min) / 2);
		System.out.println("Average is :" + ave);
	}
}