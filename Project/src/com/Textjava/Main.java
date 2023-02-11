package com.Textjava;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            byte[] bWrite = { 11, 21, 3, 4, 5};
            OutputStream os = new FileOutputStream("text.txt");
            for (byte b : bWrite) {
                os.write(b);
            }
            os.close;  // 关闭输出流

            InputStream is = new FileInputStream("text.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char)is.read() + " ");
            }
            is.close;  // 关闭输入流
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
