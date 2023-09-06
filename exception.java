interface Calc{
    void add(int n1,int n2) throws UserException;
}
class UserException extends Exception{
    UserException(String message){
        super(message);
    }
}
class Add implements Calc{
    public void add(int n1,int n2)throws UserException{
        try{
            if(n1<0 || n2<0)
                throw new Exception("No negative numbers");
            System.out.println(n1+n2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
}

public class exception {
    public static void main(String args[]) throws Exception{
        Calc a=new Add();
        a.add(-1,10);    
        
    }
}
