//package Stack;
//
//import java.util.*;
//
//
//class DllNode{
//    int data;
//    DllNode prev;
//    DllNode next;
//}
//public class StackImplemention {
//    StackImplemention() {
//         dummyHead = new DllNode();
//         iterator = dummyHead;
//    }
//
//       public void push(int val){
//           DllNode newNode=new DllNode(val,null,null);
//           iterator.next=null;
//           newNode.prev=iterator;
//           iterator=newNode;
//           return;
//       }
//
//       public int pop(){
//           if(iterator==dummyHead){
//               return -1;
//           }
//           int temp=iterator.data;
//           iterator.prev.next=null;
//           DllNode preNode=iterator.prev;
//           iterator.prev=null;
//           iterator=preNode;
//           return temp;
//       }
//       public int peek(){
//           if(iterator==dummyHead){
//               return -1;
//           }
//           return iterator.data;
//       }
//}
