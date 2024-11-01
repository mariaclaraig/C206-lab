import java.util.concurrent.TimeUnit;
public class Thread3 extends Thread{

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread 3: ");
            System.out.println(i*i);
            try{
                TimeUnit.SECONDS.sleep(3);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
