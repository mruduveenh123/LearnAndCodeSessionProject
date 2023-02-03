package JsonPojo;

public class Game {
    public int gameType;
    public Player players;

    public Game(int gameType, Player players) {
        this.gameType = gameType;
        this.players = players;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }

    public Player getPlayers() {
        return players;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }
}

