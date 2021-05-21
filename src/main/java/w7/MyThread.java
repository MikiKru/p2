package w7;


public class MyThread extends Thread {
    @Override
    public void run(){
        // wątek startuje RUNNABLE
        for(int i = 0; i < 10; i++){
            try {
                Thread.currentThread().sleep(1000);     // uśpienie wątku na sekundę       //TIME_WAITING
                System.out.printf("Th name: %10s -> value: %3d\n",Thread.currentThread().getName(), i+1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // wątek kończy działanie TERMINANTED
    }
    public static void main(String[] args) {                                                    //NEW Main
        // wątek główny programu                                                                //RUNNABLE Main
        MyThread myThread = new MyThread();                                                     //NEW Th0
        myThread.start();            // tworzy i uruchamia nowy wątek                           //RUNNABLE Th0
        MyThread myThread1 = new MyThread();                                                    //NEW Th1
        myThread1.start();            // tworzy i uruchamia nowy wątek                          //RUNNABLE Th1
        System.out.println("Main thread name: "+Thread.currentThread().getName());
        String [] names = {"Ala","Ola","Ela","Jan"};
        for (int i = 0; i < names.length; i++){
            try {
                Thread.currentThread().sleep(2000);     // uśpienie wątku na 2 sekundy     //TIME_WAITING Main
                System.out.printf("Th name: %10s -> value: %3s\n",Thread.currentThread().getName(), names[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // koniec działania wątku głównego                                                       //TERMINATED Main
    }
}
