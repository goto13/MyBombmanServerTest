import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by USER1 on 2015/07/14.
 */
public class MyTest {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.trace("TraceMessage");
        logger.debug("DebugMessage");
        logger.info("InfoMessage {}!", "Hello Log4j2");
        logger.warn("WarnMessage {}!", "Hello Log4j2");
        logger.error("ErrorMessage");
        logger.fatal("FatalMessage");

        logger.info("Exception", new IllegalArgumentException("Oops!"));

        String test = null;
        switch (test) {
            case "aaa":
                System.out.println("aaa");
            default:
                System.out.println("default");
        }
    }
}
