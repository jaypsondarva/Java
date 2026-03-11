class University
{
static int totalStudents;
static String universityname;
static {
universityname = "Ld";
totalStudents = 0;
System.out.println("static block executed");
}
{
System.out.println("instance block executed");
}
University ()
{
totalStudents++;
System.out.println("constructor executed.");
}

static int gettotalStudents()
{
return totalStudents;
}
public static void main (String args[])
{
System.out.println("Main method started.");
System.out.println("university name = "+ universityname);
University s1 = new University();
System.out.println("In total students:"+ gettotalStudents());
}
}