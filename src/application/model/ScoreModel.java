package application.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ScoreModel {
	private int correct;
	public static String username;
	private int wrong;
	private static ObservableList<Score> data = FXCollections.observableArrayList();

	public void addNewScore(int score) {
		Score A = new Score(username,score);
		data.add(A);
	}
	
	public void addNewScore(String username,int score) {
		Score A = new Score(username,score);
		data.add(A);
	}
	public ObservableList<Score> getData() {
		return data;
	}

}
