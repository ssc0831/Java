package com.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

// com.day10.Member.java 파일을 읽어서 output.txt로 내보내시오.
// 1 : package com.day10; ... 형식으로 출력
// BufferedReader, PrintStream 사용하기

public class LineFile {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("src\\com\\day10\\Member.java"));
				PrintStream ps = new PrintStream("output.txt")){
			String str;
			int cnt = 1;
			while ((str = br.readLine()) != null) {
				ps.println(cnt++ + " : " +str);
				//cnt++
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
