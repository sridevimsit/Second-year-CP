
class Element{
	int value;
	Element next;
	public Element(int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList{
	Element head;
	public LinkedList(Element head){
		this.head = head;
	}

	public void append(Element new_element){
		// Your code goes here
	
		if(head!=null){
			Element temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_element;
		}
		
	}

	public Element get_position(int position){
		// Get an element from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
		// Your code goes here
		int count=1;
		if(head!=null){
			Element temp=head;
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

	public void insert(Element new_element, int position){
	   // """Insert a new node at the given position.
       // Assume the first position is "1".
       // Inserting at position 3 means between
       // the 2nd and 3rd elements."""
		// Your code goes here
		int count=1;
		if(head!=null){
			Element temp=head;
			while(temp.next!=null && count<position)
			{
				temp=temp.next;
				count++;
			}
			new_element.next=temp.next;
			temp.next=new_element;
			
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
			Element temp=head;
			while(temp!=null)
			{
				s+=temp.value+"->";
				temp=temp.next;
			}
			
		}
		return s;
	}
}
