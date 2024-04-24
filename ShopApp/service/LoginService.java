package service;

import java.util.List;

import dto.ShopDto;

public class LoginService {
	
	int IDIndexOf;
	
	//로그인 - ID
	public boolean loginID(String loginID, List<ShopDto> logIDDtos) {
		boolean bl=false;
		while(true) {
			ShopDto sDto=new ShopDto();
			sDto.setShopStr(loginID);
			if(logIDDtos.contains(sDto)) {
				bl=true;
			}
			IDIndexOf=logIDDtos.indexOf(sDto);
			return bl;
		}
	}
	
	//로그인 - PW
	public boolean loginPW(String loginPW, List<ShopDto> logPWDtos) {
		boolean bl=false;
		while(true) {
			ShopDto sDto=new ShopDto();
			sDto.setShopStr(loginPW);
			if(logPWDtos.get(IDIndexOf).equals(sDto)) {
				bl=true;
			}
			return bl;
		}
	}
	
	//회원가입 - 중복ID체크
	public boolean checkUserID(String loginID, List<ShopDto> logIDDtos) {
		boolean bl=false;
		while(true) {
			ShopDto sDto=new ShopDto();
			sDto.setShopStr(loginID);
			if(!logIDDtos.contains(sDto)) {
				bl=true;
			}
			return bl;
		}
		
	}
	
	//회원가입 - ID생성
	public void addUserID(String loginID, List<ShopDto> logIDDtos) {
		ShopDto sDto=new ShopDto();
		sDto.setShopStr(loginID);
		logIDDtos.add(sDto);
	}
	
	//회원가입 - PW생성
	public void addUserPW(String loginPW, List<ShopDto> logPWDtos) {
		ShopDto sDto=new ShopDto();
		sDto.setShopStr(loginPW);
		logPWDtos.add(sDto);
	}
	
	//마이페이지 - 비밀번호 변경
	public void updateUserPW(String loginID, String loginPW, List<ShopDto> logIDDtos, List<ShopDto> logPWDtos) {
		ShopDto sDto=new ShopDto();
		sDto.setShopStr(loginID);
		IDIndexOf=logIDDtos.indexOf(sDto);
		ShopDto newPWDto=new ShopDto();
		newPWDto.setShopStr(loginPW);
		logPWDtos.set(IDIndexOf, newPWDto);
	}
	
	//마이페이지 - 회원탈퇴
	public void deleteUser(String loginID, List<ShopDto> logIDDtos, List<ShopDto> logPWDtos) {
		ShopDto sDto=new ShopDto();
		sDto.setShopStr(loginID);
		IDIndexOf=logIDDtos.indexOf(sDto);
		logPWDtos.remove(IDIndexOf);
		logIDDtos.remove(IDIndexOf);
	}
	
	

}
