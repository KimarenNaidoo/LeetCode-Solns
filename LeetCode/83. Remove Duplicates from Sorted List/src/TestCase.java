
public class TestCase {
	
	ListNode head;
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return null;
		
		ListNode temp = head;
		while(temp.next != null) {
			if(temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
	
	public void push(int n) {
		ListNode newNode = new ListNode(n);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void print() {
		ListNode list = head;
		while(list != null) {
			System.out.print(list.val);
			list = list.next;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		TestCase list = new TestCase();
		list.push(5);
		list.push(5);
		list.push(3);
		list.push(2);
		list.push(1);
		list.push(1);
		
		list.print();
		
		list.deleteDuplicates(list.head);
		list.print();
	}

}
