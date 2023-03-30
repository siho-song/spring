package strategy;

public class Encoder {


    private EncodingStrategy encodingStrategy;

    public String getMessage(String msg){
        return this.encodingStrategy.encode(msg);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy){
        this.encodingStrategy=encodingStrategy;
    }
}
