package javaeight;

import java.util.HashMap;
import java.util.Map;
 
public class StringToHashmapExample {
 
    public static void main(String[] args) {
        
        String strSource = "11:Jack, 23:Emily, 31:Ryan, 56:John, 99:Maria";
        
        //new HashMap object
        Map<String, String> hMapData = new HashMap<String, String>();
        
        //split the String by a comma
        String parts[] = strSource.split(",");
        
        //iterate the parts and add them to a map
        for(String part : parts){
            
            //split the employee data by : to get id and name
            String empdata[] = part.split(":");
            
            String strId = empdata[0].trim();
            String strName = empdata[1].trim();
            
            //add to map
            hMapData.put(strId, strName);
        }
        
        System.out.println("String to HashMap: " + hMapData);
    }
}