package Player;

import java.util.HashMap;

public class Playermanager {

    public HashMap<Integer, Player> players = new HashMap<Integer, Player>();

    public void addPlayer(int i, Player p) {

        this.players.put(i, p);

    }

    public void removePlayer(int i) {

        this.players.remove(i);

    }

    public int getAnzahlPlayers() {

        return this.players.size();

    }

    public Player getPlayer(int i) {

        return this.players.get(i);

    }

}
