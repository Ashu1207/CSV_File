import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap hm=new HashMap();
 hm.put(100,"Ashu");
 hm.put(200,"vaishu");
 hm.put(150, "saju");
 System.out.println(hm);
 HashMap hm1=new HashMap();
 hm1.put(300, "AASHU");
 System.out.println(hm1);
 Set s=hm.keySet();//to use the query to display the id
 System.out.println(s);
 Collection c=hm.values();//use the query to display the string 
 System.out.println(c);
	}

}
