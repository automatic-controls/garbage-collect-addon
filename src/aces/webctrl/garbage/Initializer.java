package aces.webctrl.garbage;
import javax.servlet.*;
public class Initializer implements ServletContextListener {
  private volatile Thread thread;
  private volatile boolean go = true;
  @Override public void contextInitialized(ServletContextEvent sce){
    thread = new Thread(){
      @Override public void run(){
        while (go){
          try{
            System.gc();
            Thread.sleep(300000);
          }catch(InterruptedException e){}
        }
      }
    };
    thread.start();
  }
  @Override public void contextDestroyed(ServletContextEvent sce){
    try{
      go = false;
      thread.interrupt();
      thread.join();
    }catch(InterruptedException e){}
  }
}