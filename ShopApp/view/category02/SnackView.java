package view.category02;

import java.util.List;

import dto.ShopDto;
import view.MainView;

public class SnackView extends MainView{
	
	public void getSnCateGum(List<ShopDto> gumDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　　껌　　　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, gumDtos);
		}
	
	public void getSnCateCan(List<ShopDto> canDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		　캔/통조림　		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, canDtos);
		}
	
	public void getSnCateBigSasami(List<ShopDto> bigSasamiDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		육포사사미(대용량)		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, bigSasamiDtos);
		}
	
	public void getSnCateSmallSasami(List<ShopDto> smallSasamiDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		육포사사미(소용량)		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, smallSasamiDtos);
		}
	
	public void getSnCateSausage(List<ShopDto> sausageDtos, List<ShopDto> cartDtos) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		소세지/습식간식		\n");
		buy.buyThings(buyIndex, choice, buyCnt, strArr, cartDtos, sausageDtos);
		}
}
