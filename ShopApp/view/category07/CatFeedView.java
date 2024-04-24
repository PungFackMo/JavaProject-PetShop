package view.category07;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class CatFeedView extends MainView{
	
	public void getCatFeed(List<ShopDto> catFeedDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		고양이　사료		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, catFeedDtos);
		}
}
