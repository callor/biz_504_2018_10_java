package com.biz.fileread.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.fileread.vo.WordVO;

public class WordExec01 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String readFile 
		= "D:/bizwork/workspace/ExFiles/영단어.txt";
		List<WordVO> wordList = new ArrayList();

		// Text파일을 읽기위한 객체
		FileReader fr;
		
		// Text파일을 문자열단위로 변환해서 읽기 위한 객체
		BufferedReader buffer;
		
		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			
			while(true) {
				// 한라인씩 문자열로 읽기
				String strWord = buffer.readLine();
				
				// strWord 가 null 이면
				// buffer에 더이상 읽을 내용이 없으면
				if(strWord == null) break;
				
				// strWord가 null 아닌경우 계속...
				
				// strWord 에 담긴 문자열을 : 을 기준으로
				// 분해해서 영단와 한글 풀이를 분해해서
				// strWords 문자열 배열에 담아라
				String[] strWords = strWord.split(":");
				
				// WordVO를 선언 생성
				//   WordVO 는 단어 한개의 영단어와 한글 풀이를
				//   담을 바구니 클래스다
				WordVO vo = new WordVO();
				
				// 영단어와 한글 풀이를 변수에 setting
				vo.setStrEng(strWords[0]);
				vo.setStrKor(strWords[1]);
				
				// 단어바구니를 단어리스트에 추가
				wordList.add(vo);
			}
			
			buffer.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end
		
		// ?? 여기에서 사용(접근)할 수 있는 변수는 ??
		// readFile, wordList를 사용할수 있다.
		
		/*
		for(int i = 0 ; i < wordList.size();i++) {
			WordVO vo = wordList.get(i);
			System.out.print(vo.getStrKor() + ", ");
			System.out.println(vo.getStrEng());
		}
		*/
		
		Collections.shuffle(wordList);
		
		System.out.println("다음 단어는 무엇인가");
		System.out.println(wordList.get(0).getStrKor());
		
		
		
	
	}

}







