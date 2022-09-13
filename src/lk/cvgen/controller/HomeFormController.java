package lk.cvgen.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.cvgen.commons.Commons;

import java.io.IOException;


public class HomeFormController {
    public AnchorPane infoPlaneContext;
    public AnchorPane homePaneContext;

    public void btnGenSLTemplateOnAction(MouseEvent mouseEvent) throws IOException {
        setUI("SLTemplatePersonalInfoForm",homePaneContext );
    }

    public void btnGenUSATemplateOnAction(MouseEvent mouseEvent) {
    }

    public void btnGenUKTemplateOnAction(MouseEvent mouseEvent) {
    }

    public void btnGenUAETemplateOnAction(MouseEvent mouseEvent) {
    }

    public void btnGenOtherTemplateOnAction(ActionEvent actionEvent) {
    }

    public void setUI(String formName,AnchorPane anchorPlane) throws IOException {
        Stage stage = (Stage)anchorPlane.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass()
                        .getResource("../view/"+formName+".fxml")))
        );
    }
}
