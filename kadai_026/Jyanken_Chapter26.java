package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
 Scanner scanner = new Scanner(System.in);
 String input = scanner.next();
 System.out.println(input);
 if("r".equals(input)||"s".equals(input)||"p".equals(input)) {
 scanner.close();
 return input;
	}
 else {
	 System.out.println("正しい手を入力してください");
	 return getMyChoice();
 }
	}
	public String getRandom() {
		String [] janken = {"r","s","p"};
		int enemy =(int) Math.floor(Math.random()*3);
	switch(enemy) {
	case 0:
		return janken[0];
	case 1:
		return janken[1];
	case 2:
		return janken[2];
		default:
			return "";
		}
	
	
	}
	public void playGame(){
		HashMap<String,String>janMap = new HashMap<String,String>();
		janMap.put("r","グー");
		janMap.put("s","チョキ");
		janMap.put("p","パー");
		String my = new String(getMyChoice());
		String enemy = new String(getRandom());
		System.out.println("自分の手は"+janMap.get(my)+",対戦相手の手は"+janMap.get(enemy));
		
		
		if(my.equals(enemy)) {
			System.out.println("あいこです");
		}
		else if(my=="グー"&&enemy=="チョキ"||my=="チョキ"&&enemy=="パー"||my=="パー"&&enemy=="グー") {
			System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
	}
}
