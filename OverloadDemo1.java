public class OverloadDemo1 {

    void test(){
        System.out.println("No parameters");
    }


       // overload test for two parameter
       void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }

    //overload test for a double parameter
    void test(double a ){
        System.out.println("Inside test (double) a: "+a);
    
    }
    
}
