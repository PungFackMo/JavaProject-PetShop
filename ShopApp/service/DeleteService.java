package service;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;

public class DeleteService {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void deleteService(List<ShopDto> shopDtos) {
		int index=0;
		int choice=0;

		System.out.println("삭제하실 상품의 번호를 입력하세요.");
		for(int i=0;i<shopDtos.size();i++) {
			System.out.println((i+1)+". "+shopDtos.get(i)+"원");
		}
		System.out.print("\n입력 : ");
		while(true) {
			try{
				System.out.print("\n입력 : ");
				index=scanner.nextInt();
				if(index<1||shopDtos.size()<index) {
					throw new Exception();
				}
				scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				break;
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		System.out.println(index+"번 "+shopDtos.get(index-1)+"(을)를 삭제하시겠습니까?");
		System.out.println("1. 네, 삭제하겠습니다.");
		System.out.println("2. 아니요, 삭제하지않겠습니다.");
		System.out.print("\n입력 : ");
		while(true) {
			try{
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||2<choice) {
					throw new Exception();
				}
				scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				break;
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}
		if(choice==1) {
			System.out.println(shopDtos.get(index-1)+"상품이 삭제되었습니다.");
			shopDtos.remove(index-1);
			System.out.println("메인화면으로 돌아갑니다.");
		}else if(choice==2) {
			System.out.println("아니요를 선택하셨습니다. 메인화면으로 돌아갑니다.");
		}else {
			System.out.println("잘못된 번호를 입력하였습니다. 메인화면으로 돌아갑니다.");
		}

	}


}
