package app;

import io_handler.IOoperation;
import user_interecation.CommandLineInteraction;

import java.io.IOException;

public class PrintLables {
    public static void main(String[] commands) throws IOException {
        IOoperation io = new IOoperation();
        CommandLineInteraction cli = new CommandLineInteraction(io);
        cli.operate(commands);
    }
}
