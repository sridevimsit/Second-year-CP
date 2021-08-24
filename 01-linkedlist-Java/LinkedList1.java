
class Element1{
	int value;
	Element1 next;
	public Element1(int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList1{
	Element1 head;
	public LinkedList1(Element1 head){
		this.head = head;
	}

	public void append(Element1 new_Element1){
		// Your code goes here
	
		if(head!=null){
			Element1 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_Element1;
		}
		
	}

	public Element1 get_position(int position){
		// Get an Element1 from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
		// Your code goes here
		int count=1;
		if(head!=null){
			Element1 temp=head;
			while(temp!=null && count<position)
			{
				temp=temp.next;
				count++;
			}
			System.out.println(temp.value);
			return temp;
		}
		return null;
		
	}

	public void insert(Element1 new_Element1, int position){
	   // """Insert a new node at the given position.
       // Assume the first position is "1".
       // Inserting at position 3 means between
       // the 2nd and 3rd Element1s."""
		// Your code goes here
		int count=1;
		if(head!=null){
			Element1 temp=head;
			while(temp.next!=null && count<position)
			{
				temp=temp.next;
				count++;
			}
			new_Element1.next=temp.next;
			temp.next=new_Element1;
			
		}
	}

	public void delete(int value){
		// Delete the first node with a given value.
		// Your code goes here
		if(head!=null){
			head=head.next;
			
		}
	}
	public String toString()
	{String s="";
		if(head!=null){
			Element1 temp=head;
			while(temp!=null)
			{
				s+=temp.value+"->";
				temp=temp.next;
			}
			
		}
		return s;
	}
}
