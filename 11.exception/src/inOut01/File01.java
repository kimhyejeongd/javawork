package inOut01;

import java.io.File;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		//간단한 파일 만들때
		//java.io.File 클래스
		
		try { 
			File f1 = new File("test.txt");
			f1.createNewFile(); //반드시 creatNewFile을 호출해야 생성됨
			
			File f2 = new File("C:/Users/애드인애듀/test01.txt");
			f2.createNewFile();
			
			//mkdir : 폴더생성 명령어
			File folderMk = new File("C:/Users/애드인애듀/temp")
					folderMk.mkdir();
			Double.par
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
