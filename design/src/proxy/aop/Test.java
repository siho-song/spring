package proxy.aop;

import proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Test {

    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()-> {
                    System.out.println("start");
                    start.set(System.currentTimeMillis());

                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now-start.get());
                    System.out.println("end");

                }
        );

        aopBrowser.show();
        System.out.println("loading time  : "+end.get());

        aopBrowser.show();
        System.out.println("loading time  : "+end.get());
    }
}
