package view.admin;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;
import service.CreateService;


public class CreateView {
	
	Scanner scanner=new Scanner(System.in);
	CreateService crService=new CreateService();
	int index;
	
	public void createView(List<ShopDto> feedDtos,List<ShopDto> gumDtos,List<ShopDto> canDtos,
			List<ShopDto> bigSasamiDtos,List<ShopDto> smallSasamiDtos,List<ShopDto> sausageDtos,
			List<ShopDto> towelDtos,List<ShopDto> shamRinDtos,List<ShopDto> shampooDtos,
			List<ShopDto> supplDtos,List<ShopDto> pottyPadDtos,List<ShopDto> diaperDtos,
			List<ShopDto> feederDtos,List<ShopDto> twinFeederDtos,List<ShopDto> feedStorageDtos,
			List<ShopDto> catFeedDtos,List<ShopDto> snDropsDtos,List<ShopDto> meatDtos,
			List<ShopDto> catSandDtos,List<ShopDto> catToiletDtos,List<ShopDto> catFeederDtos,
			List<ShopDto> catTwinFeederDtos) {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.println("상품 추가 페이지입니다.");
				System.out.println("추가하실 상품의 번호를 입력하세요.");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.println("1. 사료");
				System.out.println("2. 간식");
				System.out.println("3. 목욕용품");
				System.out.println("4. 영양제/의약외품/치아관리");
				System.out.println("5. 위생/배변/패드");
				System.out.println("6. 급식기/급수기");
				System.out.println("7. 고양이 사료");
				System.out.println("8. 고양이 간식");
				System.out.println("9. 모래/화장실/식기");
				System.out.println("0. 메인화면");
				System.out.print("\n입력 : ");
				index=scanner.nextInt();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				if(index<0||9<index) {
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
		switch(index) {
		case 0:
			break;
		case 1:
			crService.createService(feedDtos);
			break;
		case 2:
			while(true) {
				try{
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					System.out.println("1. 껌");
					System.out.println("2. 캔/통조림");
					System.out.println("3. 육포사사미(대용량)");
					System.out.println("4. 육포사사미(소용량)");
					System.out.println("5. 소세지/습식간식");
					System.out.print("\n입력 : ");
					index=scanner.nextInt();
					if(5<index) {
						throw new Exception();
					}else if(index<1) {
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
			
			switch(index) {
			case 1:
				crService.createService(gumDtos);
				break;
			case 2:
				crService.createService(canDtos);
				break;
			case 3:
				crService.createService(bigSasamiDtos);
				break;
			case 4:
				crService.createService(smallSasamiDtos);
				break;
			case 5:
				crService.createService(sausageDtos);
				break;
			}
			break;
		case 3:
			while(true) {
				try{
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					System.out.println("1. 타올/기타");
					System.out.println("2. 샴푸린스 겸용");
					System.out.println("3. 샴푸");
					System.out.print("\n입력 : ");
					index=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(index<1||3<index) {
						throw new Exception();
					}
					scanner.nextLine();
					switch(index) {
					case 0:
						break;
					case 1:
						crService.createService(towelDtos);
						break;
					case 2:
						crService.createService(shamRinDtos);
						break;
					case 3:
						crService.createService(shampooDtos);
						break;
					}
					break;
				}catch(Exception e){
					scanner.nextLine();
					System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
					System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
					System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
					System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
				}
			}
			break;
		case 4:
			crService.createService(supplDtos);
			break;
		case 5:
			while(true) {
				try{
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					System.out.println("1. 배변판/패드");
					System.out.println("2. 기저귀/팬티");
					System.out.print("\n입력 : ");
					index=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(index<1||2<index) {
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
			switch(index) {
			case 0:
				break;
			case 1:
				crService.createService(pottyPadDtos);
				break;
			case 2:
				crService.createService(diaperDtos);
				break;
			}
			break;
		case 6:
			while(true) {
				try{
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					System.out.println("1. 급식기/급수기");
					System.out.println("2. 쌍식기");
					System.out.println("3. 사료 보관통");
					System.out.print("\n입력 : ");
					index=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					if(index<1||3<index) {
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
			
			switch(index) {
			case 0:
				break;
			case 1:
				crService.createService(feederDtos);
				break;
			case 2:
				crService.createService(twinFeederDtos);
				break;
			case 3:
				crService.createService(feedStorageDtos);
				break;
			}
			break;
		case 7:
			crService.createService(catFeedDtos);
			break;
		case 8:
			while(true) {
				try{
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					System.out.println("1. 스낵&드롭스");
					System.out.println("2. 통살&닭가슴살");
					System.out.print("\n입력 : ");
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					index=scanner.nextInt();
					if(index<1||2<index) {
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
			switch(index) {
			case 0:
				break;
			case 1:
				crService.createService(snDropsDtos);
				break;
			case 2:
				crService.createService(meatDtos);
				break;
			}
			break;
		case 9:
			while(true) {
				try{
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					System.out.println("1. 모래");
					System.out.println("2. 화장실");
					System.out.println("3. 급식기/급수기");
					System.out.println("4. 쌍식기");
					System.out.print("\n입력 : ");
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					index=scanner.nextInt();
					if(index<1||4<index) {
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
			
			switch(index) {
			case 0:
				break;
			case 1:
				crService.createService(catSandDtos);
				break;
			case 2:
				crService.createService(catToiletDtos);
				break;
			case 3:
				crService.createService(catFeederDtos);
				break;
			case 4:
				crService.createService(catTwinFeederDtos);
				break;
			}
			break;
		}
	}

}
