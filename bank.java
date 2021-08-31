import java.util.HashMap;

public class bank
{
  private HashMap<String, Double> map;
  public bank()
  {
  HashMap<String, Double>  map = new HashMap<>();
  }

  public void deposit(String id, double amnt)
  {
    try
    {
      if(map.containsKey(id) == true)
      {
        map.replace(id, map.get(id)+amnt);
      }
      else
      {
        map.put(id, amnt);
      }
      }catch(NullPointerException e){}


  }

}
