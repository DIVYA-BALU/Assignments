package pk;
class Example{
    int n1,n2;
    Example(){
        System.out.println("Explicit default : "+this);
    }
    Example(int n1,int n2){
        this();//constructor chaining
        this.n1=n1;
        this.n2=n2;
        System.out.println("Parameterised");
    }
    Example(Example e){
        System.out.println("Copy constructor");
        this.n1=e.n1;
        this.n2=e.n2;
    }
    public void display(){
        System.out.println("n1 : "+n1);
        System.out.println("n2 : "+n2);

    }
    
}