package easy_text_board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
		System.out.printf("명령어) ");
		String command = scanner.nextLine();
		
		if (command.equals("artcle add")) {
			System.out.println("== 게시물 등록 ==");
		} else if (command.equals("artcle list")) {
			System.out.println("== 게시물 리스트 ==");
		} else if (command.equals("system exit") ) {
			System.out.println("== 프로그램 종료 ==");
			break;
		} else {
			System.out.println("== 존재하지 않는 명령어 ==");
		}
	}
		scanner.close();
	}

}
	