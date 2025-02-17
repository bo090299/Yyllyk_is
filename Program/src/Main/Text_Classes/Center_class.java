package Main.Text_Classes;

import Main.Util.SizeConfig;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Center_class extends StackPane {
    public Center_class() {
//        ImageView imageView = new ImageView(new Image("Resource/Image/back.png"));
//        imageView.setFitHeight(SizeConfig.Height(0.70));
//        imageView.setFitWidth(SizeConfig.Width(1));
//        this.getChildren().addAll(imageView);
        this.setPrefSize(SizeConfig.Width(0.70),SizeConfig.Height(0.9));
    }
}
