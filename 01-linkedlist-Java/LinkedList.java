
class Element {
    int value;
    Element next;

    public Element(int value) {
        this.value = value;
        this.next = null;
    }

    public String toString() {
        return "->|" + value + "|->";
    }
}

public class LinkedList {
    Element head;

    public LinkedList(Element head) {
        this.head = head;
    }

    public void append(Element new_element) {
        // Your code goes here
        if (head == null) {
            head = new_element;
        } else {
            Element temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_element;
        }

    }

    public Element get_position(int position) {
        // Get an element from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
        // Your code goes here
        if (head != null) {

            Element temp = head;
            int count = 1;
            while (temp.next != null && count < position) {
                temp = temp.next;
                count++;

            }
            if (count == position)

                return temp;

        }
        return null;

    }

    public void insert(Element new_element, int position) {
        // """Insert a new node at the given position.
        // Assume the first position is "1".
        // Inserting at position 3 means between
        // the 2nd and 3rd elements."""
        // Your code goes here
        if (head == null) {
            head = new_element;
        }
        if (position == 1) {
            new_element.next = head;
            head = new_element;
        } else {
            Element temp = head;
            int count = 1;
            while (temp.next != null && count < position - 1) {
                temp = temp.next;
                count++;
            }
            new_element.next = temp.next;
            temp.next = new_element;
        }

    }

    public void delete(int value) {
        // Delete the first node with a given value.
        // Your code goes here
        if (head != null) {
          
        if (head.value==value)
            {
                head=head.next;
            }
        else {
            Element temp = head;
            
            while (temp.next != null && temp.next.value!=value) {
                temp = temp.next;
               
            }
            if (temp.next.value==value)
                 temp.next = temp.next.next;
        }
    }
}

    public String toString() {
        String st = "";
        if (head == null) {
            return st;
        } else {
            Element temp = head;
            while (temp != null) {
                st += "->|" + temp.value + "|->";
                temp = temp.next;
            }

        }
        return st;

    }

}
