package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void check(String[] keyword) {
 HashMap<String,String> dic = new HashMap<String,String>();
 
   dic.put("apple","りんご");
   dic.put("peach","桃");
   dic.put("banana","バナナ");
   dic.put("lemon","レモン");
   dic.put("pear","梨");
   dic.put("kiwi","キウィ");
   dic.put("strawberry","いちご");
   dic.put("grape","ぶどう");
   dic.put("muscat","マスカット");
   dic.put("cherry","さくらんぼ");
   
   for(String word : keyword) {
	   
	   String mean = dic.get(word);
	   
	  
   
   if( mean == null) {
	   System.out.println(word+"は辞書に登録されていません");
   }
   else {System.out.println(word+"の意味は"+mean);}
   }
 }
}
