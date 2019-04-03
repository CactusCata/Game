package fr.cactuscata.game;

import fr.cactuscata.Game;
import fr.cactuscata.entity.list.Player;
import fr.cactuscata.entity.list.Zombie;
import fr.cactuscata.loc.Location;
import fr.cactuscata.loc.world.list.NormalWorld;
import fr.cactuscata.other.Say;

public class Main {

	public static void main(String[] args) {

		new Main();

	}

	public Main() {

		final Game game = new Game();

		while (game.isRunning()) {

			for (int i = 0, nbrPlayer = Say.sendIntQuestion("Choissisez le nombre de joueurs :"); i < nbrPlayer
					+ 1; i++) {
				String playerName = Say.sendStringQuestion("Choissiez votre pseudo !");
				game.addPlayer(new Player(playerName, new Location(new NormalWorld(), 20, 20, 20)));
			}
			
			Zombie zombie = new Zombie("Zombie 1", new Location(new NormalWorld(), 21, 20,20));

		}

	}

}
