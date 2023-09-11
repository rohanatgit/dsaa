package Stack;

public class StackArrayImplemention {
    int top;
    int capacity;
    int[] stack;
    StackArrayImplemention(){
        top=-1;
        capacity=10;
        stack=new int[capacity];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public int push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }
        return stack[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackArrayImplemention st=new StackArrayImplemention();
        st.push(10);
        st.push(40);
        st.push(20);
        st.push(30);

        st.pop();
        System.out.println(st.isEmpty());
        st.display();

    }
}
