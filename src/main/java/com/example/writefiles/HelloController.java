package com.example.writefiles;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class HelloController implements Initializable {

    @FXML
    private TextFlow txtFlow;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FileTools.writeFiles();

        Text text1 = new Text("Now this is a text node ");
        Text text2 = new Text(" Also a new thing ");
        text1.setFont(Font.font("verdana"));
        text1.setText(" also a new thing");
        text1.setFill(Color.CORAL);
        txtFlow.getChildren().addAll(text1, text2);
    }


}
