@FunctionalInterface
public interface OnTaskErrorListener<String> {
    void onError(String result);
}
