public class Driver {
    private static int[] set1 = {1, 2, 3};
    private static int[] set2 = {4, 5, 6};
    private static int[] set3 = {1, 8, 9};

    private static MySet setA = new MySet(set1);
    private static MySet setB = new MySet(set2);
    private static MySet setC = new MySet(set3);

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(setA.disjointed1(setB, setC));
        System.out.println("Disjoint1: " + (System.nanoTime() - start) + " ns");
        start = System.nanoTime();
        System.out.println(setB.disjointed2(setB, setC));
        System.out.println("Disjoint2: " + (System.nanoTime() - start) + " ns");
    }
}
