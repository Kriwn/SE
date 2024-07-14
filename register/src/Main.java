//6510450143 Kritt
public class Main {
    public static void main(String[] args) {

        User user = new User(20,"Kritt", "wwww@gmail.com");
        Regist regist = new Regist();

        System.out.println(regist.register(user));
    }
}