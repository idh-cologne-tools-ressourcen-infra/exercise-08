package de.ukoeln.idh.teaching.tri.ex08;

import java.util.Map;
import java.util.TreeMap;

public class Tree extends Document{
	public static void main(String[] args) {
		
		Map<String, Integer> phoneBook = new TreeMap<>();
		
		phoneBook.put("dog", 3);
		phoneBook.put("be", -1);
		phoneBook.put("feed", 1);
		phoneBook.put("by", 3);
		phoneBook.put("mister", 4);
		phoneBook.put("parker", 4);
		phoneBook.put("who", 6);
		phoneBook.put("wear", 7);
		phoneBook.put("a", 11);
		phoneBook.put("yellow", 11);
		phoneBook.put("hat", 8);

		for (String key: phoneBook.keySet()) {
		System.out.println("-" + key);
		}
	}
}
