public class OverloadDemo {
    void test(){
        System.out.println("No parameters");
    }

    // overload test for one parameter
    void test(int a){
        System.out.println("a: "+ a);
    }

    // overload test for two parameter
    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    //overload test for a double parameter
    double test(double a ){
        System.out.println("double a: "+a);
        return a*a;
    }

}