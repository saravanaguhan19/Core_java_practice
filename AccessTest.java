class Test {
    int a;
    public int b; // public access
    private int c; // private access

    // methods to access c
    void setc(int i) { // set c's value
        c = i;
    }

    int getc() { // get c's value
        return c;
    }

}

public class AccessTest {

    public static void main(String[] args) {
        Test ob = new Test();
        // these are OK , a and b may be accessed direclty
        ob.a = 10;
        ob.b = 20;

        // this is not OK and will cause an error

        // ob.c = 100 ; // error

        ob.setc(100);
        System.out.println("a , b, and c : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
