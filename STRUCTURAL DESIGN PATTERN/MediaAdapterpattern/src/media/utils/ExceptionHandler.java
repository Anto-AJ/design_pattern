package media.utils;

public class ExceptionHandler {
    public static void handleException(Exception e) {
        LoggerUtil.logError(e.getMessage());
    }
}
