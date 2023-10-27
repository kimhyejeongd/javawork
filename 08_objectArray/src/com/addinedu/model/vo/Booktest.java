package com.addinedu.model.vo;

import java.util.Scanner;

public class Booktest {

	public static void main(String[] args) {
		//복습 1. 
		Book b1 = new Book();
		b1.setTitle("혼자 공부하는 자바");
		b1.setAuthor("신용권");
		b1.setprice(32000);
		b1.setPublisher("한빛미디어");
		
		Book b2 = new Book("마이바티스 프로그래밍","이동국",25000,"에이콘");
		
        Book b3 = new Book();
        //사용자로부터 입력받아 필드에 값 저장하기
        Scanner scan = new Scanner(System.in);
        System.out.print("도서명 입력 : ");
		/* scan.next() //단어단위로 문자열 받음
		scan.nextLine() //줄 단위의 문자열 받음
		scan.nextInt() // int 형
		*/
        b3.setTitle(scan.next());
        System.out.println("도서명 입력 : ");
        b3.setTitle(scan.nextLine());
        System.out.println("저자 입력 : ");
        b3.setAuthor(scan.nextLine());
        System.out.println("가격 입력 : ");
        b3.setprice(scan.nextInt());
        scan.nextLine();
        System.out.println("출판사 입력 : ");
        b3.setPublisher(scan.nextLine());
        //Book b4 = new Book(title, )
        
        //일반변수에 3권의 책을 입력
        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        for(int i=1; i<=3; i++) {
        	System.out.println("도서명 입력 : ");
        	String title = scan.nextLine();
        	System.out.println("저자 입력 : ");
        	String Author = scan.nextLine();
        	System.out.println("가격 입력 : ");
        	int price = scan.nextInt();
        	scan.nextLine();
        	System.out.println("출판사 입력 : ");
        	String publisher = scan.nextLine();
        	
        	//매번검사
        	if(i==1)
        		book1 = new Book(title, Author, price, publisher);
        	else if(i==2)
        		book2 = new Book(title, Author, price, publisher);
        	else 
        		book3 = new Book(title, Author, price, publisher);
        	
        }
        System.out.println(book1.information());
        System.out.println(book2.information());
        System.out.println(book3.information());
        
        // 도서 제목으로 검색
        System.out.println("검색할 책 제목 : ");
        String search = scan.nextLine();
        if(book1.getTitle().equals(search)) {
        	System.out.println(book1.information());
        else if(book2.getTitle().equals(search));
        System.out.println(book2.information());
        else
        	System.out.println(book3.information());
        

}
