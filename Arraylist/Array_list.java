import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10); // adds the element at the end of the list
        list1.add(20);
        list1.add(30);

        System.out.println(list1.size()); // .size() gives the size of the arraylist
        
        list1.add(2, 40);

        for(int value:list1){           // for each loop iterate through the value not index
            System.out.println(value);
        }

        list1.set(1,15);

        for(int i = 0; i<list1.size(); i++){
            int val = list1.get(i);
            System.out.print(val + " ");
        }

        list1.remove(2);
        System.out.println();
        System.out.println(list1);

    }
}
