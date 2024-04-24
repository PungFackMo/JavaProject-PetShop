package view.category09;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class CatsOf extends MainView{
	
	public void getCatSand(List<ShopDto> catSandDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　모래　　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, catSandDtos);
		}
	
	public void getCatToilet(List<ShopDto> catToiletDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　화장실　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, catToiletDtos);
		}
	public void getCatFeeder(List<ShopDto> catFeederDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		급식기/급수기		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, catFeederDtos);
		}
	
	public void getCatTwinFeeder(List<ShopDto> catTwinFeederDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　쌍식기　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, catTwinFeederDtos);
		}
}
