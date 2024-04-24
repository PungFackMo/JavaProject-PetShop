package view.category01;

import java.util.List;

import dto.ShopDto;
import view.MainView;


public class FeedView extends MainView{
	
	public void getFeedCate(List<ShopDto> feedDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　사료　　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, feedDtos);
		}
}
