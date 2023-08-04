package com.xworkz.market;
import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {public static void main(String[] args) {
	SuperMarket market = new SuperMarket();
	market.sell();
	market.buy();
	
	OnlineMarket onlinemarket = new OnlineMarket();
	onlinemarket.buy();
}


}
