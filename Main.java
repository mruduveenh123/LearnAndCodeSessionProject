import JsonOperations.ReadJson;
import JsonOperations.WriteJson;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main extends ReadJson {
    public static void main(String[] args) throws IOException, ParseException {
        ReadJson.readJson();
        WriteJson.CreateJson();
    }
}
