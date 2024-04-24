package controller;


import service.ShopService;
import view.MainView;
import view.category01.FeedView;
import view.category02.SnackView;
import view.category03.BathView;
import view.category04.SupplementsView;
import view.category05.PottyPadView;
import view.category06.FeederView;
import view.category07.CatFeedView;
import view.category08.CatSnackView;
import view.category09.CatsOf;

public class ShopController {
	
	private MainView mView=new MainView();
	private FeedView fView=new FeedView();
	private SnackView snView=new SnackView();
	private BathView bView=new BathView();
	private SupplementsView suView=new SupplementsView();
	private PottyPadView poView=new PottyPadView();
	private FeederView feView=new FeederView();
	private CatFeedView cfView=new CatFeedView();
	private CatSnackView csView=new CatSnackView();
	private CatsOf coView=new CatsOf();
	private ShopService sService;
	
	public ShopController(ShopService sService) {
		this.sService = sService;
	}

	//앱 실행
	public void runApp() {
		int choice;
		getCategory();
		while(true) {
			choice=mView.mainMenu();
			switch(choice) {
				case 0:
					return;
				case 1:
					//상품 카테고리
					choice=mView.getCategory();
					switch(choice) {
						case 0:
							//첫 메뉴로 돌아가기
							break;
						case 1:
							//사료
							getFeedCate();
							break;
						case 2:
							//간식
							choice=mView.getCategory02();
							switch(choice) {
								case 0:
									//첫 메뉴로 돌아가기
									break;
								case 1:
									//껌
									getSnackGum();
									break;
								case 2:
									//캔/통조림
									getSnackCan();
									break;
								case 3:
									//육포사사미(대용량)
									getSnackBigSasami();
									break;
								case 4:
									//육포사사미(소용량)
									getSnackSmallSasami();
									break;
								case 5:
									//소세지/습식간식
									getSnackSausage();
									break;
							}
							break;
						case 3:
							//목욕용품
							choice=mView.getCategory03();
							switch(choice) {
								case 0:
									//첫 메뉴로 돌아가기
									break;
								case 1:
									//타올/기타
									getBathTowel();
									break;
								case 2:
									//샴푸린스겸용
									getBathShamRin();
									break;
								case 3:
									//샴푸
									getBathShampoo();
									break;
							}
							break;
						case 4:
							//영양제/의약외품/치아관리
							getSupplements();
							break;
						case 5:
							//위생/배변/패드
							choice=mView.getCategory05();
							switch(choice) {
								case 0:
									//첫 메뉴로 돌아가기
									break;
								case 1:
									//배변판/패드
									getPottyPad();
									break;
								case 2:
									//기저귀/팬티
									getDiaper();
									break;
							}
							break;
						case 6:
							//급식기/급수기
							choice=mView.getCategory06();
							switch(choice) {
								case 0:
									//첫 메뉴로 돌아가기
									break;
								case 1:
									//급식기/급수기
									getFeeder();
									break;
								case 2:
									//쌍식기
									getTwinFeeder();
									break;
								case 3:
									//사료 보관통
									getFeedStorage();
									break;
							}
							break;
						case 7:
							//고양이 사료
							getCatFeed();
							break;
						case 8:
							//고양이 간식
							choice=mView.getCategory08();
							switch(choice) {
								case 0:
									//첫 메뉴로 돌아가기
									break;
								case 1:
									//스낵&드롭스
									getCatSnDrops();
									break;
								case 2:
									//통살&닭가슴살
									getCatSnMeat();
									break;
							}
							break;
						case 9:
							//모래/화장실/식기
							choice=mView.getCategory09();
							switch(choice) {
								case 0:
									//첫 메뉴로 돌아가기
									break;
								case 1:
									//모래
									getCatSand();
									break;
								case 2:
									//화잘실
									getCatToilet();
									break;
								case 3:
									//급식기/급수기
									getCatFeeder();
									break;
								case 4:
									//쌍식기
									getCatTwinFeeder();
									break;
							}
							break;
					}
					break;
					
				case 2:
					//장바구니
					getCart();
					break;
				case 3:
					//로그인/로그아웃
					getLoginMenu();
					break;
				case 4:
					//회원가입/마이페이지/관리자페이지
					addUser();
					myPage();
					getAdminMenu();
					break;
				case 5:
					break;
				case 6:
					break;
			}
		}
	}
	
