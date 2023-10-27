package com.addinedu.run;

import java.util.Scanner;

import exSnack12.Snack;

public class ProductTest {

	public static void main(String[] args) {
		Product s1 = new Snack();
		Product s2 = new Snack("라면", "불닭볶음면", "편의점", 2000 , 10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("제품 id 입력 : ");
		s1.setprodutId(sc.next());
		System.out.println("제품 이름 입력 : ");
		s1.setproductName(sc.next());
		System.out.println("제품 판매 장소 입력 : ");
		s1.setproductArea(sc.next());
		System.out.println("가격 입력 :");
		s1.setprice(sc.nextInt());
		System.out.println("세금 입력 : ");
		s1.settax(sc.nextDouble());
		
		System.out.println("s1객체의 정보 : " + s1.information());
		System.out.println("s2객체의 정보 : " + s2.information());

	}

}
