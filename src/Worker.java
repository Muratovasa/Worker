public class Worker {
    private OnTaskDoneListener<String> callback;
    private OnTaskErrorListener<String> errorCallback;

    public Worker(OnTaskDoneListener<String> callback, OnTaskErrorListener<String> errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("ошибка на 33");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
