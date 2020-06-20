import java.awt.*;
import java.awt.List;
import java.util.ArrayList;
import java.awt.List;
import java.util.Scanner;

public class _interview1 {
	public static void main(String[]args) {
		
//		輸入一陣列，例如[1,2,3,4,5,6,7,8,9]
//		取任意三個數字，加總起來等於8
//		並輸出答案[1,2,5]、[1,3,4]
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int sum,number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println("Number is :" + number);
		sum = scanner.nextInt();
		System.out.println("Sum is :" + sum);
		for (int i = 1 ; i <= number; i++) {
			arrlist.add(i);
		}
		for (int i = 0 ; i<arrlist.size()-2;i++) {
			for(int j = i+1 ; j<arrlist.size()-1 ; j++) {
				for(int k=j+1 ; k<arrlist.size(); k++) {
					if (arrlist.get(i) + arrlist.get(j) + arrlist.get(k) == sum) {
						ArrayList<Integer> arr = new ArrayList<Integer>();
						arr.add(arrlist.get(i));
						arr.add(arrlist.get(j));
						arr.add(arrlist.get(k));
						result.add(arr);
					}
				}
			}
		}
		System.out.println(arrlist);
		System.out.println(result);
	}
}