package lk.cvgen.commons;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Commons {
    public AnchorPane anchorPlane;

    public void setUI(String formName) throws IOException {
        Stage stage = (Stage)anchorPlane.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass()
                        .getResource("../view/"+formName+".fxml")))
        );
    }
}
