public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double val;

        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // compute volume of first box

        val = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("volume of first box " + val);

        // compute value of second box
        val = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("volume of second  box " + val);

    }

}
