public class Main {
    public Main() {
        OnTaskDoneListener<String> listener = result -> System.out.println(result);
        OnTaskErrorListener<String> errorListener = result -> System.out.println(result);
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}

