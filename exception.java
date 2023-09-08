interface Calc{
    void divide(int n1,int n2) throws UserException;
}
class UserException extends Exception{
    UserException(String message){
        super(message);
    }
}
class Divide implements Calc{
    public void divide(int n1,int n2)throws UserException{
        try{
            if(n2==0)
                throw new Exception("cannot divide by zero");
            System.out.println(n1+n2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
}

public class exception {
    public static void main(String args[]) throws Exception{
        Calc a=new Divide();
        a.divide(10,0);    
        
    }
}
