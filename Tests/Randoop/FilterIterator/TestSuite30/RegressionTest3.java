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
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.Predicate predicate35 = filterIterator31.getPredicate();
        collections.Predicate predicate36 = null;
        filterIterator31.setPredicate(predicate36);
        collections.Predicate predicate38 = null;
        filterIterator31.setPredicate(predicate38);
        try {
            filterIterator31.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(predicate35);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = filterIterator17.getPredicate();
        filterIterator13.setIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator21 = filterIterator13.getIterator();
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        filterIterator5.setIterator((java.util.Iterator) filterIterator23);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test03");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator11 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test04");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test05");
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
        collections.Predicate predicate10 = null;
        filterIterator8.setPredicate(predicate10);
        java.util.Iterator iterator12 = null;
        filterIterator8.setIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator8.setIterator((java.util.Iterator) filterIterator18);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test06");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = null;
        filterIterator0.setPredicate(predicate8);
        collections.Predicate predicate10 = null;
        filterIterator0.setPredicate(predicate10);
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        filterIterator17.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate25);
        filterIterator0.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate28 = filterIterator17.getPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        collections.Predicate predicate34 = filterIterator32.getPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = null;
        filterIterator35.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        filterIterator31.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate43 = filterIterator31.getPredicate();
        collections.Predicate predicate44 = filterIterator31.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNull(predicate44);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test07");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator1.setIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        try {
            filterIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test08");
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
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator37);
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
        collections.Predicate predicate5 = null;
        filterIterator0.setPredicate(predicate5);
        collections.Predicate predicate7 = null;
        filterIterator0.setPredicate(predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate9);
        java.util.Iterator iterator11 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test10");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.Predicate predicate9 = null;
        filterIterator5.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        filterIterator5.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator0.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = filterIterator17.getPredicate();
        java.util.Iterator iterator20 = filterIterator17.getIterator();
        collections.Predicate predicate21 = filterIterator17.getPredicate();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        filterIterator23.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        collections.Predicate predicate40 = filterIterator38.getPredicate();
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate42 = null;
        filterIterator34.setPredicate(predicate42);
        collections.Predicate predicate44 = null;
        filterIterator34.setPredicate(predicate44);
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate46);
        filterIterator23.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = filterIterator23.getPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        filterIterator50.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate55 = filterIterator50.getPredicate();
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate59 = null;
        filterIterator50.setPredicate(predicate59);
        filterIterator23.setIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator66 = filterIterator65.getIterator();
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = filterIterator69.getPredicate();
        collections.Predicate predicate71 = filterIterator69.getPredicate();
        filterIterator65.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate73 = null;
        filterIterator69.setPredicate(predicate73);
        collections.Predicate predicate75 = filterIterator69.getPredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.Predicate predicate77 = filterIterator76.getPredicate();
        collections.Predicate predicate78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator76, predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        filterIterator69.setIterator((java.util.Iterator) filterIterator80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator83 = filterIterator82.getIterator();
        collections.Predicate predicate84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.Predicate predicate87 = filterIterator86.getPredicate();
        collections.Predicate predicate88 = filterIterator86.getPredicate();
        filterIterator82.setIterator((java.util.Iterator) filterIterator86);
        collections.Predicate predicate90 = null;
        filterIterator82.setPredicate(predicate90);
        filterIterator69.setIterator((java.util.Iterator) filterIterator82);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        java.util.Iterator iterator94 = filterIterator82.getIterator();
        filterIterator64.setIterator((java.util.Iterator) filterIterator82);
        filterIterator17.setIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate97 = null;
        filterIterator82.setPredicate(predicate97);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNull(predicate70);
        org.junit.Assert.assertNull(predicate71);
        org.junit.Assert.assertNull(predicate75);
        org.junit.Assert.assertNull(predicate77);
        org.junit.Assert.assertNull(iterator83);
        org.junit.Assert.assertNull(predicate87);
        org.junit.Assert.assertNull(predicate88);
        org.junit.Assert.assertNotNull(iterator94);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test11");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate6 = null;
        filterIterator0.setPredicate(predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator15 = null;
        filterIterator12.setIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
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
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = filterIterator37.getPredicate();
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate39);
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate44 = filterIterator40.getPredicate();
        filterIterator36.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = filterIterator46.getPredicate();
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate48);
        collections.Predicate predicate50 = null;
        filterIterator46.setPredicate(predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator53);
        filterIterator46.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = null;
        filterIterator46.setPredicate(predicate58);
        filterIterator36.setIterator((java.util.Iterator) filterIterator46);
        collections.Predicate predicate61 = null;
        filterIterator36.setPredicate(predicate61);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate66);
        java.util.Iterator iterator68 = filterIterator67.getIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator67);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(iterator68);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test12");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = null;
        filterIterator0.setPredicate(predicate4);
        collections.Predicate predicate6 = null;
        filterIterator0.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        collections.Predicate predicate21 = filterIterator19.getPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        collections.Predicate predicate30 = filterIterator28.getPredicate();
        filterIterator24.setIterator((java.util.Iterator) filterIterator28);
        java.util.Iterator iterator32 = filterIterator24.getIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate34 = filterIterator22.getPredicate();
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate36 = null;
        filterIterator22.setPredicate(predicate36);
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = filterIterator40.getPredicate();
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = filterIterator47.getPredicate();
        filterIterator39.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        filterIterator8.setIterator((java.util.Iterator) filterIterator52);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(predicate41);
        org.junit.Assert.assertNull(predicate49);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test13");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator7 = filterIterator3.getIterator();
        collections.Predicate predicate8 = filterIterator3.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator9.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16);
        filterIterator9.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = null;
        filterIterator9.setPredicate(predicate21);
        java.util.Iterator iterator23 = filterIterator9.getIterator();
        collections.Predicate predicate24 = null;
        filterIterator9.setPredicate(predicate24);
        filterIterator3.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate28 = filterIterator3.getPredicate();
        try {
            boolean b29 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(predicate28);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test14");
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
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.Predicate predicate35 = filterIterator31.getPredicate();
        collections.Predicate predicate36 = null;
        filterIterator31.setPredicate(predicate36);
        collections.Predicate predicate38 = null;
        filterIterator31.setPredicate(predicate38);
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test15");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator3 = null;
        filterIterator0.setIterator(iterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        filterIterator8.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate16 = null;
        filterIterator8.setPredicate(predicate16);
        filterIterator0.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate19);
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate21);
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(predicate23);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test16");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = null;
        filterIterator3.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator7.setIterator((java.util.Iterator) filterIterator17);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test17");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate8);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test18");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test19");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = null;
        filterIterator0.setPredicate(predicate3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test20");
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
        java.util.Iterator iterator49 = filterIterator32.getIterator();
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate50);
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        collections.Predicate predicate53 = null;
        filterIterator51.setPredicate(predicate53);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(predicate52);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test21");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = null;
        filterIterator4.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test22");
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
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator13.setPredicate(predicate16);
        java.util.Iterator iterator18 = filterIterator13.getIterator();
        collections.Predicate predicate19 = null;
        filterIterator13.setPredicate(predicate19);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test23");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.Predicate predicate16 = filterIterator14.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator18 = filterIterator10.getIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator1.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator28 = filterIterator25.getIterator();
        collections.Predicate predicate29 = null;
        filterIterator25.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.Predicate predicate35 = null;
        filterIterator31.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator38);
        filterIterator31.setIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate46);
        collections.Predicate predicate48 = null;
        filterIterator44.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator51);
        filterIterator44.setIterator((java.util.Iterator) filterIterator54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        filterIterator41.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = null;
        filterIterator56.setPredicate(predicate58);
        filterIterator25.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate61);
        filterIterator23.setIterator((java.util.Iterator) filterIterator62);
        collections.Predicate predicate64 = filterIterator23.getPredicate();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate64);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test24");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test25");
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
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator25.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate28);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test26");
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
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator13.setPredicate(predicate16);
        java.util.Iterator iterator18 = filterIterator13.getIterator();
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test27");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = null;
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        java.util.Iterator iterator8 = filterIterator5.getIterator();
        collections.Predicate predicate9 = filterIterator5.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate11 = filterIterator5.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test28");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = null;
        filterIterator4.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        filterIterator4.setIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator17 = filterIterator4.getIterator();
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate18);
        collections.Predicate predicate20 = filterIterator4.getPredicate();
        collections.Predicate predicate21 = filterIterator4.getPredicate();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(predicate21);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test29");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        collections.Predicate predicate5 = null;
        filterIterator1.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.Predicate predicate11 = null;
        filterIterator7.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator14);
        filterIterator7.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator20.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator27);
        filterIterator20.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator17.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate34 = null;
        filterIterator32.setPredicate(predicate34);
        filterIterator1.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        try {
            filterIterator38.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator27);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test30");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator3 = null;
        filterIterator0.setIterator(iterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate11);
        java.util.Iterator iterator13 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator15 = filterIterator0.getIterator();
        collections.Predicate predicate16 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(predicate16);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test31");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator8 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator10 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        filterIterator14.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate22);
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        filterIterator0.setIterator((java.util.Iterator) filterIterator23);
        try {
            java.lang.Object obj27 = filterIterator23.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate20);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test32");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test33");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator14 = filterIterator6.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate16);
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        filterIterator23.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate40 = filterIterator36.getPredicate();
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = filterIterator42.getPredicate();
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate44);
        collections.Predicate predicate46 = null;
        filterIterator42.setPredicate(predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator49);
        filterIterator42.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = null;
        filterIterator42.setPredicate(predicate54);
        filterIterator32.setIterator((java.util.Iterator) filterIterator42);
        filterIterator19.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        java.util.Iterator iterator60 = filterIterator58.getIterator();
        java.util.Iterator iterator61 = filterIterator58.getIterator();
        collections.Predicate predicate62 = filterIterator58.getPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        filterIterator58.setIterator((java.util.Iterator) filterIterator67);
        filterIterator32.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate70 = filterIterator67.getPredicate();
        collections.Predicate predicate71 = null;
        filterIterator67.setPredicate(predicate71);
        collections.Predicate predicate73 = filterIterator67.getPredicate();
        java.util.Iterator iterator74 = filterIterator67.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(predicate62);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNull(predicate70);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertNotNull(iterator74);
    }
}

