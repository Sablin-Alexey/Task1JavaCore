package Worker;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener otherListener = System.out::println;
        Worker otherWorker = new Worker(listener, otherListener);
        otherWorker.startMisfortune();
    }
}
