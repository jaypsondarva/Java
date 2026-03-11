class shape {
double d1,d2;
void getData(double d1, double d2 ){
this.d1=d1;
this.d2=d2;
}}
class Rectangle extends shape{
double area(){
return d1*d2;
}}
class Triangle extends shape{
double area(){
return 0.5*d1*d2;
}}
class shapeMain {
public static void main(String[] args){
Rectangle R1=new Rectangle();
Triangle t1=new Triangle();
R1.getData(8,10);
t1.getData(8,10);
double Area=R1.area();
double trea=t1.area();
System.out.println("Area of Rectangle:"+Area);
System.out.println("Area of Triangle:"+trea);
}}
