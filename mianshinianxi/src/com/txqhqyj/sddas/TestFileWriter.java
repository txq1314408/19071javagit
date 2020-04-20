package com.txqhqyj.sddas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args)  {
		File file=new File("F:\\hello.txt");
		FileWriter f = null;
		try {
			f = new FileWriter(file);
			String str=new String("字符输出流");
			f.write(str);
			f.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(f!=null) {
				try {
					f.close();
				} catch (IOException e) {
					System.out.println("文件未关闭");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}

}
