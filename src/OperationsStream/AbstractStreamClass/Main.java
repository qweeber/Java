package OperationsStream.AbstractStreamClass;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("name.txt");

        InputStream inS;
        OutputStream outS;

        Reader reader;
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

        writer.write("lala");
        ((BufferedWriter)writer).newLine();
        ((BufferedWriter)writer).write("next line");

        ((BufferedWriter)writer).close();

    }
}
