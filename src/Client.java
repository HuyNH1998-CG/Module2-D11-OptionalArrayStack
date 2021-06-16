public class Client {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(12);
        stack.push(67);
        stack.push(4);
        stack.push(23);
        System.out.println("Stack size after pushed : " + stack.size());
        System.out.println("Popping from stack");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Stack size after popped: " + stack.size());
        System.out.println(stack.isFull());
    }
}
