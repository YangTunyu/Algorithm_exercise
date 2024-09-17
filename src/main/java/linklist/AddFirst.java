package linklist;

public class AddFirst {

    public static void main(String[] args) {
        singleLinkedList st = new singleLinkedList();
        st.addFirst(1);
        st.addFirst(2);
        st.addFirst(3);
        System.out.println(st);
    }

    public static class singleLinkedList {

        private static class Node {
            int value;
            Node next;

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

        private static Node head;

        public void addFirst(int value) {
            if (head == null) {
                head = new Node(value, null);
            } else {
                head = new Node(value, head);
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = head;
            while (current!= null) {
                sb.append(current.value).append(" ");
                current = current.next;
            }
            return sb.toString();
        }
    }
}
