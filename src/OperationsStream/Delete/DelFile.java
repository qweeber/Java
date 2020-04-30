package OperationsStream.Delete;

import java.io.*;

public class DelFile {
    public static void main(String[] args) {

        int call = 0;

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("del.txt"));
            bufferedWriter.write("new line");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("del.txt"));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
