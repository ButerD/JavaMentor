package MyTest;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.logging.*;

public class MyLogger {
    private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getSourceMethodName() + " - " + record.getLevel() + ": " + record.getMessage();
        }
    }
    public static void main(String[] args) throws IOException {
        Handler consoleHandler = new ConsoleHandler();
//        consoleHandler.setFormatter(new MyFormatter());
        consoleHandler.setLevel(Level.ALL);
        logger.setLevel(Level.ALL);
//        logger.
//        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        try(FileReader f = new FileReader("")) {

        }
        logger.log(Level.FINE, "Started with arguments: {0}\n", Arrays.toString(args));
        String s = "XXX";
        logger.log(Level.WARNING, "INFO LOG{0} xzczx {1} \n", new Object[] {s, 99});
        logger.info("MY {0} LOG!!!\n");
        logger.warning("my warning");
    }
}
