import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//public class _interview2 {
//	public static void main(String[] args) {
//		int [] arr = new int [10];
//		for (int i=0 ; i < arr.length; i++) {
//			int number = (int)(Math.random()*100);
//			arr[i] = number;
//			System.out.print(arr);
//		}
//
//	}
//}
public class _interview2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] x = new int[10];
		int max,min;
		float ave;
		max = x[0];
		min = x[0];
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
		ave = (float) ((max + min) / x.length);
		System.out.println("Average is :" + ave);
	}
}