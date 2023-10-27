class Box {
    double width;
    double height;
    double depth;

    Box() {

    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
    // void volume() {
    // System.out.print("Volume is(from class box) ");
    // System.out.println(width * height * depth);

    // }
}

public class BoxDemo {

    public static void main(String[] args) {

        Box myBox = new Box();
        double vol;

        // assign values to myBox's instance variables

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // compute volume of box
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is " + vol);

        myBox.volume();

    }

}
