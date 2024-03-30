package laba3;

public class Example8_loop {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        public void createHead(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void createTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = head;
            while (current != null) {
                sb.append(current.data).append(" ");
                current = current.next;
            }
            return sb.toString();
        }

        public void addFirst(int data) {
            createHead(data);
        }

        public void addLast(int data) {
            createTail(data);
        }

        public void insert(int position, int data) {
            if (position <= 0) {
                createHead(data);
            } else {
                Node newNode = new Node(data);
                Node current = head;
                while (position > 1 && current != null) {
                    current = current.next;
                    position--;
                }
                if (current != null) {
                    newNode.next = current.next;
                    current.next = newNode;
                }
            }
        }

        public void removeFirst() {
            if (head != null) {
                head = head.next;
            }
        }
        public void removeLast() {
            if (head == null || head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }

        public void remove(int position) {
            if (position <= 0) {
                removeFirst();
            } else {
                Node current = head;
                while (position > 1 && current != null) {
                    current = current.next;
                    position--;
                }
                if (current != null && current.next != null) {
                    current.next = current.next.next;
                }
            }
        }

        public void main(String[] args) {
            LinkedList list = new LinkedList();
            list.createHead(3);
            list.createHead(7);
            list.createHead(11);

            list.addLast(5);
            list.addFirst(13);

            System.out.println(list.toString());

            list.insert(2, 9);
            list.removeFirst();
            list.removeLast();
            list.remove(2);

            System.out.println(list.toString());
        }
    }
}
