/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("My mobile","white","NOKIA");
        mobile.makeACall("Hello My mobile");
        IPhone iphone = new IPhone("My iPhone","black","Apple");
        iphone.makeACall("Hello My iPhone");
        Andriod andriod = new Andriod("My HTC", "blue","HTC");
        andriod.makeACall("Hello My HTC");

        mobile.getMobile();

        Person person = new Person("Peter",iphone);
        person.getMobile().makeACall("Hello ABCABCABCABCABCABCABCABCABCABC");

        IPhoneRobot iPhoneRobot = new IPhoneRobot("iPhoneRobot",iphone);
    }
}
