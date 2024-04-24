package service;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;

public class CreateService {
	
	private Scanner scanner = new Scanner(System.in);
	int index=0;
	int answer=0;
	int choice=0;
	String str;
	
	public void createService(List<ShopDto> shopDto) {
		while(true) {
			System.out.println("추가하실 상품명을 입력해주세요.");
			str=scanner.nextLine();
			while(true) {
				try{
					System.out.println("추가하실 상품명이 "+str+"이 맞습니까?");
					System.out.println("1. 네\n2. 아니요\n3. 취소");
					System.out.print("\n입력 : ");
					answer=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(answer<1||3<answer) {
						throw new Exception();
					}
					scanner.nextLine();
					break;
				}catch(Exception e){
					scanner.nextLine();
					System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
					System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
					System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
					System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
				}
			}
			if(answer==1) {
				System.out.println(str+"상품을 추가합니다.");
				while(true) {
					while(true) {
						try{
							System.out.println("상품의 가격을 입력해주세요");
							System.out.println("ex) 19,800원 -> 19800");
							System.out.print("\n입력 : ");
							index=scanner.nextInt();
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
							if(index<0) {
								throw new Exception();
							}
							scanner.nextLine();
							break;
						}catch(Exception e){
							scanner.nextLine();
							System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
							System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
							System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
						}
					}
					while(true) {
						try{
							System.out.println("입력하신 가격이 "+index+"원이 맞습니까?");
							System.out.println("1. 네\n2. 아니요\n3. 취소");
							System.out.print("\n입력 : ");
							answer=scanner.nextInt();
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
							if(answer<1||3<answer) {
								throw new Exception();
							}
							scanner.nextLine();
							break;
						}catch(Exception e){
							scanner.nextLine();
							System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
							System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
							System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
						}
					}
					if(answer==1) {
						System.out.println("상품을 저장합니다.");
						System.out.println("상품명 : "+str);
						System.out.println("가격 : "+index+" 원");
						ShopDto strDto=new ShopDto();
						strDto.setShopStr(str+"-"+index);
						shopDto.add(strDto);
						System.out.println("상품을 저장했습니다. 메인메뉴로 돌아갑니다.");
						break;
					}else if(answer==2) {
						System.out.println("아니요를 선택하셨습니다.");
					}else if(answer==3) {
						System.out.println("취소를 선택하셨습니다. 메인메뉴로 돌아갑니다.");
						break;
					}
				}
				break;
			}else if(answer==2) {
				System.out.println("아니요를 선택하셨습니다.");
			}else if(answer==3) {
				System.out.println("취소를 선택하셨습니다. 메인메뉴로 돌아갑니다.");
				break;
			}
		}
	}
}
