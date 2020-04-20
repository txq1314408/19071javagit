package com.txqhqyj.sddas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("F:\\hello.txt");
		FileReader f=new FileReader(file);
		int n=0;
		try {
			while((n=f.read())!=-1) {
				System.out.println((char)n);
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(f!=null) {
				try {
					f.close();
				} catch (IOException e) {
					System.out.println("文件未关闭");
					e.printStackTrace();
				}
			}
		}
		
	}

}
