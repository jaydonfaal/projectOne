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
			System.out.println("Map does not contain key");
			map.put(id, amnt);
			System.out.println("added");
		}
		System.out.println("Enter Valid Amount");
	}

	public void withdraw (String id, double amnt)
	{

		if (amnt > map.get(id))
		{
			System.out.println("Error: Amount invalid.");
		}	
		else if (map.get(id) == null)
		{
			System.out.println ("Account does not exist");
		}
		else
		{
			map.replace(id, map.get(id)- amnt);
		}

	}

public String checkBalance (String id)
{
	{
		if (map.get(id) == null)
		{
			return("ID does not exist.");
		}
		else
		{
			return ""+map.get(id);
		}
	}
}

}

