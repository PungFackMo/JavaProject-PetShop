package view.category08;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class CatSnackView extends MainView{
	
	public void getCatSnDrops(List<ShopDto> snDropsDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		스냅&드롭스		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, snDropsDtos);
		}
	
	public void getCatSnMeat(List<ShopDto> meatDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, meatDtos);
		System.out.println("		통살&닭가슴살		\n");
		}
}
