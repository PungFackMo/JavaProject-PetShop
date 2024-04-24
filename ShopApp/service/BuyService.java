package service;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;


public class BuyService{
	
	Scanner scanner=new Scanner(System.in);

	
	
	public void buyThings(int buyIndex, int choice, int buyCnt, String[] strArr,List<ShopDto> cart,List<ShopDto> shopDtos) {
		
		while(true) {
			try{
				for(int i=0;i<shopDtos.size();i++) {
					System.out.println((i+1)+". "+shopDtos.get(i)+"원");
				}
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.println("		구매/장바구니		");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.println("구매하실 상품을 선택해주세요.");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt()-1;
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.println("선택한 상품 : "+shopDtos.get(choice)+"\n");
				if(choice<0||shopDtos.size()-1<choice) {
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
		String str=shopDtos.get(choice).toString();
		strArr=str.split("-");
		while(true) {
			try{
				System.out.println("1. 바로 구매");
				System.out.println("2. 장바구니에 담기");
				System.out.println("0. 메인 메뉴로 돌아가기");
				System.out.print("\n입력 : ");
				buyIndex=scanner.nextInt();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				if(buyIndex<0||2<buyIndex) {
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
		
		switch(buyIndex) {
		case 0:
			//메인 메뉴로 돌아가기
			System.out.println("메인 메뉴로 돌아갑니다.");
			break;
		case 1:
			//바로 구매
			while(true) {
				try{
					System.out.println("구매하실 상품의 개수를 입력하세요.");
					System.out.print("\n입력 : ");
					buyCnt=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(buyCnt<0) {
						throw new Exception();
					}
					scanner.nextLine();
					break;
				}catch(Exception e){
					scanner.nextLine();
					System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
					System.out.println("◈◈◈　잘못된 개수를 입력하였습니다.　◈◈◈");
					System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
				}
			}
			System.out.println("상품 : "+strArr[0]
							+"\n수량 : "+buyCnt+"개"
							+"\n총 가격 : "+(Integer.parseInt(strArr[1]))*buyCnt+"원");
			
			while(true) {
				try{
					System.out.println("\n상품을 구매하시겠습니까?");
					System.out.println("1. 네, 구매하겠습니다.");
					System.out.println("2. 아니요, 구매하지않겠습니다.");
					System.out.print("\n입력 : ");
					buyCnt=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(buyCnt<1||2<buyCnt) {
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
			if(buyCnt==1) {
				System.out.println("상품이 구매되었습니다.");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("                구매 영수증");
				System.out.println("     ");
				System.out.println("     　상품 : "+strArr[0]);
				System.out.println("     　수량 : "+buyCnt+"개");
				System.out.println("     　총 가격 : "+(Integer.parseInt(strArr[1]))*buyCnt+"원");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				
				
			}else if(buyCnt==2){
				System.out.println("메인 화면으로 돌아갑니다.");
			}
			break;
		case 2:
			//장바구니에 담기
			while(true) {
				try{
					System.out.println("장바구니에 담을 상품의 개수를 입력하세요.");
					System.out.print("\n입력 : ");
					buyCnt=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(buyCnt<0) {
						throw new Exception();
					}
					scanner.nextLine();
					break;
				}catch(Exception e){
					scanner.nextLine();
					System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
					System.out.println("◈◈◈　잘못된 개수를 입력하였습니다.　◈◈◈");
					System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
				}
			}
			System.out.println("상품 : "+strArr[0]
							+"\n수량 : "+buyCnt+"개"
							+"\n총 가격 : "+(Integer.parseInt(strArr[1]))*buyCnt+"원");
			System.out.println(strArr[0]+"(을)를 장바구니에 "
					+ buyCnt+"개 담았습니다.");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
			ShopDto sDtoCnt=new ShopDto();
			cart.add(shopDtos.get(choice));
			sDtoCnt.setShopStr(Integer.toString(buyCnt));
			cart.add(sDtoCnt);
			break;
		}
	}

}

