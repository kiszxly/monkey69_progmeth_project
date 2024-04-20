import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import javafx.event.ActionEvent;
import java.io.IOException;

public class firstpageController {
    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    public void loginButtonAction(ActionEvent event) {
        try {
            // Load the register.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();

            // Create a new stage
            Stage stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(new Scene(root));

            // Show the stage
            stage.show();

            // Close the current stage (login window)
            Stage currentStage = (Stage) loginButton.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace(); // Handle potential errors
        }
    }
}
