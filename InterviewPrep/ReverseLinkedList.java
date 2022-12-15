//Q: write a program that reverses a linked list
public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
    LinkedList<Integer> reversed = new LinkedList();
    for(int i = list.size()-1;  i>= 0; i--){
        reversed.add(list.get(i));
    }
    return reversed;
}
