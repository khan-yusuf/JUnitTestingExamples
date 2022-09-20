package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
    /*
    * P1: For any non-null reference value x, x.equals(null) should return false.
    */

    @Test public void p1_object_test() {
        assertFalse(new Object().equals(null));
    }

    @Test public void p1_c_test() {
        C c_object = new C(4);
        assertFalse(c_object.equals(null));
    }

    @Test public void p1_d_test() {
        D d_object = new D(4, 6);
        assertFalse(d_object.equals(null));
    }


    /*
    * P2: It is reflexive: for any non-null reference value x, x.equals(x)
    * should return true.
    */

    @Test public void p2_object_test() {
        Object new_object = new Object();
        assertTrue(new_object.equals(new_object));
    }

    @Test public void p2_c_test() {
        C c_object = new C(2);
        assertTrue(c_object.equals(c_object));
    }

    @Test public void p2_d_test() {
        D d_object = new D(2, 9);
        assertTrue(d_object.equals(d_object));
    }


    /*
    * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
    * should return true if and only if y.equals(x) returns true.
    */

    @Test public void p3_object_on_different_object_test() {
        Object o1 = new Object();
        Object o2 = new Object();
        assertFalse(o1.equals(o2) && o2.equals(o1));
    }

    @Test public void p3_object_on_same_object_test() {
        Object o1 = new Object();
        Object o2 = new Object();
        o2 = (Object) o1; // Same reference
        assertTrue(o1.equals(o2) && o2.equals(o1));
    }

    @Test public void p3_object_on_c_test() {
        Object o = new Object();
        C c_object = new C(5);
        assertFalse(o.equals(c_object) && c_object.equals(o));
    }

    @Test public void p3_object_on_d_test() {
        Object o = new Object();
        D d_object = new D(5, 4);
        assertFalse(o.equals(d_object) && d_object.equals(o));
    }

    @Test public void p3_c_on_object_test() {
        C c_object = new C(2);
        Object o = new Object();
        assertFalse(c_object.equals(o) && o.equals(c_object));
    }

    @Test public void p3_c_on_different_c_test() {
        C c1 = new C(4);
        C c2 = new C(7);
        assertFalse(c1.equals(c2) && c2.equals(c1));
    }

    @Test public void p3_c_on_same_c_test() {
        C c1 = new C(3);
        C c2 = new C(3);
        assertTrue(c1.equals(c2) && c2.equals(c1));
    }

    @Test public void p3_c_on_d_test() {
        C c_object = new C(8);
        D d_object = new D(8, 3);
        assertFalse(c_object.equals(d_object) && d_object.equals(c_object));
    }

    @Test public void p3_d_on_object_test() {
        D d_obj = new D(2, 1);
        Object o = new Object();
        assertFalse(d_obj.equals(o) && o.equals(d_obj));
    }

    @Test public void p3_d_on_c_test() {
        D d_obj = new D(2, 1);
        C c_obj = new C(2);
        assertFalse(d_obj.equals(c_obj) && c_obj.equals(d_obj));
    }

    @Test public void p3_d_on_different_d_test() {
        D d1 = new D(2, 2);
        D d2 = new D(2, 8);
        assertFalse(d1.equals(d2) && d2.equals(d1));
    }

    @Test public void p3_d_on_same_d_test() {
        D d1 = new D(4, 7);
        D d2 = new D(4, 7);
        assertTrue(d1.equals(d2) && d2.equals(d1));
    }

    /*
     * P4: It is transitive: for any non-null reference values x, y, and z, 
     * if x.equals(y) returns true and y.equals(z) returns true, then 
     * x.equals(z) should return true.
     */
    
    // you do not need to write tests for P4

}

