package pk;
class constructor{
    public static void main(String args[]){
        Example ex= new Example();
        Example ex1= new Example(50,35);//constructor overloading
        Example ex2= new Example(ex1);
        ex.display();
        ex2.display();

    }
}