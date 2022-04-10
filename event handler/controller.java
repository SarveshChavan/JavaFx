package com.example.pacman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    public Circle Cir;
    public  double x;
    public  double y;
    public void up(ActionEvent e){
        Cir.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        Cir.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
        Cir.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
        Cir.setCenterX(x+=10);
    }
    public void start(ActionEvent e){
        Cir.setCenterY(y=0);
        Cir.setCenterX(x=0);
    }
    public void upright(ActionEvent e){
        up(e);
        right(e);
    }
    public void upleft(ActionEvent e){
        up(e);
        left(e);
    }
    public void exit(ActionEvent e){
        System.out.println("Ended successfully");
        javafx.application.Platform.exit();
    }
}
