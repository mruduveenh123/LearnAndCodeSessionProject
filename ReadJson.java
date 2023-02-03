package JsonOperations;

import JsonPojo.Game;
import JsonPojo.Player;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;

public class ReadJson {
    public static ArrayList<Game> gamePojos = new ArrayList<>();

    public static String gameType;

    public static void readJson() throws IOException, ParseException {

        String playerName = null;
        long playerId = 0;

        // parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("D:\\LearnAndCodeProject\\src\\main\\java\\InputJson\\TeamsInputJSON.json"));

        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        // getting firstName and lastName
        gameType = jo.get("gameType").toString();

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("players");

        for (int i = 0; i < ja.size(); i++) {
            JSONObject jsonObject = (JSONObject) ja.get(i);
            playerName = (String) jsonObject.get("name");
            playerId = (long) jsonObject.get("playerId");
            Player player = new Player(playerId, playerName);
            gamePojos.add(new Game(Integer.parseInt(gameType), player));
        }
    }

    public static String getGameType() {
        return gameType;
    }
}

