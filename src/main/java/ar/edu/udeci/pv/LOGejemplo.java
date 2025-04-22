package ar.edu.udeci.pv;

import org.apache.log4j.Logger;

public class LOGejemplo {
    private static final Logger logger = Logger.getLogger(LOGejemplo.class);

    public static void main(String[] args) {
        logger.info("Esto es un mensaje de información.");
        logger.warn("Esto es una advertencia.");
        logger.error("Esto es un mensaje de error.");
    }
}

