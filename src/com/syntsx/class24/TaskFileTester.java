package com.syntsx.class24;

public class TaskFileTester {
    public static void main(String[] args) {


       // Object[] files={new JavaFile(),new PDFFile(),};

        File[] files={new JavaFile(),new PDFFile(),new WordFile()};
        for(int i=0;i<files.length;i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }
    }
}
