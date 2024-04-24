package view.category06;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class FeederView extends MainView{
	
	public void getFeeder(List<ShopDto> feederDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		급식기/급수기		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, feederDtos);
	}

	public void getTwinFeeder(List<ShopDto> twinFeederDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　쌍식기　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, twinFeederDtos);
		}
	
	public void getFeedStorage(List<ShopDto> feedStorageDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		사료　보관통		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, feedStorageDtos);
		}
}
