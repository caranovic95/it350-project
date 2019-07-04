package Actions;


import Views.AddAngazovanjeView;
import Controller.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class DodajAction implements EventHandler<ActionEvent> {

    public DodajAction() {
    }

    @Override
    public void handle(ActionEvent event) {
        AddAngazovanjeView addAngazovanjeView = new AddAngazovanjeView();
        Scene scene = new Scene(addAngazovanjeView, 390, 345);
        Controller.getInstance().setAddAngazovanjeView(addAngazovanjeView);
        Controller.getInstance().getSideStage().setScene(scene);
        Controller.getInstance().getSideStage().setTitle("Dodaj nov red");
        Controller.getInstance().getSideStage().show();
    }
  
  
    
}
