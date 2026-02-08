class practical11 {

int hours;
int minutes;

void setTime(int h, int m){
hours = h;
minutes = m;
}

void displayTime () {

System.out.println(hours + " hours " + minutes + "minutes");
}

void addTime (practical11 t1, practical11 t2){
minutes = t1.minutes + t2.minutes;
hours = t1.hours + t2.hours;


if( minutes >= 60){
	hours += minutes/60;
minutes = minutes % 60;
}
}

public static void main (String[] args){
System.out.println("Enrollment No : 240390107051");
practical11 t1 = new practical11();
practical11 t2 = new practical11();
practical11 t3 = new practical11();

t1.setTime(2,45);
t2.setTime(1,30);

t3.addTime(t1, t2);

System.out.println("Time 1:");
t1.displayTime();

System.out.println("Time 2:");
t2.displayTime();

System.out.println("Added Time:");
t3.displayTime();
}
}

