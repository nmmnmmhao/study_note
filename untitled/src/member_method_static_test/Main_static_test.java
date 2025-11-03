package member_method_static_test;

/**
 *
 * @author tangcz
 *
 */
public class Main_static_test {
    public static void main(String[] args) {
//        Actor actor = new Actor() {
//            @Override
//            public void perform() {
//                Person person = new Person();
//                person.dance();
//            }
//        };
        Actor actor = Person::dance;
        actor.perform(new Person());
    }
}
