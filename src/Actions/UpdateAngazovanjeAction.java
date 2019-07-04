/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Baza.Baza;
import Controller.Controller;
import Tabele.Angazovanje;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

/**
 *
 * @author Milos PC
 */
public class UpdateAngazovanjeAction  implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
    
       Angazovanje a1 = Controller.getInstance().getUpdateAngazovanjeView().getA1();
       
       int apotekaId = (int) Controller.getInstance().getUpdateAngazovanjeView().getApotekaIdCb().getSelectionModel().getSelectedItem();
       String jmbgFarmaceut = (String) Controller.getInstance().getUpdateAngazovanjeView().getJmbgFarmaceutCb().getSelectionModel().getSelectedItem();
       int brojMeseci =Integer.valueOf( Controller.getInstance().getUpdateAngazovanjeView().getBrojMeseciFld().getText());
       int brojDana = Integer.valueOf(Controller.getInstance().getUpdateAngazovanjeView().getBrojDanaFld().getText());
       
       a1.setApoteka_id(apotekaId);
       a1.setJmbg_farmaceut(jmbgFarmaceut);
       a1.setBroj_meseci(brojMeseci);
       a1.setBroj_dana(brojDana);
       
      Baza.connect();
      Baza.updateAngazovanje(a1);
      Baza.disconnect();
      
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Obavestenje");
            alert.setHeaderText(null);
            alert.setContentText("Angazovanje je uspesno izmenjeno!");
            alert.showAndWait();
       
       
            
    }
     
}
