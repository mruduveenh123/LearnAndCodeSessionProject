package JsonOperations;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import static JsonOperations.ReadJson.gamePojos;
import static JsonOperations.ReadJson.gameType;


public class WriteJson {

    JSONObject jsonObject = new JSONObject();

    public static void CreateJson() {
        int gameType = Integer.parseInt(ReadJson.getGameType());

        switch (gameType) {
            case 2:
                BadmitionGameType();
                break;
            case 11:
                CricketGameType();
                break;
            case 1:
                ChessGameType();
                break;
            default:
                break;
        }
    }

    public static void BadmitionGameType() {
        int count = 0;
        JSONObject object = new JSONObject();
        JSONArray playerDetails = new JSONArray();
        JSONArray teams = new JSONArray();

        for (int j = 0; j <= gameType.length(); j++) {
            object.put("id", j);
            object.put("name", "Team -" + j);
            object.put("gameType", gameType);

            for (int i = 0; i < (gamePojos.size() / 2); i++) {
                playerDetails.add("playerId : " + gamePojos.get(count).players.getPlayerId());
                playerDetails.add("name : " + gamePojos.get(count).players.getName());
                count++;
                object.put("players" + i, playerDetails);
            }
        }
        try (
                FileWriter file = new FileWriter("D:\\LearnAndCodeProject\\src\\main\\java\\OutputJson\\Output.json")) {
            file.write(object.toJSONString());
            System.out.println("JSON Object write to a File successfully");
            System.out.println("JSON Object: " + object);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void CricketGameType() {

    }

    public static void ChessGameType() {

    }
}
