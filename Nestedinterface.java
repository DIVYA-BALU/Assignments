interface outer{
    void outerdisplay();
    interface inner{
        void innerdisplay();
    }
}
interface Testable{
    class Insideinterface{//by default public and static
        void disp1(){
            System.out.println("Class inside interface");
        }
    }
}
class IFace{
    interface InterfaceInClass{
        void disp();
    }
}
class Test1 implements IFace.InterfaceInClass{
    public void disp(){
        System.out.println("Interface inside class");
    }
}
class Demo implements outer.inner{
    public void innerdisplay(){
        System.out.println("Inner Interface");
    }
}
class Test implements outer{
    public void outerdisplay(){
        System.out.println("Outer Interface");
    }
}

public class Nestedinterface {
    public static void main(String args[]){
        outer.inner ob = new Demo();
        ob.innerdisplay();
        outer ob1 = new Test();
        ob1.outerdisplay();
        IFace.InterfaceInClass i=new Test1();
        i.disp();
        Testable.Insideinterface tc = new Testable.Insideinterface(); 
        tc.disp1();


    }
}
