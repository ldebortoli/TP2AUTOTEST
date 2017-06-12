import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate15);
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate20);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(predicate17);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.Predicate predicate11 = filterIterator9.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator13 = filterIterator5.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate15 = filterIterator3.getPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate17);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test03");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator7 = filterIterator3.getIterator();
        collections.Predicate predicate8 = filterIterator3.getPredicate();
        collections.Predicate predicate9 = filterIterator3.getPredicate();
        java.util.Iterator iterator10 = filterIterator3.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test04");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator14 = null;
        filterIterator11.setIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator11.getIterator();
        filterIterator9.setIterator(iterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = null;
        filterIterator21.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        filterIterator9.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(predicate29);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test05");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator3 = null;
        filterIterator0.setIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        filterIterator13.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate30 = filterIterator26.getPredicate();
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate34);
        collections.Predicate predicate36 = null;
        filterIterator32.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator39);
        filterIterator32.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = null;
        filterIterator32.setPredicate(predicate44);
        filterIterator22.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator0.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate50 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(predicate50);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test06");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = null;
        filterIterator0.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        collections.Predicate predicate17 = null;
        filterIterator13.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20);
        filterIterator13.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator10.setIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate27);
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate29);
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate31);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test07");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = filterIterator11.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        filterIterator3.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.Predicate predicate22 = filterIterator20.getPredicate();
        filterIterator16.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate24 = null;
        filterIterator20.setPredicate(predicate24);
        filterIterator14.setIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator27 = filterIterator14.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        collections.Predicate predicate31 = filterIterator29.getPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate33);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate36 = null;
        filterIterator28.setPredicate(predicate36);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate31);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test08");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator1, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator1);
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.Predicate predicate12 = null;
        filterIterator8.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator15);
        filterIterator8.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        collections.Predicate predicate25 = null;
        filterIterator21.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator28);
        filterIterator21.setIterator((java.util.Iterator) filterIterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        filterIterator18.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = filterIterator35.getPredicate();
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        filterIterator33.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate41);
        collections.Predicate predicate43 = filterIterator39.getPredicate();
        java.util.Iterator iterator44 = filterIterator39.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = filterIterator45.getPredicate();
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate47);
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        filterIterator39.setIterator((java.util.Iterator) filterIterator48);
        filterIterator6.setIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate55);
        try {
            boolean b57 = filterIterator48.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNull(predicate46);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test09");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        filterIterator4.setPredicate(predicate6);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test10");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate25 = null;
        filterIterator17.setPredicate(predicate25);
        collections.Predicate predicate27 = null;
        filterIterator17.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator17.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator12.setIterator((java.util.Iterator) filterIterator37);
        try {
            java.lang.Object obj39 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(predicate23);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test11");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator1, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator1);
        collections.Predicate predicate5 = null;
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        collections.Predicate predicate8 = null;
        filterIterator4.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            java.lang.Object obj11 = filterIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test12");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator3.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.Predicate predicate16 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = null;
        filterIterator10.setPredicate(predicate18);
        collections.Predicate predicate20 = null;
        filterIterator10.setPredicate(predicate20);
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator29);
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        filterIterator27.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate35);
        filterIterator10.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate38 = filterIterator27.getPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        filterIterator8.setIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator46);
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        filterIterator44.setIterator((java.util.Iterator) filterIterator49);
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate56);
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate61 = filterIterator57.getPredicate();
        filterIterator53.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate65);
        collections.Predicate predicate67 = null;
        filterIterator63.setPredicate(predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.Predicate predicate71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator70, predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator70);
        filterIterator63.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = null;
        filterIterator63.setPredicate(predicate75);
        filterIterator53.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate78 = null;
        filterIterator53.setPredicate(predicate78);
        collections.Predicate predicate80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        java.util.Iterator iterator83 = filterIterator82.getIterator();
        filterIterator39.setIterator(iterator83);
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate85);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(predicate61);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(iterator83);
    }
}

