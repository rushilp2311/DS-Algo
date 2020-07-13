public class MiddleElementOfDLL <E> {

    public void middleElementOfDdl() {
        DoublyLinkedList<E> linkedList = new DoublyLinkedList<>();
        DoublyLinkedList.Node<E> ptr1 = linkedList.getHeader();
        DoublyLinkedList.Node<E> ptr2 = linkedList.getHeader();
        DoublyLinkedList.Node<E> middleElement = linkedList.getHeader();

        while(ptr2.getNext().getElement() != linkedList.last()){
            DoublyLinkedList.Node<E> successor = ptr2.getNext().getNext();
            ptr2.setNext(successor);
            DoublyLinkedList.Node<E> ptr1Succesor = ptr1.getNext();
            ptr1.setNext(ptr1Succesor);
        }
        middleElement = ptr1;
    }


}
