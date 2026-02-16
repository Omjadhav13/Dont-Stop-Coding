package Interview_Based_Questions;

class MyThread extends Thread{
    String message;
    MyThread(String message){
        this.message=message;
    }
    public void run(){
        printMessage(message);
    }
    void printMessage(String message) {

        System.out.println("Message: " + message);
    }
}
public class ExceptionsProgram {
    static void main(String[] args) {
        MyThread my= new MyThread("om");
        my.start();
    }
}
