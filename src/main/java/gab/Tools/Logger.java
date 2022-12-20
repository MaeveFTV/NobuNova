package gab.Tools;

public class Logger {
    private String prefix;

    public Logger(String prefix) {
        this.prefix = prefix;
    }

    public void log(String message) {
        System.out.println(prefix + " - " + message);
    }
}
