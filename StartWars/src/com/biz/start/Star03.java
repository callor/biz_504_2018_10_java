package com.biz.start;

public class Star03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO 빈칸과 문자열 이어서 찍기
		System.out.println("대한민국");
		System.out.println("우리나라");
		
		System.out.print("대한");
		System.out.print("민국");
		System.out.println("우리나라");
		
		System.out.print(". . . . . ");
		System.out.println("우리");
		
		System.out.print(". . . . ");
		System.out.println("우리");
		
		System.out.print(". . . ");
		System.out.println("우리");

		System.out.print(". . ");
		System.out.println("우리");
		
		System.out.print(". ");
		System.out.println("우리");

		System.out.print("");
		System.out.println("우리");

		System.out.println("===============");
		
		System.out.print("          ");
		System.out.println("* ");
		System.out.print("        ");
		System.out.println("* * ");
		System.out.print("      ");
		System.out.println("* * * ");
		System.out.print("    ");
		System.out.println("* * * * ");
		System.out.print("  ");
		System.out.println("* * * * * ");
		
		System.out.println("===============");
		
		// TODO 빈칸찍고 별찍기
		System.out.println("--- 빈칸 찍고 별찍기");
		for(int j = 0 ; j < 5 ; j++) {
			// 빈칸을 몇개 찍고
			for(int i = j ; i < 5 ; i++) {
				System.out.print(". ");
			}
			
			//남은 부분에 별을 찍어라
			for(int k = 0 ; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		// TODO 빈칸 찍고 역삼 별찍기
		System.out.println("--- 빈칸 찍고 역삼 별찍기");
		for(int j = 0 ; j < 5 ; j++) {

			// 빈칸을 몇개 찍고
			for(int i = 0 ; i < j ; i++) {
				System.out.print("  ");
			}

			//남은 부분에 별을 찍어라
			for(int k = j ; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// TODO 빈칸 찍고 역 정삼각 별찍기
		System.out.println("--- 빈칸 찍고 역 정삼각 별찍기");
		System.out.println("===============");
		for(int j = 0 ; j < 5 ; j++) {

			// 빈칸을 몇개 찍고
			for(int i = 0 ; i < j ; i++) {
				System.out.print(" ");
			}

			//남은 부분에 별을 찍어라
			for(int k = j ; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// TODO 빈칸찍고 별찍기
		System.out.println("--- 빈칸 찍고 정삼각 별찍기");
		for(int j = 0 ; j < 5 ; j++) {
			// 빈칸을 몇개 찍고
			for(int i = j ; i < 5 ; i++) {
				System.out.print(" ");
			}
			
			//남은 부분에 별을 찍어라
			for(int k = 0 ; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}


