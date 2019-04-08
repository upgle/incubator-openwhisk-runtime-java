package example;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.stream.IntStream;

/**
 * Test JEP 323: Local-Variable Syntax for Lambda Parameters
 * http://openjdk.java.net/jeps/323
 */
public class Java11Test {
    public static JsonObject main(JsonObject args) throws Exception {
        JsonObject response = new JsonObject();
        JsonArray list = new JsonArray();

        IntStream.range(1, 5)
                // local-variable syntax
                .filter((var i) -> i % 2 == 0)
                .forEach(list::add);

        response.add("list", list);
        return response;
    }
}
