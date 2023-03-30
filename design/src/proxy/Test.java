package proxy;

public class Test {

    public static void main(String[] args) {
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();



        IBrowser ibrowser = new BrowserProxy("www.naver.com");
        ibrowser.show();
        ibrowser.show();
        ibrowser.show();
        ibrowser.show();

    }
}
