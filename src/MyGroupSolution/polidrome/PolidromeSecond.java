package MyGroupSolution.polidrome;

public class PolidromeSecond {
    public boolean isPalindromeSecond(Node head) {

        Node slow =  head, fast = head , prev, temp;
        while ( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while ( slow!= null){
            temp = slow.next;
            slow.next = prev;
            prev =  slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while ( slow != null){
            if ( fast.value != slow.value ){
                return false;
            }
            else {
                fast = fast.next;
                slow = slow.next;
            }

        }

        return true;




    }
}
