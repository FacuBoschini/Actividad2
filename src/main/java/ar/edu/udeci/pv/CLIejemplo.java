package ar.edu.udeci.pv;

import org.apache.commons.cli.*;

public class CLIejemplo {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("h", "help", false, "Muestra ayuda");
        options.addOption("n", "name", true, "Tu nombre");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("CLIejemplo", options);
            } else if (cmd.hasOption("n")) {
                System.out.println("Hola, " + cmd.getOptionValue("n") + "!");
            }
        } catch (ParseException e) {
            System.out.println("Error al procesar argumentos: " + e.getMessage());
        }
    }
}

