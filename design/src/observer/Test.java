package observer;

public class Test {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전송 : click 1");
        button.click("메시지 전송 : click 2");
        button.click("메시지 전송 : click 3");
        button.click("메시지 전송 : click 4");
    }
}
