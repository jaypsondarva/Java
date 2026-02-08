class point {
int x;
int y;
point () {
x=10;
y=20;

}

point (int a, int b){
x=a;
y=b;
}

point(point p){
x = p.x;
y=p.y;
}
void display () {
System.out.println("Point coordinates : (" + x + ", " + y + ")");
};

public static void main(String args[]){
System.out.println("Enrollment No :240390107051");
point p1 = new point();
p1.display();
point p2 = new point(10,20);
p2.display();

point p3 = new point(p2);
p3.display();
}
}