//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user = new User(20,"Kritt", "wwww@gmail.com");
        Regist regist = new Regist();

        System.out.println(regist.register(user));
    }
}