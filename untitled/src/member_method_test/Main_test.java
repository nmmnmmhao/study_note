package member_method_test;

/**
 *
 * @author tangcz
 *
 */
public class Main_test {
    private Printer printer;

    public Main_test(Printer printer) {
        this.printer = printer;
    }
    public static void main(String[] args) {
        Main_test main_test = new Main_test(new Printer());
        main_test.Main_print("123");
    }

    public void Main_print(String msg) {
//        Print print1 = new Print() {
//            @Override
//            public void print(String s) {
//                printer.print(s);
//            }
//        };

//        Print print1 = s -> printer.print(s);
        Print print1 =printer::print;
        print1.print(msg);
    }
}
