package adapter;

import java.net.ConnectException;

public class Test {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditiner airConditiner = new AirConditiner();
        Electronic110V airAdapter = new SocketAdapter(airConditiner);
        connect(airAdapter);


    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
