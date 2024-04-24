package service;

import java.util.List;

import dto.ShopDto;

public interface ShopService {
	
	void getRepoFile();
	
	void putRepoFile();
	
	void putUserData();
	
	//로그인DB
	List<ShopDto> logIDDtos();
	List<ShopDto> logPWDtos();
	
	//장바구니DB
	List<ShopDto> cartDtos();
	
	//사료DB
	List<ShopDto> feedDtos();
	
	//간식DB
	List<ShopDto> gumDtos();
	List<ShopDto> canDtos();
	List<ShopDto> bigSasamiDtos();
	List<ShopDto> smallSasamiDtos();
	List<ShopDto> sausageDtos();

	//목욕용품DB
	List<ShopDto> towelDtos();
	List<ShopDto> shamRinDtos();
	List<ShopDto> shampooDtos();
	
	//종합영양제DB
	List<ShopDto> supplDtos();
	
	//위생/배변/패드DB
	List<ShopDto> pottyPadDtos();
	List<ShopDto> diaperDtos();
	
	//급식기/급수기DB
	List<ShopDto> feederDtos();
	List<ShopDto> twinFeederDtos();
	List<ShopDto> feedStorageDtos();
	
	//고양이 사료DB
	List<ShopDto> catFeedDtos();
	
	//고양이 간식DB
	List<ShopDto> snDropsDtos();
	List<ShopDto> meatDtos();
	
	//모래/화장실/식기DB
	List<ShopDto> catSandDtos();
	List<ShopDto> catToiletDtos();
	List<ShopDto> catFeederDtos();
	List<ShopDto> catTwinFeederDtos();
	
	
	
	
	
	
	
	
}
