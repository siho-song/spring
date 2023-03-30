import adapter.Electronic110V;
import singleton.AClass;
import singleton.BClass;
import singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
        AClass aclass = new AClass();
        BClass bclass = new BClass();

        SocketClient aClient = aclass.getSocketClient();
        SocketClient bClient = bclass.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }

    public void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}