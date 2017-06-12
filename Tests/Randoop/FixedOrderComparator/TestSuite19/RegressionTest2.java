import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array2 = new java.lang.Object[] { fixedOrderComparator1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array2);
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (short) 0);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.lang.Object obj24 = null;
        boolean b25 = fixedOrderComparator19.addAsEqual((java.lang.Object) 10.0f, obj24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        int i27 = fixedOrderComparator26.getUnknownObjectBehavior();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b39 = fixedOrderComparator26.add((java.lang.Object) fixedOrderComparator38);
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        boolean b42 = fixedOrderComparator26.isLocked();
        int i44 = fixedOrderComparator19.compare((java.lang.Object) fixedOrderComparator26, (java.lang.Object) 2);
        boolean b45 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator26);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        int i49 = fixedOrderComparator46.getUnknownObjectBehavior();
        fixedOrderComparator46.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator46.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b63 = fixedOrderComparator62.isLocked();
        boolean b64 = fixedOrderComparator62.isLocked();
        int i65 = fixedOrderComparator26.compare((java.lang.Object) 1, (java.lang.Object) b64);
        try {
            fixedOrderComparator26.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator11.isLocked();
        fixedOrderComparator11.setUnknownObjectBehavior(0);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) 10L);
        boolean b18 = fixedOrderComparator11.isLocked();
        boolean b19 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b34 = fixedOrderComparator11.add((java.lang.Object) obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = fixedOrderComparator43.add((java.lang.Object) (short) 10);
        boolean b46 = fixedOrderComparator43.isLocked();
        boolean b47 = fixedOrderComparator35.add((java.lang.Object) fixedOrderComparator43);
        boolean b48 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator35);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b33 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = null;
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        boolean b46 = fixedOrderComparator42.add((java.lang.Object) 1.0f);
        int i47 = fixedOrderComparator42.getUnknownObjectBehavior();
        int i48 = fixedOrderComparator29.compare(obj34, (java.lang.Object) i47);
        int i49 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b50 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        fixedOrderComparator59.setUnknownObjectBehavior((int) (short) 0);
        int i62 = fixedOrderComparator59.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        int i66 = fixedOrderComparator63.getUnknownObjectBehavior();
        int i67 = fixedOrderComparator29.compare((java.lang.Object) i62, (java.lang.Object) fixedOrderComparator63);
        java.lang.Object[] obj_array68 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array76);
        int i80 = fixedOrderComparator79.getUnknownObjectBehavior();
        boolean b81 = fixedOrderComparator79.isLocked();
        int i82 = fixedOrderComparator63.compare((java.lang.Object) fixedOrderComparator69, (java.lang.Object) fixedOrderComparator79);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        fixedOrderComparator90.setUnknownObjectBehavior(0);
        boolean b94 = fixedOrderComparator90.add((java.lang.Object) 1.0f);
        boolean b96 = fixedOrderComparator90.add((java.lang.Object) 1.0f);
        boolean b97 = fixedOrderComparator90.isLocked();
        boolean b98 = fixedOrderComparator7.addAsEqual((java.lang.Object) i82, (java.lang.Object) fixedOrderComparator90);
        int i99 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(i48 == (-1));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(i67 == 1);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(i80 == 2);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertTrue(i99 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator23.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b40 = fixedOrderComparator23.add((java.lang.Object) obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b42 = fixedOrderComparator7.add((java.lang.Object) obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator43.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(i45 == 2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        boolean b26 = fixedOrderComparator22.add((java.lang.Object) 1.0f);
        java.lang.Object obj27 = null;
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        boolean b39 = fixedOrderComparator35.add((java.lang.Object) 1.0f);
        int i40 = fixedOrderComparator35.getUnknownObjectBehavior();
        int i41 = fixedOrderComparator22.compare(obj27, (java.lang.Object) i40);
        int i42 = fixedOrderComparator22.getUnknownObjectBehavior();
        boolean b43 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        fixedOrderComparator52.setUnknownObjectBehavior((int) (short) 0);
        int i55 = fixedOrderComparator52.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        int i59 = fixedOrderComparator56.getUnknownObjectBehavior();
        int i60 = fixedOrderComparator22.compare((java.lang.Object) i55, (java.lang.Object) fixedOrderComparator56);
        int i61 = fixedOrderComparator22.getUnknownObjectBehavior();
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Object obj63 = null;
        int i64 = fixedOrderComparator22.compare(obj62, obj63);
        java.lang.Object[] obj_array71 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        java.lang.Object[] obj_array79 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array79);
        int i83 = fixedOrderComparator22.compare((java.lang.Object) obj_array71, (java.lang.Object) fixedOrderComparator82);
        boolean b84 = fixedOrderComparator8.add((java.lang.Object) i83);
        boolean b85 = fixedOrderComparator8.isLocked();
        int i86 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator12.add((java.lang.Object) i19);
        boolean b21 = fixedOrderComparator12.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj18 = null;
        int i19 = fixedOrderComparator10.compare((java.lang.Object) 1.0d, obj18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        int i32 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b34 = fixedOrderComparator28.addAsEqual((java.lang.Object) i32, (java.lang.Object) (short) 1);
        int i35 = fixedOrderComparator28.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b44 = fixedOrderComparator43.isLocked();
        boolean b45 = fixedOrderComparator28.add((java.lang.Object) fixedOrderComparator43);
        int i47 = fixedOrderComparator10.compare((java.lang.Object) fixedOrderComparator28, (java.lang.Object) 1L);
        boolean b48 = fixedOrderComparator28.isLocked();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        java.lang.Object[] obj_array59 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { fixedOrderComparator60 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        java.lang.Object[] obj_array79 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        boolean b81 = fixedOrderComparator78.add((java.lang.Object) obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array79);
        boolean b86 = fixedOrderComparator69.add((java.lang.Object) fixedOrderComparator85);
        int i87 = fixedOrderComparator69.getUnknownObjectBehavior();
        try {
            boolean b88 = fixedOrderComparator28.addAsEqual((java.lang.Object) i58, (java.lang.Object) fixedOrderComparator69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(i87 == 2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator0.add(obj2);
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b17 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b11 = fixedOrderComparator9.isLocked();
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b24 = fixedOrderComparator9.add((java.lang.Object) fixedOrderComparator23);
        boolean b25 = fixedOrderComparator23.isLocked();
        int i26 = fixedOrderComparator23.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (short) 0);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator7.add((java.lang.Object) i22);
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator7.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator27.isLocked();
        boolean b30 = fixedOrderComparator27.add((java.lang.Object) 10.0d);
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator27.add(obj31);
        fixedOrderComparator27.setUnknownObjectBehavior(1);
        boolean b35 = fixedOrderComparator7.add((java.lang.Object) 1);
        boolean b36 = fixedOrderComparator7.isLocked();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i20 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 1.0d);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator34.isLocked();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        int i39 = fixedOrderComparator12.compare((java.lang.Object) obj_array29, (java.lang.Object) fixedOrderComparator34);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array70);
        fixedOrderComparator72.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array81 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array81);
        int i85 = fixedOrderComparator72.compare((java.lang.Object) fixedOrderComparator83, (java.lang.Object) (-1.0d));
        boolean b86 = fixedOrderComparator63.add((java.lang.Object) fixedOrderComparator72);
        boolean b87 = fixedOrderComparator72.isLocked();
        int i88 = fixedOrderComparator72.getUnknownObjectBehavior();
        int i89 = fixedOrderComparator41.compare((java.lang.Object) obj_array51, (java.lang.Object) fixedOrderComparator72);
        boolean b90 = fixedOrderComparator40.add((java.lang.Object) i89);
        boolean b91 = fixedOrderComparator40.isLocked();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator0.add(obj4);
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = fixedOrderComparator14.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b39 = fixedOrderComparator29.add((java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i41 = fixedOrderComparator40.getUnknownObjectBehavior();
        int i42 = fixedOrderComparator40.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertTrue(i42 == 2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        int i36 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b39 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator34);
        boolean b41 = fixedOrderComparator34.add((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator34.add(obj42);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b72 = fixedOrderComparator58.add((java.lang.Object) obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b83 = fixedOrderComparator73.add((java.lang.Object) obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b86 = fixedOrderComparator34.add((java.lang.Object) obj_array80);
        int i87 = fixedOrderComparator34.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(i87 == 2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        boolean b21 = fixedOrderComparator15.isLocked();
        int i22 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        int i34 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) i33);
        boolean b35 = fixedOrderComparator15.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b49 = fixedOrderComparator36.add((java.lang.Object) fixedOrderComparator48);
        boolean b50 = fixedOrderComparator48.isLocked();
        boolean b51 = fixedOrderComparator48.isLocked();
        boolean b52 = fixedOrderComparator15.add((java.lang.Object) b51);
        fixedOrderComparator15.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        boolean b10 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) (short) 10);
        boolean b21 = fixedOrderComparator18.isLocked();
        fixedOrderComparator18.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        int i36 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b51 = fixedOrderComparator34.add((java.lang.Object) obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b53 = fixedOrderComparator18.add((java.lang.Object) obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        int i57 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior((int) (byte) 0);
        boolean b61 = fixedOrderComparator54.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array68);
        java.lang.Object[] obj_array71 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        boolean b73 = fixedOrderComparator70.add((java.lang.Object) obj_array71);
        boolean b74 = fixedOrderComparator54.add((java.lang.Object) fixedOrderComparator70);
        int i75 = fixedOrderComparator54.getUnknownObjectBehavior();
        try {
            int i76 = fixedOrderComparator0.compare((java.lang.Object) obj_array45, (java.lang.Object) i75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(i75 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator24.setUnknownObjectBehavior(2);
        int i29 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        int i33 = fixedOrderComparator30.getUnknownObjectBehavior();
        fixedOrderComparator30.setUnknownObjectBehavior((int) (byte) 0);
        boolean b36 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator30);
        int i37 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator24);
        try {
            fixedOrderComparator13.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b32 = fixedOrderComparator21.add((java.lang.Object) 0);
        int i33 = fixedOrderComparator8.compare((java.lang.Object) obj_array12, (java.lang.Object) 0);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator41.add((java.lang.Object) 1.0f);
        java.lang.Object obj46 = null;
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        boolean b58 = fixedOrderComparator54.add((java.lang.Object) 1.0f);
        int i59 = fixedOrderComparator54.getUnknownObjectBehavior();
        int i60 = fixedOrderComparator41.compare(obj46, (java.lang.Object) i59);
        boolean b61 = fixedOrderComparator41.isLocked();
        int i62 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i63 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i64 = fixedOrderComparator41.getUnknownObjectBehavior();
        boolean b65 = fixedOrderComparator41.isLocked();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b75 = fixedOrderComparator73.add((java.lang.Object) (-1.0f));
        fixedOrderComparator73.setUnknownObjectBehavior((int) (short) 0);
        boolean b78 = fixedOrderComparator73.isLocked();
        fixedOrderComparator73.setUnknownObjectBehavior(2);
        int i81 = fixedOrderComparator73.getUnknownObjectBehavior();
        int i82 = fixedOrderComparator8.compare((java.lang.Object) b65, (java.lang.Object) i81);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue(i82 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        fixedOrderComparator27.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i40 = fixedOrderComparator27.compare((java.lang.Object) fixedOrderComparator38, (java.lang.Object) (-1.0d));
        boolean b41 = fixedOrderComparator38.isLocked();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b51 = fixedOrderComparator49.add((java.lang.Object) (-1.0f));
        fixedOrderComparator49.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        fixedOrderComparator63.setUnknownObjectBehavior((int) (short) 0);
        int i66 = fixedOrderComparator49.compare((java.lang.Object) 1, (java.lang.Object) fixedOrderComparator63);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        java.lang.Object[] obj_array81 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        fixedOrderComparator82.setUnknownObjectBehavior(0);
        boolean b85 = fixedOrderComparator74.add((java.lang.Object) 0);
        fixedOrderComparator74.setUnknownObjectBehavior((int) (short) 0);
        boolean b88 = fixedOrderComparator74.isLocked();
        boolean b89 = fixedOrderComparator38.addAsEqual((java.lang.Object) i66, (java.lang.Object) b88);
        int i90 = fixedOrderComparator38.getUnknownObjectBehavior();
        int i91 = fixedOrderComparator7.compare((java.lang.Object) obj_array16, (java.lang.Object) i90);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator(obj_array16);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(i90 == 2);
        org.junit.Assert.assertTrue(i91 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b33 = fixedOrderComparator32.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i21 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator19, (java.lang.Object) (-1.0d));
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b33 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        boolean b35 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        fixedOrderComparator29.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b53 = fixedOrderComparator29.add((java.lang.Object) obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b55 = fixedOrderComparator54.isLocked();
        int i56 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior((int) (short) 0);
        try {
            boolean b59 = fixedOrderComparator8.add((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        java.lang.Object obj17 = null;
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator25.add((java.lang.Object) 1.0f);
        int i30 = fixedOrderComparator25.getUnknownObjectBehavior();
        int i31 = fixedOrderComparator12.compare(obj17, (java.lang.Object) i30);
        int i32 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i33 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i35 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 10.0d);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (short) 0);
        boolean b48 = fixedOrderComparator44.add((java.lang.Object) ' ');
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b62 = fixedOrderComparator49.add((java.lang.Object) fixedOrderComparator61);
        int i63 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator44, (java.lang.Object) fixedOrderComparator49);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        boolean b75 = fixedOrderComparator71.add((java.lang.Object) 1.0f);
        int i76 = fixedOrderComparator71.getUnknownObjectBehavior();
        boolean b77 = fixedOrderComparator71.isLocked();
        java.lang.Object[] obj_array78 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array78);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { fixedOrderComparator79 };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array89);
        int i92 = fixedOrderComparator71.compare((java.lang.Object) fixedOrderComparator82, (java.lang.Object) obj_array89);
        boolean b93 = fixedOrderComparator44.add((java.lang.Object) obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator94 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator95 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator96 = new collections.comparators.FixedOrderComparator(obj_array89);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator4.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b9 = fixedOrderComparator7.isLocked();
        boolean b10 = fixedOrderComparator4.add((java.lang.Object) b9);
        boolean b11 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b21 = fixedOrderComparator19.add((java.lang.Object) (-1.0f));
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator4.add((java.lang.Object) i22);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        int i37 = fixedOrderComparator34.getUnknownObjectBehavior();
        fixedOrderComparator34.setUnknownObjectBehavior((int) (byte) 0);
        boolean b40 = fixedOrderComparator31.add((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator31.add(obj41);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        boolean b54 = fixedOrderComparator50.add((java.lang.Object) 1.0f);
        boolean b56 = fixedOrderComparator50.add((java.lang.Object) 1.0f);
        boolean b57 = fixedOrderComparator50.isLocked();
        boolean b58 = fixedOrderComparator50.isLocked();
        boolean b59 = fixedOrderComparator31.add((java.lang.Object) fixedOrderComparator50);
        boolean b60 = fixedOrderComparator50.isLocked();
        boolean b61 = fixedOrderComparator4.add((java.lang.Object) b60);
        boolean b62 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        boolean b63 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array70);
        fixedOrderComparator72.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator72.setUnknownObjectBehavior(2);
        boolean b77 = fixedOrderComparator72.isLocked();
        boolean b78 = fixedOrderComparator72.isLocked();
        fixedOrderComparator72.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        boolean b90 = fixedOrderComparator88.add((java.lang.Object) (short) 10);
        boolean b91 = fixedOrderComparator88.isLocked();
        fixedOrderComparator88.setUnknownObjectBehavior((int) (short) 0);
        try {
            int i94 = fixedOrderComparator4.compare((java.lang.Object) 1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator13.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = fixedOrderComparator17.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        boolean b22 = fixedOrderComparator20.isLocked();
        boolean b23 = fixedOrderComparator17.add((java.lang.Object) b22);
        boolean b24 = fixedOrderComparator17.isLocked();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (-1.0f));
        int i35 = fixedOrderComparator32.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator17.add((java.lang.Object) i35);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        int i50 = fixedOrderComparator47.getUnknownObjectBehavior();
        fixedOrderComparator47.setUnknownObjectBehavior((int) (byte) 0);
        boolean b53 = fixedOrderComparator44.add((java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj54 = null;
        boolean b55 = fixedOrderComparator44.add(obj54);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        boolean b67 = fixedOrderComparator63.add((java.lang.Object) 1.0f);
        boolean b69 = fixedOrderComparator63.add((java.lang.Object) 1.0f);
        boolean b70 = fixedOrderComparator63.isLocked();
        boolean b71 = fixedOrderComparator63.isLocked();
        boolean b72 = fixedOrderComparator44.add((java.lang.Object) fixedOrderComparator63);
        boolean b73 = fixedOrderComparator63.isLocked();
        boolean b74 = fixedOrderComparator17.add((java.lang.Object) b73);
        boolean b75 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator17);
        java.lang.Object[] obj_array82 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array82);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array82);
        java.lang.Object[] obj_array85 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        boolean b87 = fixedOrderComparator84.add((java.lang.Object) obj_array85);
        boolean b88 = fixedOrderComparator17.add((java.lang.Object) b87);
        int i89 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b90 = fixedOrderComparator7.add((java.lang.Object) i89);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj_array82);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(i89 == 2);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        int i16 = fixedOrderComparator13.getUnknownObjectBehavior();
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 0);
        boolean b19 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj21 = null;
        int i22 = fixedOrderComparator13.compare((java.lang.Object) 1.0d, obj21);
        boolean b23 = fixedOrderComparator13.isLocked();
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator13);
        boolean b25 = fixedOrderComparator13.isLocked();
        int i26 = fixedOrderComparator13.getUnknownObjectBehavior();
        boolean b27 = fixedOrderComparator13.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator28.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator28.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        boolean b34 = fixedOrderComparator32.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b37 = fixedOrderComparator35.isLocked();
        boolean b38 = fixedOrderComparator32.add((java.lang.Object) b37);
        boolean b39 = fixedOrderComparator32.isLocked();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b49 = fixedOrderComparator47.add((java.lang.Object) (-1.0f));
        int i50 = fixedOrderComparator47.getUnknownObjectBehavior();
        boolean b51 = fixedOrderComparator32.add((java.lang.Object) i50);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b61 = fixedOrderComparator59.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator62.setUnknownObjectBehavior(0);
        int i65 = fixedOrderComparator62.getUnknownObjectBehavior();
        fixedOrderComparator62.setUnknownObjectBehavior((int) (byte) 0);
        boolean b68 = fixedOrderComparator59.add((java.lang.Object) fixedOrderComparator62);
        java.lang.Object obj69 = null;
        boolean b70 = fixedOrderComparator59.add(obj69);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        fixedOrderComparator78.setUnknownObjectBehavior(0);
        boolean b82 = fixedOrderComparator78.add((java.lang.Object) 1.0f);
        boolean b84 = fixedOrderComparator78.add((java.lang.Object) 1.0f);
        boolean b85 = fixedOrderComparator78.isLocked();
        boolean b86 = fixedOrderComparator78.isLocked();
        boolean b87 = fixedOrderComparator59.add((java.lang.Object) fixedOrderComparator78);
        boolean b88 = fixedOrderComparator78.isLocked();
        boolean b89 = fixedOrderComparator32.add((java.lang.Object) b88);
        boolean b90 = fixedOrderComparator28.add((java.lang.Object) fixedOrderComparator32);
        boolean b91 = fixedOrderComparator28.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator();
        int i93 = fixedOrderComparator92.getUnknownObjectBehavior();
        int i94 = fixedOrderComparator13.compare((java.lang.Object) b91, (java.lang.Object) fixedOrderComparator92);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(i93 == 2);
        org.junit.Assert.assertTrue(i94 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 0);
        boolean b25 = fixedOrderComparator22.isLocked();
        java.lang.Object obj26 = null;
        try {
            boolean b27 = fixedOrderComparator10.addAsEqual((java.lang.Object) fixedOrderComparator22, obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        int i13 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b28 = fixedOrderComparator8.add((java.lang.Object) obj_array20);
        int i29 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator21.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (-1.0f));
        int i35 = fixedOrderComparator32.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (short) 0);
        int i47 = fixedOrderComparator44.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator32.add((java.lang.Object) i47);
        boolean b49 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator32);
        int i50 = fixedOrderComparator7.compare((java.lang.Object) b23, (java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { fixedOrderComparator24, (byte) 10, obj_array58 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array58);
        try {
            fixedOrderComparator66.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertNotNull(obj_array63);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        boolean b37 = fixedOrderComparator33.add((java.lang.Object) 1.0f);
        java.lang.Object obj38 = null;
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator46.add((java.lang.Object) 1.0f);
        int i51 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i52 = fixedOrderComparator33.compare(obj38, (java.lang.Object) i51);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object[] obj_array62 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b64 = fixedOrderComparator61.add((java.lang.Object) obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b68 = fixedOrderComparator7.addAsEqual((java.lang.Object) i51, (java.lang.Object) obj_array62);
        fixedOrderComparator7.setUnknownObjectBehavior(2);
        java.lang.Object obj71 = null;
        boolean b72 = fixedOrderComparator7.add(obj71);
        int i73 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b74 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        int i37 = fixedOrderComparator34.getUnknownObjectBehavior();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array63);
        fixedOrderComparator65.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array74);
        int i78 = fixedOrderComparator65.compare((java.lang.Object) fixedOrderComparator76, (java.lang.Object) (-1.0d));
        boolean b79 = fixedOrderComparator56.add((java.lang.Object) fixedOrderComparator65);
        boolean b80 = fixedOrderComparator65.isLocked();
        int i81 = fixedOrderComparator65.getUnknownObjectBehavior();
        int i82 = fixedOrderComparator34.compare((java.lang.Object) obj_array44, (java.lang.Object) fixedOrderComparator65);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array44);
        try {
            boolean b88 = fixedOrderComparator32.addAsEqual((java.lang.Object) obj_array44, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(i82 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (short) 10);
        boolean b20 = fixedOrderComparator17.isLocked();
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        boolean b23 = fixedOrderComparator4.add((java.lang.Object) fixedOrderComparator17);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b27 = fixedOrderComparator24.isLocked();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        boolean b39 = fixedOrderComparator35.add((java.lang.Object) 1.0f);
        boolean b41 = fixedOrderComparator35.add((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        boolean b45 = fixedOrderComparator42.add((java.lang.Object) 10.0d);
        int i46 = fixedOrderComparator24.compare((java.lang.Object) b41, (java.lang.Object) fixedOrderComparator42);
        int i47 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator24.isLocked();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b58 = fixedOrderComparator56.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator59.setUnknownObjectBehavior(0);
        int i62 = fixedOrderComparator59.getUnknownObjectBehavior();
        fixedOrderComparator59.setUnknownObjectBehavior((int) (byte) 0);
        boolean b65 = fixedOrderComparator56.add((java.lang.Object) fixedOrderComparator59);
        java.lang.Object obj67 = null;
        int i68 = fixedOrderComparator59.compare((java.lang.Object) 1.0d, obj67);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator78.setUnknownObjectBehavior(0);
        int i81 = fixedOrderComparator78.getUnknownObjectBehavior();
        boolean b83 = fixedOrderComparator77.addAsEqual((java.lang.Object) i81, (java.lang.Object) (short) 1);
        int i84 = fixedOrderComparator77.getUnknownObjectBehavior();
        java.lang.Object[] obj_array91 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array91);
        boolean b93 = fixedOrderComparator92.isLocked();
        boolean b94 = fixedOrderComparator77.add((java.lang.Object) fixedOrderComparator92);
        int i96 = fixedOrderComparator59.compare((java.lang.Object) fixedOrderComparator77, (java.lang.Object) 1L);
        int i97 = fixedOrderComparator4.compare((java.lang.Object) b48, (java.lang.Object) fixedOrderComparator77);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i84 == 2);
        org.junit.Assert.assertNotNull(obj_array91);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(i96 == 0);
        org.junit.Assert.assertTrue(i97 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = fixedOrderComparator10.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        fixedOrderComparator38.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i51 = fixedOrderComparator38.compare((java.lang.Object) fixedOrderComparator49, (java.lang.Object) (-1.0d));
        boolean b52 = fixedOrderComparator29.add((java.lang.Object) fixedOrderComparator38);
        boolean b53 = fixedOrderComparator38.isLocked();
        boolean b54 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator38);
        boolean b55 = fixedOrderComparator38.isLocked();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array62);
        fixedOrderComparator64.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array73);
        int i77 = fixedOrderComparator64.compare((java.lang.Object) fixedOrderComparator75, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator78.setUnknownObjectBehavior(0);
        boolean b81 = fixedOrderComparator78.isLocked();
        boolean b82 = fixedOrderComparator75.add((java.lang.Object) fixedOrderComparator78);
        try {
            boolean b83 = fixedOrderComparator10.addAsEqual((java.lang.Object) fixedOrderComparator38, (java.lang.Object) fixedOrderComparator75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) i12, (java.lang.Object) (short) 1);
        int i15 = fixedOrderComparator8.getUnknownObjectBehavior();
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        boolean b21 = fixedOrderComparator18.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b33 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        boolean b35 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        boolean b39 = fixedOrderComparator36.add((java.lang.Object) 10.0d);
        int i40 = fixedOrderComparator18.compare((java.lang.Object) b35, (java.lang.Object) fixedOrderComparator36);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) (short) 10);
        boolean b51 = fixedOrderComparator8.addAsEqual((java.lang.Object) i40, (java.lang.Object) b50);
        int i52 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b53 = fixedOrderComparator8.isLocked();
        int i54 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        int i46 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = null;
        int i49 = fixedOrderComparator7.compare(obj47, obj48);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i68 = fixedOrderComparator7.compare((java.lang.Object) obj_array56, (java.lang.Object) fixedOrderComparator67);
        fixedOrderComparator67.setUnknownObjectBehavior((int) (short) 1);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array77);
        boolean b81 = fixedOrderComparator67.add((java.lang.Object) obj_array77);
        boolean b82 = fixedOrderComparator67.isLocked();
        java.lang.Object obj83 = null;
        boolean b84 = fixedOrderComparator67.add(obj83);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b84 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        boolean b13 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        int i38 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b40 = fixedOrderComparator34.addAsEqual((java.lang.Object) i38, (java.lang.Object) (short) 1);
        int i42 = fixedOrderComparator23.compare((java.lang.Object) fixedOrderComparator34, (java.lang.Object) '#');
        java.lang.Object[] obj_array49 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array49);
        int i57 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator23, (java.lang.Object) obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array49);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator0.add(obj4);
        boolean b6 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i37 = fixedOrderComparator24.compare((java.lang.Object) fixedOrderComparator35, (java.lang.Object) (-1.0d));
        boolean b38 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator24);
        int i39 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b40 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b69 = fixedOrderComparator56.add((java.lang.Object) fixedOrderComparator68);
        boolean b70 = fixedOrderComparator68.isLocked();
        fixedOrderComparator68.setUnknownObjectBehavior(1);
        try {
            boolean b73 = fixedOrderComparator0.addAsEqual((java.lang.Object) obj_array47, (java.lang.Object) fixedOrderComparator68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) 10L);
        boolean b7 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator23);
        try {
            fixedOrderComparator23.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator14.add(obj16);
        boolean b18 = fixedOrderComparator14.isLocked();
        boolean b19 = fixedOrderComparator12.add((java.lang.Object) b18);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        boolean b11 = fixedOrderComparator7.isLocked();
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator12.isLocked();
        boolean b15 = fixedOrderComparator12.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b6 = fixedOrderComparator0.isLocked();
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b21 = fixedOrderComparator19.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        int i25 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior((int) (byte) 0);
        boolean b28 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj29 = null;
        boolean b30 = fixedOrderComparator19.add(obj29);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        fixedOrderComparator39.setUnknownObjectBehavior((int) (short) 0);
        int i42 = fixedOrderComparator39.getUnknownObjectBehavior();
        boolean b43 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator39);
        boolean b44 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator39);
        int i45 = fixedOrderComparator39.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        boolean b46 = fixedOrderComparator7.isLocked();
        boolean b47 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj18 = null;
        int i19 = fixedOrderComparator10.compare((java.lang.Object) 1.0d, obj18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b49 = fixedOrderComparator36.add((java.lang.Object) fixedOrderComparator48);
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { fixedOrderComparator36, obj_array58 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b71 = fixedOrderComparator70.isLocked();
        int i72 = fixedOrderComparator10.compare((java.lang.Object) fixedOrderComparator35, (java.lang.Object) fixedOrderComparator70);
        int i73 = fixedOrderComparator35.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(i73 == 2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        int i16 = fixedOrderComparator13.getUnknownObjectBehavior();
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 0);
        boolean b19 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj21 = null;
        int i22 = fixedOrderComparator13.compare((java.lang.Object) 1.0d, obj21);
        boolean b23 = fixedOrderComparator13.isLocked();
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator13);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        fixedOrderComparator33.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        int i46 = fixedOrderComparator33.compare((java.lang.Object) fixedOrderComparator44, (java.lang.Object) (-1.0d));
        boolean b47 = fixedOrderComparator44.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        boolean b51 = fixedOrderComparator48.isLocked();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        fixedOrderComparator59.setUnknownObjectBehavior(0);
        boolean b63 = fixedOrderComparator59.add((java.lang.Object) 1.0f);
        boolean b65 = fixedOrderComparator59.add((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        boolean b67 = fixedOrderComparator66.isLocked();
        boolean b69 = fixedOrderComparator66.add((java.lang.Object) 10.0d);
        int i70 = fixedOrderComparator48.compare((java.lang.Object) b65, (java.lang.Object) fixedOrderComparator66);
        boolean b71 = fixedOrderComparator48.isLocked();
        int i72 = fixedOrderComparator0.compare((java.lang.Object) b47, (java.lang.Object) fixedOrderComparator48);
        int i73 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i74 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i75 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(i75 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        int i36 = fixedOrderComparator23.compare((java.lang.Object) fixedOrderComparator34, (java.lang.Object) (-1.0d));
        boolean b37 = fixedOrderComparator14.add((java.lang.Object) fixedOrderComparator23);
        boolean b38 = fixedOrderComparator23.isLocked();
        boolean b39 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator23);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator11.setUnknownObjectBehavior(0);
        boolean b15 = fixedOrderComparator11.add((java.lang.Object) 1.0f);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        boolean b21 = fixedOrderComparator18.add((java.lang.Object) 10.0d);
        int i22 = fixedOrderComparator0.compare((java.lang.Object) b17, (java.lang.Object) fixedOrderComparator18);
        boolean b23 = fixedOrderComparator18.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        int i27 = fixedOrderComparator24.getUnknownObjectBehavior();
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator24.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator39.add((java.lang.Object) 0);
        boolean b51 = fixedOrderComparator39.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        boolean b54 = fixedOrderComparator39.add((java.lang.Object) i53);
        int i56 = fixedOrderComparator24.compare((java.lang.Object) fixedOrderComparator39, (java.lang.Object) 100);
        boolean b57 = fixedOrderComparator39.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        java.lang.Object[] obj_array66 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b71 = fixedOrderComparator58.add((java.lang.Object) fixedOrderComparator70);
        fixedOrderComparator58.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { fixedOrderComparator58, obj_array80 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array80);
        int i92 = fixedOrderComparator91.getUnknownObjectBehavior();
        boolean b93 = fixedOrderComparator39.add((java.lang.Object) i92);
        int i94 = fixedOrderComparator39.getUnknownObjectBehavior();
        boolean b95 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(i92 == 2);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(i94 == 2);
        org.junit.Assert.assertTrue(b95 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (-1.0f));
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator22.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) (-1.0f));
        int i36 = fixedOrderComparator33.getUnknownObjectBehavior();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator45.setUnknownObjectBehavior((int) (short) 0);
        int i48 = fixedOrderComparator45.getUnknownObjectBehavior();
        boolean b49 = fixedOrderComparator33.add((java.lang.Object) i48);
        boolean b50 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator33);
        int i51 = fixedOrderComparator8.compare((java.lang.Object) b24, (java.lang.Object) fixedOrderComparator25);
        boolean b52 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator25);
        int i53 = fixedOrderComparator25.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i21 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator19, (java.lang.Object) (-1.0d));
        boolean b22 = fixedOrderComparator19.isLocked();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) (-1.0f));
        fixedOrderComparator30.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (short) 0);
        int i47 = fixedOrderComparator30.compare((java.lang.Object) 1, (java.lang.Object) fixedOrderComparator44);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        boolean b66 = fixedOrderComparator55.add((java.lang.Object) 0);
        fixedOrderComparator55.setUnknownObjectBehavior((int) (short) 0);
        boolean b69 = fixedOrderComparator55.isLocked();
        boolean b70 = fixedOrderComparator19.addAsEqual((java.lang.Object) i47, (java.lang.Object) b69);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (byte) 0);
        int i73 = fixedOrderComparator19.getUnknownObjectBehavior();
        int i74 = fixedOrderComparator19.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(i74 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator21.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (-1.0f));
        int i35 = fixedOrderComparator32.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (short) 0);
        int i47 = fixedOrderComparator44.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator32.add((java.lang.Object) i47);
        boolean b49 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator32);
        int i50 = fixedOrderComparator7.compare((java.lang.Object) b23, (java.lang.Object) fixedOrderComparator24);
        boolean b51 = fixedOrderComparator24.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i20 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 1.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array27);
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        boolean b32 = fixedOrderComparator30.isLocked();
        int i33 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b45 = fixedOrderComparator30.add((java.lang.Object) fixedOrderComparator44);
        boolean b46 = fixedOrderComparator30.isLocked();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        fixedOrderComparator62.setUnknownObjectBehavior(0);
        boolean b65 = fixedOrderComparator54.add((java.lang.Object) 0);
        boolean b66 = fixedOrderComparator54.isLocked();
        int i67 = fixedOrderComparator12.compare((java.lang.Object) fixedOrderComparator30, (java.lang.Object) b66);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        fixedOrderComparator75.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array84 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator87.setUnknownObjectBehavior(0);
        int i90 = fixedOrderComparator87.getUnknownObjectBehavior();
        boolean b92 = fixedOrderComparator86.addAsEqual((java.lang.Object) i90, (java.lang.Object) (short) 1);
        int i94 = fixedOrderComparator75.compare((java.lang.Object) fixedOrderComparator86, (java.lang.Object) '#');
        int i95 = fixedOrderComparator86.getUnknownObjectBehavior();
        boolean b96 = fixedOrderComparator30.add((java.lang.Object) fixedOrderComparator86);
        int i97 = fixedOrderComparator30.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertTrue(i95 == 2);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertTrue(i97 == 2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator7.add(obj17);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator26.add((java.lang.Object) 1.0f);
        boolean b32 = fixedOrderComparator26.add((java.lang.Object) 1.0f);
        boolean b33 = fixedOrderComparator26.isLocked();
        boolean b34 = fixedOrderComparator26.isLocked();
        boolean b35 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator26);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        int i49 = fixedOrderComparator46.getUnknownObjectBehavior();
        fixedOrderComparator46.setUnknownObjectBehavior((int) (byte) 0);
        boolean b53 = fixedOrderComparator46.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object[] obj_array63 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator62.add((java.lang.Object) obj_array63);
        boolean b66 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator62);
        java.lang.Object[] obj_array67 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        boolean b69 = fixedOrderComparator62.add((java.lang.Object) obj_array67);
        boolean b70 = fixedOrderComparator44.add((java.lang.Object) b69);
        int i71 = fixedOrderComparator44.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i71 == 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        int i14 = fixedOrderComparator10.getUnknownObjectBehavior();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b27 = fixedOrderComparator10.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i29 = fixedOrderComparator28.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i29 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b12 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (short) 0);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator7.add((java.lang.Object) i22);
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        int i28 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 0);
        boolean b32 = fixedOrderComparator25.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) (-1.0f));
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        boolean b45 = fixedOrderComparator43.isLocked();
        fixedOrderComparator43.setUnknownObjectBehavior(0);
        int i48 = fixedOrderComparator25.compare((java.lang.Object) fixedOrderComparator40, (java.lang.Object) 0);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        boolean b59 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator56);
        boolean b60 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj61 = null;
        boolean b62 = fixedOrderComparator40.add(obj61);
        boolean b63 = fixedOrderComparator40.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator16.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b39 = fixedOrderComparator38.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array2 = new java.lang.Object[] { fixedOrderComparator1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i17 = fixedOrderComparator12.getUnknownObjectBehavior();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b46 = fixedOrderComparator32.add((java.lang.Object) obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b48 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        int i52 = fixedOrderComparator49.getUnknownObjectBehavior();
        int i53 = fixedOrderComparator49.getUnknownObjectBehavior();
        boolean b54 = fixedOrderComparator49.isLocked();
        boolean b55 = fixedOrderComparator49.isLocked();
        boolean b56 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator49);
        int i57 = fixedOrderComparator49.getUnknownObjectBehavior();
        boolean b58 = fixedOrderComparator4.add((java.lang.Object) i57);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b47 = fixedOrderComparator34.add((java.lang.Object) fixedOrderComparator46);
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { fixedOrderComparator34, obj_array56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array56);
        boolean b66 = fixedOrderComparator65.isLocked();
        boolean b67 = fixedOrderComparator33.add((java.lang.Object) fixedOrderComparator65);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        int i13 = fixedOrderComparator8.getUnknownObjectBehavior();
        int i14 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b15 = fixedOrderComparator8.isLocked();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i29 = fixedOrderComparator28.getUnknownObjectBehavior();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        int i42 = fixedOrderComparator39.getUnknownObjectBehavior();
        boolean b44 = fixedOrderComparator38.addAsEqual((java.lang.Object) i42, (java.lang.Object) (short) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        int i48 = fixedOrderComparator45.getUnknownObjectBehavior();
        fixedOrderComparator45.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator45.setUnknownObjectBehavior(1);
        boolean b53 = fixedOrderComparator38.add((java.lang.Object) 1);
        boolean b54 = fixedOrderComparator28.add((java.lang.Object) 1);
        boolean b55 = fixedOrderComparator8.add((java.lang.Object) b54);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        int i16 = fixedOrderComparator13.getUnknownObjectBehavior();
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 0);
        boolean b19 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj21 = null;
        int i22 = fixedOrderComparator13.compare((java.lang.Object) 1.0d, obj21);
        boolean b23 = fixedOrderComparator13.isLocked();
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator13);
        boolean b25 = fixedOrderComparator13.isLocked();
        boolean b26 = fixedOrderComparator13.isLocked();
        int i27 = fixedOrderComparator13.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator13.isLocked();
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj32 = null;
        boolean b33 = fixedOrderComparator31.add(obj32);
        boolean b34 = fixedOrderComparator31.isLocked();
        int i35 = fixedOrderComparator31.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i14 = fixedOrderComparator13.getUnknownObjectBehavior();
        int i15 = fixedOrderComparator13.getUnknownObjectBehavior();
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator18.isLocked();
        boolean b21 = fixedOrderComparator18.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator22.isLocked();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        boolean b27 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator22);
        int i28 = fixedOrderComparator22.getUnknownObjectBehavior();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        int i54 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b56 = fixedOrderComparator50.addAsEqual((java.lang.Object) i54, (java.lang.Object) (short) 1);
        int i57 = fixedOrderComparator50.getUnknownObjectBehavior();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b66 = fixedOrderComparator65.isLocked();
        boolean b67 = fixedOrderComparator50.add((java.lang.Object) fixedOrderComparator65);
        boolean b68 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator50);
        boolean b69 = fixedOrderComparator22.add((java.lang.Object) fixedOrderComparator37);
        boolean b70 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator22);
        boolean b71 = fixedOrderComparator13.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        int i43 = fixedOrderComparator40.getUnknownObjectBehavior();
        fixedOrderComparator40.setUnknownObjectBehavior((int) (byte) 0);
        boolean b47 = fixedOrderComparator40.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b57 = fixedOrderComparator55.add((java.lang.Object) (-1.0f));
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        boolean b60 = fixedOrderComparator58.isLocked();
        fixedOrderComparator58.setUnknownObjectBehavior(0);
        int i63 = fixedOrderComparator40.compare((java.lang.Object) fixedOrderComparator55, (java.lang.Object) 0);
        int i64 = fixedOrderComparator40.getUnknownObjectBehavior();
        boolean b65 = fixedOrderComparator40.isLocked();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        fixedOrderComparator73.setUnknownObjectBehavior(0);
        boolean b77 = fixedOrderComparator73.add((java.lang.Object) 1.0f);
        int i78 = fixedOrderComparator73.getUnknownObjectBehavior();
        boolean b79 = fixedOrderComparator73.isLocked();
        try {
            int i80 = fixedOrderComparator39.compare((java.lang.Object) fixedOrderComparator40, (java.lang.Object) b79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) i12, (java.lang.Object) (short) 1);
        int i15 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator23.isLocked();
        boolean b25 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        int i29 = fixedOrderComparator26.getUnknownObjectBehavior();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        fixedOrderComparator57.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array66);
        int i70 = fixedOrderComparator57.compare((java.lang.Object) fixedOrderComparator68, (java.lang.Object) (-1.0d));
        boolean b71 = fixedOrderComparator48.add((java.lang.Object) fixedOrderComparator57);
        boolean b72 = fixedOrderComparator57.isLocked();
        int i73 = fixedOrderComparator57.getUnknownObjectBehavior();
        int i74 = fixedOrderComparator26.compare((java.lang.Object) obj_array36, (java.lang.Object) fixedOrderComparator57);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b76 = fixedOrderComparator75.isLocked();
        int i77 = fixedOrderComparator75.getUnknownObjectBehavior();
        boolean b78 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator75);
        int i79 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == 2);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i79 == 2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        int i21 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        boolean b25 = fixedOrderComparator22.add((java.lang.Object) 10.0d);
        java.lang.Object obj26 = null;
        boolean b27 = fixedOrderComparator22.add(obj26);
        boolean b28 = fixedOrderComparator22.isLocked();
        boolean b29 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i40 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator22, (java.lang.Object) obj_array36);
        try {
            fixedOrderComparator22.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b6 = fixedOrderComparator0.isLocked();
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (-1.0f));
        int i20 = fixedOrderComparator17.getUnknownObjectBehavior();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (short) 0);
        int i32 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b33 = fixedOrderComparator17.add((java.lang.Object) i32);
        int i34 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i35 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator17.isLocked();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b46 = fixedOrderComparator45.isLocked();
        int i47 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator17, (java.lang.Object) fixedOrderComparator45);
        boolean b48 = fixedOrderComparator17.isLocked();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        boolean b60 = fixedOrderComparator56.add((java.lang.Object) 1.0f);
        int i61 = fixedOrderComparator56.getUnknownObjectBehavior();
        boolean b62 = fixedOrderComparator56.isLocked();
        java.lang.Object[] obj_array63 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { fixedOrderComparator64 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array74);
        int i77 = fixedOrderComparator56.compare((java.lang.Object) fixedOrderComparator67, (java.lang.Object) obj_array74);
        java.lang.Object obj78 = null;
        try {
            int i79 = fixedOrderComparator17.compare((java.lang.Object) obj_array74, obj78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(i77 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b28 = fixedOrderComparator17.add((java.lang.Object) 0);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        boolean b31 = fixedOrderComparator17.isLocked();
        boolean b32 = fixedOrderComparator17.isLocked();
        boolean b33 = fixedOrderComparator17.isLocked();
        int i34 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i35 = fixedOrderComparator17.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator43.setUnknownObjectBehavior(0);
        boolean b47 = fixedOrderComparator43.add((java.lang.Object) 1.0f);
        java.lang.Object obj48 = null;
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        boolean b60 = fixedOrderComparator56.add((java.lang.Object) 1.0f);
        int i61 = fixedOrderComparator56.getUnknownObjectBehavior();
        int i62 = fixedOrderComparator43.compare(obj48, (java.lang.Object) i61);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.lang.Object[] obj_array72 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b74 = fixedOrderComparator71.add((java.lang.Object) obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b78 = fixedOrderComparator17.addAsEqual((java.lang.Object) i61, (java.lang.Object) obj_array72);
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        boolean b81 = fixedOrderComparator7.add((java.lang.Object) 0);
        int i82 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        int i38 = fixedOrderComparator36.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(i38 == 2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) i12, (java.lang.Object) (short) 1);
        int i15 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        int i27 = fixedOrderComparator24.getUnknownObjectBehavior();
        int i28 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        int i32 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior((int) (byte) 0);
        int i35 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator24.add((java.lang.Object) i35);
        boolean b37 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b47 = fixedOrderComparator45.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        int i51 = fixedOrderComparator48.getUnknownObjectBehavior();
        fixedOrderComparator48.setUnknownObjectBehavior((int) (byte) 0);
        boolean b54 = fixedOrderComparator45.add((java.lang.Object) fixedOrderComparator48);
        java.lang.Object obj56 = null;
        int i57 = fixedOrderComparator48.compare((java.lang.Object) 1.0d, obj56);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator67.setUnknownObjectBehavior(0);
        int i70 = fixedOrderComparator67.getUnknownObjectBehavior();
        boolean b72 = fixedOrderComparator66.addAsEqual((java.lang.Object) i70, (java.lang.Object) (short) 1);
        int i73 = fixedOrderComparator66.getUnknownObjectBehavior();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b82 = fixedOrderComparator81.isLocked();
        boolean b83 = fixedOrderComparator66.add((java.lang.Object) fixedOrderComparator81);
        int i85 = fixedOrderComparator48.compare((java.lang.Object) fixedOrderComparator66, (java.lang.Object) 1L);
        int i86 = fixedOrderComparator48.getUnknownObjectBehavior();
        boolean b87 = fixedOrderComparator48.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator();
        int i89 = fixedOrderComparator88.getUnknownObjectBehavior();
        boolean b90 = fixedOrderComparator88.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator();
        int i92 = fixedOrderComparator91.getUnknownObjectBehavior();
        boolean b93 = fixedOrderComparator91.isLocked();
        boolean b94 = fixedOrderComparator88.add((java.lang.Object) b93);
        boolean b95 = fixedOrderComparator88.isLocked();
        int i96 = fixedOrderComparator88.getUnknownObjectBehavior();
        int i97 = fixedOrderComparator88.getUnknownObjectBehavior();
        boolean b98 = fixedOrderComparator88.isLocked();
        try {
            boolean b99 = fixedOrderComparator8.addAsEqual((java.lang.Object) fixedOrderComparator48, (java.lang.Object) fixedOrderComparator88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(i89 == 2);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(i92 == 2);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(i96 == 2);
        org.junit.Assert.assertTrue(i97 == 2);
        org.junit.Assert.assertTrue(b98 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        boolean b32 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        boolean b7 = fixedOrderComparator0.isLocked();
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b55 = fixedOrderComparator41.add((java.lang.Object) obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj57 = null;
        boolean b58 = fixedOrderComparator56.add(obj57);
        boolean b59 = fixedOrderComparator56.isLocked();
        boolean b60 = fixedOrderComparator56.isLocked();
        int i61 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator26, (java.lang.Object) b60);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b13 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator23.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator23.isLocked();
        int i27 = fixedOrderComparator23.getUnknownObjectBehavior();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b40 = fixedOrderComparator23.add((java.lang.Object) obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b42 = fixedOrderComparator7.add((java.lang.Object) obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array34);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b54 = fixedOrderComparator52.add((java.lang.Object) (short) 10);
        boolean b55 = fixedOrderComparator52.isLocked();
        fixedOrderComparator52.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i69 = fixedOrderComparator68.getUnknownObjectBehavior();
        int i70 = fixedOrderComparator68.getUnknownObjectBehavior();
        boolean b71 = fixedOrderComparator68.isLocked();
        int i72 = fixedOrderComparator68.getUnknownObjectBehavior();
        java.lang.Object[] obj_array79 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array79);
        boolean b85 = fixedOrderComparator68.add((java.lang.Object) obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array79);
        boolean b87 = fixedOrderComparator52.add((java.lang.Object) obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array79);
        boolean b90 = fixedOrderComparator44.add((java.lang.Object) obj_array79);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i69 == 2);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i20 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 1.0d);
        boolean b21 = fixedOrderComparator12.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) (-1.0f));
        fixedOrderComparator29.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array40);
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        boolean b45 = fixedOrderComparator43.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b56 = fixedOrderComparator54.add((java.lang.Object) (-1.0f));
        int i57 = fixedOrderComparator54.getUnknownObjectBehavior();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        fixedOrderComparator66.setUnknownObjectBehavior((int) (short) 0);
        int i69 = fixedOrderComparator66.getUnknownObjectBehavior();
        boolean b70 = fixedOrderComparator54.add((java.lang.Object) i69);
        boolean b71 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator54);
        int i72 = fixedOrderComparator29.compare((java.lang.Object) b45, (java.lang.Object) fixedOrderComparator46);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array80);
        java.lang.Object[] obj_array85 = new java.lang.Object[] { fixedOrderComparator46, (byte) 10, obj_array80 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array80);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b91 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator90);
        int i92 = fixedOrderComparator90.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(i92 == 2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) i12, (java.lang.Object) (short) 1);
        int i15 = fixedOrderComparator8.getUnknownObjectBehavior();
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        fixedOrderComparator26.setUnknownObjectBehavior((int) (short) 0);
        int i29 = fixedOrderComparator26.getUnknownObjectBehavior();
        java.lang.Object obj31 = null;
        boolean b32 = fixedOrderComparator26.addAsEqual((java.lang.Object) 10.0f, obj31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        int i36 = fixedOrderComparator33.getUnknownObjectBehavior();
        fixedOrderComparator33.setUnknownObjectBehavior((int) (byte) 0);
        boolean b39 = fixedOrderComparator33.isLocked();
        int i40 = fixedOrderComparator33.getUnknownObjectBehavior();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i51 = fixedOrderComparator50.getUnknownObjectBehavior();
        int i52 = fixedOrderComparator26.compare((java.lang.Object) fixedOrderComparator33, (java.lang.Object) i51);
        boolean b53 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator33);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = fixedOrderComparator14.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj30 = null;
        boolean b31 = fixedOrderComparator29.add(obj30);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array40);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator51.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        int i64 = fixedOrderComparator51.compare((java.lang.Object) fixedOrderComparator62, (java.lang.Object) (-1.0d));
        boolean b65 = fixedOrderComparator42.add((java.lang.Object) fixedOrderComparator51);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b75 = fixedOrderComparator74.isLocked();
        boolean b76 = fixedOrderComparator74.isLocked();
        int i77 = fixedOrderComparator74.getUnknownObjectBehavior();
        boolean b78 = fixedOrderComparator42.add((java.lang.Object) fixedOrderComparator74);
        boolean b79 = fixedOrderComparator29.add((java.lang.Object) fixedOrderComparator74);
        try {
            fixedOrderComparator29.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == 2);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        int i36 = fixedOrderComparator23.compare((java.lang.Object) fixedOrderComparator34, (java.lang.Object) (-1.0d));
        boolean b37 = fixedOrderComparator14.add((java.lang.Object) fixedOrderComparator23);
        boolean b38 = fixedOrderComparator23.isLocked();
        boolean b39 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator23);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i20 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 1.0d);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        int i23 = fixedOrderComparator12.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator12.isLocked();
        boolean b25 = fixedOrderComparator12.isLocked();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator34.add((java.lang.Object) 0);
        fixedOrderComparator34.setUnknownObjectBehavior((int) (short) 0);
        boolean b48 = fixedOrderComparator34.isLocked();
        boolean b49 = fixedOrderComparator34.isLocked();
        boolean b50 = fixedOrderComparator34.isLocked();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array57);
        int i62 = fixedOrderComparator61.getUnknownObjectBehavior();
        int i63 = fixedOrderComparator61.getUnknownObjectBehavior();
        boolean b64 = fixedOrderComparator61.isLocked();
        int i65 = fixedOrderComparator61.getUnknownObjectBehavior();
        boolean b66 = fixedOrderComparator34.add((java.lang.Object) fixedOrderComparator61);
        boolean b67 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator61);
        int i68 = fixedOrderComparator61.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i68 == 2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = fixedOrderComparator10.isLocked();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        int i27 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b29 = fixedOrderComparator23.addAsEqual((java.lang.Object) i27, (java.lang.Object) (short) 1);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b43 = fixedOrderComparator23.add((java.lang.Object) fixedOrderComparator42);
        int i44 = fixedOrderComparator42.getUnknownObjectBehavior();
        boolean b45 = fixedOrderComparator42.isLocked();
        int i46 = fixedOrderComparator42.getUnknownObjectBehavior();
        boolean b47 = fixedOrderComparator10.add((java.lang.Object) i46);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        int i29 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b30 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) 10L);
        boolean b7 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator23);
        fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array53);
        fixedOrderComparator55.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i68 = fixedOrderComparator55.compare((java.lang.Object) fixedOrderComparator66, (java.lang.Object) (-1.0d));
        boolean b69 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator55);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        boolean b79 = fixedOrderComparator78.isLocked();
        boolean b80 = fixedOrderComparator78.isLocked();
        int i81 = fixedOrderComparator78.getUnknownObjectBehavior();
        boolean b82 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator78);
        boolean b83 = fixedOrderComparator36.add((java.lang.Object) b82);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        fixedOrderComparator18.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        int i31 = fixedOrderComparator18.compare((java.lang.Object) fixedOrderComparator29, (java.lang.Object) (-1.0d));
        boolean b32 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) (-1.0f));
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array52);
        fixedOrderComparator54.setUnknownObjectBehavior((int) (short) 0);
        int i57 = fixedOrderComparator40.compare((java.lang.Object) 1, (java.lang.Object) fixedOrderComparator54);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        fixedOrderComparator73.setUnknownObjectBehavior(0);
        boolean b76 = fixedOrderComparator65.add((java.lang.Object) 0);
        fixedOrderComparator65.setUnknownObjectBehavior((int) (short) 0);
        boolean b79 = fixedOrderComparator65.isLocked();
        boolean b80 = fixedOrderComparator29.addAsEqual((java.lang.Object) i57, (java.lang.Object) b79);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (byte) 0);
        int i83 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b84 = fixedOrderComparator29.isLocked();
        boolean b85 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator29);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        int i29 = fixedOrderComparator28.getUnknownObjectBehavior();
        boolean b30 = fixedOrderComparator28.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        int i32 = fixedOrderComparator31.getUnknownObjectBehavior();
        boolean b33 = fixedOrderComparator31.isLocked();
        boolean b34 = fixedOrderComparator28.add((java.lang.Object) b33);
        boolean b35 = fixedOrderComparator28.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        int i39 = fixedOrderComparator36.getUnknownObjectBehavior();
        fixedOrderComparator36.setUnknownObjectBehavior((int) (byte) 0);
        boolean b43 = fixedOrderComparator36.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object[] obj_array53 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b55 = fixedOrderComparator52.add((java.lang.Object) obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b59 = fixedOrderComparator36.add((java.lang.Object) fixedOrderComparator58);
        int i60 = fixedOrderComparator36.getUnknownObjectBehavior();
        try {
            boolean b61 = fixedOrderComparator7.addAsEqual((java.lang.Object) fixedOrderComparator28, (java.lang.Object) fixedOrderComparator36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i60 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator0.add(obj4);
        boolean b6 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i37 = fixedOrderComparator24.compare((java.lang.Object) fixedOrderComparator35, (java.lang.Object) (-1.0d));
        boolean b38 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator24);
        int i39 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b40 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        boolean b52 = fixedOrderComparator48.add((java.lang.Object) 1.0f);
        int i53 = fixedOrderComparator48.getUnknownObjectBehavior();
        boolean b54 = fixedOrderComparator48.isLocked();
        java.lang.Object[] obj_array55 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { fixedOrderComparator56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array66);
        int i69 = fixedOrderComparator48.compare((java.lang.Object) fixedOrderComparator59, (java.lang.Object) obj_array66);
        boolean b70 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator48);
        boolean b71 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        int i46 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = null;
        int i49 = fixedOrderComparator7.compare(obj47, obj48);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i68 = fixedOrderComparator7.compare((java.lang.Object) obj_array56, (java.lang.Object) fixedOrderComparator67);
        fixedOrderComparator67.setUnknownObjectBehavior((int) (short) 1);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array77);
        boolean b81 = fixedOrderComparator67.add((java.lang.Object) obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array77);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) (-1.0f));
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        boolean b39 = fixedOrderComparator37.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) (-1.0f));
        int i51 = fixedOrderComparator48.getUnknownObjectBehavior();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        fixedOrderComparator60.setUnknownObjectBehavior((int) (short) 0);
        int i63 = fixedOrderComparator60.getUnknownObjectBehavior();
        boolean b64 = fixedOrderComparator48.add((java.lang.Object) i63);
        boolean b65 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator48);
        int i66 = fixedOrderComparator23.compare((java.lang.Object) b39, (java.lang.Object) fixedOrderComparator40);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array74);
        java.lang.Object[] obj_array79 = new java.lang.Object[] { fixedOrderComparator40, (byte) 10, obj_array74 };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b83 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator82);
        int i84 = fixedOrderComparator13.getUnknownObjectBehavior();
        boolean b85 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator13);
        int i86 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i84 == 2);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(i86 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        int i14 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        fixedOrderComparator46.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i59 = fixedOrderComparator46.compare((java.lang.Object) fixedOrderComparator57, (java.lang.Object) (-1.0d));
        boolean b60 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator46);
        boolean b61 = fixedOrderComparator46.isLocked();
        int i62 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i63 = fixedOrderComparator15.compare((java.lang.Object) obj_array25, (java.lang.Object) fixedOrderComparator46);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        boolean b66 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator64);
        boolean b67 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (-1.0f));
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (short) 0);
        int i23 = fixedOrderComparator20.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator8.add((java.lang.Object) i23);
        boolean b25 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj26 = null;
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        int i39 = fixedOrderComparator36.getUnknownObjectBehavior();
        boolean b41 = fixedOrderComparator35.addAsEqual((java.lang.Object) i39, (java.lang.Object) (short) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator42.setUnknownObjectBehavior(1);
        boolean b50 = fixedOrderComparator35.add((java.lang.Object) 1);
        try {
            boolean b51 = fixedOrderComparator0.addAsEqual(obj26, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        fixedOrderComparator11.setUnknownObjectBehavior((int) (byte) 1);
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        fixedOrderComparator11.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        int i36 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b37 = fixedOrderComparator34.isLocked();
        int i38 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b39 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator34);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        int i41 = fixedOrderComparator40.getUnknownObjectBehavior();
        boolean b42 = fixedOrderComparator40.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        boolean b45 = fixedOrderComparator43.isLocked();
        boolean b46 = fixedOrderComparator40.add((java.lang.Object) b45);
        boolean b47 = fixedOrderComparator40.isLocked();
        int i48 = fixedOrderComparator40.getUnknownObjectBehavior();
        boolean b49 = fixedOrderComparator7.add((java.lang.Object) i48);
        int i50 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        boolean b19 = fixedOrderComparator7.isLocked();
        boolean b20 = fixedOrderComparator7.isLocked();
        int i21 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        boolean b25 = fixedOrderComparator22.isLocked();
        boolean b26 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        boolean b38 = fixedOrderComparator34.add((java.lang.Object) 1.0f);
        boolean b40 = fixedOrderComparator34.add((java.lang.Object) 1.0f);
        int i42 = fixedOrderComparator22.compare((java.lang.Object) fixedOrderComparator34, (java.lang.Object) 1.0d);
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        boolean b58 = fixedOrderComparator56.isLocked();
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        int i61 = fixedOrderComparator34.compare((java.lang.Object) obj_array51, (java.lang.Object) fixedOrderComparator56);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b66 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator65);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (short) 0);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator7.add((java.lang.Object) i22);
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        int i28 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 0);
        boolean b32 = fixedOrderComparator25.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) (-1.0f));
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        boolean b45 = fixedOrderComparator43.isLocked();
        fixedOrderComparator43.setUnknownObjectBehavior(0);
        int i48 = fixedOrderComparator25.compare((java.lang.Object) fixedOrderComparator40, (java.lang.Object) 0);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        boolean b59 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator56);
        boolean b60 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj61 = null;
        boolean b62 = fixedOrderComparator40.add(obj61);
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 0);
        boolean b23 = fixedOrderComparator16.isLocked();
        boolean b24 = fixedOrderComparator16.isLocked();
        java.lang.Object obj25 = null;
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        java.lang.Object[] obj_array35 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator34.add((java.lang.Object) obj_array35);
        try {
            boolean b38 = fixedOrderComparator16.addAsEqual(obj25, (java.lang.Object) b37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator8.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        int i16 = fixedOrderComparator13.getUnknownObjectBehavior();
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 0);
        int i19 = fixedOrderComparator13.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator8.add((java.lang.Object) i19);
        boolean b21 = fixedOrderComparator8.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        int i25 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior((int) (byte) 0);
        boolean b28 = fixedOrderComparator22.isLocked();
        int i29 = fixedOrderComparator22.getUnknownObjectBehavior();
        int i30 = fixedOrderComparator22.getUnknownObjectBehavior();
        int i31 = fixedOrderComparator22.getUnknownObjectBehavior();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) (-1.0f));
        int i42 = fixedOrderComparator39.getUnknownObjectBehavior();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator51.setUnknownObjectBehavior((int) (short) 0);
        int i54 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b55 = fixedOrderComparator39.add((java.lang.Object) i54);
        int i56 = fixedOrderComparator39.getUnknownObjectBehavior();
        int i57 = fixedOrderComparator39.getUnknownObjectBehavior();
        boolean b58 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b68 = fixedOrderComparator67.isLocked();
        int i69 = fixedOrderComparator22.compare((java.lang.Object) fixedOrderComparator39, (java.lang.Object) fixedOrderComparator67);
        boolean b70 = fixedOrderComparator39.isLocked();
        boolean b71 = fixedOrderComparator8.add((java.lang.Object) b70);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        int i36 = fixedOrderComparator23.compare((java.lang.Object) fixedOrderComparator34, (java.lang.Object) (-1.0d));
        boolean b37 = fixedOrderComparator14.add((java.lang.Object) fixedOrderComparator23);
        boolean b38 = fixedOrderComparator23.isLocked();
        boolean b39 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator23);
        boolean b40 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b14 = fixedOrderComparator7.isLocked();
        int i15 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = null;
        int i18 = fixedOrderComparator7.compare(obj16, obj17);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        int i34 = fixedOrderComparator32.getUnknownObjectBehavior();
        fixedOrderComparator32.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        boolean b39 = fixedOrderComparator37.isLocked();
        boolean b40 = fixedOrderComparator37.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        int i42 = fixedOrderComparator41.getUnknownObjectBehavior();
        boolean b43 = fixedOrderComparator41.isLocked();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        boolean b46 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator41);
        int i47 = fixedOrderComparator41.getUnknownObjectBehavior();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        fixedOrderComparator56.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator70.setUnknownObjectBehavior(0);
        int i73 = fixedOrderComparator70.getUnknownObjectBehavior();
        boolean b75 = fixedOrderComparator69.addAsEqual((java.lang.Object) i73, (java.lang.Object) (short) 1);
        int i76 = fixedOrderComparator69.getUnknownObjectBehavior();
        java.lang.Object[] obj_array83 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        boolean b85 = fixedOrderComparator84.isLocked();
        boolean b86 = fixedOrderComparator69.add((java.lang.Object) fixedOrderComparator84);
        boolean b87 = fixedOrderComparator56.add((java.lang.Object) fixedOrderComparator69);
        boolean b88 = fixedOrderComparator41.add((java.lang.Object) fixedOrderComparator56);
        boolean b89 = fixedOrderComparator32.add((java.lang.Object) fixedOrderComparator41);
        int i90 = fixedOrderComparator32.getUnknownObjectBehavior();
        int i91 = fixedOrderComparator32.getUnknownObjectBehavior();
        try {
            boolean b92 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(i76 == 2);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(i91 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator27);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator15.isLocked();
        int i33 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) 2);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array40);
        fixedOrderComparator42.setUnknownObjectBehavior((int) (short) 0);
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        java.lang.Object obj47 = null;
        boolean b48 = fixedOrderComparator42.addAsEqual((java.lang.Object) 10.0f, obj47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b62 = fixedOrderComparator49.add((java.lang.Object) fixedOrderComparator61);
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b65 = fixedOrderComparator49.isLocked();
        int i67 = fixedOrderComparator42.compare((java.lang.Object) fixedOrderComparator49, (java.lang.Object) 2);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b77 = fixedOrderComparator75.add((java.lang.Object) (-1.0f));
        int i78 = fixedOrderComparator75.getUnknownObjectBehavior();
        java.lang.Object[] obj_array85 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        fixedOrderComparator87.setUnknownObjectBehavior((int) (short) 0);
        int i90 = fixedOrderComparator87.getUnknownObjectBehavior();
        boolean b91 = fixedOrderComparator75.add((java.lang.Object) i90);
        boolean b92 = fixedOrderComparator49.add((java.lang.Object) b91);
        fixedOrderComparator49.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj95 = null;
        int i96 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator49, obj95);
        int i97 = fixedOrderComparator8.getUnknownObjectBehavior();
        int i98 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(i78 == 2);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(i96 == (-1));
        org.junit.Assert.assertTrue(i97 == 0);
        org.junit.Assert.assertTrue(i98 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = fixedOrderComparator14.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (short) 1);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (short) 0);
        int i36 = fixedOrderComparator29.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator27);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator15.isLocked();
        int i33 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator15.add((java.lang.Object) i35);
        boolean b37 = fixedOrderComparator15.isLocked();
        int i38 = fixedOrderComparator15.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) i12, (java.lang.Object) (short) 1);
        int i15 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        int i27 = fixedOrderComparator24.getUnknownObjectBehavior();
        int i28 = fixedOrderComparator24.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        int i32 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior((int) (byte) 0);
        int i35 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator24.add((java.lang.Object) i35);
        boolean b37 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator24);
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b65 = fixedOrderComparator51.add((java.lang.Object) obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array73);
        boolean b76 = fixedOrderComparator66.add((java.lang.Object) obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array73);
        java.lang.Object obj78 = null;
        boolean b79 = fixedOrderComparator77.add(obj78);
        boolean b80 = fixedOrderComparator77.isLocked();
        boolean b81 = fixedOrderComparator35.add((java.lang.Object) fixedOrderComparator77);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i28 = fixedOrderComparator7.compare((java.lang.Object) fixedOrderComparator18, (java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i35 == 2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i20 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 1.0d);
        int i21 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b22 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        int i39 = fixedOrderComparator36.getUnknownObjectBehavior();
        fixedOrderComparator36.setUnknownObjectBehavior((int) (byte) 0);
        boolean b42 = fixedOrderComparator33.add((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj44 = null;
        int i45 = fixedOrderComparator36.compare((java.lang.Object) 1.0d, obj44);
        boolean b46 = fixedOrderComparator36.isLocked();
        boolean b47 = fixedOrderComparator23.add((java.lang.Object) fixedOrderComparator36);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        fixedOrderComparator55.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator67.setUnknownObjectBehavior(0);
        int i70 = fixedOrderComparator67.getUnknownObjectBehavior();
        boolean b72 = fixedOrderComparator66.addAsEqual((java.lang.Object) i70, (java.lang.Object) (short) 1);
        int i74 = fixedOrderComparator55.compare((java.lang.Object) fixedOrderComparator66, (java.lang.Object) '#');
        int i75 = fixedOrderComparator0.compare((java.lang.Object) b47, (java.lang.Object) '#');
        int i76 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(i76 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        int i24 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i25 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        boolean b37 = fixedOrderComparator33.add((java.lang.Object) 1.0f);
        java.lang.Object obj38 = null;
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator46.add((java.lang.Object) 1.0f);
        int i51 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i52 = fixedOrderComparator33.compare(obj38, (java.lang.Object) i51);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object[] obj_array62 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b64 = fixedOrderComparator61.add((java.lang.Object) obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b68 = fixedOrderComparator7.addAsEqual((java.lang.Object) i51, (java.lang.Object) obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array62);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator16.add((java.lang.Object) obj_array21);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator31.add((java.lang.Object) 1.0f);
        int i36 = fixedOrderComparator31.getUnknownObjectBehavior();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array54);
        int i60 = fixedOrderComparator31.compare((java.lang.Object) fixedOrderComparator47, (java.lang.Object) fixedOrderComparator59);
        boolean b61 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator31);
        boolean b62 = fixedOrderComparator31.isLocked();
        try {
            fixedOrderComparator31.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        fixedOrderComparator40.setUnknownObjectBehavior((int) (short) 0);
        int i43 = fixedOrderComparator40.getUnknownObjectBehavior();
        java.lang.Object obj45 = null;
        boolean b46 = fixedOrderComparator40.addAsEqual((java.lang.Object) 10.0f, obj45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b60 = fixedOrderComparator47.add((java.lang.Object) fixedOrderComparator59);
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        boolean b63 = fixedOrderComparator47.isLocked();
        int i65 = fixedOrderComparator40.compare((java.lang.Object) fixedOrderComparator47, (java.lang.Object) 2);
        java.lang.Object[] obj_array66 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { fixedOrderComparator67 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array68);
        boolean b72 = fixedOrderComparator47.add((java.lang.Object) fixedOrderComparator71);
        boolean b73 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator47);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b83 = fixedOrderComparator81.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator84.setUnknownObjectBehavior(0);
        int i87 = fixedOrderComparator84.getUnknownObjectBehavior();
        fixedOrderComparator84.setUnknownObjectBehavior((int) (byte) 0);
        boolean b90 = fixedOrderComparator81.add((java.lang.Object) fixedOrderComparator84);
        java.lang.Object obj92 = null;
        int i93 = fixedOrderComparator84.compare((java.lang.Object) 1.0d, obj92);
        int i94 = fixedOrderComparator84.getUnknownObjectBehavior();
        boolean b95 = fixedOrderComparator7.add((java.lang.Object) i94);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(i93 == 0);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator18.addAsEqual((java.lang.Object) i22, (java.lang.Object) (short) 1);
        int i26 = fixedOrderComparator7.compare((java.lang.Object) fixedOrderComparator18, (java.lang.Object) '#');
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        boolean b37 = fixedOrderComparator18.add((java.lang.Object) i36);
        int i38 = fixedOrderComparator18.getUnknownObjectBehavior();
        int i39 = fixedOrderComparator18.getUnknownObjectBehavior();
        int i40 = fixedOrderComparator18.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(i40 == 2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator0.add(obj4);
        boolean b6 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i37 = fixedOrderComparator24.compare((java.lang.Object) fixedOrderComparator35, (java.lang.Object) (-1.0d));
        boolean b38 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator24);
        int i39 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b40 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        boolean b52 = fixedOrderComparator48.add((java.lang.Object) 1.0f);
        int i53 = fixedOrderComparator48.getUnknownObjectBehavior();
        boolean b54 = fixedOrderComparator48.isLocked();
        java.lang.Object[] obj_array55 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { fixedOrderComparator56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array66);
        int i69 = fixedOrderComparator48.compare((java.lang.Object) fixedOrderComparator59, (java.lang.Object) obj_array66);
        boolean b70 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator48);
        try {
            fixedOrderComparator48.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        int i46 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = null;
        int i49 = fixedOrderComparator7.compare(obj47, obj48);
        try {
            boolean b51 = fixedOrderComparator7.add((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b3 = fixedOrderComparator0.isLocked();
        boolean b4 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        int i20 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 1.0d);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator34.isLocked();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        int i39 = fixedOrderComparator12.compare((java.lang.Object) obj_array29, (java.lang.Object) fixedOrderComparator34);
        int i40 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i41 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i42 = fixedOrderComparator12.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b21 = fixedOrderComparator7.isLocked();
        boolean b22 = fixedOrderComparator7.isLocked();
        boolean b23 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator31.add((java.lang.Object) 1.0f);
        boolean b37 = fixedOrderComparator31.add((java.lang.Object) 1.0f);
        fixedOrderComparator31.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b55 = fixedOrderComparator31.add((java.lang.Object) obj_array46);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array62);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array77);
        boolean b84 = fixedOrderComparator70.add((java.lang.Object) obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array77);
        boolean b87 = fixedOrderComparator86.isLocked();
        try {
            boolean b88 = fixedOrderComparator7.addAsEqual((java.lang.Object) b55, (java.lang.Object) b87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        int i46 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i47 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator19);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        boolean b21 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator27);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator15.isLocked();
        int i33 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) 2);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array40);
        fixedOrderComparator42.setUnknownObjectBehavior((int) (short) 0);
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        java.lang.Object obj47 = null;
        boolean b48 = fixedOrderComparator42.addAsEqual((java.lang.Object) 10.0f, obj47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b62 = fixedOrderComparator49.add((java.lang.Object) fixedOrderComparator61);
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b65 = fixedOrderComparator49.isLocked();
        int i67 = fixedOrderComparator42.compare((java.lang.Object) fixedOrderComparator49, (java.lang.Object) 2);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b77 = fixedOrderComparator75.add((java.lang.Object) (-1.0f));
        int i78 = fixedOrderComparator75.getUnknownObjectBehavior();
        java.lang.Object[] obj_array85 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array85);
        fixedOrderComparator87.setUnknownObjectBehavior((int) (short) 0);
        int i90 = fixedOrderComparator87.getUnknownObjectBehavior();
        boolean b91 = fixedOrderComparator75.add((java.lang.Object) i90);
        boolean b92 = fixedOrderComparator49.add((java.lang.Object) b91);
        fixedOrderComparator49.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj95 = null;
        int i96 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator49, obj95);
        int i97 = fixedOrderComparator8.getUnknownObjectBehavior();
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(i78 == 2);
        org.junit.Assert.assertNotNull(obj_array85);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(i96 == (-1));
        org.junit.Assert.assertTrue(i97 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        boolean b13 = fixedOrderComparator8.isLocked();
        boolean b14 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(1);
        int i17 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) (-1.0f));
        int i28 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        boolean b41 = fixedOrderComparator25.add((java.lang.Object) i40);
        int i42 = fixedOrderComparator25.getUnknownObjectBehavior();
        int i43 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        boolean b55 = fixedOrderComparator51.add((java.lang.Object) 1.0f);
        int i56 = fixedOrderComparator51.getUnknownObjectBehavior();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array74);
        int i80 = fixedOrderComparator51.compare((java.lang.Object) fixedOrderComparator67, (java.lang.Object) fixedOrderComparator79);
        boolean b81 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator67);
        boolean b82 = fixedOrderComparator8.add((java.lang.Object) b81);
        boolean b83 = fixedOrderComparator8.isLocked();
        int i84 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(i84 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b30 = fixedOrderComparator7.add((java.lang.Object) obj_array27);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj46 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        int i50 = fixedOrderComparator47.getUnknownObjectBehavior();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        fixedOrderComparator78.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array87);
        int i91 = fixedOrderComparator78.compare((java.lang.Object) fixedOrderComparator89, (java.lang.Object) (-1.0d));
        boolean b92 = fixedOrderComparator69.add((java.lang.Object) fixedOrderComparator78);
        boolean b93 = fixedOrderComparator78.isLocked();
        int i94 = fixedOrderComparator78.getUnknownObjectBehavior();
        int i95 = fixedOrderComparator47.compare((java.lang.Object) obj_array57, (java.lang.Object) fixedOrderComparator78);
        int i96 = fixedOrderComparator7.compare(obj46, (java.lang.Object) i95);
        int i97 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertTrue(i96 == (-1));
        org.junit.Assert.assertTrue(i97 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        int i13 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b28 = fixedOrderComparator8.add((java.lang.Object) obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b43 = fixedOrderComparator39.add((java.lang.Object) 1.0f);
        boolean b45 = fixedOrderComparator39.add((java.lang.Object) 1.0f);
        fixedOrderComparator39.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b63 = fixedOrderComparator39.add((java.lang.Object) obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b70 = fixedOrderComparator31.add((java.lang.Object) obj_array54);
        int i71 = fixedOrderComparator31.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i71 == 2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b31 = fixedOrderComparator7.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b33 = fixedOrderComparator32.isLocked();
        try {
            fixedOrderComparator32.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator21.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (-1.0f));
        int i35 = fixedOrderComparator32.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (short) 0);
        int i47 = fixedOrderComparator44.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator32.add((java.lang.Object) i47);
        boolean b49 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator32);
        int i50 = fixedOrderComparator7.compare((java.lang.Object) b23, (java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { fixedOrderComparator24, (byte) 10, obj_array58 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b67 = fixedOrderComparator66.isLocked();
        try {
            fixedOrderComparator66.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        int i6 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b8 = fixedOrderComparator0.isLocked();
        boolean b9 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator4.isLocked();
        fixedOrderComparator4.setUnknownObjectBehavior(0);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (short) 10);
        boolean b20 = fixedOrderComparator17.isLocked();
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        boolean b23 = fixedOrderComparator4.add((java.lang.Object) fixedOrderComparator17);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        java.lang.Object obj26 = null;
        boolean b27 = fixedOrderComparator24.add(obj26);
        fixedOrderComparator24.setUnknownObjectBehavior(1);
        int i30 = fixedOrderComparator24.getUnknownObjectBehavior();
        java.lang.Object obj31 = null;
        int i32 = fixedOrderComparator17.compare((java.lang.Object) i30, obj31);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        boolean b7 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) (-1.0f));
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        boolean b19 = fixedOrderComparator0.add((java.lang.Object) i18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) (-1.0f));
        fixedOrderComparator27.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator41.setUnknownObjectBehavior((int) (short) 0);
        int i44 = fixedOrderComparator27.compare((java.lang.Object) 1, (java.lang.Object) fixedOrderComparator41);
        fixedOrderComparator41.setUnknownObjectBehavior((int) (byte) 0);
        boolean b47 = fixedOrderComparator41.isLocked();
        boolean b48 = fixedOrderComparator0.add((java.lang.Object) b47);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        boolean b4 = fixedOrderComparator0.isLocked();
        boolean b5 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) (-1.0f));
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator18.isLocked();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        int i23 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) 0);
        int i24 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        boolean b36 = fixedOrderComparator32.add((java.lang.Object) 1.0f);
        int i37 = fixedOrderComparator32.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator32.isLocked();
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { fixedOrderComparator40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        int i53 = fixedOrderComparator32.compare((java.lang.Object) fixedOrderComparator43, (java.lang.Object) obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array62);
        fixedOrderComparator64.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator78.setUnknownObjectBehavior(0);
        int i81 = fixedOrderComparator78.getUnknownObjectBehavior();
        boolean b83 = fixedOrderComparator77.addAsEqual((java.lang.Object) i81, (java.lang.Object) (short) 1);
        int i84 = fixedOrderComparator77.getUnknownObjectBehavior();
        java.lang.Object[] obj_array91 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array91);
        boolean b93 = fixedOrderComparator92.isLocked();
        boolean b94 = fixedOrderComparator77.add((java.lang.Object) fixedOrderComparator92);
        boolean b95 = fixedOrderComparator64.add((java.lang.Object) fixedOrderComparator77);
        int i96 = fixedOrderComparator0.compare((java.lang.Object) obj_array50, (java.lang.Object) fixedOrderComparator77);
        collections.comparators.FixedOrderComparator fixedOrderComparator97 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator98 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator99 = new collections.comparators.FixedOrderComparator(obj_array50);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i84 == 2);
        org.junit.Assert.assertNotNull(obj_array91);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertTrue(i96 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        int i25 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior((int) (byte) 0);
        boolean b29 = fixedOrderComparator22.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator38.add((java.lang.Object) obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b45 = fixedOrderComparator22.add((java.lang.Object) fixedOrderComparator44);
        int i46 = fixedOrderComparator44.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b60 = fixedOrderComparator47.add((java.lang.Object) fixedOrderComparator59);
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { fixedOrderComparator47, obj_array69 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array69);
        int i81 = fixedOrderComparator80.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator();
        boolean b83 = fixedOrderComparator80.add((java.lang.Object) fixedOrderComparator82);
        try {
            boolean b84 = fixedOrderComparator19.addAsEqual((java.lang.Object) i46, (java.lang.Object) fixedOrderComparator82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b15 = fixedOrderComparator14.isLocked();
        boolean b16 = fixedOrderComparator14.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator10.isLocked();
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i14 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator27);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator15.isLocked();
        int i33 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b47 = fixedOrderComparator34.add((java.lang.Object) fixedOrderComparator46);
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array56);
        int i61 = fixedOrderComparator60.getUnknownObjectBehavior();
        int i62 = fixedOrderComparator60.getUnknownObjectBehavior();
        boolean b63 = fixedOrderComparator60.isLocked();
        int i64 = fixedOrderComparator60.getUnknownObjectBehavior();
        int i66 = fixedOrderComparator34.compare((java.lang.Object) fixedOrderComparator60, (java.lang.Object) 1L);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array73);
        fixedOrderComparator75.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator75.setUnknownObjectBehavior(2);
        boolean b80 = fixedOrderComparator75.isLocked();
        boolean b81 = fixedOrderComparator60.add((java.lang.Object) fixedOrderComparator75);
        int i82 = fixedOrderComparator75.getUnknownObjectBehavior();
        java.lang.Object obj83 = null;
        int i84 = fixedOrderComparator8.compare((java.lang.Object) i82, obj83);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i61 == 2);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(i82 == 2);
        org.junit.Assert.assertTrue(i84 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator57.isLocked();
        int i60 = fixedOrderComparator41.compare((java.lang.Object) fixedOrderComparator47, (java.lang.Object) fixedOrderComparator57);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array67);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        int i73 = fixedOrderComparator71.getUnknownObjectBehavior();
        boolean b74 = fixedOrderComparator71.isLocked();
        boolean b75 = fixedOrderComparator57.add((java.lang.Object) fixedOrderComparator71);
        try {
            fixedOrderComparator71.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator16.add((java.lang.Object) obj_array21);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator31.add((java.lang.Object) 1.0f);
        int i36 = fixedOrderComparator31.getUnknownObjectBehavior();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array54);
        int i60 = fixedOrderComparator31.compare((java.lang.Object) fixedOrderComparator47, (java.lang.Object) fixedOrderComparator59);
        boolean b61 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator31);
        boolean b62 = fixedOrderComparator31.isLocked();
        try {
            fixedOrderComparator31.setUnknownObjectBehavior(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        int i20 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i21 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i22 = fixedOrderComparator17.getUnknownObjectBehavior();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array29);
        int i34 = fixedOrderComparator33.getUnknownObjectBehavior();
        int i35 = fixedOrderComparator33.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator33.isLocked();
        boolean b37 = fixedOrderComparator33.isLocked();
        boolean b38 = fixedOrderComparator17.add((java.lang.Object) fixedOrderComparator33);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator46.add((java.lang.Object) 1.0f);
        boolean b52 = fixedOrderComparator46.add((java.lang.Object) 1.0f);
        fixedOrderComparator46.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b70 = fixedOrderComparator46.add((java.lang.Object) obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array61);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        try {
            int i73 = fixedOrderComparator7.compare((java.lang.Object) b38, (java.lang.Object) fixedOrderComparator71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i72 == 2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        boolean b7 = fixedOrderComparator0.isLocked();
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i11 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (short) 0);
        int i25 = fixedOrderComparator22.getUnknownObjectBehavior();
        java.lang.Object obj27 = null;
        boolean b28 = fixedOrderComparator22.addAsEqual((java.lang.Object) 10.0f, obj27);
        boolean b29 = fixedOrderComparator22.isLocked();
        int i31 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator22, (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = fixedOrderComparator14.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b43 = fixedOrderComparator39.add((java.lang.Object) 1.0f);
        java.lang.Object obj44 = null;
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        fixedOrderComparator52.setUnknownObjectBehavior(0);
        boolean b56 = fixedOrderComparator52.add((java.lang.Object) 1.0f);
        int i57 = fixedOrderComparator52.getUnknownObjectBehavior();
        int i58 = fixedOrderComparator39.compare(obj44, (java.lang.Object) i57);
        int i59 = fixedOrderComparator39.getUnknownObjectBehavior();
        boolean b60 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        fixedOrderComparator69.setUnknownObjectBehavior((int) (short) 0);
        int i72 = fixedOrderComparator69.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator73.setUnknownObjectBehavior(0);
        int i76 = fixedOrderComparator73.getUnknownObjectBehavior();
        int i77 = fixedOrderComparator39.compare((java.lang.Object) i72, (java.lang.Object) fixedOrderComparator73);
        int i78 = fixedOrderComparator39.getUnknownObjectBehavior();
        java.lang.Object obj79 = new java.lang.Object();
        java.lang.Object obj80 = null;
        int i81 = fixedOrderComparator39.compare(obj79, obj80);
        int i82 = fixedOrderComparator39.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator83.setUnknownObjectBehavior(0);
        int i86 = fixedOrderComparator83.getUnknownObjectBehavior();
        fixedOrderComparator83.setUnknownObjectBehavior((int) (byte) 0);
        boolean b89 = fixedOrderComparator83.isLocked();
        int i90 = fixedOrderComparator83.getUnknownObjectBehavior();
        int i91 = fixedOrderComparator83.getUnknownObjectBehavior();
        boolean b92 = fixedOrderComparator31.addAsEqual((java.lang.Object) i82, (java.lang.Object) fixedOrderComparator83);
        java.lang.Object obj93 = null;
        boolean b94 = fixedOrderComparator83.add(obj93);
        fixedOrderComparator83.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(i77 == 1);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        int i14 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 1);
        int i17 = fixedOrderComparator10.getUnknownObjectBehavior();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b35 = fixedOrderComparator10.add((java.lang.Object) obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array24);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        int i13 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b28 = fixedOrderComparator8.add((java.lang.Object) obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array20);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i4 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator0.isLocked();
        boolean b6 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i19 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator17.isLocked();
        boolean b21 = fixedOrderComparator17.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        int i25 = fixedOrderComparator22.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator22.getUnknownObjectBehavior();
        boolean b27 = fixedOrderComparator22.isLocked();
        boolean b28 = fixedOrderComparator22.isLocked();
        try {
            boolean b29 = fixedOrderComparator0.addAsEqual((java.lang.Object) b21, (java.lang.Object) b28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        int i39 = fixedOrderComparator37.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue(i39 == 2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        java.lang.Object obj2 = null;
        boolean b3 = fixedOrderComparator0.add(obj2);
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b19 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator18);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        int i22 = fixedOrderComparator6.getUnknownObjectBehavior();
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        boolean b36 = fixedOrderComparator32.add((java.lang.Object) 1.0f);
        java.lang.Object obj37 = null;
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        boolean b49 = fixedOrderComparator45.add((java.lang.Object) 1.0f);
        int i50 = fixedOrderComparator45.getUnknownObjectBehavior();
        int i51 = fixedOrderComparator32.compare(obj37, (java.lang.Object) i50);
        boolean b52 = fixedOrderComparator32.isLocked();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array59);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        fixedOrderComparator64.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b77 = fixedOrderComparator75.add((java.lang.Object) (-1.0f));
        fixedOrderComparator75.setUnknownObjectBehavior((int) (short) 0);
        boolean b80 = fixedOrderComparator75.isLocked();
        int i81 = fixedOrderComparator32.compare((java.lang.Object) (byte) 1, (java.lang.Object) fixedOrderComparator75);
        boolean b82 = fixedOrderComparator75.isLocked();
        int i83 = fixedOrderComparator0.compare((java.lang.Object) (byte) 0, (java.lang.Object) fixedOrderComparator75);
        boolean b84 = fixedOrderComparator75.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b29 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator28);
        fixedOrderComparator16.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array38);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { fixedOrderComparator16, obj_array38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b49 = fixedOrderComparator15.add((java.lang.Object) obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b52 = fixedOrderComparator51.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator7.add((java.lang.Object) 0);
        boolean b19 = fixedOrderComparator7.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        int i36 = fixedOrderComparator33.getUnknownObjectBehavior();
        fixedOrderComparator33.setUnknownObjectBehavior((int) (byte) 0);
        boolean b39 = fixedOrderComparator30.add((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj41 = null;
        int i42 = fixedOrderComparator33.compare((java.lang.Object) 1.0d, obj41);
        boolean b43 = fixedOrderComparator33.isLocked();
        boolean b44 = fixedOrderComparator20.add((java.lang.Object) fixedOrderComparator33);
        boolean b45 = fixedOrderComparator33.isLocked();
        boolean b46 = fixedOrderComparator33.isLocked();
        int i47 = fixedOrderComparator33.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator7.add((java.lang.Object) i47);
        int i49 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == 2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) 10.0f, obj13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b28 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator27);
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        boolean b31 = fixedOrderComparator15.isLocked();
        int i33 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator15, (java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator15.add((java.lang.Object) i35);
        boolean b37 = fixedOrderComparator15.isLocked();
        boolean b38 = fixedOrderComparator15.isLocked();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator47.setUnknownObjectBehavior((int) (short) 0);
        boolean b50 = fixedOrderComparator47.isLocked();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b79 = fixedOrderComparator65.add((java.lang.Object) obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b81 = fixedOrderComparator80.isLocked();
        int i82 = fixedOrderComparator15.compare((java.lang.Object) b50, (java.lang.Object) fixedOrderComparator80);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator21.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (-1.0f));
        int i35 = fixedOrderComparator32.getUnknownObjectBehavior();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (short) 0);
        int i47 = fixedOrderComparator44.getUnknownObjectBehavior();
        boolean b48 = fixedOrderComparator32.add((java.lang.Object) i47);
        boolean b49 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator32);
        int i50 = fixedOrderComparator7.compare((java.lang.Object) b23, (java.lang.Object) fixedOrderComparator24);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { fixedOrderComparator24, (byte) 10, obj_array58 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array58);
        int i71 = fixedOrderComparator70.getUnknownObjectBehavior();
        fixedOrderComparator70.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(i71 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator21.setUnknownObjectBehavior((int) (short) 0);
        int i24 = fixedOrderComparator7.compare((java.lang.Object) 1, (java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b38 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator37);
        boolean b39 = fixedOrderComparator37.isLocked();
        boolean b40 = fixedOrderComparator37.isLocked();
        boolean b41 = fixedOrderComparator21.add((java.lang.Object) fixedOrderComparator37);
        int i42 = fixedOrderComparator21.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = fixedOrderComparator14.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj30 = null;
        boolean b31 = fixedOrderComparator29.add(obj30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator32.isLocked();
        boolean b35 = fixedOrderComparator32.add((java.lang.Object) 10.0d);
        boolean b36 = fixedOrderComparator32.isLocked();
        int i37 = fixedOrderComparator32.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator29.add((java.lang.Object) i37);
        int i39 = fixedOrderComparator29.getUnknownObjectBehavior();
        int i40 = fixedOrderComparator29.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(i40 == 2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i34 = fixedOrderComparator33.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator33.add((java.lang.Object) fixedOrderComparator35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array66);
        fixedOrderComparator68.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        int i81 = fixedOrderComparator68.compare((java.lang.Object) fixedOrderComparator79, (java.lang.Object) (-1.0d));
        boolean b82 = fixedOrderComparator59.add((java.lang.Object) fixedOrderComparator68);
        boolean b83 = fixedOrderComparator68.isLocked();
        int i84 = fixedOrderComparator68.getUnknownObjectBehavior();
        int i85 = fixedOrderComparator37.compare((java.lang.Object) obj_array47, (java.lang.Object) fixedOrderComparator68);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b94 = fixedOrderComparator33.add((java.lang.Object) obj_array47);
        fixedOrderComparator33.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj97 = null;
        java.lang.Object obj98 = null;
        try {
            boolean b99 = fixedOrderComparator33.addAsEqual(obj97, obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator12.add((java.lang.Object) 1.0f);
        java.lang.Object obj17 = null;
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator25.add((java.lang.Object) 1.0f);
        int i30 = fixedOrderComparator25.getUnknownObjectBehavior();
        int i31 = fixedOrderComparator12.compare(obj17, (java.lang.Object) i30);
        int i32 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i33 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i35 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) 10.0d);
        int i36 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i37 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i38 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (-1.0f));
        int i49 = fixedOrderComparator46.getUnknownObjectBehavior();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array56);
        fixedOrderComparator58.setUnknownObjectBehavior((int) (short) 0);
        int i61 = fixedOrderComparator58.getUnknownObjectBehavior();
        boolean b62 = fixedOrderComparator46.add((java.lang.Object) i61);
        int i63 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i64 = fixedOrderComparator46.getUnknownObjectBehavior();
        boolean b65 = fixedOrderComparator46.isLocked();
        int i66 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i67 = fixedOrderComparator46.getUnknownObjectBehavior();
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array74);
        java.lang.Object[] obj_array77 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        boolean b79 = fixedOrderComparator76.add((java.lang.Object) obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array77);
        int i84 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator46, (java.lang.Object) obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array77);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 2);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 2);
        org.junit.Assert.assertTrue(i67 == 2);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(i84 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator10);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        boolean b28 = fixedOrderComparator24.add((java.lang.Object) 1.0f);
        int i29 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b30 = fixedOrderComparator24.isLocked();
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { fixedOrderComparator32 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        int i45 = fixedOrderComparator24.compare((java.lang.Object) fixedOrderComparator35, (java.lang.Object) obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b48 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator47);
        int i49 = fixedOrderComparator47.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) obj_array17);
        boolean b20 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator16.add((java.lang.Object) obj_array21);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        boolean b35 = fixedOrderComparator31.add((java.lang.Object) 1.0f);
        int i36 = fixedOrderComparator31.getUnknownObjectBehavior();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array54);
        int i60 = fixedOrderComparator31.compare((java.lang.Object) fixedOrderComparator47, (java.lang.Object) fixedOrderComparator59);
        boolean b61 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator31);
        boolean b62 = fixedOrderComparator16.isLocked();
        int i63 = fixedOrderComparator16.getUnknownObjectBehavior();
        try {
            fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator0, obj_array22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b39 = fixedOrderComparator37.add((java.lang.Object) (-1.0d));
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        boolean b41 = fixedOrderComparator37.isLocked();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b51 = fixedOrderComparator49.add((java.lang.Object) (short) 10);
        boolean b52 = fixedOrderComparator49.isLocked();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        fixedOrderComparator68.setUnknownObjectBehavior(0);
        boolean b71 = fixedOrderComparator60.add((java.lang.Object) 0);
        boolean b72 = fixedOrderComparator60.isLocked();
        boolean b73 = fixedOrderComparator60.isLocked();
        int i74 = fixedOrderComparator60.getUnknownObjectBehavior();
        try {
            int i75 = fixedOrderComparator37.compare((java.lang.Object) fixedOrderComparator49, (java.lang.Object) fixedOrderComparator60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i74 == 2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        boolean b3 = fixedOrderComparator1.isLocked();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        fixedOrderComparator12.setUnknownObjectBehavior((int) (short) 0);
        int i15 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i16 = fixedOrderComparator12.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        int i20 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior((int) (byte) 0);
        int i23 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator12.add((java.lang.Object) i23);
        try {
            int i26 = fixedOrderComparator1.compare((java.lang.Object) i23, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        boolean b6 = fixedOrderComparator0.isLocked();
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        fixedOrderComparator27.setUnknownObjectBehavior(0);
        boolean b30 = fixedOrderComparator19.add((java.lang.Object) 0);
        boolean b31 = fixedOrderComparator19.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        boolean b34 = fixedOrderComparator19.add((java.lang.Object) i33);
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) i33);
        boolean b36 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        boolean b13 = fixedOrderComparator8.isLocked();
        boolean b14 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(1);
        int i17 = fixedOrderComparator8.getUnknownObjectBehavior();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) (-1.0f));
        int i28 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        boolean b41 = fixedOrderComparator25.add((java.lang.Object) i40);
        int i42 = fixedOrderComparator25.getUnknownObjectBehavior();
        int i43 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        boolean b55 = fixedOrderComparator51.add((java.lang.Object) 1.0f);
        int i56 = fixedOrderComparator51.getUnknownObjectBehavior();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array74);
        int i80 = fixedOrderComparator51.compare((java.lang.Object) fixedOrderComparator67, (java.lang.Object) fixedOrderComparator79);
        boolean b81 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator67);
        boolean b82 = fixedOrderComparator8.add((java.lang.Object) b81);
        int i83 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i83 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i36 = fixedOrderComparator7.compare((java.lang.Object) fixedOrderComparator23, (java.lang.Object) fixedOrderComparator35);
        boolean b37 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator21.setUnknownObjectBehavior((int) (short) 0);
        int i24 = fixedOrderComparator7.compare((java.lang.Object) 1, (java.lang.Object) fixedOrderComparator21);
        int i25 = fixedOrderComparator21.getUnknownObjectBehavior();
        fixedOrderComparator21.setUnknownObjectBehavior(1);
        int i28 = fixedOrderComparator21.getUnknownObjectBehavior();
        try {
            fixedOrderComparator21.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i28 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = fixedOrderComparator14.add((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i32 = fixedOrderComparator31.getUnknownObjectBehavior();
        try {
            fixedOrderComparator31.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i32 == 2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b41 = fixedOrderComparator27.add((java.lang.Object) obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b43 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator42);
        try {
            fixedOrderComparator42.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = null;
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array23);
        int i28 = fixedOrderComparator10.compare(obj16, (java.lang.Object) obj_array23);
        java.lang.Object obj29 = null;
        java.lang.Object[] obj_array36 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i44 = fixedOrderComparator10.compare(obj29, (java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array36);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        int i14 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        fixedOrderComparator46.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i59 = fixedOrderComparator46.compare((java.lang.Object) fixedOrderComparator57, (java.lang.Object) (-1.0d));
        boolean b60 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator46);
        boolean b61 = fixedOrderComparator46.isLocked();
        int i62 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i63 = fixedOrderComparator15.compare((java.lang.Object) obj_array25, (java.lang.Object) fixedOrderComparator46);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        boolean b66 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator64);
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertTrue(b66 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        boolean b11 = fixedOrderComparator8.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b23 = fixedOrderComparator21.isLocked();
        int i24 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b36 = fixedOrderComparator21.add((java.lang.Object) fixedOrderComparator35);
        boolean b37 = fixedOrderComparator21.isLocked();
        int i38 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        boolean b50 = fixedOrderComparator46.add((java.lang.Object) 1.0f);
        java.lang.Object obj51 = null;
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        fixedOrderComparator59.setUnknownObjectBehavior(0);
        boolean b63 = fixedOrderComparator59.add((java.lang.Object) 1.0f);
        int i64 = fixedOrderComparator59.getUnknownObjectBehavior();
        int i65 = fixedOrderComparator46.compare(obj51, (java.lang.Object) i64);
        int i66 = fixedOrderComparator46.getUnknownObjectBehavior();
        boolean b67 = fixedOrderComparator46.isLocked();
        int i68 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i69 = fixedOrderComparator46.getUnknownObjectBehavior();
        int i70 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator21, (java.lang.Object) fixedOrderComparator46);
        int i71 = fixedOrderComparator46.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(i71 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator10);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b19 = fixedOrderComparator17.isLocked();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b33 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = null;
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        boolean b46 = fixedOrderComparator42.add((java.lang.Object) 1.0f);
        int i47 = fixedOrderComparator42.getUnknownObjectBehavior();
        int i48 = fixedOrderComparator29.compare(obj34, (java.lang.Object) i47);
        int i49 = fixedOrderComparator29.getUnknownObjectBehavior();
        int i50 = fixedOrderComparator29.getUnknownObjectBehavior();
        int i52 = fixedOrderComparator17.compare((java.lang.Object) fixedOrderComparator29, (java.lang.Object) 10.0d);
        int i53 = fixedOrderComparator17.getUnknownObjectBehavior();
        int i54 = fixedOrderComparator17.getUnknownObjectBehavior();
        boolean b55 = fixedOrderComparator17.isLocked();
        boolean b56 = fixedOrderComparator7.add((java.lang.Object) b55);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(i48 == (-1));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        boolean b22 = fixedOrderComparator18.add((java.lang.Object) 1.0f);
        boolean b24 = fixedOrderComparator18.add((java.lang.Object) 1.0f);
        boolean b25 = fixedOrderComparator18.isLocked();
        boolean b26 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator18);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator57.isLocked();
        int i60 = fixedOrderComparator41.compare((java.lang.Object) fixedOrderComparator47, (java.lang.Object) fixedOrderComparator57);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array67);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        int i73 = fixedOrderComparator71.getUnknownObjectBehavior();
        boolean b74 = fixedOrderComparator71.isLocked();
        boolean b75 = fixedOrderComparator57.add((java.lang.Object) fixedOrderComparator71);
        int i76 = fixedOrderComparator57.getUnknownObjectBehavior();
        boolean b77 = fixedOrderComparator57.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(i76 == 2);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        int i12 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i36 = fixedOrderComparator7.compare((java.lang.Object) fixedOrderComparator23, (java.lang.Object) fixedOrderComparator35);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b53 = fixedOrderComparator23.add((java.lang.Object) obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array43);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i21 = fixedOrderComparator8.compare((java.lang.Object) fixedOrderComparator19, (java.lang.Object) (-1.0d));
        boolean b22 = fixedOrderComparator19.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        boolean b25 = fixedOrderComparator23.isLocked();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        boolean b29 = fixedOrderComparator23.add((java.lang.Object) 10L);
        boolean b30 = fixedOrderComparator23.isLocked();
        boolean b31 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b46 = fixedOrderComparator23.add((java.lang.Object) obj_array38);
        boolean b47 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator23);
        int i48 = fixedOrderComparator23.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) 10L);
        boolean b7 = fixedOrderComparator0.isLocked();
        boolean b8 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b23 = fixedOrderComparator0.add((java.lang.Object) obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (short) 10);
        boolean b35 = fixedOrderComparator32.isLocked();
        boolean b36 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator32);
        try {
            fixedOrderComparator24.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b14 = fixedOrderComparator8.addAsEqual((java.lang.Object) i12, (java.lang.Object) (short) 1);
        int i15 = fixedOrderComparator8.getUnknownObjectBehavior();
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        boolean b21 = fixedOrderComparator18.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b33 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        boolean b35 = fixedOrderComparator29.add((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        boolean b39 = fixedOrderComparator36.add((java.lang.Object) 10.0d);
        int i40 = fixedOrderComparator18.compare((java.lang.Object) b35, (java.lang.Object) fixedOrderComparator36);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) (short) 10);
        boolean b51 = fixedOrderComparator8.addAsEqual((java.lang.Object) i40, (java.lang.Object) b50);
        int i52 = fixedOrderComparator8.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator53.setUnknownObjectBehavior(0);
        int i56 = fixedOrderComparator53.getUnknownObjectBehavior();
        fixedOrderComparator53.setUnknownObjectBehavior((int) (byte) 0);
        boolean b60 = fixedOrderComparator53.add((java.lang.Object) (short) 10);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        boolean b70 = fixedOrderComparator68.add((java.lang.Object) (-1.0f));
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator();
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        boolean b73 = fixedOrderComparator71.isLocked();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        int i76 = fixedOrderComparator53.compare((java.lang.Object) fixedOrderComparator68, (java.lang.Object) 0);
        int i77 = fixedOrderComparator53.getUnknownObjectBehavior();
        boolean b78 = fixedOrderComparator8.add((java.lang.Object) i77);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = null;
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) 1.0f);
        int i25 = fixedOrderComparator20.getUnknownObjectBehavior();
        int i26 = fixedOrderComparator7.compare(obj12, (java.lang.Object) i25);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b28 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 100.0d, 10.0f, 10.0d, 0.0d, (short) 0, 0 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (short) 0);
        int i40 = fixedOrderComparator37.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        int i44 = fixedOrderComparator41.getUnknownObjectBehavior();
        int i45 = fixedOrderComparator7.compare((java.lang.Object) i40, (java.lang.Object) fixedOrderComparator41);
        int i46 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = null;
        int i49 = fixedOrderComparator7.compare(obj47, obj48);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10, 10L, 1.0f, 0, (-1L), 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array64);
        int i68 = fixedOrderComparator7.compare((java.lang.Object) obj_array56, (java.lang.Object) fixedOrderComparator67);
        int i69 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b70 = fixedOrderComparator7.isLocked();
        boolean b71 = fixedOrderComparator7.isLocked();
        int i72 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i73 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(i73 == 0);
    }
}

