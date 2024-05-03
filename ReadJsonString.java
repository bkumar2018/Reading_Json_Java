
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonString {

 public static void main(String[] args) throws ParseException {

   String target_str = "{\"targets\":[{\"count(*)\":\"0\"}]}";
   System.out.println(target_str.toString());

   JSONParser parser = new JSONParser();
   Object json = parser.parse(target_str);
   JSONObject jsonObject = (JSONObject)json;

   JSONArray targetsJsonArr = (JSONArray)jsonObject.get("targets");

   JSONObject jsonObjectCnt = (JSONObject)targetsJsonArr.get(0);

   System.out.println(jsonObjectCnt.get("count(*)"));


 }


}
