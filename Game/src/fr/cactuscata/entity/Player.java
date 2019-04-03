package fr.cactuscata.entity;

import fr.cactuscata.game.Score;

public interface Player extends SubEntity {

	public Score getScore();
	
	public void addScore(int scoreAdded);
	
}
