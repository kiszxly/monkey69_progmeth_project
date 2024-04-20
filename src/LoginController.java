import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button registerButton;

    @FXML
    public void registerButtonAction(ActionEvent event) {
        try {
            // Load the register.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
            Parent root = loader.load();

            // Create a new stage
            Stage stage = new Stage();
            stage.setTitle("Register");
            stage.setScene(new Scene(root));

            // Show the stage
            stage.show();

            // Close the current stage (login window)
            Stage currentStage = (Stage) registerButton.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace(); // Handle potential errors
        }
    }
}
