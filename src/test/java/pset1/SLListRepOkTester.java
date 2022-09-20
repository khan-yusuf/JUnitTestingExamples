package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
    
    // empty list check
    @Test public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    // list with one elem=true node
    @Test public void t1() {
        SLList l = new SLList();
        Node n = new Node();
        
        n.elem = true;
        n.next = null;

        l.first = n;
        l.last = n;

        assertTrue(l.repOk());

    }

    // list with one elem=false node
    @Test public void t2() {
        SLList l = new SLList();
        Node n = new Node();

        n.elem = false;
        n.next = null;

        l.first = n;
        l.last = n;

        assertTrue(l.repOk());

    }

    // list with one cyclic elem=true node
    @Test public void t3() {
        SLList l = new SLList();
        Node n = new Node();

        n.elem = true;
        n.next = n;

        l.first = n;
        l.last = n;

        assertFalse(l.repOk()); // false because cyclic with one node
        
    }


    // list with one cyclic elem = false node
    @Test public void t4() {
        SLList l = new SLList();
        Node n = new Node();

        n.elem = false;
        n.next = n;

        l.first = n;
        l.last = n;

        assertFalse(l.repOk()); // false because one node keeps cycling

    }
}
