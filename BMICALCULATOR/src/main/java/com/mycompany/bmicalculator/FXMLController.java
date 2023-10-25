package com.mycompany.bmicalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public  class FXMLController implements Initializable {
    
    
       @FXML
    private Label labelage;

    @FXML
    private Label labelweight;

    @FXML
    private Label labelheight;

    @FXML
    private TextField ageinput;

    @FXML
    private  TextField heightinputft;

    @FXML
    private TextField weightinput;

    @FXML
    private TextField bmi;

    @FXML
    private TextField idealweight;

    @FXML
    private Button calculate;

    @FXML
    private TextField heightinputinch;
    
    @FXML
    private TextField textareadisplay;
    
    @FXML
    private ComboBox<String> gender;
    
    ObservableList<String> list = FXCollections.observableArrayList("Male","Female");
     
    
    @FXML
    private TextField genderdis;
    
    @FXML
    private TextField fatperdis;
    
    
    
    @FXML
    
    void genderselection(ActionEvent e ){
    
    genderdis.setText(gender.getValue());
    
    }
    
    
    
    
     
    @FXML
        void calculatebmi(ActionEvent e) {

        int age = Integer.parseInt(ageinput.getText());
        
        double heightft = Double.parseDouble(heightinputft.getText());
        
        double heightinch = Double.parseDouble(heightinputinch.getText());
        
        double weight = Double.parseDouble(weightinput.getText());
        
        Calculations convt = new Calculations();
        
        double height = convt.heightcnv(heightft, heightinch);
        
        double fbmi = convt.bmical(weight,height);
        
       
        
        String w = convt.idealweightcal(height);
        
        
        String s = String.valueOf(fbmi);
        
        Instructions opins = new Instructions();
        
        
        String Opinion = opins.opinions(fbmi);
        
        
        
        double fatperf;
     
        if(gender.getValue().equals("Male")){
        
        fatperf = Math.round(((1.39*fbmi)+(.16*age)-(10.34*1)-9)*10.0)/10.0;
        
        }
        
        else{
        
        fatperf =  Math.round(((1.39*fbmi)+(.16*age)-(10.34*0)-9)*10.0)/10.0;
        
        }
        
       
        
        
       bmi.setText(s);
       idealweight.setText(w);
      
      textareadisplay.setText(Opinion);
      
       fatperdis.setText(String.valueOf(fatperf + " % "+ "Body Fat"));
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
    gender.setItems(list);
    
    
    }    
}
