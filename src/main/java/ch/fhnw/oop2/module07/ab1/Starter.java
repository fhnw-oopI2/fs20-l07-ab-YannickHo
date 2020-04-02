package ch.fhnw.oop2.module07.ab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Starter extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		final Scene scene = new Scene(new EventHandler(), 500, 200);
		
		stage.setScene(scene);
		stage.setResizable(true);
		stage.setTitle("Event Handler In Action");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
