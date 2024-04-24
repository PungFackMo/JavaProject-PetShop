package service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import dto.ShopDto;

public class ShopRepoFile implements ShopService{
	
	FileReadWrite fRW=new FileReadWrite();
	
	//장바구니DB
	List<ShopDto> cartDtos=new ArrayList<>();
	
	//사료DB
	File feedFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\feed\\feed.txt");
	List<ShopDto> feedDtos=new ArrayList<>();
	
	//간식DB
	File gumFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\snack\\gum.txt");
	File canFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\snack\\can.txt");
	File bigSasamiFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\snack\\bigSasami.txt");
	File smallSasamiFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\snack\\smallSasami.txt");
	File sausageFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\snack\\sausage.txt");
	List<ShopDto> gumDtos=new ArrayList<>();
	List<ShopDto> canDtos=new ArrayList<>();
	List<ShopDto> bigSasamiDtos=new ArrayList<>();
	List<ShopDto> smallSasamiDtos=new ArrayList<>();
	List<ShopDto> sausageDtos=new ArrayList<>();

	//목욕용품DB
	File towelFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\bath\\towel.txt");
	File shamRinFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\bath\\shamRin.txt");
	File shampooFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\bath\\shampoo.txt");
	List<ShopDto> towelDtos=new ArrayList<>();
	List<ShopDto> shamRinDtos=new ArrayList<>();
	List<ShopDto> shampooDtos=new ArrayList<>();
	
	//목욕용품DB
	File supplFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\supplements\\supplements.txt");
	List<ShopDto> supplDtos=new ArrayList<>();
	
	//위생/배변/패드DB
	File pottyPadFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\pottyPad\\pottyPad.txt");
	File diaperFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\pottyPad\\diaper.txt");
	List<ShopDto> pottyPadDtos=new ArrayList<>();
	List<ShopDto> diaperDtos=new ArrayList<>();

	//급식기/급수기DB
	File feederFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\feeder\\feeder.txt");
	File twinFeederFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\feeder\\twinFeeder.txt");
	File feedStorageFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\feeder\\feedStorage.txt");
	List<ShopDto> feederDtos=new ArrayList<>();
	List<ShopDto> twinFeederDtos=new ArrayList<>();
	List<ShopDto> feedStorageDtos=new ArrayList<>();

	//고양이 사료DB
	File catFeedFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catFeed\\catFeed.txt");
	List<ShopDto> catFeedDtos=new ArrayList<>();

	//고양이 간식DB
	File snDropsFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catSnack\\snDrops.txt");
	File meatFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catSnack\\meat.txt");
	List<ShopDto> snDropsDtos=new ArrayList<>();
	List<ShopDto> meatDtos=new ArrayList<>();
	
	//모래/화장실/식기DB
	File catSandFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catsOf\\catSand.txt");
	File catToiletFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catsOf\\catToilet.txt");
	File catFeederFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catsOf\\catFeeder.txt");
	File catTwinFeederFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\catsOf\\catTwinFeeder.txt");
	List<ShopDto> catSandDtos=new ArrayList<>();
	List<ShopDto> catToiletDtos=new ArrayList<>();
	List<ShopDto> catFeederDtos=new ArrayList<>();
	List<ShopDto> catTwinFeederDtos=new ArrayList<>();

	//로그인 저장소
	File logIDFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\login\\ID.txt");
	File logPWFile=new File("C:\\Users\\ITPS\\Documents\\dev\\java\\workspace\\ShopApp\\src\\service\\fileRepo\\login\\PW.txt");
	List<ShopDto> logIDDtos=new ArrayList<>();
	List<ShopDto> logPWDtos=new ArrayList<>();
	

	
	
	
	@Override
	public void putUserData() {
		fRW.putRepoFile(logIDFile, logIDDtos);
		fRW.putRepoFile(logPWFile, logPWDtos);
	}
	
	@Override
	public void getRepoFile() {
		//사료DB
		fRW.getRepoFile(feedFile, feedDtos);
		//간식DB
		fRW.getRepoFile(gumFile, gumDtos);
		fRW.getRepoFile(canFile, canDtos);
		fRW.getRepoFile(bigSasamiFile, bigSasamiDtos);
		fRW.getRepoFile(smallSasamiFile, smallSasamiDtos);
		fRW.getRepoFile(sausageFile, sausageDtos);
		//목욕용품DB
		fRW.getRepoFile(towelFile, towelDtos);
		fRW.getRepoFile(shamRinFile, shamRinDtos);
		fRW.getRepoFile(shampooFile, shampooDtos);
		//종합영양제DB
		fRW.getRepoFile(supplFile, supplDtos);
		//위생/배변/패드DB
		fRW.getRepoFile(pottyPadFile, pottyPadDtos);
		fRW.getRepoFile(diaperFile, diaperDtos);
		//급식기/급수기DB
		fRW.getRepoFile(feederFile, feederDtos);
		fRW.getRepoFile(twinFeederFile, twinFeederDtos);
		fRW.getRepoFile(feedStorageFile, feedStorageDtos);
		//고양이 사료DB
		fRW.getRepoFile(catFeedFile, catFeedDtos);
		//고양이 간식DB
		fRW.getRepoFile(snDropsFile, snDropsDtos);
		fRW.getRepoFile(meatFile, meatDtos);
		//모래/화장실/식기DB
		fRW.getRepoFile(catSandFile, catSandDtos);
		fRW.getRepoFile(catToiletFile, catToiletDtos);
		fRW.getRepoFile(catFeederFile, catFeederDtos);
		fRW.getRepoFile(catTwinFeederFile, catTwinFeederDtos);
		//로그인DB
		fRW.getRepoFile(logIDFile, logIDDtos);
		fRW.getRepoFile(logPWFile, logPWDtos);
	}

