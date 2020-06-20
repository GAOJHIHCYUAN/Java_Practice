import java.awt.*;
import java.util.*;

public class _interview1 {
	public static void main(String[]args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int sum,number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println("Number is :" + number);
		sum = scanner.nextInt();
		System.out.println("Sum is :" + sum);
		for (int i = 0 ; i <= number; i++) {
			arrlist.add(i);
		}
		for (int i = 0 ; i<=arrlist.size()-2;i++) {
			for(int j = i+1 ; j<=arrlist.size()-1 ; j++) {
				for(int k=j+1 ; k<=arrlist.size(); k++) {
					if (arrlist.get(i) + arrlist.get(j) + arrlist.get(k) == sum) {
						result.add(0,arrlist);
						result.add(1,arrlist);
						result.add(2,arrlist);
					}
				}
			}
		}
		System.out.print(arrlist);
		System.out.print(result);
	}
}