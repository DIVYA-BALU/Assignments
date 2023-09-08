interface Calculater{
   void add(int n1,int n2);
   void add(int n1,float n2);
   void add(float n1,int n2);
   void add(float n1,float n2);
   void sub(int n1,int n2);
   void sub(int n1,float n2);
   void sub(float n1,int n2);
   void sub(float n1,float n2);
   void multiply(int n1,int n2);
   void multiply(int n1,float n2);
   void multiply(float n1,int n2);
   void multiply(float n1,float n2);
   void divide(int n1,int n2);
   void divide(int n1,float n2);
   void divide(float n1,int n2);
   void divide(float n1,float n2);
}
class Operation implements Calculater{
   public void add(int n1,int n2){
      System.out.println(n1+n2);
   }
   public void add(int n1,float n2){
      System.out.println(n1+n2);
   }
   public void add(float n1,int n2){
      System.out.println(n1+n2);
   }
   public void add(float n1,float n2){
      System.out.println(n1+n2);
   }
   public void sub(int n1,int n2){
      System.out.println(n1-n2);
   }
   public void sub(int n1,float n2){
      System.out.println(n1-n2);
   }
   public void sub(float n1,int n2){
      System.out.println(n1-n2);
   }
   public void sub(float n1,float n2){
      System.out.println(n1-n2);
   }
   public void multiply(int n1,int n2){
      System.out.println(n1*n2);
   }
   public void multiply(int n1,float n2){
      System.out.println(n1*n2);
   }
   public void multiply(float n1,int n2){
      System.out.println(n1*n2);
   }
   public void multiply(float n1,float n2){
      System.out.println(n1*n2);
   }
   public void divide(int n1,int n2){
      if(n2==0){
         System.out.println("Denominator cannot be Zero");
         return;
      }
      System.out.println(n1/n2);
   }
   public void divide(int n1,float n2){
      if(n2==0.0){
         System.out.println("Denominator cannot be Zero");
         return;
      }
      System.out.println(n1/n2);
   }
   public void divide(float n1,int n2){
      if(n2==0){
         System.out.println("Denominator cannot be Zero");
         return;
      }
      System.out.println(n1/n2);
   }
   public void divide(float n1,float n2){
      if(n2==0){
         System.out.println("Denominator cannot be Zero");
         return;
      }
      System.out.println(n1/n2);
   }

}
  
class abstraction{  
public static void main(String args[]){ 
   Calculater op = new Operation();
   op.add(1,2);
   op.add(1.1f,2);
   op.add(1,2.5f);
   op.add(1.5f,2.7f);
   op.sub(1,2);
   op.sub(1.1f,2);
   op.sub(1,2.5f);
   op.sub(1.5f,2.7f);
   op.multiply(1,2);
   op.multiply(1.1f,2);
   op.multiply(1,2.5f);
   op.multiply(1.5f,2.7f);
   op.divide(1,0);
   op.divide(1.1f,2);
   op.divide(1,2.5f);
   op.divide(1.5f,2.7f);

}  
}