package com.gui;

import java.io.IOException;

import com.logic.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/*
 * Hoofd controller, wordt gebruikt om alle switch statements te implementeren.
 * De setUser, setPoint zijn er zodat elke controller een vaste start method heeft.
 */
public abstract class AController {

    @FXML
    public Label points = new Label();

    public User user;

    public void setUser(User user){
        this.user = user;
    }
    public void setPoints(User user){
        points.setText(user.getPoint().getPointsString());
    }

    //All switch statements (if you want a new fxml file add the switch method here!)
    @FXML
    private void switchToReisGegevens() throws IOException {
        Main.show("reisgegevens", user);
    }
    @FXML
    private void switchToLeaderboard() throws IOException {
        Main.show("leaderboard", user);
    }
    @FXML
    public void switchToDashboard() throws IOException {
        Main.show("dashboard", user);
    }
    @FXML
    public void switchToInstellingen() throws IOException {
        Main.show("instellingen", user);
    }
    @FXML
    public void switchToShop() throws IOException {
        Main.show("shop", user);
    }
    @FXML 
    public void switchToAdmin() throws IOException{
        Main.show("admin", user);
    } 
}