	//관리자 메뉴
	public void getAdminMenu() {
		mView.adminMenu(sService.feedDtos(),sService.gumDtos(),sService.canDtos(),sService.bigSasamiDtos(),
				sService.smallSasamiDtos(),sService.sausageDtos(),sService.towelDtos(),sService.shamRinDtos(),
				sService.shampooDtos(),sService.supplDtos(),sService.pottyPadDtos(),sService.diaperDtos(),
				sService.feederDtos(),sService.twinFeederDtos(),sService.feedStorageDtos(),sService.catFeedDtos(),
				sService.snDropsDtos(),sService.meatDtos(),sService.catSandDtos(),sService.catToiletDtos(),
				sService.catFeederDtos(),sService.catTwinFeederDtos());
		sService.putRepoFile();
	}
	
	//마이페이지
	public void myPage() {
		mView.myPage(sService.logIDDtos(), sService.logPWDtos());
	}
	
	//회원가입
	public void addUser() {
		mView.addUser(sService.logIDDtos(), sService.logPWDtos());
		sService.putUserData();
	}
	
	//로그인/로그아웃
	public void getLoginMenu() {
		mView.getLoginMenu(sService.logIDDtos(), sService.logPWDtos());
	}
	
	//장바구니 불러오기		
	public void getCart() {
		mView.getCartList(sService.cartDtos());
		
	}
	
	//카테고리 전부 로드
	public void getCategory() {
		sService.getRepoFile();
	}
	
	//카테고리 전부 저장
	public void putCategory() {
		sService.putRepoFile();
	}
	
	////////////////////////////////////////	상품카테고리	////////////////////////////////////////
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		   사료   	@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//사료
	public void getFeedCate() {
		fView.getFeedCate(sService.feedDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		   간식   	@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//껌
	public void getSnackGum() {
		snView.getSnCateGum(sService.gumDtos(), sService.cartDtos());
	}
	//캔/통조림
	public void getSnackCan() {
		snView.getSnCateCan(sService.canDtos(), sService.cartDtos());
	}
	//육포사사미(대용량)
	public void getSnackBigSasami() {
		snView.getSnCateBigSasami(sService.bigSasamiDtos(), sService.cartDtos());
	}
	//육포사사미(소용량)
	public void getSnackSmallSasami() {
		snView.getSnCateSmallSasami(sService.smallSasamiDtos(), sService.cartDtos());
	}
	//소세지/습식간식
	public void getSnackSausage() {
		snView.getSnCateSausage(sService.sausageDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		목욕용품		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//타올/기타
	public void getBathTowel() {
		bView.getBaTowel(sService.towelDtos(), sService.cartDtos());
	}
	//샴푸린스겸용
	public void getBathShamRin() {
		bView.getBaShamRin(sService.shamRinDtos(), sService.cartDtos());
	}
	//샴푸
	public void getBathShampoo() {
		bView.getBaShampoo(sService.shampooDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		 영양제/의약외품/치아관리		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//종합영양제
	public void getSupplements() {
		suView.getSupplements(sService.supplDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		 위생/배변/패드		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//배변판/패드
	public void getPottyPad() {
		poView.getPottyPad(sService.pottyPadDtos(), sService.cartDtos());
	}
	//기저귀/팬티
	public void getDiaper() {
		poView.getDiaper(sService.diaperDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		 급식긱/급수기		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//급식기/급수기
	public void getFeeder() {
		feView.getFeeder(sService.feederDtos(), sService.cartDtos());
	}
	//쌍식기
	public void getTwinFeeder() {
		feView.getTwinFeeder(sService.twinFeederDtos(), sService.cartDtos());
	}
	//사료 보관통
	public void getFeedStorage() {
		feView.getFeedStorage(sService.feedStorageDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		 고양이 사료		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//고양이 사료
	public void getCatFeed() {
		cfView.getCatFeed(sService.catFeedDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		 고양이 간식		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//스낵&드롭스
	public void getCatSnDrops() {
		csView.getCatSnDrops(sService.snDropsDtos(), sService.cartDtos());
	}
	//통살&닭가슴살
	public void getCatSnMeat() {
		csView.getCatSnMeat(sService.meatDtos(), sService.cartDtos());
	}
//	@@@@@@@@@@@@@@@@@@@@@@@@@@@		 모래/화장실/식기		@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//모래
	public void getCatSand() {
		coView.getCatSand(sService.catSandDtos(), sService.cartDtos());
	}
	//화장실
	public void getCatToilet() {
		coView.getCatToilet(sService.catToiletDtos(), sService.cartDtos());
	}
	//급식기/급수기
	public void getCatFeeder() {
		coView.getCatFeeder(sService.catFeederDtos(), sService.cartDtos());
	}
	//쌍식기
	public void getCatTwinFeeder() {
		coView.getCatTwinFeeder(sService.catTwinFeederDtos(), sService.cartDtos());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
