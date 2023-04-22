
/*В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_home_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String text = br.readLine();
            br.close(); 
            String str = text.substring(1, text.length()-1);
            String strFormat1 = str.replace(":", ",");
            String strFormat2 = strFormat1.replace('\"', ' ');
            String strFormat3 = strFormat2.trim();
            String [] rezStr = strFormat3.split(",");
            
            System.out.printf("SELECT * FROM students WHERE %s = \"%s\" AND %s = \"%s\" AND %s = \"%s\"", rezStr[0].trim(), rezStr[1].trim(), rezStr[2].trim(), rezStr[3].trim(), rezStr[4].trim(), rezStr[5].trim());

            
            
            
    }
}
