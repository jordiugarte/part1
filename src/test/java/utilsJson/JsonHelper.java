package utilsJson;

import org.json.JSONObject;

import java.util.Iterator;

public class JsonHelper {

    public static boolean areEqualJson(String expectedResult, String actualResult) {
        boolean areEqual = true;

        JSONObject expectedResultJSON = new JSONObject(expectedResult);
        JSONObject actualResultJSON = new JSONObject(actualResult);

        Iterator<?> propertiesList = actualResultJSON.keys();

        while (propertiesList.hasNext()) {
            String key = (String) propertiesList.next();
            if (actualResultJSON.has(key)) {
                String expValue = String.valueOf(expectedResultJSON.get(key));
                String actValue =  String.valueOf( actualResultJSON.get(key));
                if (expValue.equals("IGNORE")) {
                    System.out.println("Propiedad [" + key + "] es ignorado para la verificacion");
                } else if (!expValue.equals(actValue)) {
                    areEqual = false;
                    System.out.println("ERROR! al comparar la key : [" + key + "] exp : [" + expValue + "] VS act :[" + actValue + "]");
                }
            } else {
                areEqual = false;
                System.out.println("la propiedad [" + key + "] no existe en el actual result");
            }
        }

        return areEqual;
    }

}
