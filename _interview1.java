import java.util.ArrayList;
import java.util.Scanner;

public class _interview1 {
	public static void main(String[]args) {
		
//		輸入一陣列，例如[1,2,3,4,5,6,7,8,9]
//		取任意三個數字，加總起來等於8
//		並輸出答案[1,2,5]、[1,3,4]
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int sum,number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt(); //使用者輸入，決定陣列的大小
		System.out.println("Number is :" + number); 
		sum = scanner.nextInt(); //使用者輸入希望三個數字總合為幾
		System.out.println("Sum is :" + sum);
		for (int i = 1 ; i <= number; i++) {
			arrlist.add(i); //將陣列從1開始填滿。
		}
		for (int i = 0 ; i<arrlist.size()-2;i++) { 
			for(int j = i+1 ; j<arrlist.size()-1 ; j++) { 
				for(int k=j+1 ; k<arrlist.size(); k++) { //前兩個不變，從第三個開始往下遞增檢查。
					if (arrlist.get(i) + arrlist.get(j) + arrlist.get(k) == sum) { //若三個數字相加結果等於sum，將數字分別放入陣列中。
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