package ch.fhnw.oop2.module07.ab3;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

final class EventHandler extends VBox {

    private TextField textField;
    private Slider slider;
    private NumberStringConverter numberStringconv = new NumberStringConverter();

    EventHandler() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        slider = new Slider(1, 10, 5);
        textField = new TextField(String.valueOf(slider.getValue()));
    }

    private void layoutControls() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setPadding(new Insets(10));
        
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(1); // Major=grosse Striche auf Slider
        slider.setMinorTickCount(0);// Minor=Unterteilung zwischen grossen Strichen
        slider.setSnapToTicks(true);
        
        textField.textProperty().bindBidirectional(slider.valueProperty(),numberStringconv);
        
        getChildren().add(textField);
        getChildren().add(slider);
    }

}
