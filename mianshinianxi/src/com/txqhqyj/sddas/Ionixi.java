package com.txqhqyj.sddas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ionixi {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("F:\\hello.txt");
		FileInputStream f=new FileInputStream(file);
			
			try {
				
				int n=0;
				int i=0;
				while((n=f.read())!=-1) {
					i++;
					System.out.println((char)n+"..."+i);
				
					
					
				}
			} catch (IOException e) {
				System.out.println("文件没找到");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(f!=null) {
					try {
						f.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
			
		FileOutputStream f2=new FileOutputStream(file);
		String str=new String("输出流");
		try {
			f2.write(str.getBytes());
		} catch (IOException e) {
			System.out.println("文件没找到");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(f2!=null) {
				try {
					f2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		} 
	

}
