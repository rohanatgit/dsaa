package Queue;

public class QueueusingArrayImplement {
    int front;
    int rear;
    int capacity=5;
    int[] object;
    QueueusingArrayImplement(){
        front=-1;
        rear=-1;
        object=new int[capacity];
    }

    boolean isEmpty(){
        return rear<=front;
    }


    int enqueue(int data){
        return object[++rear]=data;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        if(rear>=front){
            return object[++front];
        }
        return -1;
    }

    int size(){
        return rear-front;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(object[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueusingArrayImplement qq=new QueueusingArrayImplement();
        System.out.println( qq.isEmpty());
        qq.enqueue(12);
        qq.enqueue(23);
        qq.enqueue(45);
        System.out.println(qq.dequeue());
        qq.display();

    }
}
