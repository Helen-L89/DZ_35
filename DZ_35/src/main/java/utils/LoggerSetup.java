package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerSetup {
    public static Logger setupLogger(Class<?> clazz) {
        Logger logger = Logger.getLogger(clazz);
        //PropertyConfigurator.configure("log4j.properties");
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        return Logger.getLogger(clazz);
    }
}
