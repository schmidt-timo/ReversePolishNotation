/**
 * @author: Timo Schmidt
 * @version: 2019-11-30
 */

public class Node {

    Object data;
    Node next;

    Node (Object obj) {
        data = obj;
    }

    Node (Object obj, Node next) {
        data = obj;
        this.next = next;
    }

}
