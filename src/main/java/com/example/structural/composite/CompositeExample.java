package com.example.structural.composite;

import com.example.structural.composite.file.BinaryFile;
import com.example.structural.composite.file.Directory;
import com.example.structural.composite.file.File;

public class CompositeExample {
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();

        System.out.println("----------------");

        File root2 = createTreeTwo();
        root2.ls();
    }

    private static File createTreeOne() {
        File file1 = new BinaryFile("File1", 1000);
        Directory dir1 = new Directory("Dir1");

        dir1.addFile(file1);
        File file2 = new BinaryFile("File2", 2000);
        File file3 = new BinaryFile("File3", 50);
        Directory dir2 = new Directory("dir2");
        
        dir2.addFile(file2);
        dir2.addFile(file3);
        dir2.addFile(dir1);
        return dir2;
    }

    private static File createTreeTwo() {
        return new BinaryFile("Another file", 200);
    }
}
