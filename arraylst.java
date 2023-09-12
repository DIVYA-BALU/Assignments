import java.util.*;
public class arraylst {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1,10);
        al.addAll(al);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        //al.clear();
        // al1 = (ArrayList)al.clone();
         System.out.println(al1);
         al1.forEach(System.out::println);
         System.out.println(al.get(5));
         al1.remove(0);
         System.out.println(al.indexOf(10));
         System.out.println(al.lastIndexOf(10));

         al.set(3,25);
         System.out.println(al);
         System.out.println(al1);

    }
}
