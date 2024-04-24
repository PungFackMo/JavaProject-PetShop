package view.category04;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class SupplementsView extends MainView{
	
	public void getSupplements(List<ShopDto> supplDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		종합　영양제		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, supplDtos);
		}
}
