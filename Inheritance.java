class Shape{
    int l,b;
    float pi=3.14f;
  Shape(){
    System.out.println("Class shape of "+this);
   }
   Shape(int l, int b){
    this();
    this.l=l;
    this.b=b;
   }
}
class Rectangle extends Shape{
   Rectangle(int l,int b){
    super(l,b);
   }
   public void draw(){
        System.out.println("Area of rectangle : "+l*b);
   }

 }
 class Circle extends Shape{
    float r;
   Circle(float r){
    this.r=r;
   }
   public void draw(){
        System.out.println("Area of circle : "+ pi*r*r);
   }

 }

class Inheritance 
{
    public static void main(String args[])
    {
        Rectangle r= new Rectangle(10,20);
        r.draw();
        Circle c= new Circle(5.5f);
        c.draw();
    }
}