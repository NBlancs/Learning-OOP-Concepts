public class App {
    public static void main(String[] args) throws Exception {
        ControlStruct cs = new ControlStruct();

        System.out.println("\n====SEQUENTIAL EXAMPLE====\n");
        cs.sequential();
        System.out.println("\n====SINGLE ALTERNATIVE====\n");
        cs.singleAlt();
        System.out.println("\n====DOUBLE ALTERNATIVE====\n");
        cs.doubleAlt();
        System.out.println("\n====MULTIPLE ALTERNATIVE====\n");
        cs.multiAlt();
        System.out.println("\n====WHILE LOOP====\n");
        cs.whileLoop();
        System.out.println("\n====FOR LOOPS====\n");
        cs.forLoop();
    }
}
