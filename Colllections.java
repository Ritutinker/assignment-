/*
 WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.*/
package Collections.Anudip;
    import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class StudentMap {

		public static void main(String[] args) {
			HashMap<Integer,String> map=new HashMap<>();
			map.put(106, "Ritu");
			map.put(102, "Ritika");
			map.put(103, "Anjali");
			map.put(104, "Manju");
			map.put(105, "Akshara");

			Set<Integer> keys=map.keySet();
			for(Integer sm:keys)
			{
				if( sm.intValue()>103)
				{
				System.out.println(map.get(sm));
			    }
			}

		}

	}

