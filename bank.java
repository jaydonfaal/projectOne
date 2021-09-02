import java.util.HashMap;

public class bank
{
	private HashMap<String, Double> map = new HashMap<String, Double>();

	public void deposit(String id, Double amnt)
	{
			if (amnt > 0)
			{
				if(map != null && map.containsKey(id))
				{
					map.put(id, map.get(id)+amnt);
					System.out.println("added");
				}
				System.out.println("map does not contain key");
				map.put(id, amnt);
				System.out.println("added");
			}
			System.out.println("Enter Valid Amount");
	}

	public void withdraw (String id, double amnt)
	{
		
			if (amnt > 0)
			{
				if (map != null && map.containsKey(id))
				{
					map.replace(id, map.get(id)- amnt);
				}
				else
				{
					System.out.println ("Account does not exist");
				}
			}
		}

	public String checkBalance (String id)
	{
		System.out.println(map.containsKey(id));
		
		if (map != null && map.containsKey(id))
		{
			String ret =  "" + (map.get(id));
			return ret;
		}
		else
		{
			return ("Account does not exist");
		}
	}

}

