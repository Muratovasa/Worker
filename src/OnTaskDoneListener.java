@FunctionalInterface
public interface OnTaskDoneListener<String> {
    void onDone(String result);
}