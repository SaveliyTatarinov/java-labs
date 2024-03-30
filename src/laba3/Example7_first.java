package laba3;

public class Example7_first {
    public static void main(String[] args) {
        Example4.Node node0 = new Example4.Node(0,null);
        Example4.Node node1 = new Example4.Node(1,null);
        Example4.Node node2 = new Example4.Node(2,null);
        Example4.Node node3 = new Example4.Node(3,null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Example4.Node ref = node0;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}