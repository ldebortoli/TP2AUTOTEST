import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        defaultedMap1.clear();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection9 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap17.keySet();
        java.util.Collection collection19 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) collection25);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = new java.lang.Object();
        boolean b30 = defaultedMap26.containsValue(obj29);
        boolean b31 = defaultedMap26.isEmpty();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap8.get((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 0 + "'", obj34.equals((byte) 0));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test2");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 'a');
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Collection collection17 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) collection23);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap24);
        boolean b27 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) (-1.0d), (java.lang.Object) '4');
        defaultedMap15.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1.0f);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 1, obj48);
        boolean b51 = defaultedMap46.containsKey((java.lang.Object) 1);
        defaultedMap46.clear();
        java.lang.Object obj53 = defaultedMap37.put((java.lang.Object) defaultedMap42, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) 1, obj57);
        boolean b60 = defaultedMap55.containsKey((java.lang.Object) 1);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 100);
        int i66 = defaultedMap63.size();
        java.lang.Object obj67 = defaultedMap55.remove((java.lang.Object) defaultedMap63);
        boolean b68 = defaultedMap42.containsValue(obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) 1, obj72);
        java.util.Set set74 = defaultedMap70.keySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) set74);
        java.lang.Object obj77 = defaultedMap42.put((java.lang.Object) defaultedMap75, (java.lang.Object) (-1L));
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap75);
        java.util.Set set79 = defaultedMap75.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(set79);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test3");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Collection collection7 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection13 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) collection13);
        boolean b15 = defaultedMap14.isEmpty();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap14);
        boolean b17 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) '4');
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate26, predicate27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test4");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 1);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) 1, obj11);
        java.util.Set set13 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1.0f);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap24.put((java.lang.Object) 1, obj26);
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) 1);
        defaultedMap24.clear();
        java.lang.Object obj31 = defaultedMap15.put((java.lang.Object) defaultedMap20, (java.lang.Object) defaultedMap24);
        defaultedMap9.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap20.containsValue(obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1.0f);
        defaultedMap36.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) 1, obj47);
        boolean b50 = defaultedMap45.containsKey((java.lang.Object) 1);
        defaultedMap45.clear();
        java.lang.Object obj52 = defaultedMap36.put((java.lang.Object) defaultedMap41, (java.lang.Object) defaultedMap45);
        defaultedMap20.putAll((java.util.Map) defaultedMap41);
        java.util.Collection collection54 = defaultedMap41.values();
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) collection54);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) 0 + "'", obj55.equals((byte) 0));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test5");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap4.entrySet();
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap4.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test6");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap17.keySet();
        boolean b20 = defaultedMap17.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) collection21);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b24 = defaultedMap13.containsValue((java.lang.Object) defaultedMap22);
        boolean b25 = defaultedMap13.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) b25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) 10.0d);
        java.util.Set set33 = defaultedMap28.entrySet();
        boolean b34 = defaultedMap8.equals((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Set set42 = defaultedMap40.entrySet();
        boolean b43 = defaultedMap36.containsValue((java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set46 = defaultedMap45.keySet();
        java.util.Collection collection47 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set50 = defaultedMap49.keySet();
        boolean b52 = defaultedMap49.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection53 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) collection53);
        boolean b55 = defaultedMap54.isEmpty();
        boolean b56 = defaultedMap45.containsValue((java.lang.Object) defaultedMap54);
        boolean b57 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        boolean b59 = defaultedMap58.isEmpty();
        java.util.Collection collection60 = defaultedMap58.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 1.0f);
        defaultedMap58.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection66 = defaultedMap58.values();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) collection66);
        java.lang.Object obj68 = defaultedMap28.remove((java.lang.Object) map67);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 0 + "'", obj32.equals((byte) 0));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test7");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test8");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap5.values();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) collection9, (java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap13.keySet();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection17 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) collection17);
        int i19 = defaultedMap18.size();
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection28 = defaultedMap24.values();
        java.util.Set set29 = defaultedMap24.keySet();
        java.util.Set set30 = defaultedMap24.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        boolean b36 = defaultedMap33.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection37 = defaultedMap33.values();
        collections.Predicate predicate38 = null;
        collections.Predicate predicate39 = null;
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1.0f);
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) 1, obj53);
        boolean b56 = defaultedMap51.containsKey((java.lang.Object) 1);
        defaultedMap51.clear();
        java.lang.Object obj58 = defaultedMap42.put((java.lang.Object) defaultedMap47, (java.lang.Object) defaultedMap51);
        java.lang.Object obj59 = null;
        boolean b60 = defaultedMap47.containsValue(obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b63 = defaultedMap62.isEmpty();
        boolean b64 = defaultedMap62.isEmpty();
        boolean b66 = defaultedMap62.equals((java.lang.Object) 10);
        java.lang.Object obj67 = defaultedMap47.get((java.lang.Object) b66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap47);
        collections.Predicate predicate69 = null;
        collections.Predicate predicate70 = null;
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate69, predicate70);
        boolean b72 = defaultedMap1.containsKey((java.lang.Object) predicate69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (byte) 0 + "'", obj67.equals((byte) 0));
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
    }
}

