import java.util.Base64;

public class Encoder {

    IEncoder iEncoder ;

    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return this.iEncoder.encode(message);
    }

}
