import java.util.ArrayList;

public class Test1 {
	public static void main (String[] args)
	{
		int pk,	n, ip, q, offset, ipP;
		pk = 26;
		n = 13; 
		ip = pk % n;
		q = pk/n;
		if(q%n != 0) {
			offset = q;
		}
		else {
			offset = 19;
		}
		ipP = (ip + offset) % n;
		System.out.println("ip:" + ip + "|q:" + q + "|offset:" + offset + "|ipP:" + ipP);
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(27);
		x.add(53);
		x.add(13);
		x.add(10);
		x.add(138);
		x.add(109);
		x.add(49);
		x.add(174);
		x.add(26);
		x.add(24);
		for(Integer y: x) {
			System.out.println("ip:" + (y % 10) + '|' + y);
		}
		
	}

}
