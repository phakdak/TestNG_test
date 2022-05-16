import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testMain() {
        Main.main(new String[]{});
    }


    @Test
    public void testAdd() {
        System.out.println(Main.add(1, 2));
    }

    @Test
    public void testSub() {
        System.out.println(Main.sub(2, 1));
    }

    @Test
    public void testMul() {
        System.out.println(Main.mul(2, 3));
    }

    @Test
    public void testDiv() {
        System.out.println(Main.div(4, 2));
    }

    @Test
    public void testMod() {
        System.out.println(Main.mod(4, 3));
    }

    @Test
    public void testFact() {
        System.out.println(Main.fact(4));
    }
}