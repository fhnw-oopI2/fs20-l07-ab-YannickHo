package ch.fhnw.oop2.module07.ab2;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

final class EventHandler extends VBox {

    private Label label;
    private Slider slider;

    EventHandler() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        slider = new Slider(1, 10, 5);
        label = new Label(String.valueOf(slider.getValue()));
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
        slider.valueProperty().addListener((observableValue, oldValue, newValue) -> label.setText(String.valueOf(newValue)));
        
        getChildren().add(label);
        getChildren().add(slider);
    }

}
