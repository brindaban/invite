package app;

import io_handler.IOoperation;
import user_interecation.CommandLineInterection;

import java.io.IOException;

public class PrintLables {
    public static void main(String[] commands) throws IOException {
        IOoperation io = new IOoperation();
        CommandLineInterection cli = new CommandLineInterection(io);
        cli.operate(commands);
    }
}
