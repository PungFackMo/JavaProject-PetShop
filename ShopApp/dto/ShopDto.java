package dto;

import java.util.Objects;

public class ShopDto {
	private String shopStr;

	public String getShopStr() {
		return shopStr;
	}

	public void setShopStr(String shopStr) {
		this.shopStr = shopStr;
	}

	@Override
	public String toString() {
		return shopStr;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    ShopDto other = (ShopDto) obj;
	    return Objects.equals(this.shopStr, other.shopStr);
	}

}
