package aplicacao;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Nose {
    private static Logger logger = Logger.getLogger("com.wombat.nose");
    private static FileHandler fh = new FileHandler();

    public static void main(String argv[]) {
	// Send logger output to our FileHandler.
	logger.addHandler(fh);
	// Request that every detail gets logged.
	logger.setLevel(Level.ALL);
	// Log a simple INFO message.
	logger.info("doing stuff");
	try {
	    System.out.println("Teste");
	} catch (Exception ex) {
	    logger.log(Level.WARNING, "trouble sneezing", ex);
	}
	logger.fine("done");
    }
}