package fr.cactuscata.game;

import java.util.ArrayList;
import java.util.List;

import fr.cactuscata.entity.Entity;

public class Score {

	private int score;
	private List<Entity> entityMeet;

	{
		score = 0;
		entityMeet = new ArrayList<>();
	}

	public int getScore() {
		return this.score;
	}

	public void addScore(int score) {
		setScore(getScore() + score);
	}

	public void removeScore(int score) {
		setScore(getScore() - score);
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Entity> getEntityMeet() {
		return this.entityMeet;
	}

	public void addEntityMeet(Entity entity) {
		this.entityMeet.add(entity);
	}

}
