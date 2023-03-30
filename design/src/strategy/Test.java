package strategy;

public class Test {
    public static void main(String[] args) {
        Encoder encoder1 =new Encoder();

        //base64 strategy
        EncodingStrategy base64= new Base64Strategy();

        //normal strategy
        EncodingStrategy normal = new NormalStrategy();

        String message = "Hello, Java";
        encoder1.setEncodingStrategy(base64);
        String base64Result = encoder1.getMessage(message);
        System.out.println(base64Result);

        encoder1.setEncodingStrategy(normal);
        String normalResult = encoder1.getMessage(message);
        System.out.println(normalResult);

        EncodingStrategy appendStrategy = new AppendStrategy();
        encoder1.setEncodingStrategy(appendStrategy);
        String appendResult=encoder1.getMessage(message);
        System.out.println(appendResult);
    }

}
