package io_handler;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class IOoperation {
    public String [] readData(String fileName) throws IOException {
        File file = new File(fileName);
        char[] data = new char[(int) file.length()];
        FileReader reader = new FileReader(file);
        reader.read(data);
        String content = new String(data);
        return content.split("\n");
    }

    public void print(List<String> guestToInvite) {
        for (String eachGuest:guestToInvite)
            System.out.println(eachGuest);

    }
}
