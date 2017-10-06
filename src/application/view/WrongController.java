package application.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.ListenerWorker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class WrongController extends AbstractController implements Initializable{
	
	RecordController recordController = new RecordController();
	ListenerWorker worker = new ListenerWorker();
	@FXML
	private Label wrongAns;
	
	// for the quit button
	public void changeSceneToMenu(ActionEvent event) throws IOException{
		recordController.resetQno();
		recordController.resetScore();
		changeScene(event,"Menu");
	}
	
	// for the try again button
	public void changeSceneToRecord(ActionEvent event) throws IOException{
		changeScene(event,"Record");
	}
	
	public void listenRecording(ActionEvent event) throws IOException{
		new Thread(worker).start();
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		wrongAns.setText(recordController.getWrongAns());
	}
}