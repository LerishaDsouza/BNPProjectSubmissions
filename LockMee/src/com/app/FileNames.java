package com.app;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class FileNames {
	List<File> l;
	
	File f;
	
	String path = "C:" + File.separator + "Users" + File.separator + "lerisha" + File.separator + "Downloads";
	
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Enter file name to be search ");
        String filename = new Scanner(System.in).nextLine();
        
        f = new File(path);
        l = Arrays.asList(f.listFiles());
		for (File s : l) {
			if(!s.isDirectory()) {
				if(filename.equals(s.getName())){
					System.out.println("The File is Found");
					break;
				}else{
					System.out.println("The File is not Found");
					break;
				}
			}
		}
	}	
	
		
	public void createFile() throws IOException{
		// TODO Auto-generated method stub

		System.out.println("Enter file name to be created ");
        String filename = new Scanner(System.in).nextLine();
        boolean success = false;
        
        
        f = new File(path + File.separator + filename);
        if(f.exists()){
        	System.out.println("file exists");
        }else{
        	try
        	{
        	success = f.createNewFile();
        	System.out.println("New File exists");
        	}catch(IOException e){
        		throw new IOException("File not found");
        	}
        }

	}
	
	public void delete(){
		System.out.println("Enter file name to be deleted");
        String filename = new Scanner(System.in).nextLine();
        
         
        f = new File(path + File.separator + filename);
        	if(f.delete()){
        		System.out.println("File deleted");
        	}else{
        		System.out.println("File not found");
        	}
        
        
       
	}
	public void display() {
		
		f = new File(path);
		if(f.isDirectory()) {
			l = Arrays.asList(f.listFiles());
			Collections.sort(l);
			for (File s : l) {
				
				if(!s.isDirectory()) {
					System.out.println( s.getName());
				}
			}
		}
			
	}
}
