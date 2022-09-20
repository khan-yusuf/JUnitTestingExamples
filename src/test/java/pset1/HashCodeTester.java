package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
    
    /*
    * P5: If two objects are equal according to the equals(Object)
    * method, then calling the hashCode method on each of
    * the two objects must produce the same integer result.
    */

    @Test public void p5_object_on_different_object_test() {
        Object o1 = new Object();
        Object o2 = new Object();
        if(o1.equals(o2)){
            assertTrue(o1.hashCode() == o2.hashCode());
        }
    }

    @Test public void p5_object_on_same_object_test() {
        Object o1 = new Object();
        Object o2 = new Object();
        o2 = (Object) o1; // Same reference
        if(o1.equals(o2)){
            assertTrue(o1.hashCode() == o2.hashCode());
        }
    }

    @Test public void p5_object_on_c_test() {
        Object o = new Object();
        C c_object = new C(5);
        if(o.equals(c_object)) {
            assertTrue(o.hashCode() == c_object.hashCode());
        }
    }

    @Test public void p5_object_on_d_test() {
        Object o = new Object();
        D d_object = new D(5, 4);
        if(o.equals(d_object)) {
            assertTrue(o.hashCode() == d_object.hashCode());
        }
    }

    @Test public void p5_c_on_object_test() {
        C c_object = new C(2);
        Object o = new Object();
        if(c_object.equals(o)) {
            assertTrue(c_object.hashCode() == o.hashCode());
        }
    }

    @Test public void p5_c_on_different_c_test() {
        C c1 = new C(4);
        C c2 = new C(7);
        if(c1.equals(c2)) {
            assertTrue(c1.hashCode() == c2.hashCode());
        }
    }

    @Test public void p5_c_on_same_c_test() {
        C c1 = new C(3);
        C c2 = new C(3);
        if(c1.equals(c2)) {
            assertTrue(c1.hashCode() == c2.hashCode());
        }
    }

    @Test public void p5_c_on_d_test() {
        C c_object = new C(8);
        D d_object = new D(8, 3);
        if(c_object.equals(d_object)) {
            assertTrue(c_object.hashCode() == d_object.hashCode());
        }
    }

    @Test public void p5_d_on_object_test() {
        D d_obj = new D(2, 1);
        Object o = new Object();
        if(d_obj.equals(o)) {
            assertTrue(d_obj.hashCode() == o.hashCode());
        }
    }

    @Test public void p5_d_on_c_test() {
        D d_obj = new D(2, 1);
        C c_obj = new C(2);
        if(d_obj.equals(c_obj)) {
            assertTrue(d_obj.hashCode() == c_obj.hashCode());
        }
    }

    @Test public void p3_d_on_different_d_test() {
        D d1 = new D(2, 2);
        D d2 = new D(2, 8);
        if(d1.equals(d2)) {
            assertTrue(d1.hashCode() == d2.hashCode());
        }
    }

    @Test public void p3_d_on_same_d_test() {
        D d1 = new D(4, 7);
        D d2 = new D(4, 7);
        if(d1.equals(d2)) {
            assertTrue(d1.hashCode() == d2.hashCode());
        }
    }
}