package com.ayush;

import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D://file.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter out = (new PrintWriter(new FileWriter("file1.txt")));
            String s = "";
            while ((s = br.readLine()) != null) {
                out.write(s.toUpperCase() + "\n");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
