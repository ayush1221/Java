public class CommonThreadProperties {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        Runnable r = () -> {
            System.out.println(a + b);
        };

        Thread t=new Thread(r,"I,am A Thread!");
        t.setDaemon(true);
        long id=t.getId();
        if(t.isDaemon())
        {
            System.out.println("I am a daemon Thread");
        }
       // Thread.MAX_PRIORITY;--> 10
       // Thread.MIN_PRIORITY; --> 0
        //Thread.NORM_PRIORITY; ---> 5
        t.setPriority(3);

    }

}