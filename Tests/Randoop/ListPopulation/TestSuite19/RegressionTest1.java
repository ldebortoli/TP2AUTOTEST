import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.lang.String str37 = elitisticListPopulation31.toString();
        double d38 = elitisticListPopulation31.getElitismRate();
        math.genetics.Population population39 = elitisticListPopulation31.nextGeneration();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation45.addChromosome(chromosome46);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) '#', 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation45.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array67 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome68 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome68, chromosome_array67);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome68, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74, (int) '#', 0.0d);
        java.lang.String str79 = elitisticListPopulation78.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome80 = elitisticListPopulation78.getChromosomes();
        math.genetics.Chromosome[] chromosome_array81 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome82 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82, chromosome_array81);
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82, (int) '#', 0.0d);
        java.lang.String str87 = elitisticListPopulation86.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome88 = elitisticListPopulation86.getChromosomes();
        elitisticListPopulation78.setChromosomes(list_chromosome88);
        elitisticListPopulation72.setChromosomes(list_chromosome88);
        elitisticListPopulation66.setChromosomes(list_chromosome88);
        elitisticListPopulation31.setChromosomes(list_chromosome88);
        elitisticListPopulation5.setChromosomes(list_chromosome88);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(d38 == 0.0d);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(chromosome_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "[]" + "'", str79.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome80);
        org.junit.Assert.assertNotNull(chromosome_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "[]" + "'", str87.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome88);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        double d20 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        int i35 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation5.addChromosome(chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i35 == 35);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertNotNull(list_chromosome3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) '#');
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        int i31 = elitisticListPopulation5.getPopulationSize();
        int i32 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str33 = elitisticListPopulation5.toString();
        double d34 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 35);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertTrue(d34 == 0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        int i44 = elitisticListPopulation5.getPopulationLimit();
        int i45 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome46 = elitisticListPopulation5.spliterator();
        math.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation5.addChromosome(chromosome47);
        double d49 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome46);
        org.junit.Assert.assertTrue(d49 == 0.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        java.lang.String str44 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation50.addChromosome(chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome53);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = list_chromosome53.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        try {
            elitisticListPopulation5.setElitismRate((double) 52);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        int i32 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(list_chromosome34, 97, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome34);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        int i9 = elitisticListPopulation5.getPopulationSize();
        double d10 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        int i24 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 35);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome21, (int) '#', (double) 32);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        int i23 = elitisticListPopulation5.getPopulationLimit();
        int i24 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(2);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i23 == 35);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation8.nextGeneration();
        int i12 = elitisticListPopulation8.getPopulationLimit();
        java.lang.String str13 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation25.setChromosomes(list_chromosome35);
        elitisticListPopulation19.setChromosomes(list_chromosome35);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        elitisticListPopulation2.setChromosomes(list_chromosome35);
        double d40 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome41);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) '#', 0.0d);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation22.getChromosomes();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation22.setChromosomes(list_chromosome32);
        elitisticListPopulation16.setChromosomes(list_chromosome32);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) '#', 0.0d);
        java.lang.String str50 = elitisticListPopulation49.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation49.getChromosomes();
        elitisticListPopulation41.setChromosomes(list_chromosome51);
        java.lang.String str53 = elitisticListPopulation41.toString();
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation41.addChromosome(chromosome54);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation41.getChromosomes();
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation41.addChromosome(chromosome57);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation41.iterator();
        java.lang.String str60 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome61 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome61);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]" + "'", str50.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome51);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[null, null]" + "'", str60.equals("[null, null]"));
        org.junit.Assert.assertNotNull(list_chromosome61);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        java.lang.String str28 = elitisticListPopulation27.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        elitisticListPopulation13.setChromosomes(list_chromosome29);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation13.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome33);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(list_chromosome33, (-1), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome33);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation5.spliterator();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation19.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(list_chromosome22, (int) (byte) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome28);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(list_chromosome28);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        elitisticListPopulation5.setPopulationLimit((int) '#');
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        java.lang.String str21 = elitisticListPopulation20.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome22);
        try {
            math.genetics.Population population24 = elitisticListPopulation5.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        double d21 = elitisticListPopulation20.getElitismRate();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        double d29 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(d29 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        int i66 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome69 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome70 = null;
        elitisticListPopulation5.addChromosome(chromosome70);
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation(list_chromosome72, (int) (byte) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome69);
        org.junit.Assert.assertNotNull(list_chromosome72);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        int i20 = elitisticListPopulation5.getPopulationLimit();
        int i21 = elitisticListPopulation5.getPopulationSize();
        double d22 = elitisticListPopulation5.getElitismRate();
        java.lang.String str23 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) '#', 0.0d);
        double d35 = elitisticListPopulation34.getElitismRate();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) '#', 0.0d);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation28.iterator();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        double d55 = elitisticListPopulation54.getElitismRate();
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome60 = elitisticListPopulation54.iterator();
        elitisticListPopulation54.setPopulationLimit((int) '#');
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation54.getChromosomes();
        int i64 = elitisticListPopulation54.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation70.addChromosome(chromosome71);
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74, (int) '#', 0.0d);
        double d79 = elitisticListPopulation78.getElitismRate();
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81);
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86, (int) '#', 0.0d);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        try {
            elitisticListPopulation5.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 35);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(d35 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome60);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(d79 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 0);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        elitisticListPopulation27.setChromosomes(list_chromosome43);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation27.iterator();
        int i47 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        int i50 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        math.genetics.Population population53 = elitisticListPopulation2.nextGeneration();
        int i54 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(i47 == 35);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(population53);
        org.junit.Assert.assertTrue(i54 == 35);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        elitisticListPopulation27.setChromosomes(list_chromosome43);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation27.iterator();
        int i47 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        int i50 = elitisticListPopulation2.getPopulationSize();
        int i51 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(list_chromosome52, (int) '4', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(i47 == 35);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(list_chromosome52);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation5.addChromosome(chromosome39);
        double d41 = elitisticListPopulation5.getElitismRate();
        int i42 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation5.addChromosome(chromosome43);
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertTrue(i42 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        int i66 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome70, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation74.addChromosome(chromosome75);
        math.genetics.Chromosome[] chromosome_array77 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome78 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78, chromosome_array77);
        math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome78, (int) '#', 0.0d);
        double d83 = elitisticListPopulation82.getElitismRate();
        math.genetics.Chromosome[] chromosome_array84 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome85 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85, chromosome_array84);
        elitisticListPopulation82.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85);
        elitisticListPopulation74.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome85);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome85);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome90 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(chromosome_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(d83 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome90);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(list_chromosome24, (int) (byte) 10, 1.0d);
        try {
            math.genetics.Chromosome chromosome28 = elitisticListPopulation27.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(list_chromosome24);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.lang.String str24 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        int i12 = elitisticListPopulation5.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome23, 52, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome23, (int) '4', (double) 1L);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        java.lang.String str19 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[null]" + "'", str19.equals("[null]"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        double d15 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        double d26 = elitisticListPopulation25.getElitismRate();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) '#', 0.0d);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome63 = elitisticListPopulation44.iterator();
        int i64 = elitisticListPopulation44.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome65);
        elitisticListPopulation2.setChromosomes(list_chromosome65);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation(list_chromosome65, (int) (short) 1, (double) 32);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertNotNull(iterator_chromosome63);
        org.junit.Assert.assertTrue(i64 == 35);
        org.junit.Assert.assertNotNull(list_chromosome65);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        int i13 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) '#', 0.0d);
        double d23 = elitisticListPopulation22.getElitismRate();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) '#', 0.0d);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation16.iterator();
        math.genetics.Population population37 = elitisticListPopulation16.nextGeneration();
        math.genetics.Population population38 = elitisticListPopulation16.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) '#', 0.0d);
        double d48 = elitisticListPopulation47.getElitismRate();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation41.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 35);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertNotNull(population37);
        org.junit.Assert.assertNotNull(population38);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(d48 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(list_chromosome56);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        int i27 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation5.addChromosome(chromosome28);
        int i30 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Population population31 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation5.addChromosome(chromosome32);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        try {
            math.genetics.Population population36 = elitisticListPopulation5.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNotNull(population31);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) '#', 0.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation12.iterator();
        math.genetics.Population population33 = elitisticListPopulation12.nextGeneration();
        math.genetics.Population population34 = elitisticListPopulation12.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) '#', 0.0d);
        double d44 = elitisticListPopulation43.getElitismRate();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation37.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation5.setElitismRate(0.0d);
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation5.addChromosome(chromosome54);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(population34);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        double d9 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        double d38 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population39 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = population39.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue(d38 == 0.0d);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        java.lang.String str10 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation5.spliterator();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        int i13 = elitisticListPopulation5.getPopulationLimit();
        double d14 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue(i13 == 35);
        org.junit.Assert.assertTrue(d14 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) '#', 0.0d);
        double d49 = elitisticListPopulation48.getElitismRate();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) '#', 0.0d);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome65 = elitisticListPopulation5.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str69 = elitisticListPopulation68.toString();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation75.addChromosome(chromosome76);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79, (int) '#', 0.0d);
        double d84 = elitisticListPopulation83.getElitismRate();
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        elitisticListPopulation83.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation75.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        math.genetics.Chromosome[] chromosome_array90 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome91 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b92 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome91, chromosome_array90);
        math.genetics.ElitisticListPopulation elitisticListPopulation95 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91, (int) '#', 0.0d);
        elitisticListPopulation75.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91);
        elitisticListPopulation68.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome91);
        try {
            math.genetics.Chromosome chromosome99 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertNotNull(spliterator_chromosome65);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(d84 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(chromosome_array90);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Population population10 = elitisticListPopulation5.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        double d12 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(d12 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        double d31 = elitisticListPopulation30.getElitismRate();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation30.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) '#', 0.0d);
        double d46 = elitisticListPopulation45.getElitismRate();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation45.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation39.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) '#', 0.0d);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation39.iterator();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) '#', 0.0d);
        java.lang.String str66 = elitisticListPopulation65.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome67);
        elitisticListPopulation30.setChromosomes(list_chromosome67);
        elitisticListPopulation2.setChromosomes(list_chromosome67);
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNotNull(list_chromosome73);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        math.genetics.Population population22 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        int i25 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit(10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setElitismRate((double) 1L);
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        int i38 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue(i38 == 35);
        org.junit.Assert.assertNotNull(list_chromosome39);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(2, (double) (byte) 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        int i44 = elitisticListPopulation5.getPopulationLimit();
        int i45 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate((double) 1);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) '#', 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        elitisticListPopulation53.setElitismRate(0.0d);
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation53.addChromosome(chromosome57);
        math.genetics.Chromosome chromosome59 = null;
        elitisticListPopulation53.addChromosome(chromosome59);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome61 = elitisticListPopulation53.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation53.getChromosomes();
        try {
            elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome62);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome61);
        org.junit.Assert.assertNotNull(list_chromosome62);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation5.getChromosomes();
        int i26 = elitisticListPopulation5.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome27 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population24 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        double d34 = elitisticListPopulation33.getElitismRate();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        int i41 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(d34 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i41 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome23);
        int i25 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(i25 == 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        int i44 = elitisticListPopulation5.getPopulationLimit();
        double d45 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = list_chromosome46.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome48 = list_chromosome46.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(d45 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertNotNull(spliterator_chromosome48);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        int i14 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) '#', 0.0d);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) '#', 0.0d);
        java.lang.String str37 = elitisticListPopulation36.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome38);
        elitisticListPopulation28.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome50);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome53 = list_chromosome50.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertNotNull(spliterator_chromosome53);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        math.genetics.Population population16 = elitisticListPopulation13.nextGeneration();
        int i17 = elitisticListPopulation13.getPopulationLimit();
        int i18 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        java.lang.String str30 = elitisticListPopulation24.toString();
        elitisticListPopulation24.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome33);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) '#', 0.0d);
        double d49 = elitisticListPopulation48.getElitismRate();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) '#', 0.0d);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        math.genetics.Chromosome[] chromosome_array63 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome64 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome64, chromosome_array63);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome64, (int) '#', 0.0d);
        double d69 = elitisticListPopulation68.getElitismRate();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation68.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71);
        java.lang.String str74 = elitisticListPopulation68.toString();
        elitisticListPopulation68.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome77 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation13.setChromosomes(list_chromosome77);
        elitisticListPopulation5.setChromosomes(list_chromosome77);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation(list_chromosome77, 35, 100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue(i17 == 35);
        org.junit.Assert.assertTrue(i18 == 35);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(chromosome_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(d69 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[]" + "'", str74.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome77);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit(100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationSize();
        int i10 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) '#', 0.0d);
        java.lang.String str53 = elitisticListPopulation52.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation52.getChromosomes();
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) '#', 0.0d);
        java.lang.String str61 = elitisticListPopulation60.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation60.getChromosomes();
        elitisticListPopulation52.setChromosomes(list_chromosome62);
        elitisticListPopulation46.setChromosomes(list_chromosome62);
        elitisticListPopulation40.setChromosomes(list_chromosome62);
        elitisticListPopulation5.setChromosomes(list_chromosome62);
        int i67 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str68 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[]" + "'", str61.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome62);
        org.junit.Assert.assertTrue(i67 == 35);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]" + "'", str68.equals("[]"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        int i15 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        int i66 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome67 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome67);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        int i9 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) '#', 0.0d);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation15.getChromosomes();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) '#', 0.0d);
        java.lang.String str24 = elitisticListPopulation23.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation15.setChromosomes(list_chromosome25);
        elitisticListPopulation15.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        java.lang.String str41 = elitisticListPopulation40.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) '#', 0.0d);
        java.lang.String str49 = elitisticListPopulation48.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation40.setChromosomes(list_chromosome50);
        elitisticListPopulation34.setChromosomes(list_chromosome50);
        elitisticListPopulation15.setChromosomes(list_chromosome50);
        int i54 = elitisticListPopulation15.getPopulationLimit();
        double d55 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation15.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = list_chromosome56.spliterator();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation(list_chromosome56, 2, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.lang.String str33 = elitisticListPopulation27.toString();
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation27.addChromosome(chromosome34);
        java.lang.String str36 = elitisticListPopulation27.toString();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation42.addChromosome(chromosome43);
        math.genetics.Population population45 = elitisticListPopulation42.nextGeneration();
        int i46 = elitisticListPopulation42.getPopulationLimit();
        java.lang.String str47 = elitisticListPopulation42.toString();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55, (int) '#', 0.0d);
        java.lang.String str60 = elitisticListPopulation59.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome61 = elitisticListPopulation59.getChromosomes();
        math.genetics.Chromosome[] chromosome_array62 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome63 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63, chromosome_array62);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63, (int) '#', 0.0d);
        java.lang.String str68 = elitisticListPopulation67.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation67.getChromosomes();
        elitisticListPopulation59.setChromosomes(list_chromosome69);
        elitisticListPopulation53.setChromosomes(list_chromosome69);
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome69);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome69);
        elitisticListPopulation2.setChromosomes(list_chromosome69);
        try {
            elitisticListPopulation2.setElitismRate((double) 2);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[null]" + "'", str36.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertTrue(i46 == 35);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[null]" + "'", str47.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[]" + "'", str60.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome61);
        org.junit.Assert.assertNotNull(chromosome_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]" + "'", str68.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome69);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation5.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) '#', 0.0d);
        java.lang.String str15 = elitisticListPopulation14.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation14.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) (short) 10, (double) (short) 1);
        double d23 = elitisticListPopulation22.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) '#', 0.0d);
        double d33 = elitisticListPopulation32.getElitismRate();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation26.iterator();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) '#', 0.0d);
        java.lang.String str53 = elitisticListPopulation52.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation52.getChromosomes();
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome54);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation61.addChromosome(chromosome62);
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65, (int) '#', 0.0d);
        double d70 = elitisticListPopulation69.getElitismRate();
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        elitisticListPopulation69.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72);
        elitisticListPopulation61.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72);
        math.genetics.Chromosome[] chromosome_array76 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome77 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b78 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome77, chromosome_array76);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome77, (int) '#', 0.0d);
        elitisticListPopulation61.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome77);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome77);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome77);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome77);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue(d23 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(d70 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(chromosome_array76);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation8.nextGeneration();
        int i12 = elitisticListPopulation8.getPopulationLimit();
        java.lang.String str13 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation25.setChromosomes(list_chromosome35);
        elitisticListPopulation19.setChromosomes(list_chromosome35);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        elitisticListPopulation2.setChromosomes(list_chromosome35);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = elitisticListPopulation2.spliterator();
        math.genetics.Population population41 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertNotNull(population41);
        org.junit.Assert.assertNotNull(list_chromosome42);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.util.List<math.genetics.Chromosome> list_chromosome3 = elitisticListPopulation2.getChromosomes();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(list_chromosome3);
        org.junit.Assert.assertTrue(i4 == 97);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) '#', 0.0d);
        java.lang.String str15 = elitisticListPopulation14.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) '#', 0.0d);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome24);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        java.lang.String str32 = elitisticListPopulation31.toString();
        math.genetics.Population population33 = elitisticListPopulation31.nextGeneration();
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation31.addChromosome(chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str41 = elitisticListPopulation40.toString();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51, (int) '#', 0.0d);
        double d56 = elitisticListPopulation55.getElitismRate();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation55.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58);
        elitisticListPopulation47.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58);
        math.genetics.Chromosome[] chromosome_array62 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome63 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63, chromosome_array62);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63, (int) '#', 0.0d);
        elitisticListPopulation47.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63);
        int i70 = elitisticListPopulation40.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome71);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome71);
        try {
            math.genetics.Chromosome chromosome74 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 35);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(d56 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(chromosome_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(list_chromosome71);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        double d23 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(d23 == 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        double d15 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation2.iterator();
        math.genetics.Population population17 = elitisticListPopulation2.nextGeneration();
        int i18 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str19 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation71.addChromosome(chromosome72);
        math.genetics.Population population74 = elitisticListPopulation71.nextGeneration();
        int i75 = elitisticListPopulation71.getPopulationSize();
        math.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation71.addChromosome(chromosome76);
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array81 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome82 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82, chromosome_array81);
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82, (int) '#', 0.0d);
        double d87 = elitisticListPopulation86.getElitismRate();
        math.genetics.Chromosome[] chromosome_array88 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome89 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89, chromosome_array88);
        elitisticListPopulation86.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89);
        elitisticListPopulation80.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome89);
        java.util.List<math.genetics.Chromosome> list_chromosome93 = elitisticListPopulation80.getChromosomes();
        elitisticListPopulation71.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome93);
        elitisticListPopulation5.setChromosomes(list_chromosome93);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation98 = new math.genetics.ElitisticListPopulation(list_chromosome93, 1, (double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(population74);
        org.junit.Assert.assertTrue(i75 == 1);
        org.junit.Assert.assertNotNull(chromosome_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(d87 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(list_chromosome93);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        java.lang.String str37 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        int i9 = elitisticListPopulation5.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) '#', 0.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.lang.String str37 = elitisticListPopulation31.toString();
        double d38 = elitisticListPopulation31.getElitismRate();
        math.genetics.Population population39 = elitisticListPopulation31.nextGeneration();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation45.addChromosome(chromosome46);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) '#', 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation45.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 10, 1.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        int i65 = elitisticListPopulation5.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome66 = elitisticListPopulation5.spliterator();
        try {
            math.genetics.Chromosome chromosome67 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(d38 == 0.0d);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome66);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        int i10 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) '#', 0.0d);
        java.lang.String str17 = elitisticListPopulation16.toString();
        math.genetics.Population population18 = elitisticListPopulation16.nextGeneration();
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation16.addChromosome(chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation16.getChromosomes();
        int i22 = elitisticListPopulation16.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation32.addChromosome(chromosome33);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) '#', 0.0d);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        java.lang.String str55 = elitisticListPopulation25.toString();
        elitisticListPopulation25.setElitismRate((double) 0.0f);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) '#', 0.0d);
        double d64 = elitisticListPopulation63.getElitismRate();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation63.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        java.lang.String str69 = elitisticListPopulation63.toString();
        double d70 = elitisticListPopulation63.getElitismRate();
        math.genetics.Population population71 = elitisticListPopulation63.nextGeneration();
        math.genetics.Chromosome[] chromosome_array72 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome73 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b74 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome73, chromosome_array72);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome73, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome78 = null;
        elitisticListPopulation77.addChromosome(chromosome78);
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81, (int) '#', 0.0d);
        double d86 = elitisticListPopulation85.getElitismRate();
        math.genetics.Chromosome[] chromosome_array87 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome88 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88, chromosome_array87);
        elitisticListPopulation85.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation77.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation63.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome94 = arraylist_chromosome88.spliterator();
        elitisticListPopulation16.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertTrue(i10 == 35);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(d64 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertTrue(d70 == 0.0d);
        org.junit.Assert.assertNotNull(population71);
        org.junit.Assert.assertNotNull(chromosome_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(d86 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome94);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(35);
        org.junit.Assert.assertTrue(i3 == 52);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (byte) 10, 1.0d);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome44 = null;
        elitisticListPopulation43.addChromosome(chromosome44);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) '#', 0.0d);
        java.lang.String str58 = elitisticListPopulation57.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation57.getChromosomes();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) '#', 0.0d);
        java.lang.String str66 = elitisticListPopulation65.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation57.setChromosomes(list_chromosome67);
        elitisticListPopulation51.setChromosomes(list_chromosome67);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome70 = elitisticListPopulation51.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome71);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome71);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]" + "'", str58.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNotNull(iterator_chromosome70);
        org.junit.Assert.assertNotNull(list_chromosome71);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) '#', 0.0d);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) '#', 0.0d);
        java.lang.String str37 = elitisticListPopulation36.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome38);
        elitisticListPopulation28.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome50);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation5.getChromosomes();
        double d54 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertTrue(d54 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        double d20 = elitisticListPopulation5.getElitismRate();
        int i21 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue(i21 == 35);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation20.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome22);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        math.genetics.Population population32 = elitisticListPopulation29.nextGeneration();
        int i33 = elitisticListPopulation29.getPopulationLimit();
        int i34 = elitisticListPopulation29.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str46 = elitisticListPopulation40.toString();
        elitisticListPopulation40.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome49);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome57 = null;
        elitisticListPopulation56.addChromosome(chromosome57);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, (int) '#', 0.0d);
        double d65 = elitisticListPopulation64.getElitismRate();
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67);
        elitisticListPopulation56.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) '#', 0.0d);
        elitisticListPopulation56.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72);
        elitisticListPopulation29.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72);
        int i80 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNotNull(list_chromosome22);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertTrue(i33 == 35);
        org.junit.Assert.assertTrue(i34 == 35);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(d65 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i80 == 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        elitisticListPopulation27.setChromosomes(list_chromosome43);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation27.iterator();
        int i47 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        int i52 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str53 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome54 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(i47 == 35);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = list_chromosome21.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(list_chromosome21, 52, 1.0d);
        int i28 = elitisticListPopulation27.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) (short) 10, (double) (short) 1);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        int i66 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome70, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation74.addChromosome(chromosome75);
        math.genetics.Chromosome[] chromosome_array77 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome78 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome78, chromosome_array77);
        math.genetics.ElitisticListPopulation elitisticListPopulation82 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome78, (int) '#', 0.0d);
        double d83 = elitisticListPopulation82.getElitismRate();
        math.genetics.Chromosome[] chromosome_array84 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome85 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85, chromosome_array84);
        elitisticListPopulation82.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85);
        elitisticListPopulation74.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome85);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome85);
        math.genetics.Chromosome[] chromosome_array90 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome91 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b92 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome91, chromosome_array90);
        math.genetics.ElitisticListPopulation elitisticListPopulation95 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91, (int) '#', 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome96 = elitisticListPopulation95.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome97 = elitisticListPopulation95.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome97);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(chromosome_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(d83 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(chromosome_array90);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome96);
        org.junit.Assert.assertNotNull(list_chromosome97);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) '#', 0.0d);
        double d49 = elitisticListPopulation48.getElitismRate();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome51);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) '#', 0.0d);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome65 = elitisticListPopulation5.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str69 = elitisticListPopulation68.toString();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome71, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation75.addChromosome(chromosome76);
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79, (int) '#', 0.0d);
        double d84 = elitisticListPopulation83.getElitismRate();
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        elitisticListPopulation83.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation75.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        math.genetics.Chromosome[] chromosome_array90 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome91 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b92 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome91, chromosome_array90);
        math.genetics.ElitisticListPopulation elitisticListPopulation95 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91, (int) '#', 0.0d);
        elitisticListPopulation75.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91);
        elitisticListPopulation68.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome91);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome91);
        int i99 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(list_chromosome64);
        org.junit.Assert.assertNotNull(spliterator_chromosome65);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(d84 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(chromosome_array90);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(i99 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation8.nextGeneration();
        int i12 = elitisticListPopulation8.getPopulationLimit();
        java.lang.String str13 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation25.setChromosomes(list_chromosome35);
        elitisticListPopulation19.setChromosomes(list_chromosome35);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        math.genetics.Chromosome chromosome40 = null;
        elitisticListPopulation2.addChromosome(chromosome40);
        double d42 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(d42 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation5.addChromosome(chromosome11);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        elitisticListPopulation5.setElitismRate((double) (byte) 0);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 52);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        int i27 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(2, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation5.addChromosome(chromosome39);
        double d41 = elitisticListPopulation5.getElitismRate();
        int i42 = elitisticListPopulation5.getPopulationSize();
        double d43 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome44 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome44);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(list_chromosome24, (int) (byte) 10, 1.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(list_chromosome24, 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(list_chromosome24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        int i35 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str36 = elitisticListPopulation5.toString();
        int i37 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i35 == 35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        double d19 = elitisticListPopulation16.getElitismRate();
        elitisticListPopulation16.setPopulationLimit((int) (short) 100);
        math.genetics.Population population22 = elitisticListPopulation16.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        elitisticListPopulation25.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) '#', 0.0d);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) '#', 0.0d);
        java.lang.String str57 = elitisticListPopulation56.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome58 = elitisticListPopulation56.getChromosomes();
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, (int) '#', 0.0d);
        java.lang.String str65 = elitisticListPopulation64.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome66 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation56.setChromosomes(list_chromosome66);
        elitisticListPopulation50.setChromosomes(list_chromosome66);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome69 = elitisticListPopulation50.iterator();
        int i70 = elitisticListPopulation50.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome71);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome71);
        elitisticListPopulation5.setChromosomes(list_chromosome71);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome75 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[]" + "'", str57.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome58);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]" + "'", str65.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome66);
        org.junit.Assert.assertNotNull(iterator_chromosome69);
        org.junit.Assert.assertTrue(i70 == 35);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertNotNull(spliterator_chromosome75);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (byte) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        int i9 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) '#', 0.0d);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation15.getChromosomes();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) '#', 0.0d);
        java.lang.String str24 = elitisticListPopulation23.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation15.setChromosomes(list_chromosome25);
        elitisticListPopulation15.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        java.lang.String str41 = elitisticListPopulation40.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) '#', 0.0d);
        java.lang.String str49 = elitisticListPopulation48.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation40.setChromosomes(list_chromosome50);
        elitisticListPopulation34.setChromosomes(list_chromosome50);
        elitisticListPopulation15.setChromosomes(list_chromosome50);
        int i54 = elitisticListPopulation15.getPopulationLimit();
        double d55 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation15.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = list_chromosome56.spliterator();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = list_chromosome56.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        try {
            math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) '#');
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        int i15 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(35, 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        elitisticListPopulation27.setChromosomes(list_chromosome43);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation27.iterator();
        int i47 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome52 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        double d59 = elitisticListPopulation58.getElitismRate();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        java.lang.String str64 = elitisticListPopulation58.toString();
        math.genetics.Chromosome chromosome65 = null;
        elitisticListPopulation58.addChromosome(chromosome65);
        math.genetics.Population population67 = elitisticListPopulation58.nextGeneration();
        elitisticListPopulation58.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation58.setPopulationLimit((int) ' ');
        elitisticListPopulation58.setPopulationLimit(100);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome74 = elitisticListPopulation58.spliterator();
        math.genetics.Chromosome[] chromosome_array75 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome76 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b77 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome76, chromosome_array75);
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome76, (int) '#', 0.0d);
        java.lang.String str81 = elitisticListPopulation80.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome82 = elitisticListPopulation80.getChromosomes();
        math.genetics.Chromosome[] chromosome_array83 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome84 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b85 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome84, chromosome_array83);
        math.genetics.ElitisticListPopulation elitisticListPopulation88 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome84, (int) '#', 0.0d);
        java.lang.String str89 = elitisticListPopulation88.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome90 = elitisticListPopulation88.getChromosomes();
        elitisticListPopulation80.setChromosomes(list_chromosome90);
        java.lang.String str92 = elitisticListPopulation80.toString();
        math.genetics.Chromosome chromosome93 = null;
        elitisticListPopulation80.addChromosome(chromosome93);
        java.util.List<math.genetics.Chromosome> list_chromosome95 = elitisticListPopulation80.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome96 = elitisticListPopulation80.getChromosomes();
        elitisticListPopulation58.setChromosomes(list_chromosome96);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome96);
        java.util.List<math.genetics.Chromosome> list_chromosome99 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(i47 == 35);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(spliterator_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(d59 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[]" + "'", str64.equals("[]"));
        org.junit.Assert.assertNotNull(population67);
        org.junit.Assert.assertNotNull(spliterator_chromosome74);
        org.junit.Assert.assertNotNull(chromosome_array75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "[]" + "'", str81.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome82);
        org.junit.Assert.assertNotNull(chromosome_array83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "[]" + "'", str89.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome90);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "[]" + "'", str92.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome95);
        org.junit.Assert.assertNotNull(list_chromosome96);
        org.junit.Assert.assertNotNull(list_chromosome99);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        int i7 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue(i7 == 35);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.lang.String str24 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        int i32 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) '#', 0.0d);
        double d43 = elitisticListPopulation42.getElitismRate();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        elitisticListPopulation36.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation36.iterator();
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) '#', 0.0d);
        java.lang.String str63 = elitisticListPopulation62.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome64 = elitisticListPopulation62.getChromosomes();
        elitisticListPopulation36.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome64);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome64);
        elitisticListPopulation2.setPopulationLimit(97);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[]" + "'", str63.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome64);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        java.lang.String str28 = elitisticListPopulation27.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation19.setChromosomes(list_chromosome29);
        elitisticListPopulation13.setChromosomes(list_chromosome29);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation13.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome33);
        math.genetics.Population population35 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(population35);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) '#', 0.0d);
        java.lang.String str22 = elitisticListPopulation21.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation21.getChromosomes();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        java.lang.String str30 = elitisticListPopulation29.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation21.setChromosomes(list_chromosome31);
        elitisticListPopulation15.setChromosomes(list_chromosome31);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome34 = elitisticListPopulation15.iterator();
        int i35 = elitisticListPopulation15.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(iterator_chromosome34);
        org.junit.Assert.assertTrue(i35 == 35);
        org.junit.Assert.assertNotNull(list_chromosome36);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) (short) 10, (double) (short) 1);
        double d14 = elitisticListPopulation13.getElitismRate();
        int i15 = elitisticListPopulation13.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation13.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(list_chromosome16, (int) (byte) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(d14 == 1.0d);
        org.junit.Assert.assertTrue(i15 == 10);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        int i44 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome45 = null;
        elitisticListPopulation5.addChromosome(chromosome45);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        double d17 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        double d26 = elitisticListPopulation23.getElitismRate();
        elitisticListPopulation23.setPopulationLimit((int) (short) 100);
        math.genetics.Population population29 = elitisticListPopulation23.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        double d39 = elitisticListPopulation38.getElitismRate();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) '#', 0.0d);
        java.lang.String str64 = elitisticListPopulation63.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation63.getChromosomes();
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67, (int) '#', 0.0d);
        java.lang.String str72 = elitisticListPopulation71.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation71.getChromosomes();
        elitisticListPopulation63.setChromosomes(list_chromosome73);
        elitisticListPopulation57.setChromosomes(list_chromosome73);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome76 = elitisticListPopulation57.iterator();
        int i77 = elitisticListPopulation57.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome78 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation32.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome78);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome78);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome78);
        int i82 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(d39 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[]" + "'", str64.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[]" + "'", str72.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome73);
        org.junit.Assert.assertNotNull(iterator_chromosome76);
        org.junit.Assert.assertTrue(i77 == 35);
        org.junit.Assert.assertNotNull(list_chromosome78);
        org.junit.Assert.assertTrue(i82 == 100);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        elitisticListPopulation27.setChromosomes(list_chromosome43);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation27.iterator();
        int i47 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        math.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation2.addChromosome(chromosome50);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation2.getChromosomes();
        int i53 = elitisticListPopulation2.getPopulationSize();
        try {
            math.genetics.Chromosome chromosome54 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(i47 == 35);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue(i53 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        double d31 = elitisticListPopulation30.getElitismRate();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation30.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) '#', 0.0d);
        double d46 = elitisticListPopulation45.getElitismRate();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation45.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation39.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) '#', 0.0d);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation39.iterator();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) '#', 0.0d);
        java.lang.String str66 = elitisticListPopulation65.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome67);
        elitisticListPopulation30.setChromosomes(list_chromosome67);
        elitisticListPopulation2.setChromosomes(list_chromosome67);
        java.util.List<math.genetics.Chromosome> list_chromosome71 = elitisticListPopulation2.getChromosomes();
        java.lang.String str72 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNotNull(list_chromosome71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[]" + "'", str72.equals("[]"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        java.lang.String str10 = elitisticListPopulation5.toString();
        try {
            math.genetics.Chromosome chromosome11 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[null]" + "'", str10.equals("[null]"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation5.getChromosomes();
        double d22 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(d22 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation33.setChromosomes(list_chromosome43);
        elitisticListPopulation27.setChromosomes(list_chromosome43);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome46 = elitisticListPopulation27.iterator();
        int i47 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        int i50 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        math.genetics.Population population53 = elitisticListPopulation2.nextGeneration();
        int i54 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(iterator_chromosome46);
        org.junit.Assert.assertTrue(i47 == 35);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(population53);
        org.junit.Assert.assertTrue(i54 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i19 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        java.lang.String str22 = elitisticListPopulation5.toString();
        math.genetics.Population population23 = elitisticListPopulation5.nextGeneration();
        java.lang.String str24 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = elitisticListPopulation5.spliterator();
        java.lang.String str26 = elitisticListPopulation5.toString();
        double d27 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertTrue(d27 == 0.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation5.addChromosome(chromosome39);
        double d41 = elitisticListPopulation5.getElitismRate();
        int i42 = elitisticListPopulation5.getPopulationSize();
        double d43 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome44 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(d43 == 0.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        int i27 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation5.addChromosome(chromosome28);
        int i30 = elitisticListPopulation5.getPopulationSize();
        int i31 = elitisticListPopulation5.getPopulationLimit();
        int i32 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Population population33 = elitisticListPopulation5.nextGeneration();
        int i34 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit(35);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 35);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertTrue(i34 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation27.addChromosome(chromosome28);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) '#', 0.0d);
        double d36 = elitisticListPopulation35.getElitismRate();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) '#', 0.0d);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43);
        int i50 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str51 = elitisticListPopulation5.toString();
        java.lang.String str52 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i50 == 35);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        double d10 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) '#', 0.0d);
        java.lang.String str33 = elitisticListPopulation32.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation32.getChromosomes();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        java.lang.String str41 = elitisticListPopulation40.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation32.setChromosomes(list_chromosome42);
        elitisticListPopulation26.setChromosomes(list_chromosome42);
        elitisticListPopulation20.setChromosomes(list_chromosome42);
        elitisticListPopulation2.setChromosomes(list_chromosome42);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome42);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', 1.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) '#', 0.0d);
        double d13 = elitisticListPopulation12.getElitismRate();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        elitisticListPopulation6.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome26);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome23);
        int i25 = elitisticListPopulation5.getPopulationLimit();
        double d26 = elitisticListPopulation5.getElitismRate();
        java.lang.String str27 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[null]" + "'", str27.equals("[null]"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation5.addChromosome(chromosome39);
        double d41 = elitisticListPopulation5.getElitismRate();
        int i42 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome43 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome43);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        java.lang.String str44 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation50.addChromosome(chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome53);
        math.genetics.Chromosome chromosome55 = null;
        try {
            elitisticListPopulation5.addChromosome(chromosome55);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(list_chromosome53);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.lang.String str37 = elitisticListPopulation31.toString();
        double d38 = elitisticListPopulation31.getElitismRate();
        math.genetics.Population population39 = elitisticListPopulation31.nextGeneration();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation45.addChromosome(chromosome46);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) '#', 0.0d);
        double d54 = elitisticListPopulation53.getElitismRate();
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation45.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        elitisticListPopulation31.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 10, 1.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56);
        int i65 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(d38 == 0.0d);
        org.junit.Assert.assertNotNull(population39);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i65 == 35);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        double d5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation5.spliterator();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) '#', 0.0d);
        java.lang.String str33 = elitisticListPopulation32.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation32.getChromosomes();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        java.lang.String str41 = elitisticListPopulation40.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation32.setChromosomes(list_chromosome42);
        elitisticListPopulation26.setChromosomes(list_chromosome42);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation26.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation26.getChromosomes();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) '#', 0.0d);
        java.lang.String str53 = elitisticListPopulation52.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation52.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome55 = elitisticListPopulation52.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation52.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation52.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(list_chromosome57, (int) (short) 10, (double) (short) 1);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome57);
        elitisticListPopulation5.setChromosomes(list_chromosome57);
        math.genetics.Chromosome[] chromosome_array63 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome64 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome64, chromosome_array63);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome64, (int) '#', 0.0d);
        java.lang.String str69 = elitisticListPopulation68.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome70);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]" + "'", str41.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(iterator_chromosome55);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertNotNull(chromosome_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome70);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation19.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation19.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome25 = list_chromosome24.spliterator();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome24);
        elitisticListPopulation5.setPopulationLimit(2);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) '#', 0.0d);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome37 = elitisticListPopulation34.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome38 = elitisticListPopulation34.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation34.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = list_chromosome39.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(list_chromosome39, 10, (double) (short) 0);
        elitisticListPopulation5.setChromosomes(list_chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome25);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]" + "'", str35.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertNotNull(iterator_chromosome37);
        org.junit.Assert.assertNotNull(iterator_chromosome38);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        int i66 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 10);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome69 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome70 = null;
        elitisticListPopulation5.addChromosome(chromosome70);
        math.genetics.Population population72 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome69);
        org.junit.Assert.assertNotNull(population72);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation5.getChromosomes();
        double d27 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        double d34 = elitisticListPopulation33.getElitismRate();
        elitisticListPopulation33.setElitismRate(0.0d);
        int i37 = elitisticListPopulation33.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) '#', 0.0d);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation43.getChromosomes();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) '#', 0.0d);
        java.lang.String str52 = elitisticListPopulation51.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation43.setChromosomes(list_chromosome53);
        elitisticListPopulation43.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array63 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome64 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome64, chromosome_array63);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome64, (int) '#', 0.0d);
        java.lang.String str69 = elitisticListPopulation68.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome70 = elitisticListPopulation68.getChromosomes();
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) '#', 0.0d);
        java.lang.String str77 = elitisticListPopulation76.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome78 = elitisticListPopulation76.getChromosomes();
        elitisticListPopulation68.setChromosomes(list_chromosome78);
        elitisticListPopulation62.setChromosomes(list_chromosome78);
        elitisticListPopulation43.setChromosomes(list_chromosome78);
        int i82 = elitisticListPopulation43.getPopulationLimit();
        double d83 = elitisticListPopulation43.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome84 = elitisticListPopulation43.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome85 = list_chromosome84.spliterator();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome84);
        java.util.List<math.genetics.Chromosome> list_chromosome87 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome87);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(d34 == 0.0d);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(chromosome_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome70);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "[]" + "'", str77.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome78);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertTrue(d83 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome84);
        org.junit.Assert.assertNotNull(spliterator_chromosome85);
        org.junit.Assert.assertNotNull(list_chromosome87);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 0);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        math.genetics.Population population11 = elitisticListPopulation8.nextGeneration();
        int i12 = elitisticListPopulation8.getPopulationLimit();
        java.lang.String str13 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation25.setChromosomes(list_chromosome35);
        elitisticListPopulation19.setChromosomes(list_chromosome35);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        elitisticListPopulation2.setChromosomes(list_chromosome35);
        double d40 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation46.addChromosome(chromosome47);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        double d55 = elitisticListPopulation54.getElitismRate();
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57);
        math.genetics.Chromosome[] chromosome_array61 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome62 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome62, chromosome_array61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62, (int) '#', 0.0d);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome62);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(i12 == 35);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]" + "'", str34.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(chromosome_array61);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.lang.String str32 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str46 = elitisticListPopulation40.toString();
        double d47 = elitisticListPopulation40.getElitismRate();
        math.genetics.Population population48 = elitisticListPopulation40.nextGeneration();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation54.addChromosome(chromosome55);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) '#', 0.0d);
        double d63 = elitisticListPopulation62.getElitismRate();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation62.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        int i71 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome72 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(d63 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i71 == 97);
        org.junit.Assert.assertNotNull(list_chromosome72);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        int i20 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation5.getChromosomes();
        java.lang.String str22 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit(10);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(i20 == 35);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[null]" + "'", str22.equals("[null]"));
        org.junit.Assert.assertNotNull(list_chromosome25);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str9 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation5.spliterator();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        java.lang.String str12 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 35);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[null]" + "'", str12.equals("[null]"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) '#', 0.0d);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) '#', 0.0d);
        java.lang.String str19 = elitisticListPopulation18.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome20);
        java.lang.String str22 = elitisticListPopulation10.toString();
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation10.addChromosome(chromosome23);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation10.getChromosomes();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation10.addChromosome(chromosome26);
        int i28 = elitisticListPopulation10.getPopulationLimit();
        int i29 = elitisticListPopulation10.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        math.genetics.Population population38 = elitisticListPopulation35.nextGeneration();
        int i39 = elitisticListPopulation35.getPopulationLimit();
        int i40 = elitisticListPopulation35.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) '#', 0.0d);
        double d47 = elitisticListPopulation46.getElitismRate();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        java.lang.String str52 = elitisticListPopulation46.toString();
        elitisticListPopulation46.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome55);
        elitisticListPopulation10.setChromosomes(list_chromosome55);
        elitisticListPopulation2.setChromosomes(list_chromosome55);
        java.lang.String str59 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(i28 == 35);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(population38);
        org.junit.Assert.assertTrue(i39 == 35);
        org.junit.Assert.assertTrue(i40 == 35);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setElitismRate((double) 1L);
        int i10 = elitisticListPopulation5.getPopulationSize();
        int i11 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str12 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit(100);
        try {
            math.genetics.Chromosome chromosome15 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 35);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.lang.String str32 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str46 = elitisticListPopulation40.toString();
        double d47 = elitisticListPopulation40.getElitismRate();
        math.genetics.Population population48 = elitisticListPopulation40.nextGeneration();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation54.addChromosome(chromosome55);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) '#', 0.0d);
        double d63 = elitisticListPopulation62.getElitismRate();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation62.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome72 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(d63 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertNotNull(spliterator_chromosome72);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        double d10 = elitisticListPopulation9.getElitismRate();
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        java.lang.String str15 = elitisticListPopulation9.toString();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation9.addChromosome(chromosome16);
        math.genetics.Population population18 = elitisticListPopulation9.nextGeneration();
        elitisticListPopulation9.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation9.setPopulationLimit((int) (short) 10);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome23);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) 0.0f);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = list_chromosome27.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation(list_chromosome27, 52, 1.0d);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        math.genetics.Population population35 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(population35);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        int i32 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        double d39 = elitisticListPopulation38.getElitismRate();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        java.lang.String str44 = elitisticListPopulation38.toString();
        elitisticListPopulation38.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation38.getChromosomes();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation53.addChromosome(chromosome54);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(d39 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.lang.String str24 = elitisticListPopulation2.toString();
        math.genetics.Population population25 = elitisticListPopulation2.nextGeneration();
        int i26 = elitisticListPopulation2.getPopulationLimit();
        double d27 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertTrue(i26 == 100);
        org.junit.Assert.assertTrue(d27 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(52, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome21, (int) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        java.lang.String str30 = elitisticListPopulation29.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation29.getChromosomes();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) '#', 0.0d);
        java.lang.String str38 = elitisticListPopulation37.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation37.getChromosomes();
        elitisticListPopulation29.setChromosomes(list_chromosome39);
        elitisticListPopulation23.setChromosomes(list_chromosome39);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome42 = elitisticListPopulation23.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation15.setChromosomes(list_chromosome43);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(iterator_chromosome42);
        org.junit.Assert.assertNotNull(list_chromosome43);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        int i27 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation5.addChromosome(chromosome28);
        java.lang.String str30 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[null]" + "'", str30.equals("[null]"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) (byte) 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '4', (double) 0);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        try {
            math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        int i20 = elitisticListPopulation5.getPopulationLimit();
        int i21 = elitisticListPopulation5.getPopulationSize();
        double d22 = elitisticListPopulation5.getElitismRate();
        java.lang.String str23 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) '#', 0.0d);
        double d35 = elitisticListPopulation34.getElitismRate();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        elitisticListPopulation34.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) '#', 0.0d);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation28.iterator();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        double d55 = elitisticListPopulation54.getElitismRate();
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome60 = elitisticListPopulation54.iterator();
        elitisticListPopulation54.setPopulationLimit((int) '#');
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation54.getChromosomes();
        int i64 = elitisticListPopulation54.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome66, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation70.addChromosome(chromosome71);
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74, (int) '#', 0.0d);
        double d79 = elitisticListPopulation78.getElitismRate();
        math.genetics.Chromosome[] chromosome_array80 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome81 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81, chromosome_array80);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome81);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome81);
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86, (int) '#', 0.0d);
        elitisticListPopulation70.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation54.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation28.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        double d95 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 35);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(d35 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome60);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(d79 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(d95 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation5.iterator();
        int i21 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome23);
        java.lang.String str25 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[null]" + "'", str25.equals("[null]"));
        org.junit.Assert.assertNotNull(iterator_chromosome26);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        int i23 = elitisticListPopulation5.getPopulationLimit();
        int i24 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        math.genetics.Population population33 = elitisticListPopulation30.nextGeneration();
        int i34 = elitisticListPopulation30.getPopulationLimit();
        int i35 = elitisticListPopulation30.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '#', 0.0d);
        double d42 = elitisticListPopulation41.getElitismRate();
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation41.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44);
        java.lang.String str47 = elitisticListPopulation41.toString();
        elitisticListPopulation41.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        elitisticListPopulation5.setChromosomes(list_chromosome50);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array56 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome57 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome57, chromosome_array56);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome57, (int) '#', 0.0d);
        double d62 = elitisticListPopulation61.getElitismRate();
        math.genetics.Chromosome[] chromosome_array63 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome64 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome64, chromosome_array63);
        elitisticListPopulation61.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome64);
        elitisticListPopulation55.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome64);
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69, (int) '#', 0.0d);
        elitisticListPopulation55.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69);
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69, 10, (double) 1.0f);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i23 == 35);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertTrue(i34 == 35);
        org.junit.Assert.assertTrue(i35 == 35);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(d42 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertNotNull(chromosome_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(d62 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) '#', 0.0d);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome30);
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome33, (int) '#', 0.0d);
        double d38 = elitisticListPopulation37.getElitismRate();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.lang.String str43 = elitisticListPopulation37.toString();
        math.genetics.Chromosome chromosome44 = null;
        elitisticListPopulation37.addChromosome(chromosome44);
        math.genetics.Population population46 = elitisticListPopulation37.nextGeneration();
        elitisticListPopulation37.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation37.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation37.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome50);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(d38 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
        org.junit.Assert.assertNotNull(population46);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertNotNull(list_chromosome50);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome24 = list_chromosome21.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation(list_chromosome21, 1, (double) 2);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome24);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', (double) 1);
        try {
            math.genetics.Chromosome chromosome25 = elitisticListPopulation24.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation5.iterator();
        int i14 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation5.getChromosomes();
        java.lang.String str16 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation5.addChromosome(chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertTrue(i14 == 35);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[null]" + "'", str16.equals("[null]"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0.0f);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome23, (int) (byte) 10, 0.0d);
        math.genetics.Population population27 = elitisticListPopulation26.nextGeneration();
        int i28 = elitisticListPopulation26.getPopulationLimit();
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.lang.String str30 = elitisticListPopulation26.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation26.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertTrue(i28 == 10);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome31);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.lang.String str32 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str46 = elitisticListPopulation40.toString();
        double d47 = elitisticListPopulation40.getElitismRate();
        math.genetics.Population population48 = elitisticListPopulation40.nextGeneration();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation54.addChromosome(chromosome55);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) '#', 0.0d);
        double d63 = elitisticListPopulation62.getElitismRate();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation62.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65, 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(d63 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        double d20 = elitisticListPopulation19.getElitismRate();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        java.lang.String str45 = elitisticListPopulation44.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation44.getChromosomes();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48, (int) '#', 0.0d);
        java.lang.String str53 = elitisticListPopulation52.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation52.getChromosomes();
        elitisticListPopulation44.setChromosomes(list_chromosome54);
        elitisticListPopulation38.setChromosomes(list_chromosome54);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome57 = elitisticListPopulation38.iterator();
        int i58 = elitisticListPopulation38.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome59);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome59);
        double d62 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertNotNull(iterator_chromosome57);
        org.junit.Assert.assertTrue(i58 == 35);
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertTrue(d62 == 0.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        double d8 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation5.spliterator();
        int i10 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        elitisticListPopulation5.setPopulationLimit((int) '4');
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation18.addChromosome(chromosome19);
        math.genetics.Population population21 = elitisticListPopulation18.nextGeneration();
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation18.addChromosome(chromosome22);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        math.genetics.Population population32 = elitisticListPopulation29.nextGeneration();
        int i33 = elitisticListPopulation29.getPopulationLimit();
        int i34 = elitisticListPopulation29.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str46 = elitisticListPopulation40.toString();
        elitisticListPopulation40.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome49);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome49);
        elitisticListPopulation5.setChromosomes(list_chromosome49);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertTrue(i33 == 35);
        org.junit.Assert.assertTrue(i34 == 35);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome49);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) '#', 0.0d);
        double d15 = elitisticListPopulation14.getElitismRate();
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        java.lang.String str20 = elitisticListPopulation14.toString();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation14.addChromosome(chromosome21);
        java.lang.String str23 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        math.genetics.Population population32 = elitisticListPopulation29.nextGeneration();
        int i33 = elitisticListPopulation29.getPopulationLimit();
        java.lang.String str34 = elitisticListPopulation29.toString();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) '#', 0.0d);
        java.lang.String str47 = elitisticListPopulation46.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation46.getChromosomes();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        java.lang.String str55 = elitisticListPopulation54.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation54.getChromosomes();
        elitisticListPopulation46.setChromosomes(list_chromosome56);
        elitisticListPopulation40.setChromosomes(list_chromosome56);
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        elitisticListPopulation5.setChromosomes(list_chromosome56);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[null]" + "'", str23.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertTrue(i33 == 35);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[null]" + "'", str34.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome56);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setPopulationLimit((int) '4');
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        java.lang.String str28 = elitisticListPopulation27.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation27.getChromosomes();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) '#', 0.0d);
        java.lang.String str36 = elitisticListPopulation35.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation27.setChromosomes(list_chromosome37);
        java.lang.String str39 = elitisticListPopulation27.toString();
        math.genetics.Chromosome chromosome40 = null;
        elitisticListPopulation27.addChromosome(chromosome40);
        int i42 = elitisticListPopulation27.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome43);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertTrue(i42 == 35);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(list_chromosome45);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        double d31 = elitisticListPopulation30.getElitismRate();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation30.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) '#', 0.0d);
        double d46 = elitisticListPopulation45.getElitismRate();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation45.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation39.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        math.genetics.Chromosome[] chromosome_array52 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome53 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53, chromosome_array52);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome53, (int) '#', 0.0d);
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome53);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome59 = elitisticListPopulation39.iterator();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) '#', 0.0d);
        java.lang.String str66 = elitisticListPopulation65.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome67 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation39.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome67);
        elitisticListPopulation30.setChromosomes(list_chromosome67);
        elitisticListPopulation2.setChromosomes(list_chromosome67);
        math.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation2.addChromosome(chromosome71);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d31 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(chromosome_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome59);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome67);
        org.junit.Assert.assertNotNull(list_chromosome73);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        math.genetics.Population population23 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population24 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(population24);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        double d25 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        double d32 = elitisticListPopulation31.getElitismRate();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.lang.String str37 = elitisticListPopulation31.toString();
        math.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation31.addChromosome(chromosome38);
        math.genetics.Population population40 = elitisticListPopulation31.nextGeneration();
        elitisticListPopulation31.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation31.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = elitisticListPopulation46.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        int i51 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(d32 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(i51 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        math.genetics.Population population26 = elitisticListPopulation23.nextGeneration();
        int i27 = elitisticListPopulation23.getPopulationSize();
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation23.addChromosome(chromosome28);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        double d39 = elitisticListPopulation38.getElitismRate();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        elitisticListPopulation32.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41);
        java.util.List<math.genetics.Chromosome> list_chromosome45 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome45);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome45);
        java.lang.String str48 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(d39 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[null]" + "'", str48.equals("[null]"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(i9 == 35);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population24 = elitisticListPopulation2.nextGeneration();
        int i25 = elitisticListPopulation2.getPopulationLimit();
        double d26 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertTrue(d26 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        int i10 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) 2);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        int i31 = elitisticListPopulation5.getPopulationSize();
        int i32 = elitisticListPopulation5.getPopulationLimit();
        double d33 = elitisticListPopulation5.getElitismRate();
        int i34 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 35);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        double d18 = elitisticListPopulation17.getElitismRate();
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20);
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25, (int) '#', 0.0d);
        elitisticListPopulation9.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome25);
        java.lang.String str32 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) '#', 0.0d);
        double d41 = elitisticListPopulation40.getElitismRate();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43);
        java.lang.String str46 = elitisticListPopulation40.toString();
        double d47 = elitisticListPopulation40.getElitismRate();
        math.genetics.Population population48 = elitisticListPopulation40.nextGeneration();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation54.addChromosome(chromosome55);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        math.genetics.ElitisticListPopulation elitisticListPopulation62 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome58, (int) '#', 0.0d);
        double d63 = elitisticListPopulation62.getElitismRate();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation62.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation54.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation40.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome71 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome72 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(d18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(d63 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome71);
        org.junit.Assert.assertNotNull(iterator_chromosome72);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14, (int) '#', 0.0d);
        double d19 = elitisticListPopulation18.getElitismRate();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation12.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome32 = elitisticListPopulation12.iterator();
        math.genetics.Population population33 = elitisticListPopulation12.nextGeneration();
        math.genetics.Population population34 = elitisticListPopulation12.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) '#', 0.0d);
        double d44 = elitisticListPopulation43.getElitismRate();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation37.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation12.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) (byte) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(d19 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome32);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(population34);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        double d21 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, 97, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        int i23 = elitisticListPopulation2.getPopulationSize();
        double d24 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        int i37 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation5.toString();
        java.lang.String str39 = elitisticListPopulation5.toString();
        math.genetics.Population population40 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(population40);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        int i20 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation5.getChromosomes();
        int i22 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(i20 == 35);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 35);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        int i44 = elitisticListPopulation5.getPopulationLimit();
        int i45 = elitisticListPopulation5.getPopulationSize();
        int i46 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome47 = elitisticListPopulation5.spliterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome47);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) 1.0f);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        int i31 = elitisticListPopulation5.getPopulationSize();
        int i32 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str33 = elitisticListPopulation5.toString();
        math.genetics.Population population34 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 35);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertNotNull(population34);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        double d25 = elitisticListPopulation24.getElitismRate();
        elitisticListPopulation24.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        math.genetics.Population population36 = elitisticListPopulation33.nextGeneration();
        int i37 = elitisticListPopulation33.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation33.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) '#', 0.0d);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation50.getChromosomes();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation50.setChromosomes(list_chromosome60);
        elitisticListPopulation44.setChromosomes(list_chromosome60);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome60);
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation71.addChromosome(chromosome72);
        math.genetics.Population population74 = elitisticListPopulation71.nextGeneration();
        int i75 = elitisticListPopulation71.getPopulationSize();
        math.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation71.addChromosome(chromosome76);
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array81 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome82 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome82, chromosome_array81);
        math.genetics.ElitisticListPopulation elitisticListPopulation86 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome82, (int) '#', 0.0d);
        double d87 = elitisticListPopulation86.getElitismRate();
        math.genetics.Chromosome[] chromosome_array88 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome89 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89, chromosome_array88);
        elitisticListPopulation86.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome89);
        elitisticListPopulation80.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome89);
        java.util.List<math.genetics.Chromosome> list_chromosome93 = elitisticListPopulation80.getChromosomes();
        elitisticListPopulation71.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome93);
        elitisticListPopulation5.setChromosomes(list_chromosome93);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome96 = list_chromosome93.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(population74);
        org.junit.Assert.assertTrue(i75 == 1);
        org.junit.Assert.assertNotNull(chromosome_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(d87 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(list_chromosome93);
        org.junit.Assert.assertNotNull(spliterator_chromosome96);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) '#', 0.0d);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation28.getChromosomes();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) '#', 0.0d);
        java.lang.String str37 = elitisticListPopulation36.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome38);
        elitisticListPopulation28.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        java.util.List<math.genetics.Chromosome> list_chromosome50 = elitisticListPopulation47.getChromosomes();
        elitisticListPopulation28.setChromosomes(list_chromosome50);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome50);
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) '#', 0.0d);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome60 = elitisticListPopulation58.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome61 = elitisticListPopulation58.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome62 = elitisticListPopulation58.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome63 = elitisticListPopulation58.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation(list_chromosome63, (int) (short) 10, (double) (short) 1);
        double d67 = elitisticListPopulation66.getElitismRate();
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69, (int) '#', 0.0d);
        java.lang.String str74 = elitisticListPopulation73.toString();
        math.genetics.Population population75 = elitisticListPopulation73.nextGeneration();
        math.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation73.addChromosome(chromosome76);
        java.util.List<math.genetics.Chromosome> list_chromosome78 = elitisticListPopulation73.getChromosomes();
        elitisticListPopulation66.setChromosomes(list_chromosome78);
        elitisticListPopulation5.setChromosomes(list_chromosome78);
        int i81 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_chromosome50);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]" + "'", str59.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome60);
        org.junit.Assert.assertNotNull(iterator_chromosome61);
        org.junit.Assert.assertNotNull(iterator_chromosome62);
        org.junit.Assert.assertNotNull(list_chromosome63);
        org.junit.Assert.assertTrue(d67 == 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[]" + "'", str74.equals("[]"));
        org.junit.Assert.assertNotNull(population75);
        org.junit.Assert.assertNotNull(list_chromosome78);
        org.junit.Assert.assertTrue(i81 == 1);
    }
}

