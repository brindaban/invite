package user_interecation;

import io_handler.IOoperation;
import storage.GuestList;

import java.io.IOException;


public class CommandLineInterection {
    private IOoperation io;

    public CommandLineInterection(IOoperation io) {
        this.io = io;
    }


    public void operate(String[] commands) throws IOException {
        Command command = new Command(commands);
        String[] splittedData = io.readData(command.getFileName());
        GuestList listOfAllGuest = GuestList.createAllGuestList(splittedData);

    }
}
