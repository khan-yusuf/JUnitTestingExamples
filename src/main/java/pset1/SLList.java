package pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList {
    Node first; // first node in <this> list
    Node last; // last node in <this> list
    
    static class Node {
        boolean elem;
        Node next;
    }

    boolean repOk() {
        // postcondition: returns true iff <this> is an acyclic list, i.e.,
        // there is no path from a node to itself
        
        if (first == null || last == null) {
            return first == last;
        }
        Set<Node> visited = new HashSet<Node>();
        Node n = first;
        while (n != null) {
            if (!visited.add(n)) {
                return false; // node already visited
            }
            if (n.next == null) {
                return n == last;
            }
            n = n.next;
        }
        return true;
    }
    
    void add(boolean e) {
        // precondition: this.repOk()
        // postcondition: adds <e> in a new node at the end of <this>
        // list; the rest of <this> list is unmodified
        
        Node newNode = new Node();
        newNode.elem = e;
        newNode.next = null;

        // add one node to an empty list
        if(first == null && last == null) 
        {
            first = newNode;
            last = newNode;
            // first.next remains null since there is only one node

        }
        // at least one element already in list
        else if(first != null && first.next == null) 
        {
            last = newNode;
            first.next = last;

        }
        // already has at least two nodes in list
        else 
        {
            last.next = newNode;
            last = newNode;
        }
    }

}