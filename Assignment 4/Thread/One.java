public class One implements Runnable {
    @Override
    public void run() {
      System.out.println("Hello, World!");
    }
  
    public static void main(String[] args) {
      One runnable = new One();
      Thread thread = new Thread(runnable);
      thread.start();
    }
  }