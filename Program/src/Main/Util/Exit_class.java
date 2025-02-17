package Main.Util;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Exit_class {
    public Exit_class() {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Warning!");

        // Основной текст
        Label label = new Label("Siz hakykatdanam programmany ýapmakçymy?");
        label.getStyleClass().add("exit-text");

        // Кнопка "Howa"
        Button howa = new Button("Howa");
        howa.getStyleClass().add("exit-button");
        howa.setOnAction(e -> System.exit(0));

        // Кнопка "Ýok"
        Button yok = new Button("Ýok");
        yok.getStyleClass().add("exit-button");
        yok.setOnAction(e -> stage.close());

        // Блок с кнопками
        HBox btnBox = new HBox(20, howa, yok);
        btnBox.setAlignment(Pos.CENTER);

        // Основной контейнер
        VBox main = new VBox(30, label, btnBox);
        main.setAlignment(Pos.CENTER);
        main.setPadding(new Insets(20));

        // Фон с закруглёнными углами и тенью
        StackPane container = new StackPane();
        Rectangle bg = new Rectangle(350, 180);
        bg.setArcWidth(20);
        bg.setArcHeight(20);
        bg.setFill(Color.web("#2C3E50"));
        bg.setStroke(Color.web("#34495E"));
        bg.setStrokeWidth(2);
        container.getChildren().addAll(bg, main);

        Scene scene = new Scene(container, 350, 180);
        String cssPath = CssConfig.Css();
        if (cssPath != null) {
            scene.getStylesheets().add(cssPath);
        }

        stage.setScene(scene);
        stage.show();
    }
}
