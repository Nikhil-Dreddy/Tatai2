package application.view;

import java.io.IOException;

import javafx.event.ActionEvent;

public class PracticeEquationsController extends AbstractController{

	RecordController recController = new RecordController();

	public void equation(ActionEvent event) throws IOException{
		recController.setQTypeEquation();
		changeSceneToRecord(event);
	}
	
	public void changeSceneToRecord(ActionEvent event) throws IOException{
		changeScene(event,"Username_Scene");
	}
	
	
	public void changeSceneToUsername(ActionEvent event) throws IOException{
		changeScene(event,"Record");
	}
	
	public void quit(ActionEvent event) throws IOException{
		changeScene(event,"Menu");
	}
	
	public void customizeEq(ActionEvent event) throws IOException{
		changeScene(event,"CustomEquation");
	}
} 