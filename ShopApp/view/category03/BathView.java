package view.category03;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class BathView extends MainView{
	
	public void getBaTowel(List<ShopDto> towelDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　타올/기타　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, towelDtos);
		}
	
	public void getBaShamRin(List<ShopDto> shamRinDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		샴푸린스겸용		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, shamRinDtos);
		}
	
	public void getBaShampoo(List<ShopDto> shampooDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　샴푸　　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, shampooDtos);
		}
}
