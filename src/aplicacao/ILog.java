package aplicacao;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class ILog {

	public static ILog instancia;
	private static final Logger LOG = Logger.getLogger(HelloLogging.class.getName());

	protected ILog() {
	}

	public static ILog getInstancia() {
		if (instancia == null)
			instancia = new ILog();

		try {
			Handler console = new ConsoleHandler();
			Handler file = new FileHandler("C:\\log\\loggin.xml");
			/*
			 * Define que na consola apenas aparece log com n�vel superior ou a
			 * warning e no ficheiro deve aparecer o log de qualquer n�vel
			 */
			console.setLevel(Level.WARNING);
			file.setLevel(Level.ALL);
			// Define o formato de output do ficheiro como XML
			file.setFormatter(new XMLFormatter());
			// Adiciona os handlers para ficheiro e console
			LOG.addHandler(file);
			LOG.addHandler(console);
			// Ignora os Handlers definidos no Logger Global
			LOG.setUseParentHandlers(false);
		} catch (IOException io) {
			LOG.warning("O ficheiro hellologgin.xml n�o pode ser criado");
		}

		return instancia;
	}
	
	public void setLog(String acao, String resultado) {
        LOG.info("A��o: "+ acao +"  Resultado: "+ resultado);
		
	}

}
