/**
 *
 * @author tangcz
 *
 */
interface Actor{
    void act(String name);
}

public class methodtest {
    public static void main(String[] args) {
        Actor act = System.out::println;
        act.act("123");
    }
}
