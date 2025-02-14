package com.example.adapter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import model.Adapter;

public class HelloController {
    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> demolist;

    @FXML
    private Button insertButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button findButton;

    @FXML
    private Rectangle resultIndicator;

    private Adapter demo;

    public HelloController() {
        demo = new Adapter();
    }

    @FXML
    public void initialize() {}

    @FXML
    private void handleInsert() {
        String input = inputField.getText();
        if (!input.isEmpty()) {
            demo.insert(Integer.parseInt(input));
            updateListView();
            inputField.clear();
        }
    }

    @FXML
    private void handleDelete() {
        demo.delete();
        updateListView();
    }

    @FXML
    private void handleFind() {
        String input = inputField.getText();
        if (!input.isEmpty()) {
            boolean found = demo.find(Integer.parseInt(input));
            if (found) {
                resultIndicator.setFill(javafx.scene.paint.Color.GREEN);
            } else {
                resultIndicator.setFill(javafx.scene.paint.Color.RED);
            }
        }
    }

    private void updateListView() {
        demolist.getItems().clear();
        demolist.getItems().addAll(demo.display());
        resultIndicator.setFill(javafx.scene.paint.Color.TRANSPARENT);
    }
}

