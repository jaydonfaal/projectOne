import java.util.HashMap;

public class bank
{
	private HashMap<String, Double> map = new HashMap<String, Double>();
	private String id;
	public bank(String id)
	{
		this.id = id;
	}

	public void deposit(String id, Double amnt)
	{
		try
		{
			if (amnt > 0)
			{
				if(map.containsKey(id))
				{
					map.put(id, map.get(id)+amnt);
				}
			}
			else
			{
				map.put(id, amnt);
			}
		}catch(NullPointerException e){}
	}

	public void withdraw (String id, double amnt)
	{
		try
		{
			if (amnt > 0)
			{
				if (map.containsKey(id))
				{
					map.replace(id, map.get(id)- amnt);
				}
				else
				{
					System.out.println ("Account does not exist");
				}
			}
		}catch(NullPointerException e){}}

	public String checkBalance (String id)
	{
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

