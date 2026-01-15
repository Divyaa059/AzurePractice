public class HelloWorld {
  public static void main(String[] args)
  {
    System.out.println("Hello from java app running in Azure!");
    while (true) {
      try {
        Thread.sleep(10000);
      }
       catch (Exception e) {
         e.printStackTrace();
       }
    }
  }
}
