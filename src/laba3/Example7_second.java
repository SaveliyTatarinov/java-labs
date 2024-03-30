package laba3;

public class Example7_second {
    public static void main(String[] args) {
        Example4.Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Example4.Node(i,head);
        }

        Example4.Node ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
