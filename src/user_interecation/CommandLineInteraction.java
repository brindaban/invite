package user_interecation;

import filtration.FilterCollection;
import io_handler.IOoperation;
import representation.TemplateGenerate;
import storage.GuestList;

import java.io.IOException;
import java.util.List;


public class CommandLineInteraction {
    private IOoperation io;

    public CommandLineInteraction(IOoperation io) {
        this.io = io;
    }


    public void operate(String[] commands) throws IOException {
        Command command = new Command(commands);
        String[] splittedData = io.readData(command.getFileName());
        GuestList listOfAllGuest = GuestList.createAllGuestList(splittedData);
        TemplateGenerate template = command.getTempleteGenerate();
        FilterCollection filtersOfUser = command.getAllFiterOptionWhichUserWant();
        List<String> guestToInvite = listOfAllGuest.inviteGuest(filtersOfUser,template);
        io.print(guestToInvite);
    }
}
