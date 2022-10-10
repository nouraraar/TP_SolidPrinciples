package com.directi.training.dip.exercise_answer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements ReaderInterface
{
    private String protocol;
    private String host;
    private String file;

    public NetworkReader(String protocol, String host, String file)
    {
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }

    @Override
    public String read() throws IOException
    {
        URL url = new URL(protocol, host, file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString.append((char) c);
            c = reader.read();
        }
        return inputString.toString();
    }
}
