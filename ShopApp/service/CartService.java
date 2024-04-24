package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.ShopDto;

public class CartService {
	
	Scanner scanner=new Scanner(System.in);
	
	public void cartService(List<ShopDto> cartDtos, String[] strArr) {
		for(int i=0;i<cartDtos.size();i++) {
			System.out.print(cartDtos.get(i)+" ");
			if(i%2==1) {
				System.out.println("개");
			}
		}
		List<Integer> priceDto=new ArrayList<>();
		List<Integer> cntDto=new ArrayList<>();
		for(int i=0;i<cartDtos.size();i++) {
			String str=cartDtos.get(i).toString();
			strArr=str.split("-");
			if(strArr.length==2) {
				priceDto.add((Integer.parseInt(strArr[1])));
			}else if(strArr.length==1) {
				cntDto.add((Integer.parseInt(strArr[0])));
			}
		}
		int sum=0;
		for(int i=0;i<priceDto.size();i++) {
			sum+=(priceDto.get(i))*(cntDto.get(i));
		}
		System.out.println("\n총 "+sum+"원입니다.");
		System.out.println("모두 구매하겠습니까?");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		int answer=0;
		while(true) {
			try{
				System.out.println("1. 네\n2. 아니요");
				System.out.print("\n입력 : ");
				answer=scanner.nextInt();
				if(answer<1||2<answer) {
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
		switch(answer) {
		case 1:
			System.out.println("상품이 구매되었습니다.");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("                구매 영수증\n");
			for(int i=0;i<cartDtos.size();i++) {
				String str=cartDtos.get(i).toString();
				strArr=str.split("-");
				if(strArr.length==2) {
					System.out.println("     ");
					System.out.println("     　상품 : "+strArr[0]);
				}else if(strArr.length==1) {
					System.out.println("     　수량 : "+strArr[0]+"개");
				}
				
			}
			System.out.println("     　총 가격 : "+sum+"원");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
			cartDtos.clear();
			break;
		case 2:
			System.out.println("아니요를 선택하셨습니다. 메인화면으로 돌아갑니다.");
			break;
		}
	}

}
