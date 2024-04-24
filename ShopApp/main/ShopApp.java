package main;

import controller.ShopController;
import service.ShopRepoFile;

// 참고 홈페이지 - https://pethug.kr/index.html
public class ShopApp {
	
	public static void main(String[] args) {
		
	ShopController sController=new ShopController(new ShopRepoFile());
	
	//앱실행
	sController.runApp();

	//관리자 ID, PW - admin,admin
	}
}































