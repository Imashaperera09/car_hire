import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer  extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = this.getClass().getResource("lk/ijse/carhire/view/DashBoardForm.fxml");
        Parent window = FXMLLoader.load(resource);
        Scene scene = new Scene(window);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add Customer");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
