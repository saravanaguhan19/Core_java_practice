public class Box {

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
