package laba3;

public class Example8_recursion {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedListRec {
        Node head;

        public void createHeadRec(int data) {
            head = addToHead(head, data);
        }

        private Node addToHead(Node current, int data) {
            if (current == null) {
                current = new Node(data);
            } else {
                current.next = addToHead(current.next, data);
            }
            return current;
        }

        public void createTailRec(int data) {
            head = addToTail(head, data);
        }

        private Node addToTail(Node current, int data) {
            if (current == null) {
                return new Node(data);
            }
            current.next = addToTail(current.next, data);
            return current;
        }

        public String toStringRec() {
            return toStringHelper(head);
        }

        private String toStringHelper(Node current) {
            if (current == null) {
                return "";
            }
            return current.data + " " + toStringHelper(current.next);
        }

        public void main(String[] args) {
            LinkedListRec list = new LinkedListRec();
            list.createHeadRec(3);
            list.createHeadRec(7);
            list.createHeadRec(11);

            list.createTailRec(5);

            System.out.println(list.toStringRec());
        }
    }
}
