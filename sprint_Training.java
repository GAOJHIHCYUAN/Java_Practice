import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class sprint_Training {
	public static void main(String[] args) {
		// 5
	    // [2,4,3,1]
	    // 10 
	    // [1,5,10,3]
	    int n = 10;
	    List<Integer> sprints = new ArrayList<>();
	    sprints.add(1);
	    sprints.add(5);
	    sprints.add(10);
	    sprints.add(3);
	    List<Integer> marks = new ArrayList<>();
	    for (int i = 0; i < n + 2; i++) {
	      marks.add(0);
	    }
	    for (int i = 0; i < sprints.size() - 1; i++) {
	      int start = Math.min(sprints.get(i), sprints.get(i+1));
	      int end = Math.max(sprints.get(i), sprints.get(i+1));
	      marks.set(start, marks.get(start) + 1);
	      marks.set(end + 1, marks.get(end + 1) - 1);
	      System.out.println(marks);
	    }
	      System.out.println();
	      System.out.println();
	      System.out.println();
	    List<Integer> visits = new ArrayList<>();
	    for (int i = 0; i < n + 1; i++) {
	      visits.add(0);
	    }
	    int current = 0; 
	    for (int i = 1; i < visits.size(); i++) {
	      current += marks.get(i);
	      visits.set(i, current);
	      System.out.println(visits);
	    }
	    System.out.println(visits.indexOf(Collections.max(visits)));
	    System.out.println(visits);
	}

}
