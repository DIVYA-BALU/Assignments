import java.util.HashMap;
import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Character,Integer> hp=new HashMap<>();
        String str;
        int times;
        int maxLength=0;
        int left=0;
        int maxRepeatcharcount=0;
        int nonRepeatcharcount=0;
        System.out.print("Enter the string : ");
        str=sc.nextLine();
        System.out.print("\nEnter the number of operations : ");
        times=sc.nextInt();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); 
            hp.put(ch,hp.getOrDefault(ch, 0)+1);
            maxRepeatcharcount=Math.max(maxRepeatcharcount, hp.get(ch));
            nonRepeatcharcount=(i-left+1)-maxRepeatcharcount;
            if(nonRepeatcharcount>times){
                hp.put(str.charAt(left),hp.get(str.charAt(left))-1);
                left++;
            }
            
            maxLength=Math.max(maxLength,i-left+1);
        }
        System.out.println("The longest repeating lenth after replacement is : "+maxLength);
  }
}
