
public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errCallback) {
        this.callback = callback;
        this.errCallback = errCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errCallback.onError("Task " + i + " throws error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
