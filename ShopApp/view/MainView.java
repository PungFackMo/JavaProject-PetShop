package view;

import java.util.List;
import java.util.Scanner;

import dto.ShopDto;
import service.BuyService;
import service.CartService;
import service.LoginService;
import view.admin.AdminView;

public class MainView {
	
	private Scanner scanner = new Scanner(System.in);
	
	public int choice=-1;
	public int buyIndex;
	public int buyCnt=0;
	public String[] strArr;
	public BuyService buy=new BuyService();
	LoginService loginService=new LoginService();
	CartService caService=new CartService();
	AdminView adminView=new AdminView();
	int loginIndex=0;
	String id=null;
	
	//메인메뉴
	public int mainMenu() {
		if(loginIndex==0) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("		메인　　메뉴		\n");
			System.out.println("어서오세요 미소코코샵 입니다.");
			System.out.println("1. 상품 카테고리");
			System.out.println("2. 장바구니");
			System.out.println("3. 로그인");
			System.out.println("4. 회원가입");
			System.out.println("0. 종료");
			try{
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<0||4<choice) {
					throw new Exception();
				}
				scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}else if(loginIndex==1) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("		메인　　메뉴		\n");
			System.out.println("어서오세요 미소코코샵 입니다.");
			System.out.println("1. 상품 카테고리");
			System.out.println("2. 장바구니");
			System.out.println("3. 로그아웃");
			System.out.println("4. 마이페이지");
			System.out.println("0. 종료");
			try{
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<0||5<choice) {
					throw new Exception();
				}
				scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}else if(loginIndex==2) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("		메인　　메뉴		\n");
			System.out.println("어서오세요 **샵 입니다.");
			System.out.println("1. 상품 카테고리");
			System.out.println("2. 장바구니");
			System.out.println("3. 로그아웃");
			System.out.println("4. 관리자 페이지");
			System.out.println("0. 종료");
			try{
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<0||6<choice) {
					throw new Exception();
				}
				scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
		}
		return choice;
	}
	
	//관리자 메뉴
	public void adminMenu(List<ShopDto> feedDtos,List<ShopDto> gumDtos,List<ShopDto> canDtos,
			List<ShopDto> bigSasamiDtos,List<ShopDto> smallSasamiDtos,List<ShopDto> sausageDtos,
			List<ShopDto> towelDtos,List<ShopDto> shamRinDtos,List<ShopDto> shampooDtos,
			List<ShopDto> supplDtos,List<ShopDto> pottyPadDtos,List<ShopDto> diaperDtos,
			List<ShopDto> feederDtos,List<ShopDto> twinFeederDtos,List<ShopDto> feedStorageDtos,
			List<ShopDto> catFeedDtos,List<ShopDto> snDropsDtos,List<ShopDto> meatDtos,
			List<ShopDto> catSandDtos,List<ShopDto> catToiletDtos,List<ShopDto> catFeederDtos,
			List<ShopDto> catTwinFeederDtos) {
		if(loginIndex==2) {
			adminView.getAdminMenu(feedDtos,gumDtos,canDtos,bigSasamiDtos,
					smallSasamiDtos,sausageDtos,towelDtos,shamRinDtos,
					shampooDtos,supplDtos,pottyPadDtos,diaperDtos,feederDtos,
					twinFeederDtos,feedStorageDtos,catFeedDtos,snDropsDtos,
					meatDtos,catSandDtos,catToiletDtos,catFeederDtos,catTwinFeederDtos);
		}
	}
	
	//로그인 메뉴
	public void getLoginMenu(List<ShopDto> logIDDtos, List<ShopDto> logPWDtos) {
		if(loginIndex==0) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("		로그인　메뉴		\n");
			while(true) {
				if(loginIndex==0) {
					System.out.println("ID와 PW를 입력하세요");
					System.out.print("ID : ");
					id=scanner.nextLine();
					if(loginService.loginID(id, logIDDtos)) {
						System.out.print("PW : ");
						String pw=scanner.nextLine();
						if(loginService.loginPW(pw, logPWDtos)) {
							System.out.println("로그인 되었습니다.\n");
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							if(id.equals("admin")) {
								loginIndex=2; //관리자 로그인
								break;
							}else {
								loginIndex=1; //일반 로그인
								break;
							}
						}else {
							System.out.println("패스워드가 틀렸습니다.");
						}
					}else if(loginService.loginID(id, logIDDtos)==false){
						System.out.println("아이디가 없습니다. 다시 로그인 하시겠습니까?");
						while(true) {
							try{
								System.out.println("1.로그인");
								System.out.println("2.메인화면");
								int answer=0;
								System.out.print("\n입력 : ");
								answer=scanner.nextInt();
								if(answer<1||2<answer) {
									throw new Exception();
								}
								scanner.nextLine();
								if(answer==1) {
									break;
								}
								if(answer==2) {
									System.out.println("메인화면으로 돌아갑니다.");
									return;
								}
							}catch(Exception e){
								scanner.nextLine();
								System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
								System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
								System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
								System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
							}
						}
					}
				}
			}
		}else if(!(loginIndex==0)) {
			int answer;
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("		로그아웃메뉴		\n");
			while(true) {
				try{
					System.out.println("로그아웃 하시겠습니까?");
					System.out.println("1. 네\n2. 아니요");
					System.out.print("\n입력 : ");
					answer=scanner.nextInt();
					if(answer<1||2<answer) {
						throw new Exception();
					}
					scanner.nextLine();
					if(answer==1) {
						System.out.println("로그아웃 되었습니다.");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						loginIndex=0;
						return;
					}else if(answer==2) {
						System.out.println("아니요를 선택하셨습니다. 메인화면으로 돌아갑니다.");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						return;
					}
				}catch(Exception e){
					scanner.nextLine();
					System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
					System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
					System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
					System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
				}
			}
		}
	}
	
	//회원가입 메뉴
	public void addUser(List<ShopDto> logIDDtos, List<ShopDto> logPWDtos) {
		if(loginIndex==0) {
			System.out.println("회원 가입 페이지입니다.");
			System.out.println("새로운 ID를 입력하십시요.");
			System.out.print("ID : ");
			while(true) {
				String newID=scanner.nextLine();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				if(loginService.checkUserID(newID, logIDDtos)) {
					System.out.println("사용 가능한 ID입니다.");
					System.out.println(newID+"로 ID를 생성하시겠습니까?");
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
							if(answer==1) {
								System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
								System.out.println(newID+"로 ID를 생성합니다.");
								loginService.addUserID(newID, logIDDtos);
								System.out.println("패스워드를 입력하세요.");
								System.out.println("PW : ");
								String newPW=scanner.nextLine();
								loginService.addUserPW(newPW, logPWDtos);
								System.out.println("회원가입이 성공적으로 이루어졌습니다.");
								return;
							}else if(answer==2) {
								System.out.println("아니요를 선택하셨습니다. 메인 화면으로 돌아갑니다.");
								return;
							}else {
								System.out.println("잘못된 번호를 입력하였습니다. 메인 화면으로 돌아갑니다.");
								return;
							}
						}catch(Exception e){
							scanner.nextLine();
							System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
							System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
							System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
							System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
						}
					}
				}else {
					System.out.println("중복된 ID입니다. 새로운 ID를 입력하세요.");
					System.out.print("ID : ");
				}
			}
		}
	}
	
	//마이페이지
	public void myPage(List<ShopDto> logIDDtos, List<ShopDto> logPWDtos) {
		if(loginIndex==1) {
			int index;
			System.out.println("마이 페이지입니다.\n");
			while(true) {
				try{
					System.out.println("1. 비밀번호 변경");
					System.out.println("2. 회원 탈퇴");
					System.out.println("0. 메인메뉴");
					System.out.print("\n입력 : ");
					index=scanner.nextInt();
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					if(index<0||2<index) {
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
				System.out.println("메인메뉴로 돌아갑니다.");
			}else if(index==1) {
				System.out.println("비밀번호 변경 페이지입니다.\n");
				while(true) {
					System.out.println("변경하실 비밀번호를 입력하세요.");
					System.out.println("취소하시려면 0번을 입력하세요.");
					System.out.print("\n입력 : ");
					String newPW01=scanner.nextLine();
					if(newPW01.equals("0")) {
						System.out.println("취소를 선택하셨습니다. 메인메뉴로 돌아갑니다.");
						break;
						}
					System.out.println("변경하실 비밀번호를 다시 입력하세요.");
					System.out.print("\n입력 : ");
					String newPW02=scanner.nextLine();
					if(newPW01.equals(newPW02)) {
						loginService.updateUserPW(id, newPW02, logIDDtos, logPWDtos);
						System.out.println("비밀번호가 변경되었습니다. 메인화면으로 돌아갑니다.");
						break;
					}else if(!(newPW01.equals(newPW02))){
						System.out.println("비밀번호를 다르게 입력하였습니다.");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
					}
				}
			}else if(index==2) {
				System.out.println("회원 탈퇴 페이지입니다.");
				System.out.println("정말로 회원을 탈퇴하시겠습니까?");
				System.out.println("1. 네\n2. 아니요");
				while(true) {
					try{
						System.out.print("\n입력 : ");
						choice=scanner.nextInt();
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
						if(choice<1||2<choice) {
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
				if(choice==1) {
					System.out.println("회원을 탈퇴합니다.");
					loginService.deleteUser(id, logIDDtos, logPWDtos);
					System.out.println("정상적으로 탈퇴되었습니다. 메인화면으로 돌아갑니다.");
					loginIndex=0;
				}else if(choice==2) {
					System.out.println("아니요를 선택하셨습니다. 메인화면으로 돌아갑니다.");
				}
			}
		}
	}
	
	//장바구니
	public void getCartList(List<ShopDto> cartDtos) {
		System.out.println("장바구니 페이지 입니다.");
		if(cartDtos.isEmpty()) {
			System.out.println("장바구니가 비어있습니다.");
		}else {
			System.out.println("장바구니 목록입니다.\n");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("                장바구니목록\n");
			caService.cartService(cartDtos, strArr);
		}
	}
	
	//카테고리 메뉴
	public int getCategory() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		상품　　메뉴		\n");
				System.out.println("1. 사료");
				System.out.println("2. 간식");
				System.out.println("3. 목욕용품");
				System.out.println("4. 영양제/의약외품/치아관리");
				System.out.println("5. 위생/배변/패드");
				System.out.println("6. 급식기/급수기");
				System.out.println("7. 고양이 사료");
				System.out.println("8. 고양이 간식");
				System.out.println("9. 모래/화장실/식기");
				System.out.println("0. 메인화면으로 돌아가기");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<0||9<choice) {
					throw new Exception();
				}
				scanner.nextLine();
				if(choice==0) {
					System.out.println("메인화면으로 돌아갑니다.");
				}
				return choice;
			}catch(Exception e){
				scanner.nextLine();
				System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				System.out.println("◈◈◈　잘못된 번호를 입력하였습니다.　◈◈◈");
				System.out.println("◈◈◈　메뉴에 기재된 번호를 입력해주세요.　◈◈◈");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n");
			}
			
		}
	}
	
	//카테고리 - 간식 하위 메뉴
	public int getCategory02() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		간식　　메뉴		\n");
				System.out.println("1. 껌");
				System.out.println("2. 캔/통조림");
				System.out.println("3. 육포사사미(대용량)");
				System.out.println("4. 육포사사미(소용량)");
				System.out.println("5. 소세지/습식간식");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||5<choice) {
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
		return choice;
	}
	
	//카테고리 - 목욕용품 하위 메뉴
	public int getCategory03() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		목욕용품메뉴		\n");
				System.out.println("1. 타올/기타");
				System.out.println("2. 샴푸린스 겸용");
				System.out.println("3. 샴푸");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||3<choice) {
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
		return choice;
	}
	
	//카테고리 - 위생/배변/패드 하위 메뉴
	public int getCategory05() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		위생배변패드		\n");
				System.out.println("1. 배변판/패드");
				System.out.println("2. 기저귀/팬티");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||2<choice) {
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
		return choice;
	}
	
	//카테고리 - 급식기/급수기 하위 메뉴
	public int getCategory06() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		식기　　메뉴		\n");
				System.out.println("1. 급식기/급수기");
				System.out.println("2. 쌍식기");
				System.out.println("3. 사료 보관통");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||3<choice) {
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
		return choice;
	}
	
	//카테고리 - 고양이 간식 하위 메뉴
	public int getCategory08() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		간식　　메뉴		\n");
				System.out.println("1. 스낵&드롭스");
				System.out.println("2. 통살&닭가슴살");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||2<choice) {
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
		return choice;
	}
	
	//카테고리 - 모래/화장실/식기 하위 메뉴
	public int getCategory09() {
		while(true) {
			try{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("		괭이용품메뉴		\n");
				System.out.println("1. 모래");
				System.out.println("2. 화장실");
				System.out.println("3. 급식기/급수기");
				System.out.println("4. 쌍식기");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
				System.out.print("\n입력 : ");
				choice=scanner.nextInt();
				if(choice<1||4<choice) {
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
		return choice;
	}
	
	
	
	

}
