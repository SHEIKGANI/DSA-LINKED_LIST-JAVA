import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> marks = new LinkedList<>();

        marks.add(10);
        marks.add(20);
        marks.addFirst(5);
        marks.addLast(30);

        // System.out.println(marks);
        for(int val:marks){
            System.out.println(val);
        }
        
    }
    
}
