package Code.simpleOutput;

import java.io.*;

public class readingFile {

    public  readingFile (){

    }

    public void readnow () throws IOException {
    File file = new File("/Users/ak/read.log");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
  while ((st = br.readLine()) != null) {

      System.out.println(st);


  }
    }


    }


