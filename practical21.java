class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4/3) * Math.PI * radius * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        VolumeCalculator v = new VolumeCalculator();

        double cube = v.calculateVolume(5);
        double rectangularCube = v.calculateVolume(4, 5, 6);
        double sphere = v.calculateVolume(3f);

        System.out.println("Volume of Cube: " + cube);
        System.out.println("Volume of Rectangular Cube: " + rectangularCube);
        System.out.println("Volume of Sphere: " + sphere);
    }
}
