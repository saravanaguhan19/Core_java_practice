public class TestStack {

    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // push some number onto the stack
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        // pop those number of the stack

        System.out.println("Stack in mystack1:");

        for (int i = 0; i < 10; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack2.pop() + " ");
        }

    }

}
