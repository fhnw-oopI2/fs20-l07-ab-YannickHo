package ch.fhnw.oop2.module07.ab1;

import java.util.stream.Stream;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;


final class EventHandler extends GridPane {
	
	private Button button;
	private int countRow;
	private int countColumn;
	private int countLabel;
	private final int numberOfRows = 5;
	
	
	EventHandler() {
		initializeControls();
		layoutControls();
	    button.setOnAction(event -> addLabel());
	}
	
	private void initializeControls() {
		button = new Button("Add Label");
		button.setMaxSize(70, 70);
		this.setGridLinesVisible(false);
		
		Stream.iterate(0,n -> n+1)
		    .limit(numberOfRows)
		    .forEach(n -> {
		        ColumnConstraints column = new ColumnConstraints();
		        column.setPercentWidth(100/numberOfRows);
		        getColumnConstraints().add(column);
		        RowConstraints row = new RowConstraints();
		        row.setPercentHeight(100/numberOfRows);
		        getRowConstraints().add(row);
		    });
	}
	
	private void layoutControls() {
		add(button, 0, 0);
		setMargin(button, new Insets(20));
	}
	
	private void addLabel() {
	    countRow++;
	    countLabel++;
	    if (countRow % numberOfRows == 0){
	        countRow=0;
	        countColumn++;
	    }
        add(new Label("label"+countLabel),countRow,countColumn);
	}
}

