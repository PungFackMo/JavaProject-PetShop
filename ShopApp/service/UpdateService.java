package service;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;

public class UpdateService {
	
	private Scanner scanner = new Scanner(System.in);
	private String[] strArr;
	
	public void updateService(List<ShopDto> shopDtos) {
		int index=0;
		while(true) {
			try{
				System.out.println("수정하실 상품의 번호를 입력하세요.");
				for(int i=0;i<shopDtos.size();i++) {
					System.out.println((i+1)+". "+shopDtos.get(i)+"원");
				}
				System.out.print("\n입력 : ");
				index=scanner.nextInt();
				if(index<0) {
					throw new Exception();
				}
				scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.println(index+"번 "+shopDtos.get(index-1)+"(을)를 수정하시겠습니까?");
				break;
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}
		int choice=0;
		while(true) {
			try{
				System.out.println("1. 네, 수정하겠습니다.");
				System.out.println("2. 아니요, 수정하지않겠습니다.");
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
			String str=shopDtos.get(index-1).toString();
			strArr=str.split("-");
			System.out.println("");
			System.out.println("수정할 상품명을 입력하세요.");
			System.out.print("\n입력 : ");
			strArr[0]=scanner.nextLine();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
			int updateIndex=0;
			while(true) {
				try{
					System.out.println("수정한 상품의 가격을 입력하세요.");
					System.out.println("ex) 19,800원 -> 19800");
					System.out.print("\n입력 : ");
					updateIndex=scanner.nextInt();
					if(updateIndex<0) {
						throw new Exception();
					}
					scanner.nextLine();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					break;
				}catch(Exception e){
					scanner.nextLine();
					System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
					System.out.println("◈◈◈　잘못된 가격을 입력하였습니다.　◈◈◈");
					System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
				}
			}
			strArr[1]=Integer.toString(updateIndex);
			ShopDto sDto=new ShopDto();
			sDto.setShopStr(strArr[0]+"-"+strArr[1]);
			System.out.println(shopDtos.get(index-1)+"상품이");
			shopDtos.set(index-1, sDto);
			System.out.println(shopDtos.get(index-1)+"상품으로 수정되었습니다.");
			System.out.println("메인화면으로 돌아갑니다.");
		}else if(choice==2) {
			System.out.println("아니요를 선택하셨습니다. 메인화면으로 돌아갑니다.");
		}else {
			System.out.println("잘못된 번호를 입력하였습니다. 메인화면으로 돌아갑니다.");
		}
	}

}
