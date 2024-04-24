package view.category05;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class PottyPadView extends MainView{
	
	public void getPottyPad(List<ShopDto> PottyPadDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		배변판/패드			\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, PottyPadDtos);
		}
	
	public void getDiaper(List<ShopDto> diaperDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		기저귀/팬티			\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, diaperDtos);
		}
}
