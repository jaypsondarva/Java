interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Other Division";
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Name : Jay");
        System.out.println("Enrollment : 240390107051");

        Result r = new Result();
        System.out.println(r.getDivision(65));
    }
}
