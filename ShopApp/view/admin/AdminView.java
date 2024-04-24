package view.admin;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;



public class AdminView{
	
	private Scanner scanner = new Scanner(System.in);
	private UpdateView upView=new UpdateView();
	private DeleteView deView=new DeleteView();
	private CreateView crView=new CreateView();
	
	//관리자 메뉴
	public void getAdminMenu(List<ShopDto> feedDtos,List<ShopDto> gumDtos,List<ShopDto> canDtos,
			List<ShopDto> bigSasamiDtos,List<ShopDto> smallSasamiDtos,List<ShopDto> sausageDtos,
			List<ShopDto> towelDtos,List<ShopDto> shamRinDtos,List<ShopDto> shampooDtos,
			List<ShopDto> supplDtos,List<ShopDto> pottyPadDtos,List<ShopDto> diaperDtos,
			List<ShopDto> feederDtos,List<ShopDto> twinFeederDtos,List<ShopDto> feedStorageDtos,
			List<ShopDto> catFeedDtos,List<ShopDto> snDropsDtos,List<ShopDto> meatDtos,
			List<ShopDto> catSandDtos,List<ShopDto> catToiletDtos,List<ShopDto> catFeederDtos,
			List<ShopDto> catTwinFeederDtos) {
		System.out.println("		관리자　메뉴		");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		System.out.println("관리자 메뉴 입니다.");
		int index=0;
		while(true) {
			try{
				System.out.println("1. 상품 수정");
				System.out.println("2. 상품 삭제");
				System.out.println("3. 상품 추가");
				System.out.println("0. 메인 메뉴");
				System.out.print("\n입력 : ");
				index=scanner.nextInt();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				if(index<0||3<index) {
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
		if(index==0) {
			System.out.println("메인 메뉴로 돌아갑니다");
		}else if(index==1) {
			upView.updateView(feedDtos, gumDtos, canDtos, bigSasamiDtos,
					smallSasamiDtos, sausageDtos, towelDtos, shamRinDtos,
					shampooDtos, supplDtos, pottyPadDtos, diaperDtos,
					feederDtos, twinFeederDtos, feedStorageDtos, catFeedDtos,
					snDropsDtos, meatDtos, catSandDtos, catToiletDtos, catFeederDtos, catTwinFeederDtos);
		}else if(index==2) {
			deView.deleteView(feedDtos, gumDtos, canDtos, bigSasamiDtos,
					smallSasamiDtos, sausageDtos, towelDtos, shamRinDtos,
					shampooDtos, supplDtos, pottyPadDtos, diaperDtos,
					feederDtos, twinFeederDtos, feedStorageDtos, catFeedDtos,
					snDropsDtos, meatDtos, catSandDtos, catToiletDtos, catFeederDtos, catTwinFeederDtos);
		}else if(index==3) {
			crView.createView(feedDtos, gumDtos, canDtos, bigSasamiDtos,
					smallSasamiDtos, sausageDtos, towelDtos, shamRinDtos,
					shampooDtos, supplDtos, pottyPadDtos, diaperDtos,
					feederDtos, twinFeederDtos, feedStorageDtos, catFeedDtos,
					snDropsDtos, meatDtos, catSandDtos, catToiletDtos, catFeederDtos, catTwinFeederDtos);
		}else {
			System.out.println("잘못된 번호를 입력하였습니다.");
		}
	}

}
