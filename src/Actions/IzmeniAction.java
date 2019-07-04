/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Controller.Controller;
import Views.AddAngazovanjeView;
import Views.UpdateAngazovanjeView;
import Views.UpdateApotekaView;
import Views.UpdateFarmaceutView;
import Views.UpdateLekView;
import Views.UpdatePacijentView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

/**
 *
 * @author Milos PC
 */
public class IzmeniAction implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        try{
            
        
        int izbor = Controller.getInstance().getPocetniEkranView().getPocetniEkranTabeleCb().getSelectionModel().getSelectedIndex();

        switch (izbor) {
            case 0: {
                UpdateAngazovanjeView updateAngazovanjeView = new UpdateAngazovanjeView();
                Scene scene = new Scene(updateAngazovanjeView, 390, 345);
                Controller.getInstance().setUpdateAngazovanjeView(updateAngazovanjeView);
                Controller.getInstance().getSideStage().setScene(scene);
                Controller.getInstance().getSideStage().setTitle("Dodaj nov red");
                Controller.getInstance().getSideStage().show();
            }
        }
        
        switch (izbor) {
            case 1: {
                UpdateApotekaView updateApotekaView = new UpdateApotekaView();
                Scene scene = new Scene(updateApotekaView, 390, 345);
                Controller.getInstance().setUpdateApotekaView(updateApotekaView);
                Controller.getInstance().getSideStage().setScene(scene);
                Controller.getInstance().getSideStage().setTitle("Dodaj nov red");
                Controller.getInstance().getSideStage().show();
            }
        }
         switch (izbor) {
            case 4: {
                UpdateFarmaceutView updateFarmaceutView = new UpdateFarmaceutView();
                Scene scene = new Scene(updateFarmaceutView, 390, 345);
                Controller.getInstance().setUpdateFarmaceutView(updateFarmaceutView);
                Controller.getInstance().getSideStage().setScene(scene);
                Controller.getInstance().getSideStage().setTitle("Dodaj nov red");
                Controller.getInstance().getSideStage().show();
            }
        }
          switch (izbor) {
            case 6: {
                UpdateLekView updateLekView = new UpdateLekView();
                Scene scene = new Scene(updateLekView, 390, 345);
                Controller.getInstance().setUpdateLekView(updateLekView);
                Controller.getInstance().getSideStage().setScene(scene);
                Controller.getInstance().getSideStage().setTitle("Dodaj nov red");
                Controller.getInstance().getSideStage().show();
            }
        }
            switch (izbor) {
            case 8: {
                UpdatePacijentView updatePacijentView = new UpdatePacijentView();
                Scene scene = new Scene(updatePacijentView, 390, 345);
                Controller.getInstance().setUpdatePacijentView(updatePacijentView);
                Controller.getInstance().getSideStage().setScene(scene);
                Controller.getInstance().getSideStage().setTitle("Dodaj nov red");
                Controller.getInstance().getSideStage().show();
            }
        }
        }
        catch(NullPointerException e)
        {
             Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Greska");
            alert.setHeaderText(null);
            alert.setContentText("Izaberite objekat za update");
            alert.showAndWait();
        }
             
    }

    }
