package com.model;

import java.io.IOException;

import java.util.*;

import com.app.FileNames;



public class Client {
	public static void main(String[] args){
		boolean m = true;
		boolean f = true;
		while(m){
		System.out.println("LockMe.com");
		System.out.println("Name:Lerisha Dsouza");
		System.out.println("Company;BNP Paribas");
		System.out.println("Enter one of the following details");
		System.out.println("1: Display the current Files in the directory");
		System.out.println("2: Perform the following operations");
		System.out.println("3: Exit the application");
		int n = new Scanner(System.in).nextInt();
		
		switch(n){

		case 1: 
				new FileNames() .display();
				break;
		
		case 2: while (f){
					System.out.println("Choose one of the operations performed");
					System.out.println("1: Create a new File");
					System.out.println("2: Delete a new File");
					System.out.println("3: Search a new File");
					System.out.println("4: Navigate back to the main application");
					int r = new Scanner(System.in).nextInt();
					switch(r){
					case 1: try{
								new FileNames().createFile();
							}catch(IOException e){
								System.out.println("cannot perform the creation operation");
							}
							break;
					case 2: new FileNames().delete();
							break;
						
					case 3: new FileNames().search();
							break;
						
					case 4: f = false;
							break;
					}
				}
				break;
				
		case 3: m = false;
				break;
		}
		
		}
	}
}
