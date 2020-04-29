package OperationsStream.WriteRead;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try{
            PrintWriter printWriter = new PrintWriter(new FileWriter("date.txt"));

            printWriter.println(3245);
            //printWriter.flush();
            printWriter.close();

            String j = "cm";
            printWriter = new PrintWriter(new FileWriter("date.txt", true));
            printWriter.append("lala");
            printWriter.println();
            printWriter.printf("He weighs %d kg and has %.2f %s height.", 50, 196.0, j);

            printWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("date.txt"));

            //System.out.println((char) bufferedReader.read());
            //System.out.println(bufferedReader.readLine());

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("base.txt"));
            String content = "";
            while ((content = bufferedReader.readLine()) != null){
                //System.out.println(content);
                bufferedWriter.write(content);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            bufferedReader.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //Main.test(4,8,9, "dsf", "sdf", 99);

    }

    static void test(Object... a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

}