	@Override
	public void putRepoFile() {
		//사료DB
		fRW.putRepoFile(feedFile, feedDtos);
		//간식DB
		fRW.putRepoFile(gumFile, gumDtos);
		fRW.putRepoFile(canFile, canDtos);
		fRW.putRepoFile(bigSasamiFile, bigSasamiDtos);
		fRW.putRepoFile(smallSasamiFile, smallSasamiDtos);
		fRW.putRepoFile(sausageFile, sausageDtos);
		//목욕용품DB
		fRW.putRepoFile(towelFile, towelDtos);
		fRW.putRepoFile(shamRinFile, shamRinDtos);
		fRW.putRepoFile(shampooFile, shampooDtos);
		//종합영양제DB
		fRW.putRepoFile(supplFile, supplDtos);
		//위생/배변/패드DB
		fRW.putRepoFile(pottyPadFile, pottyPadDtos);
		fRW.putRepoFile(diaperFile, diaperDtos);
		//급식기/급수기DB
		fRW.putRepoFile(feederFile, feederDtos);
		fRW.putRepoFile(twinFeederFile, twinFeederDtos);
		fRW.putRepoFile(feedStorageFile, feedStorageDtos);
		//고양이 사료DB
		fRW.putRepoFile(catFeedFile, catFeedDtos);
		//고양이 간식DB
		fRW.putRepoFile(snDropsFile, snDropsDtos);
		fRW.putRepoFile(meatFile, meatDtos);
	}
	
	@Override
	public List<ShopDto> logIDDtos() {
		return logIDDtos;
	}
	
	@Override
	public List<ShopDto> logPWDtos() {
		return logPWDtos;
	}
	
	@Override
	public List<ShopDto> cartDtos() {
		return cartDtos;
	}
	
	@Override
	public List<ShopDto> feedDtos() {
		return feedDtos;
	}

	@Override
	public List<ShopDto> gumDtos() {
		return gumDtos;
	}

	@Override
	public List<ShopDto> canDtos() {
		return canDtos;
	}

	@Override
	public List<ShopDto> bigSasamiDtos() {
		return bigSasamiDtos;
	}
	
	@Override
	public List<ShopDto> smallSasamiDtos() {
		return smallSasamiDtos;
	}

	@Override
	public List<ShopDto> sausageDtos() {
		return sausageDtos;
	}

	@Override
	public List<ShopDto> towelDtos() {
		return towelDtos;
	}

	@Override
	public List<ShopDto> shamRinDtos() {
		return shamRinDtos;
	}

	@Override
	public List<ShopDto> shampooDtos() {
		return shampooDtos;
	}

	@Override
	public List<ShopDto> supplDtos() {
		return supplDtos;
	}

	@Override
	public List<ShopDto> pottyPadDtos() {
		return pottyPadDtos;
	}

	@Override
	public List<ShopDto> diaperDtos() {
		return diaperDtos;
	}

	@Override
	public List<ShopDto> feederDtos() {
		return feederDtos;
	}

	@Override
	public List<ShopDto> twinFeederDtos() {
		return twinFeederDtos;
	}

	@Override
	public List<ShopDto> feedStorageDtos() {
		return feedStorageDtos;
	}

	@Override
	public List<ShopDto> catFeedDtos() {
		return catFeedDtos;
	}

	@Override
	public List<ShopDto> snDropsDtos() {
		return snDropsDtos;
	}

	@Override
	public List<ShopDto> meatDtos() {
		return meatDtos;
	}

	@Override
	public List<ShopDto> catSandDtos() {
		return catSandDtos;
	}

	@Override
	public List<ShopDto> catToiletDtos() {
		return catToiletDtos;
	}

	@Override
	public List<ShopDto> catFeederDtos() {
		return catFeederDtos;
	}

	@Override
	public List<ShopDto> catTwinFeederDtos() {
		return catTwinFeederDtos;
	}





	

}
