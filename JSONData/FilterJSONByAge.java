import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.Iterator;

public class FilterJSONByAge {
    public static void main(String[] args) {
        String jsonArray = """
                [
                    { "name": "Harvey", "age": 22, "email": "harvey@gmail.com" },
                    { "name": "Mike", "age": 21, "email": "mike@gmail.com" },
                    { "name": "Jessica", "age": 22, "email": "jessica@gmail.com" }
                ]
                """;

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootArray = objectMapper.readTree(jsonArray);

            ArrayNode filteredArray = objectMapper.createArrayNode();

            for (JsonNode node : rootArray) {
                if (node.get("age").asInt() > 25) {
                    filteredArray.add(node);
                }
            }
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredArray));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
