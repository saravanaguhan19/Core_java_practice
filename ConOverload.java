
class Box {

    double width;
    double height;
    double depth;

    // constructor used when all dimension specified

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimension is specified

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube dimension is created

    Box(double len) {
        width = height = depth = len;

    }

    double volume() {
        return width * height * depth;
    }

}

public class ConOverload {

    public static void main(String[] args) {
        // created box using the various constructor

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        // get volume of first box

        vol = myBox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube

        vol = myCube.volume();
        System.out.println("Volume of mycube is " + vol);

    }
}
