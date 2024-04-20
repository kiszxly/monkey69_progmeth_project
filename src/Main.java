import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("firstpage.fxml"));
        primaryStage.setTitle("Monkey69");
        primaryStage.setScene(new Scene(root, 1150, 600)); // Set the scene size according to your HTML
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
