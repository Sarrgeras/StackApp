package com.example.stackapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import util.RandomGenerating;
import util.SpecialStack;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private int count;

    public void acceptCount(String countElem){
        count = Integer.parseInt(countElem);
    }

    @FXML
    private Label addLabel;

    @FXML
    private Button addToStack;

    @FXML
    private Button createStack;

    @FXML
    private Button removeFromStack;

    @FXML
    private Label label1;

    @FXML
    private Label label10;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private Label label9;

    @FXML
    private Label removeLabel;

    @FXML
    private Button showingStack;

    @FXML
    private VBox stackVBox;

    @FXML
    void initialize(){

        SpecialStack<String> specialStack = new SpecialStack<>();
        RandomGenerating randomGenerating = new RandomGenerating();
        ArrayList<Label> labels = new ArrayList<>();
        showingStack.setOnAction(actionEvent -> {

            for (int i = 0; i < 160; i++) {
                specialStack.push(randomGenerating.stackGenerate());
            }

            labels.add(0, label1);
            labels.add(1, label2);
            labels.add(2, label3);
            labels.add(3, label4);
            labels.add(4, label5);
            labels.add(5, label6);
            labels.add(6, label7);
            labels.add(7, label8);
            labels.add(8, label9);
            labels.add(9, label10);
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialStack.getIndex(i));
            }
        });
        addToStack.setOnAction(actionEvent -> {
            specialStack.push(randomGenerating.stackGenerate());
            addLabel.setText(specialStack.peek());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialStack.getIndex(i));
            }

        });
        removeFromStack.setOnAction(actionEvent -> {
            removeLabel.setText(specialStack.pop());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialStack.getIndex(i));
            }
        });
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
