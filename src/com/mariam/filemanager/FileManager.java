package com.mariam.filemanager;

import java.io.File;

public class FileManager {
    public void listFiles(String directoryPath){
        File directory = new File(directoryPath);
        if(directory.exists() && directory.isDirectory()){
            File[] contents = directory.listFiles();
            if(contents != null){
                for(File file : contents){
                    if(file.isDirectory()){
                        System.out.println("[DIR]: "+file.getName());
                    } else {
                        System.out.println("[FILE]: "+ file.getName());
                    }
                }
            }else{
                System.out.println("Directory is empty.");
            }
        }else{
            System.out.println("Invalid directory path: Path doesn't exist or is not a directory");
        }
    }
    public void createDirectory(String directoryPath){
        System.out.println("Not implemented yet !");
    }
    public void deleteFileOrDirectory(String directoryOrFilePath){
        System.out.println("Not implemented yet !");
    }
}
