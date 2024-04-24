package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import dto.ShopDto;

public class FileReadWrite {
	
	//불러오기
	public void getRepoFile(File file, List<ShopDto> shopDtos) {
		try {
			BufferedReader feedBR=new BufferedReader(new FileReader(file));
			
			String line;
			while((line=feedBR.readLine())!=null) {
				ShopDto sDtos=new ShopDto();
				sDtos.setShopStr(line);
				shopDtos.add(sDtos);
			}
			feedBR.close();
		} catch (FileNotFoundException e) {
			System.out.println("카테고리에 등록된 상품이 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//저장하기
	public void putRepoFile(File file, List<ShopDto> shopDtos) {
		try {
			BufferedWriter feedBW=new BufferedWriter(new FileWriter(file));
			
			for(int i=0;i<shopDtos.size();i++) {
				ShopDto arr=shopDtos.get(i);
				String str=arr.toString();
				feedBW.write(str);
				feedBW.newLine();
			}
			feedBW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}






















