package com.txqhqyj.sddas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestInputStreamReaderAndOutputStreamWriter {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f:\\hello.txt"));
			osw.write("cuihua,");
			System.out.println(osw.getEncoding());
			osw.close();
			//追加
			osw = new OutputStreamWriter(new FileOutputStream("f:\\helloWorld.txt", true), "ISO8859_1"); 
			osw.write("I love you!");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	}


