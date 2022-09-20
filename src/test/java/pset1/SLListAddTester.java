package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class SLListAddTester {
    @Test public void test0() {
        SLList l = new SLList();

        assertTrue(l.repOk());

        l.add(true);

        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l

        assertTrue(l.first != null);

        assertTrue(l.first.elem == true);
        assertTrue(l.first.next == null);
        assertTrue(l.last == l.first); // first = last if only one node in list
        assertTrue(l.last.elem == true);
        assertTrue(l.last.next == null);
    }
    
    @Test public void test1() {
        SLList l = new SLList();

        assertTrue(l.repOk());
        l.add(true);

        assertTrue(l.repOk());
        l.add(false);

        assertTrue(l.repOk());

        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l

        assertTrue(l.first != null);
        
        assertTrue(l.first.elem == true);
        assertTrue(l.first.next == l.last);
        assertTrue(l.last != null);
        assertTrue(l.last.elem == false);
        assertTrue(l.last.next == null);
    }
    
}
