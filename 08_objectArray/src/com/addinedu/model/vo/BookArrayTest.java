package com.addinedu.model.vo;

import java.util.Scanner;

public class BookArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book[] books = new Book[3];
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			 System.out.print("도서명 입력 : ");
		        String title = scan.nextLine();
		        System.out.print("저자 입력 : ");
		        String Author = scan.nextLine();
		        System.out.print("가격 입력 : ");
		         int price = scan.nextInt();
		          scan.nextLine();
		        System.out.print("출판사 입력 : ");
		        String publisher = scan.nextLine();
		        //배열에 객체 입력
		        books[i] = new Book(title, Author, price, publisher);
		        
		}
		//도서 제목으로 검색
		System.out.println("검색할 책 제목 : ");
		String search = scan.nextLine();
		
       for(int i=0; i<books.length; i++) {
    	   if(books[i].getTitle().equals(search))
    		   System.out.println(books[i].information());
       }
	}

}
