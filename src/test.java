import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		check("1.2,2.2", "2.2,1.2");
		
		check("3.2,8.2", "1.2,8.2");
		
		// int x[] = new int[4];
		// int y[] = new int[4];
		// Random random = new Random();
		// for (int i = 0; i < x.length; i++) {
		// x[i] = random.nextInt(10)+1;
		// y[i] = random.nextInt(2)+1;
		// for(int a = 0; a < i;a++){
		// if(x[i] == x[a] && y[i] == y[a])
		// i--;
		// }
		// }
		//
		// for(int i = 0; i < 4; i ++) {
		// System.out.println(x[i] + ", " +y[i]);
		// }
		// check("x[0].y[0]",)
		//
	}

	public static void check(String user1, String user2) {
		Map<String, CardVO> resultMap = new HashMap<String, CardVO>();
		// 堡动
		resultMap.put("3.2,8.2", new CardVO("38堡动", 1));
		resultMap.put("1.2,8.2", new CardVO("堡动", 2));
		resultMap.put("1.2,3.2", new CardVO("堡动", 3));
		// 动
		resultMap.put("10.1,10.2", new CardVO("厘动", 4));
		resultMap.put("9.1,9.2", new CardVO("备动", 5));
		resultMap.put("8.1,8.2", new CardVO("迫动", 6));
		resultMap.put("7.1,7.2", new CardVO("磨动", 7));
		resultMap.put("6.1,6.2", new CardVO("腊动", 8));
		resultMap.put("5.1,5.2", new CardVO("坷动", 9));
		resultMap.put("4.1,4.2", new CardVO("荤动", 10));
		resultMap.put("3.1,3.2", new CardVO("伙动", 11));
		resultMap.put("2.1,2.2", new CardVO("捞动", 12));
		resultMap.put("1.1,1.2", new CardVO("老动", 13));

		// 舅府
		resultMap.put("1.2,2.2", new CardVO("舅府", 14));
		resultMap.put("2.2,1.2", new CardVO("舅府", 14));

		resultMap.put("1.2,2.1", new CardVO("舅府", 15));
		resultMap.put("2.1,1.2", new CardVO("舅府", 15));

		resultMap.put("1.1,2.2", new CardVO("舅府", 16));
		resultMap.put("2.2,1.1", new CardVO("舅府", 16));

		resultMap.put("1.1,2.1", new CardVO("舅府", 17));
		resultMap.put("2.1,1.1", new CardVO("舅府", 17));

		// 刀荤
		resultMap.put("1.2,4.2", new CardVO("刀荤", 18));
		resultMap.put("4.2,1.2", new CardVO("刀荤", 18));

		resultMap.put("1.2,4.1", new CardVO("刀荤", 19));
		resultMap.put("4.1,1.2", new CardVO("刀荤", 19));

		resultMap.put("1.1,4.2", new CardVO("刀荤", 20));
		resultMap.put("4.2,1.1", new CardVO("刀荤", 20));

		resultMap.put("1.1,4.1", new CardVO("刀荤", 21));
		resultMap.put("4.1,1.1", new CardVO("刀荤", 21));

		// 备绘
		resultMap.put("1.2,9.2", new CardVO("备绘", 22));
		resultMap.put("9.2,1.2", new CardVO("备绘", 22));

		resultMap.put("1.2,9.1", new CardVO("备绘", 23));
		resultMap.put("9.1,1.2", new CardVO("备绘", 23));

		resultMap.put("1.1,9.2", new CardVO("备绘", 24));
		resultMap.put("9.2,1.1", new CardVO("备绘", 24));

		resultMap.put("1.1,9.1", new CardVO("备绘", 25));
		resultMap.put("9.1,1.1", new CardVO("备绘", 25));

		// 厘绘
		resultMap.put("1.2,10.2", new CardVO("厘绘", 26));
		resultMap.put("10.2,1.2", new CardVO("厘绘", 26));

		resultMap.put("1.2,10.1", new CardVO("厘绘", 27));
		resultMap.put("10.1,1.2", new CardVO("厘绘", 27));

		resultMap.put("1.1,10.2", new CardVO("厘绘", 28));
		resultMap.put("10.2,1.1", new CardVO("厘绘", 28));

		resultMap.put("1.1,10.1", new CardVO("厘绘", 29));
		resultMap.put("10.1,1.1", new CardVO("厘绘", 29));

		// 厘荤
		resultMap.put("4.2,10.2", new CardVO("厘荤", 30));
		resultMap.put("10.2,4.2", new CardVO("厘荤", 30));

		resultMap.put("4.2,10.1", new CardVO("厘荤", 31));
		resultMap.put("10.1,4.2", new CardVO("厘荤", 31));

		resultMap.put("4.1,10.2", new CardVO("厘荤", 32));
		resultMap.put("10.2,4.1", new CardVO("厘荤", 32));

		resultMap.put("4.1,10.1", new CardVO("厘荤", 33));
		resultMap.put("10.1,4.1", new CardVO("厘荤", 33));

		// 技氟
		resultMap.put("4.2,6.2", new CardVO("技氟", 34));
		resultMap.put("6.2,4.2", new CardVO("技氟", 34));

		resultMap.put("4.2,6.1", new CardVO("技氟", 35));
		resultMap.put("6.1,4.2", new CardVO("技氟", 35));

		resultMap.put("4.1,6.2", new CardVO("技氟", 36));
		resultMap.put("6.2,4.1", new CardVO("技氟", 36));

		resultMap.put("4.1,6.1", new CardVO("技氟", 37));
		resultMap.put("6.1,4.1", new CardVO("技氟", 37));

		// 备场(1,8)
//		resultMap.put("1.2,8.2", new CardVO("备场", 38));
//		resultMap.put("8.2,1.2", new CardVO("备场", 38));

		resultMap.put("1.2,8.1", new CardVO("备场", 39));
		resultMap.put("8.1,1.2", new CardVO("备场", 39));

		resultMap.put("1.1,8.2", new CardVO("备场", 40));
		resultMap.put("8.2,1.1", new CardVO("备场", 40));

		resultMap.put("1.1,8.1", new CardVO("备场", 41));
		resultMap.put("8.1,1.1", new CardVO("备场", 41));

		// 备场(2,7)
		resultMap.put("2.2,7.2", new CardVO("备场", 42));
		resultMap.put("7.2,2.2", new CardVO("备场", 42));

		resultMap.put("2.2,7.1", new CardVO("备场", 43));
		resultMap.put("7.1,2.2", new CardVO("备场", 43));

		resultMap.put("2.1,7.2", new CardVO("备场", 44));
		resultMap.put("7.2,2.1", new CardVO("备场", 44));

		resultMap.put("2.1,7.1", new CardVO("备场", 45));
		resultMap.put("7.1,2.1", new CardVO("备场", 45));

		// 备场(3,6)
		resultMap.put("3.2,6.2", new CardVO("备场", 46));
		resultMap.put("6.2,3.2", new CardVO("备场", 46));

		resultMap.put("3.2,6.1", new CardVO("备场", 47));
		resultMap.put("6.1,3.2", new CardVO("备场", 47));

		resultMap.put("3.1,6.2", new CardVO("备场", 48));
		resultMap.put("6.2,3.1", new CardVO("备场", 48));

		resultMap.put("3.1,6.1", new CardVO("备场", 49));
		resultMap.put("6.1,3.1", new CardVO("备场", 49));

		// 备场(4,5)
		resultMap.put("4.2,5.2", new CardVO("备场", 50));
		resultMap.put("5.2,4.2", new CardVO("备场", 50));

		resultMap.put("4.2,5.1", new CardVO("备场", 51));
		resultMap.put("5.1,4.2", new CardVO("备场", 51));

		resultMap.put("4.1,5.2", new CardVO("备场", 52));
		resultMap.put("5.2,4.1", new CardVO("备场", 52));

		resultMap.put("4.1,5.1", new CardVO("备场", 53));
		resultMap.put("5.1,4.1", new CardVO("备场", 53));

		// 备场(9,10)
		resultMap.put("9.2,10.2", new CardVO("备场", 54));
		resultMap.put("10.2,9.2", new CardVO("备场", 54));

		resultMap.put("9.2,10.1", new CardVO("备场", 55));
		resultMap.put("10.1,9.2", new CardVO("备场", 55));

		resultMap.put("9.1,10.2", new CardVO("备场", 56));
		resultMap.put("10.2,9.1", new CardVO("备场", 56));

		resultMap.put("9.1,10.1", new CardVO("备场", 57));
		resultMap.put("10.1,9.1", new CardVO("备场", 57));

		// 迫场(1,7)
		resultMap.put("1.2,7.2", new CardVO("迫场", 58));
		resultMap.put("7.2,1.2", new CardVO("迫场", 58));

		resultMap.put("1.2,7.1", new CardVO("迫场", 59));
		resultMap.put("7.1,1.2", new CardVO("迫场", 59));

		resultMap.put("1.1,7.2", new CardVO("迫场", 60));
		resultMap.put("7.2,1.1", new CardVO("迫场", 60));

		resultMap.put("1.1,7.1", new CardVO("迫场", 61));
		resultMap.put("7.1,1.1", new CardVO("迫场", 61));

		// 迫场(2,6)
		resultMap.put("2.2,6.2", new CardVO("迫场", 62));
		resultMap.put("6.2,2.2", new CardVO("迫场", 62));

		resultMap.put("2.2,6.1", new CardVO("迫场", 63));
		resultMap.put("6.1,2.2", new CardVO("迫场", 63));

		resultMap.put("2.1,6.2", new CardVO("迫场", 64));
		resultMap.put("6.2,2.1", new CardVO("迫场", 64));

		resultMap.put("2.1,6.1", new CardVO("迫场", 65));
		resultMap.put("6.1,2.1", new CardVO("迫场", 65));

		// 迫场(3,5)
		resultMap.put("3.2,5.2", new CardVO("迫场", 66));
		resultMap.put("5.2,3.2", new CardVO("迫场", 66));

		resultMap.put("3.2,5.1", new CardVO("迫场", 67));
		resultMap.put("5.1,3.2", new CardVO("迫场", 67));

		resultMap.put("3.1,5.2", new CardVO("迫场", 68));
		resultMap.put("5.2,3.1", new CardVO("迫场", 68));

		resultMap.put("3.1,5.1", new CardVO("迫场", 69));
		resultMap.put("5.1,3.1", new CardVO("迫场", 69));

		// 迫场(8,10)
		resultMap.put("8.2,10.2", new CardVO("迫场", 70));
		resultMap.put("10.2,8.2", new CardVO("迫场", 70));

		resultMap.put("8.2,10.1", new CardVO("迫场", 71));
		resultMap.put("10.1,8.2", new CardVO("迫场", 71));

		resultMap.put("8.1,10.2", new CardVO("迫场", 72));
		resultMap.put("10.2,8.1", new CardVO("迫场", 72));

		resultMap.put("8.1,10.1", new CardVO("迫场", 73));
		resultMap.put("10.1,8.1", new CardVO("迫场", 73));

		// 磨场(1,6)
		resultMap.put("1.2,6.2", new CardVO("磨场", 74));
		resultMap.put("6.2,1.2", new CardVO("磨场", 74));

		resultMap.put("1.2,6.1", new CardVO("磨场", 75));
		resultMap.put("6.1,1.2", new CardVO("磨场", 75));

		resultMap.put("1.1,6.2", new CardVO("磨场", 76));
		resultMap.put("6.2,1.1", new CardVO("磨场", 76));

		resultMap.put("1.1,6.1", new CardVO("磨场", 77));
		resultMap.put("6.1,1.1", new CardVO("磨场", 77));

		// 磨场(2,5)
		resultMap.put("2.2,5.2", new CardVO("磨场", 78));
		resultMap.put("5.2,2.2", new CardVO("磨场", 78));

		resultMap.put("2.2,5.1", new CardVO("磨场", 79));
		resultMap.put("5.1,2.2", new CardVO("磨场", 79));

		resultMap.put("2.1,5.2", new CardVO("磨场", 80));
		resultMap.put("5.2,2.1", new CardVO("磨场", 80));

		resultMap.put("2.1,5.1", new CardVO("磨场", 81));
		resultMap.put("5.1,2.1", new CardVO("磨场", 81));

		// 磨场(3,4)
		resultMap.put("3.2,4.2", new CardVO("磨场", 82));
		resultMap.put("4.2,3.2", new CardVO("磨场", 82));

		resultMap.put("3.2,4.1", new CardVO("磨场", 83));
		resultMap.put("4.1,3.2", new CardVO("磨场", 83));

		resultMap.put("3.1,4.2", new CardVO("磨场", 84));
		resultMap.put("4.2,3.1", new CardVO("磨场", 84));

		resultMap.put("3.1,4.1", new CardVO("磨场", 85));
		resultMap.put("4.1,3.1", new CardVO("磨场", 85));

		// 磨场(7,10)
		resultMap.put("7.2,10.2", new CardVO("磨场", 86));
		resultMap.put("10.2,7.2", new CardVO("磨场", 86));

		resultMap.put("7.2,10.1", new CardVO("磨场", 87));
		resultMap.put("10.1,7.2", new CardVO("磨场", 87));

		resultMap.put("7.1,10.2", new CardVO("磨场", 88));
		resultMap.put("10.2,7.1", new CardVO("磨场", 88));

		resultMap.put("7.1,10.1", new CardVO("磨场", 89));
		resultMap.put("10.1,7.1", new CardVO("磨场", 89));

		// 磨场(8,9)
		resultMap.put("8.2,9.2", new CardVO("磨场", 90));
		resultMap.put("9.2,8.2", new CardVO("磨场", 90));

		resultMap.put("8.2,9.1", new CardVO("磨场", 91));
		resultMap.put("9.1,8.2", new CardVO("磨场", 91));

		resultMap.put("8.1,9.2", new CardVO("磨场", 92));
		resultMap.put("9.2,8.1", new CardVO("磨场", 92));

		resultMap.put("8.1,9.1", new CardVO("磨场", 93));
		resultMap.put("9.1,8.1", new CardVO("磨场", 93));

		// 腊场(1,5)
		resultMap.put("1.2,5.2", new CardVO("腊场", 94));
		resultMap.put("5.2,1.2", new CardVO("腊场", 94));

		resultMap.put("1.2,5.1", new CardVO("腊场", 95));
		resultMap.put("5.1,1.2", new CardVO("腊场", 95));

		resultMap.put("1.1,5.2", new CardVO("腊场", 96));
		resultMap.put("5.2,1.1", new CardVO("腊场", 96));

		resultMap.put("1.1,5.1", new CardVO("腊场", 97));
		resultMap.put("5.1,1.1", new CardVO("腊场", 97));

		// 腊场(2,4)
		resultMap.put("2.2,4.2", new CardVO("腊场", 98));
		resultMap.put("4.2,2.2", new CardVO("腊场", 98));

		resultMap.put("2.2,4.1", new CardVO("腊场", 99));
		resultMap.put("4.1,2.2", new CardVO("腊场", 9));

		resultMap.put("2.1,4.2", new CardVO("腊场", 100));
		resultMap.put("4.2,2.1", new CardVO("腊场", 100));

		resultMap.put("2.1,4.1", new CardVO("腊场", 101));
		resultMap.put("4.1,2.1", new CardVO("腊场", 101));

		// 腊场(6,10)
		resultMap.put("6.2,10.2", new CardVO("腊场", 102));
		resultMap.put("10.2,6.2", new CardVO("腊场", 102));

		resultMap.put("6.2,10.1", new CardVO("腊场", 103));
		resultMap.put("10.1,6.2", new CardVO("腊场", 103));

		resultMap.put("6.1,10.2", new CardVO("腊场", 104));
		resultMap.put("10.2,6.1", new CardVO("腊场", 104));

		resultMap.put("6.1,10.1", new CardVO("腊场", 105));
		resultMap.put("10.1,6.1", new CardVO("腊场", 105));

		// 腊场(7,9)
		resultMap.put("7.2,9.2", new CardVO("腊场", 106));
		resultMap.put("9.2,7.2", new CardVO("腊场", 106));

		resultMap.put("7.2,9.1", new CardVO("腊场", 107));
		resultMap.put("9.1,7.2", new CardVO("腊场", 107));

		resultMap.put("7.1,9.2", new CardVO("腊场", 108));
		resultMap.put("9.2,7.1", new CardVO("腊场", 108));

		resultMap.put("7.1,9.1", new CardVO("腊场", 109));
		resultMap.put("9.1,7.1", new CardVO("腊场", 109));

		// 坷场(2,3)
		resultMap.put("2.2,3.2", new CardVO("坷场", 110));
		resultMap.put("3.2,2.2", new CardVO("坷场", 110));

		resultMap.put("2.2,3.1", new CardVO("坷场", 111));
		resultMap.put("3.1,2.2", new CardVO("坷场", 111));

		resultMap.put("2.1,3.2", new CardVO("坷场", 112));
		resultMap.put("3.2,2.1", new CardVO("坷场", 112));

		resultMap.put("2.1,3.1", new CardVO("坷场", 113));
		resultMap.put("3.1,2.1", new CardVO("坷场", 113));

		// 坷场(5,10)
		resultMap.put("5.2,10.2", new CardVO("坷场", 114));
		resultMap.put("10.2,5.2", new CardVO("坷场", 114));

		resultMap.put("5.2,10.1", new CardVO("坷场", 115));
		resultMap.put("10.1,5.2", new CardVO("坷场", 115));

		resultMap.put("5.1,10.2", new CardVO("坷场", 116));
		resultMap.put("10.2,5.1", new CardVO("坷场", 116));

		resultMap.put("5.1,10.1", new CardVO("坷场", 117));
		resultMap.put("10.1,5.1", new CardVO("坷场", 117));

		// 坷场(6,9)
		resultMap.put("6.2,9.2", new CardVO("坷场", 118));
		resultMap.put("9.2,6.2", new CardVO("坷场", 118));

		resultMap.put("6.2,9.1", new CardVO("坷场", 119));
		resultMap.put("9.1,6.2", new CardVO("坷场", 119));

		resultMap.put("6.1,9.2", new CardVO("坷场", 120));
		resultMap.put("9.2,6.1", new CardVO("坷场", 120));

		resultMap.put("6.1,9.1", new CardVO("坷场", 121));
		resultMap.put("9.1,6.1", new CardVO("坷场", 121));

		// 坷场(7,8)
		resultMap.put("7.2,8.2", new CardVO("坷场", 122));
		resultMap.put("8.2,7.2", new CardVO("坷场", 122));

		resultMap.put("7.2,8.1", new CardVO("坷场", 123));
		resultMap.put("8.1,7.2", new CardVO("坷场", 123));

		resultMap.put("7.1,8.2", new CardVO("坷场", 124));
		resultMap.put("8.2,7.1", new CardVO("坷场", 124));

		resultMap.put("7.1,8.1", new CardVO("坷场", 125));
		resultMap.put("8.1,7.1", new CardVO("坷场", 125));

		//荤场(1,3)
//		resultMap.put("1.2,3.2", new CardVO("荤场", 126));
//		resultMap.put("3.2,1.2", new CardVO("荤场", 126));

		resultMap.put("1.2,3.1", new CardVO("荤场", 127));
		resultMap.put("3.1,1.2", new CardVO("荤场", 127));

		resultMap.put("1.1,3.2", new CardVO("荤场", 128));
		resultMap.put("3.2,1.1", new CardVO("荤场", 128));

		resultMap.put("1.1,3.1", new CardVO("荤场", 129));
		resultMap.put("3.1,1.1", new CardVO("荤场", 129));
		
		//荤场(5,9)
		resultMap.put("5.2,9.2", new CardVO("荤场", 130));
		resultMap.put("9.2,5.2", new CardVO("荤场", 130));

		resultMap.put("5.2,9.1", new CardVO("荤场", 131));
		resultMap.put("9.1,5.2", new CardVO("荤场", 131));

		resultMap.put("5.1,9.2", new CardVO("荤场", 132));
		resultMap.put("9.2,5.1", new CardVO("荤场", 132));

		resultMap.put("5.1,9.1", new CardVO("荤场", 133));
		resultMap.put("9.1,5.1", new CardVO("荤场", 133));
		
		//荤场(6,8)
		resultMap.put("6.2,8.2", new CardVO("荤场", 134));
		resultMap.put("8.2,6.2", new CardVO("荤场", 134));

		resultMap.put("6.2,8.1", new CardVO("荤场", 135));
		resultMap.put("8.1,6.2", new CardVO("荤场", 135));

		resultMap.put("6.1,8.2", new CardVO("荤场", 136));
		resultMap.put("8.2,6.1", new CardVO("荤场", 136));

		resultMap.put("6.1,8.1", new CardVO("荤场", 137));
		resultMap.put("8.1,6.1", new CardVO("荤场", 137));
		
		//3场(3,10)
		resultMap.put("3.2,10.2", new CardVO("伙场", 138));
		resultMap.put("10.2,3.2", new CardVO("伙场", 138));

		resultMap.put("3.2,10.1", new CardVO("伙场", 139));
		resultMap.put("10.1,3.2", new CardVO("伙场", 139));
		
		resultMap.put("3.1,10.2", new CardVO("伙场", 140));
		resultMap.put("10.2,3.1", new CardVO("伙场", 140));

		resultMap.put("3.1,10.1", new CardVO("伙场", 141));
		resultMap.put("10.1,3.1", new CardVO("伙场", 141));
		
		//3场(4,9)
		resultMap.put("4.2,9.2", new CardVO("伙场", 142));
		resultMap.put("9.2,4.2", new CardVO("伙场", 142));

		resultMap.put("4.2,9.1", new CardVO("伙场", 143));
		resultMap.put("9.1,4.2", new CardVO("伙场", 143));

		resultMap.put("4.1,9.2", new CardVO("伙场", 144));
		resultMap.put("9.2,4.1", new CardVO("伙场", 144));

		resultMap.put("4.1,9.1", new CardVO("伙场", 145));
		resultMap.put("9.1,4.1", new CardVO("伙场", 145));
		
		//3场(5,8)
		resultMap.put("5.2,8.2", new CardVO("伙场", 146));
		resultMap.put("8.2,5.2", new CardVO("伙场", 146));

		resultMap.put("5.2,8.1", new CardVO("伙场", 147));
		resultMap.put("8.1,5.2", new CardVO("伙场", 147));

		resultMap.put("5.1,8.2", new CardVO("伙场", 148));
		resultMap.put("8.2,5.1", new CardVO("伙场", 148));

		resultMap.put("5.1,8.1", new CardVO("伙场", 149));
		resultMap.put("8.1,5.1", new CardVO("伙场", 149));
		
		//3场(6,7)
		resultMap.put("6.2,7.2", new CardVO("伙场", 150));
		resultMap.put("7.2,6.2", new CardVO("伙场", 150));

		resultMap.put("6.2,7.1", new CardVO("伙场", 151));
		resultMap.put("7.1,6.2", new CardVO("伙场", 151));

		resultMap.put("6.1,7.2", new CardVO("伙场", 152));
		resultMap.put("7.2,6.1", new CardVO("伙场", 152));

		resultMap.put("6.1,7.1", new CardVO("伙场", 153));
		resultMap.put("7.1,6.1", new CardVO("伙场", 153));
		
		//2场(2,10)
		resultMap.put("2.2,10.2", new CardVO("捞场", 154));
		resultMap.put("10.2,2.2", new CardVO("捞场", 154));

		resultMap.put("2.2,10.1", new CardVO("捞场", 155));
		resultMap.put("10.1,2.2", new CardVO("捞场", 155));
		
		resultMap.put("2.1,10.2", new CardVO("捞场", 156));
		resultMap.put("10.2,2.1", new CardVO("捞场", 156));

		resultMap.put("2.1,10.1", new CardVO("捞场", 157));
		resultMap.put("10.1,2.1", new CardVO("捞场", 157));
		
		//2场(3,9)
		resultMap.put("3.2,9.2", new CardVO("捞场", 158));
		resultMap.put("9.2,3.2", new CardVO("捞场", 158));

		resultMap.put("3.2,9.1", new CardVO("捞场", 159));
		resultMap.put("9.1,3.2", new CardVO("捞场", 159));

		resultMap.put("3.1,9.2", new CardVO("捞场", 160));
		resultMap.put("9.2,3.1", new CardVO("捞场", 160));

		resultMap.put("3.1,9.1", new CardVO("捞场", 161));
		resultMap.put("9.1,3.1", new CardVO("捞场", 161));
		
		//2场(4,8)
		resultMap.put("4.2,8.2", new CardVO("捞场", 162));
		resultMap.put("8.2,4.2", new CardVO("捞场", 162));

		resultMap.put("4.2,8.1", new CardVO("捞场", 163));
		resultMap.put("8.1,4.2", new CardVO("捞场", 163));

		resultMap.put("4.1,8.2", new CardVO("捞场", 164));
		resultMap.put("8.2,4.1", new CardVO("捞场", 164));

		resultMap.put("4.1,8.1", new CardVO("捞场", 165));
		resultMap.put("8.1,4.1", new CardVO("捞场", 165));
		
		//2场(5,7)
		resultMap.put("5.2,7.2", new CardVO("捞场", 166));
		resultMap.put("7.2,5.2", new CardVO("捞场", 166));

		resultMap.put("5.2,7.1", new CardVO("捞场", 167));
		resultMap.put("7.1,5.2", new CardVO("捞场", 167));

		resultMap.put("5.1,7.2", new CardVO("捞场", 168));
		resultMap.put("7.2,5.1", new CardVO("捞场", 168));

		resultMap.put("5.1,7.1", new CardVO("捞场", 169));
		resultMap.put("7.1,5.1", new CardVO("捞场", 169));
		
		//1场(2,9)
		resultMap.put("2.2,9.2", new CardVO("老场", 170));
		resultMap.put("9.2,2.2", new CardVO("老场", 170));

		resultMap.put("2.2,9.1", new CardVO("老场", 171));
		resultMap.put("9.1,2.2", new CardVO("老场", 171));

		resultMap.put("2.1,9.2", new CardVO("老场", 172));
		resultMap.put("9.2,2.1", new CardVO("老场", 172));

		resultMap.put("2.1,9.1", new CardVO("老场", 173));
		resultMap.put("9.1,2.1", new CardVO("老场", 173));
		
		//1场(3,8)
//		resultMap.put("3.2,8.2", new CardVO("老场", 174));
//		resultMap.put("8.2,3.2", new CardVO("老场", 174));

		resultMap.put("3.2,8.1", new CardVO("老场", 175));
		resultMap.put("8.1,3.2", new CardVO("老场", 175));

		resultMap.put("3.1,8.2", new CardVO("老场", 176));
		resultMap.put("8.2,3.1", new CardVO("老场", 176));

		resultMap.put("3.1,8.1", new CardVO("老场", 177));
		resultMap.put("8.1,3.1", new CardVO("老场", 177));
		
		//1场(4,7)
		resultMap.put("4.2,7.2", new CardVO("老场", 178));
		resultMap.put("7.2,4.2", new CardVO("老场", 178));

		resultMap.put("4.2,7.1", new CardVO("老场", 179));
		resultMap.put("7.1,4.2", new CardVO("老场", 179));

		resultMap.put("4.1,7.2", new CardVO("老场", 180));
		resultMap.put("7.2,4.1", new CardVO("老场", 180));

		resultMap.put("4.1,7.1", new CardVO("老场", 181));
		resultMap.put("7.1,4.1", new CardVO("老场", 181));
		
		//1场(5,6)
		resultMap.put("5.2,6.2", new CardVO("老场", 182));
		resultMap.put("6.2,5.2", new CardVO("老场", 182));

		resultMap.put("5.2,6.1", new CardVO("老场", 183));
		resultMap.put("6.1,5.2", new CardVO("老场", 183));

		resultMap.put("5.1,6.2", new CardVO("老场", 184));
		resultMap.put("6.2,5.1", new CardVO("老场", 184));

		resultMap.put("5.1,6.1", new CardVO("老场", 185));
		resultMap.put("6.1,5.1", new CardVO("老场", 185));
		
		//噶烹(2,8)
		resultMap.put("2.2,8.2", new CardVO("噶烹", 186));
		resultMap.put("8.2,2.2", new CardVO("噶烹", 186));

		resultMap.put("2.2,8.1", new CardVO("噶烹", 187));
		resultMap.put("8.1,2.2", new CardVO("噶烹", 187));

		resultMap.put("2.1,8.2", new CardVO("噶烹", 188));
		resultMap.put("8.2,2.1", new CardVO("噶烹", 188));

		resultMap.put("2.1,8.1", new CardVO("噶烹", 189));
		resultMap.put("8.1,2.1", new CardVO("噶烹", 189));
		
		
		//噶烹(3,7)
		resultMap.put("3.2,7.2", new CardVO("噶烹", 190));
		resultMap.put("7.2,3.2", new CardVO("噶烹", 190));

		resultMap.put("3.2,7.1", new CardVO("噶烹", 191));
		resultMap.put("7.1,3.2", new CardVO("噶烹", 191));

		resultMap.put("3.1,7.2", new CardVO("噶烹", 192));
		resultMap.put("7.2,3.1", new CardVO("噶烹", 192));

		resultMap.put("3.1,7.1", new CardVO("噶烹", 193));
		resultMap.put("7.1,3.1", new CardVO("噶烹", 193));

		
		System.out.println(resultMap.get(user1).getValue() + " , rank : " + resultMap.get(user1).getRank());
		System.out.println(resultMap.get(user2).getValue() + " , rank : " + resultMap.get(user2).getRank());
	}

	public static class CardVO {
		String value;
		int rank;

		CardVO(String value, int rank) {
			this.value = value;
			this.rank = rank;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

	}
}
