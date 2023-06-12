class TestThread1 extends Thread{
    public static void main(String[] args) {
        TestThread obj = new TestThread();
        Thread threadobj=new Thread(obj);
        threadobj.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is Running in a Thread");
    }
}
