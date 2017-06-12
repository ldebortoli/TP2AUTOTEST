import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b10 = defaultedMap8.isEmpty();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, obj25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap23);
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj33 = defaultedMap19.get((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        boolean b35 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection41 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) collection41);
        boolean b43 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 1.0f);
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 1, obj56);
        boolean b59 = defaultedMap54.containsKey((java.lang.Object) 1);
        defaultedMap54.clear();
        java.lang.Object obj61 = defaultedMap45.put((java.lang.Object) defaultedMap50, (java.lang.Object) defaultedMap54);
        collections.Predicate predicate62 = null;
        collections.Predicate predicate63 = null;
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate62, predicate63);
        java.lang.Object obj65 = defaultedMap42.get((java.lang.Object) predicate62);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap67.put((java.lang.Object) 1, obj69);
        java.util.Set set71 = defaultedMap67.keySet();
        boolean b72 = defaultedMap42.containsValue((java.lang.Object) set71);
        boolean b73 = defaultedMap1.equals((java.lang.Object) defaultedMap42);
        defaultedMap42.clear();
        java.util.Set set75 = defaultedMap42.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test02");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap10.keySet();
        java.util.Collection collection12 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set15 = defaultedMap14.keySet();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection18 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) collection18);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap10.containsValue((java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 1.0f);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 'a');
        java.lang.Object obj37 = defaultedMap26.get((java.lang.Object) 'a');
        defaultedMap26.clear();
        boolean b39 = defaultedMap26.isEmpty();
        int i40 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set43 = defaultedMap42.keySet();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection46 = defaultedMap42.values();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) collection46);
        boolean b48 = defaultedMap47.isEmpty();
        java.util.Set set49 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set52 = defaultedMap51.keySet();
        java.util.Collection collection53 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set56 = defaultedMap55.keySet();
        boolean b58 = defaultedMap55.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection59 = defaultedMap55.values();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) collection59);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b62 = defaultedMap51.containsValue((java.lang.Object) defaultedMap60);
        int i63 = defaultedMap60.size();
        java.util.Set set64 = defaultedMap60.keySet();
        defaultedMap47.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj66 = defaultedMap26.get((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set73 = defaultedMap72.keySet();
        boolean b75 = defaultedMap72.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection76 = defaultedMap72.values();
        java.lang.Object obj77 = defaultedMap68.get((java.lang.Object) collection76);
        int i78 = defaultedMap68.size();
        boolean b79 = defaultedMap26.containsKey((java.lang.Object) defaultedMap68);
        defaultedMap10.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 0 + "'", obj37.equals((byte) 0));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (byte) 0 + "'", obj66.equals((byte) 0));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0 + "'", obj77.equals(0));
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test03");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1, obj8);
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1, obj17);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1.0f);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1, obj32);
        boolean b35 = defaultedMap30.containsKey((java.lang.Object) 1);
        defaultedMap30.clear();
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap26, (java.lang.Object) defaultedMap30);
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap26.containsValue(obj38);
        java.util.Set set40 = defaultedMap26.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) 1, obj46);
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) 1);
        int i50 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set53 = defaultedMap52.keySet();
        boolean b55 = defaultedMap52.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection56 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) collection56);
        boolean b58 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) 1.0f);
        defaultedMap60.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) 1, obj71);
        boolean b74 = defaultedMap69.containsKey((java.lang.Object) 1);
        defaultedMap69.clear();
        java.lang.Object obj76 = defaultedMap60.put((java.lang.Object) defaultedMap65, (java.lang.Object) defaultedMap69);
        collections.Predicate predicate77 = null;
        collections.Predicate predicate78 = null;
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate77, predicate78);
        java.lang.Object obj80 = defaultedMap57.get((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj84 = null;
        java.lang.Object obj85 = defaultedMap82.put((java.lang.Object) 1, obj84);
        java.util.Set set86 = defaultedMap82.keySet();
        boolean b87 = defaultedMap57.containsValue((java.lang.Object) set86);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection90 = defaultedMap89.values();
        java.lang.Object obj91 = defaultedMap44.put((java.lang.Object) b87, (java.lang.Object) defaultedMap89);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap89);
        java.lang.Object obj93 = defaultedMap1.remove((java.lang.Object) defaultedMap89);
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 0 + "'", obj13.equals((byte) 0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test04");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection10 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, obj25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap23);
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap19.containsValue(obj31);
        java.util.Set set33 = defaultedMap19.entrySet();
        java.util.Collection collection34 = defaultedMap19.values();
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        java.util.Collection collection36 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 0 + "'", obj35.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test05");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1, obj8);
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap6);
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
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap22.containsValue(obj25);
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1, obj31);
        java.util.Set set33 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        java.util.Set set35 = defaultedMap34.entrySet();
        int i36 = defaultedMap34.size();
        java.lang.Object obj37 = defaultedMap22.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 0 + "'", obj11.equals((byte) 0));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test06");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 1, obj10);
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap8.toString();
        java.util.Collection collection15 = defaultedMap8.values();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) collection15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{1=null}" + "'", str14.equals("{1=null}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test07");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test08");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test09");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 1, obj12);
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 1);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1, obj21);
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) 1);
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 100);
        int i30 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap19.remove((java.lang.Object) defaultedMap27);
        boolean b32 = defaultedMap6.containsValue(obj31);
        java.util.Collection collection33 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 1, obj37);
        boolean b40 = defaultedMap35.containsKey((java.lang.Object) 1);
        int i41 = defaultedMap35.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set44 = defaultedMap43.keySet();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection47 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) collection47);
        boolean b49 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1.0f);
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = defaultedMap60.put((java.lang.Object) 1, obj62);
        boolean b65 = defaultedMap60.containsKey((java.lang.Object) 1);
        defaultedMap60.clear();
        java.lang.Object obj67 = defaultedMap51.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap60);
        collections.Predicate predicate68 = null;
        collections.Predicate predicate69 = null;
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate68, predicate69);
        java.lang.Object obj71 = defaultedMap48.get((java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 1, obj75);
        java.util.Set set77 = defaultedMap73.keySet();
        boolean b78 = defaultedMap48.containsValue((java.lang.Object) set77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection81 = defaultedMap80.values();
        java.lang.Object obj82 = defaultedMap35.put((java.lang.Object) b78, (java.lang.Object) defaultedMap80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap80);
        java.lang.Object obj84 = defaultedMap6.get((java.lang.Object) defaultedMap83);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) 0 + "'", obj84.equals((byte) 0));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test10");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test11");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1, obj8);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 100);
        int i17 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap6.remove((java.lang.Object) defaultedMap14);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap6.get(obj20);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test12");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 'a');
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b14 = defaultedMap1.isEmpty();
        int i15 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap17.keySet();
        boolean b20 = defaultedMap17.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection21 = defaultedMap17.values();
        java.lang.String str22 = defaultedMap17.toString();
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) 1, obj30);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        boolean b34 = defaultedMap17.equals((java.lang.Object) defaultedMap28);
        int i35 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set41 = defaultedMap40.keySet();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection44 = defaultedMap40.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) collection44);
        boolean b46 = defaultedMap45.isEmpty();
        java.lang.Object obj47 = defaultedMap37.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) 1, obj51);
        defaultedMap49.clear();
        java.util.Set set54 = defaultedMap49.entrySet();
        boolean b55 = defaultedMap37.containsKey((java.lang.Object) set54);
        java.lang.Object obj56 = defaultedMap28.get((java.lang.Object) b55);
        collections.Factory factory57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, factory57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 0 + "'", obj56.equals((byte) 0));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test13");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set3 = defaultedMap2.keySet();
        java.lang.Object obj5 = defaultedMap2.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap2.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 0 + "'", obj5.equals((byte) 0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test14");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Set set12 = defaultedMap8.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test15");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 1, obj12);
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 1);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap10);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap6.containsValue(obj18);
        java.util.Set set20 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap6.containsValue((java.lang.Object) collection23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 100);
        int i29 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1.0f);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap26.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap38.keySet();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection42 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) collection42);
        int i44 = defaultedMap43.size();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate45, predicate46);
        java.lang.Object obj48 = defaultedMap31.get((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) 1, obj52);
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) 1);
        java.lang.String str56 = defaultedMap50.toString();
        java.lang.Object obj57 = defaultedMap6.put((java.lang.Object) defaultedMap31, (java.lang.Object) str56);
        int i58 = defaultedMap31.size();
        java.util.Set set59 = defaultedMap31.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte) 0 + "'", obj48.equals((byte) 0));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{1=null}" + "'", str56.equals("{1=null}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test16");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b10 = defaultedMap8.isEmpty();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, obj25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap23);
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj33 = defaultedMap19.get((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        boolean b35 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set38 = defaultedMap37.keySet();
        java.util.Collection collection39 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection45 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) collection45);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b48 = defaultedMap37.containsValue((java.lang.Object) defaultedMap46);
        boolean b49 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        boolean b51 = defaultedMap50.isEmpty();
        java.util.Collection collection52 = defaultedMap50.values();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1.0f);
        defaultedMap50.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap50);
        defaultedMap58.clear();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap62);
        collections.Factory factory64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test17");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set5 = defaultedMap4.keySet();
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection8 = defaultedMap4.values();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = null;
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0f);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, obj24);
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) 1);
        defaultedMap22.clear();
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap22);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap18.containsValue(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        boolean b37 = defaultedMap33.equals((java.lang.Object) 10);
        java.lang.Object obj38 = defaultedMap18.get((java.lang.Object) b37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap18);
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate40, predicate41);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 1.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1.0f);
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) 'a');
        java.lang.Object obj56 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.String str57 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set60 = defaultedMap59.keySet();
        java.util.Collection collection61 = defaultedMap59.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set64 = defaultedMap63.keySet();
        boolean b66 = defaultedMap63.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection67 = defaultedMap63.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) collection67);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b70 = defaultedMap59.containsValue((java.lang.Object) defaultedMap68);
        boolean b71 = defaultedMap59.isEmpty();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj77 = defaultedMap74.put((java.lang.Object) (-1.0d), (java.lang.Object) '4');
        defaultedMap59.putAll((java.util.Map) defaultedMap74);
        java.lang.Object obj79 = defaultedMap45.get((java.lang.Object) defaultedMap59);
        boolean b80 = defaultedMap4.equals((java.lang.Object) defaultedMap59);
        java.lang.Object obj81 = defaultedMap1.get((java.lang.Object) defaultedMap59);
        java.util.Collection collection82 = defaultedMap1.values();
        java.lang.String str83 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 0 + "'", obj38.equals((byte) 0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 0 + "'", obj56.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) 0 + "'", obj79.equals((byte) 0));
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + (byte) 0 + "'", obj81.equals((byte) 0));
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test18");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate20, predicate21);
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate24);
        java.util.Set set27 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{1=null}" + "'", str7.equals("{1=null}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test19");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 1);
        defaultedMap1.clear();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test20");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 1, obj12);
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 1);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap10);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap6.containsValue(obj18);
        java.util.Set set20 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap6.containsValue((java.lang.Object) collection23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap27.keySet();
        java.util.Collection collection29 = defaultedMap27.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test21");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte) 0 + "'", obj3.equals((byte) 0));
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test22");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        boolean b12 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, obj25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap23);
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap11.get((java.lang.Object) predicate31);
        java.util.Set set35 = defaultedMap11.entrySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        java.util.Collection collection37 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test23");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap10);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap10.containsValue(obj13);
        boolean b15 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap18.keySet();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection22 = defaultedMap18.values();
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1.0f);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 1, obj38);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) 1);
        defaultedMap36.clear();
        java.lang.Object obj43 = defaultedMap27.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap36);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap32.containsValue(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        boolean b51 = defaultedMap47.equals((java.lang.Object) 10);
        java.lang.Object obj52 = defaultedMap32.get((java.lang.Object) b51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap32);
        java.lang.Object obj54 = defaultedMap16.get((java.lang.Object) defaultedMap32);
        collections.Transformer transformer55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, transformer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 0 + "'", obj52.equals((byte) 0));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test24");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap10);
        int i13 = defaultedMap10.size();
        java.util.Set set14 = defaultedMap10.keySet();
        boolean b15 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Set set23 = defaultedMap21.entrySet();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) set23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 100);
        java.util.Set set29 = defaultedMap26.keySet();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set33 = defaultedMap32.keySet();
        boolean b35 = defaultedMap32.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection36 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) collection36);
        int i38 = defaultedMap37.size();
        collections.Predicate predicate39 = null;
        collections.Predicate predicate40 = null;
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        boolean b42 = defaultedMap26.containsKey((java.lang.Object) map41);
        java.lang.Object obj43 = defaultedMap10.get((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 0 + "'", obj30.equals((byte) 0));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test25");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1, obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        java.util.Set set7 = defaultedMap6.entrySet();
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test26");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) collection5);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1.0f);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 1, obj20);
        boolean b23 = defaultedMap18.containsKey((java.lang.Object) 1);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap18);
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = null;
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 1, obj33);
        java.util.Set set35 = defaultedMap31.keySet();
        boolean b36 = defaultedMap6.containsValue((java.lang.Object) set35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1.0f);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) 1, obj49);
        boolean b52 = defaultedMap47.containsKey((java.lang.Object) 1);
        defaultedMap47.clear();
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap47);
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap43.containsValue(obj55);
        java.util.Set set57 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection60 = defaultedMap59.values();
        boolean b61 = defaultedMap43.containsValue((java.lang.Object) collection60);
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) b61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) 1, obj66);
        boolean b69 = defaultedMap64.containsKey((java.lang.Object) 1);
        defaultedMap64.clear();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) (byte) 100);
        int i75 = defaultedMap72.size();
        java.lang.Object obj76 = defaultedMap64.remove((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection79 = defaultedMap78.values();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap78);
        boolean b81 = defaultedMap64.containsValue((java.lang.Object) defaultedMap80);
        java.util.Set set82 = defaultedMap64.entrySet();
        java.lang.Object obj83 = defaultedMap6.get((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test27");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b10 = defaultedMap8.isEmpty();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 1, obj25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap23);
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj33 = defaultedMap19.get((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        boolean b35 = defaultedMap1.isEmpty();
        java.util.Collection collection36 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap38.keySet();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 1, obj45);
        java.util.Set set47 = defaultedMap43.keySet();
        java.lang.Object obj48 = defaultedMap38.get((java.lang.Object) defaultedMap43);
        boolean b49 = defaultedMap1.containsValue(obj48);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 0 + "'", obj12.equals((byte) 0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 0 + "'", obj31.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 0 + "'", obj33.equals((byte) 0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte) 0 + "'", obj48.equals((byte) 0));
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test28");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1.0f);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1, obj18);
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 1);
        defaultedMap16.clear();
        java.lang.Object obj23 = defaultedMap7.put((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap16);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap12.put((java.lang.Object) (byte) 100, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 100);
        int i35 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1.0f);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) 'a');
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) defaultedMap37);
        defaultedMap12.putAll((java.util.Map) defaultedMap32);
        java.util.Set set44 = defaultedMap12.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 0 + "'", obj5.equals((byte) 0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 0 + "'", obj24.equals((byte) 0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test29");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0f);
        boolean b10 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) (-1.0d), (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 1, obj24);
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) 1);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 100);
        int i33 = defaultedMap30.size();
        java.lang.Object obj34 = defaultedMap22.remove((java.lang.Object) defaultedMap30);
        boolean b35 = defaultedMap17.containsKey((java.lang.Object) defaultedMap22);
        java.lang.Object obj36 = defaultedMap13.remove((java.lang.Object) defaultedMap17);
        defaultedMap13.clear();
        java.util.Set set38 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 1.0f);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) 1, obj51);
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) 1);
        defaultedMap49.clear();
        java.lang.Object obj56 = defaultedMap40.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap49);
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap45.containsValue(obj57);
        java.util.Set set59 = defaultedMap45.entrySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection62 = defaultedMap61.values();
        boolean b63 = defaultedMap45.containsValue((java.lang.Object) collection62);
        defaultedMap13.putAll((java.util.Map) defaultedMap45);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap45);
        java.util.Set set66 = defaultedMap11.entrySet();
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) set66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0.0f);
        boolean b72 = defaultedMap69.isEmpty();
        java.lang.Object obj75 = defaultedMap69.put((java.lang.Object) 10L, (java.lang.Object) "{}");
        collections.Predicate predicate76 = null;
        collections.Predicate predicate77 = null;
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set81 = defaultedMap80.keySet();
        java.util.Collection collection82 = defaultedMap80.values();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set85 = defaultedMap84.keySet();
        boolean b87 = defaultedMap84.containsKey((java.lang.Object) 0.0f);
        java.util.Collection collection88 = defaultedMap84.values();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) collection88);
        boolean b90 = defaultedMap89.isEmpty();
        boolean b91 = defaultedMap80.containsValue((java.lang.Object) defaultedMap89);
        boolean b92 = defaultedMap80.isEmpty();
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap80);
        boolean b94 = defaultedMap93.isEmpty();
        java.lang.Object obj95 = defaultedMap69.remove((java.lang.Object) defaultedMap93);
        java.util.Set set96 = defaultedMap69.keySet();
        collections.map.DefaultedMap defaultedMap97 = new collections.map.DefaultedMap((java.lang.Object) set96);
        java.lang.Object obj98 = defaultedMap1.get((java.lang.Object) set96);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + (byte) 0 + "'", obj67.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) 0 + "'", obj71.equals((byte) 0));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + (byte) 0 + "'", obj98.equals((byte) 0));
    }
}

