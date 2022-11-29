package com.example.stackapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import util.RandomGenerating;
import util.SpecialStack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Controller {

    private int count;

    public void acceptCount(String countElem){
        count = Integer.parseInt(countElem);
    }

    @FXML
    private Button aboutProgram;
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
    private Label numberElem;

    @FXML
    void initialize(){

        SpecialStack<String> specialStack = new SpecialStack<>();
        RandomGenerating randomGenerating = new RandomGenerating();
        ArrayList<Label> labels = new ArrayList<>();
        showingStack.setOnAction(actionEvent -> {

            if (!specialStack.empty()){
                specialStack.removeAll();
                for (int i = 0; i < 10; i++) {
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
            }
            else{
                for (int i = 0; i < 10; i++) {
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
            }
            numberElem.setText(specialStack.size());
        });
        addToStack.setOnAction(actionEvent -> {
            try {
                specialStack.push(randomGenerating.stackGenerate());
                for (int i = 0; i < 10; i++) {
                    try{
                        labels.get(i).setText(specialStack.getIndex(i));
                    }catch (Exception ex){
                        labels.get(i).setText("0");
                    }

                }
                addLabel.setText(specialStack.peek());
                numberElem.setText(specialStack.size());
            }catch (Exception ex){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!!!");
                alert.setHeaderText(null);
                alert.setContentText("Для начала работы создайте стек!");

                alert.showAndWait();
            }

        });
        removeFromStack.setOnAction(actionEvent -> {

            try {
                removeLabel.setText(specialStack.pop());
                for (int i = 0; i < 10; i++) {
                    try {
                        labels.get(i).setText(specialStack.getIndex(i));
                    }catch (Exception ex){
                        labels.get(i).setText("0");
                    }

                }

            }catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!!!");
                alert.setHeaderText(null);
                alert.setContentText("Для начала работы создайте стек!");

                alert.showAndWait();
            }
            numberElem.setText(specialStack.size());
        });
        aboutProgram.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Разработчик");
            alert.setHeaderText(null);
            alert.setContentText("Разработал студент БНТУ, группы 10702221" +
                    '\n' + "Млинников Владислав Вячеславович" +
                    '\n' + "GitHub: https://github.com/Sarrgeras");

            alert.showAndWait();
        });
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
