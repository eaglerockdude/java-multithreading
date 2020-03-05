public class Main {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
      // code that runs in thread
        System.out.println("We are now in run thread method :" + Thread.currentThread().getName());
      }
    });
    thread.setName("renamed thread as worker");
    System.out.println("We are now in run thread method before starting the thread" + Thread.currentThread().getName());
    thread.start();
    System.out.println("We are now in run thread method after starting the thread" + Thread.currentThread().getName());
    //Thread.sleep(10000);
  }
}
