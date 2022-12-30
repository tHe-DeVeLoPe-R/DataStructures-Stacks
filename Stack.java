public class Stack {
    Element top = null;
    Element bottom = null;

    class Element {
        int data;
        Element next;

        Element(int data) {
            this.data = data;
        }

    }

    void push(int data) {
        System.out.println("pushing - " + data);
        Element newNode = new Element(data);
        if (top == null) {
            top = newNode;
            bottom = newNode;
            top.next = bottom.next = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;

    }

    void pop() {

        if (top == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("poping - " + top.data);
        if (top == bottom) {
            top = bottom = null;
            return;
        }
        top = top.next;
    }

    void displayStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Displaying final stack:");
        Element temp = top;
        if (temp == bottom) {
            System.out.println(temp.data);
            return;
        }
        while (temp != bottom) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            if (temp == bottom) {
                System.out.print(temp.data);
            }
        }
    }

    void top() {
        if (top == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println(top.data + " is the top of current stack");
    }

    public static void main(String[] args) throws Exception {

        Stack stack = new Stack();
        stack.push(7);
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.pop();
        stack.pop();
        stack.top();
        stack.displayStack();
    }
}
