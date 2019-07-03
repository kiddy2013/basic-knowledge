package basic.knowledge.logging.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jack
 */
public class MainEnter {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        log.info("MainEnter");
    }

}
