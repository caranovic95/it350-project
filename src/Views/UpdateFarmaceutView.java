/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Actions.DodajDobavljacAction;
import Actions.DodajFarmaceutAction;
import Actions.DodajPromenaTabeleAction;
import Actions.UpdateApotekaAction;
import Actions.UpdateFarmaceutAction;
import Baza.Baza;
import Controller.Controller;
import Tabele.Apoteka;
import Tabele.Farmaceut;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Milos PC
 */
public class UpdateFarmaceutView extends GridPane{
    
    /* String jmbg, String ime, String prezime, String adresa,String strucnaSprema*/
    
         private ComboBox tabeleCB = Controller.getInstance().getPocetniEkranView().getTabeleCb();
    
    private Label jmbgFarmaceutLbl = new Label("Farmaceut jmbg:");
    private Label imeFarmaceutLbl = new Label("Ime farmaceuta: ");
    private Label prezimeFarmaceutLbl = new Label("Prezime farmaceuta: ");
    
    private Label adresaFarmaceutLbl = new Label("Adresa farmaceuta : ");
     private Label strucnaSpremaFarmaceutLbl = new Label("Strucna sprema farmaceuta : ");
    
    private TextField jmbgFarmaceutFld = new TextField();
    private TextField imeFarmaceutFld = new TextField();
      private TextField prezimeFarmaceutFld = new TextField();
    private TextField adresaFarmaceutFld = new TextField();
        private TextField strucnaSpremaFamraceutFld = new TextField();
        private Farmaceut f1;

    
    private Button dodajBtn = new Button("Izmeni");
    
    public UpdateFarmaceutView() {
        f1 = (Farmaceut) Controller.getInstance().getPocetniEkranView().getTabela().getSelectionModel().getSelectedItem();
        
        setF1(f1);
         Baza.connect();
        Baza.disconnect();
        
        
         imeFarmaceutFld.setText(f1.getIme());
         prezimeFarmaceutFld.setText(f1.getPrezime());
         adresaFarmaceutFld.setText(f1.getAdresa());
         strucnaSpremaFamraceutFld.setText(f1.getStrucnaSprema());
         
         
         
         
        dodajBtn.setOnAction(new UpdateFarmaceutAction());
        
        tabeleCB = Controller.getInstance().getTabeleCb();
        tabeleCB.getSelectionModel().select(4);
        tabeleCB.setOnAction(new DodajPromenaTabeleAction());
        
        
       
        
        add(imeFarmaceutLbl, 0, 2);
        add(imeFarmaceutFld, 1, 2);
        
        add(prezimeFarmaceutLbl, 0, 3);
        add(prezimeFarmaceutFld, 1, 3);
        
        add(adresaFarmaceutLbl, 0, 4);
        add(adresaFarmaceutFld, 1, 4);
        
        add(strucnaSpremaFarmaceutLbl, 0,5);
        add(strucnaSpremaFamraceutFld,1,5);
        
        add(dodajBtn, 1, 6);
        
        setPadding(new Insets(10, 10, 10, 10));
        setHgap(10);
        setVgap(10);
    }

    public ComboBox getTabeleCB() {
        return tabeleCB;
    }

    public void setTabeleCB(ComboBox tabeleCB) {
        this.tabeleCB = tabeleCB;
    }

    public Label getJmbgFarmaceutLbl() {
        return jmbgFarmaceutLbl;
    }

    public void setJmbgFarmaceutLbl(Label jmbgFarmaceutLbl) {
        this.jmbgFarmaceutLbl = jmbgFarmaceutLbl;
    }

    public Label getImeFarmaceutLbl() {
        return imeFarmaceutLbl;
    }

    public void setImeFarmaceutLbl(Label imeFarmaceutLbl) {
        this.imeFarmaceutLbl = imeFarmaceutLbl;
    }

    public Label getAdresaFarmaceutLbl() {
        return adresaFarmaceutLbl;
    }

    public void setAdresaFarmaceutLbl(Label adresaFarmaceutLbl) {
        this.adresaFarmaceutLbl = adresaFarmaceutLbl;
    }

    public Label getStrucnaSpremaFarmaceutLbl() {
        return strucnaSpremaFarmaceutLbl;
    }

    public void setStrucnaSpremaFarmaceutLbl(Label strucnaSpremaFarmaceutLbl) {
        this.strucnaSpremaFarmaceutLbl = strucnaSpremaFarmaceutLbl;
    }

    public TextField getJmbgFarmaceutFld() {
        return jmbgFarmaceutFld;
    }

    public void setJmbgFarmaceutFld(TextField jmbgFarmaceutFld) {
        this.jmbgFarmaceutFld = jmbgFarmaceutFld;
    }

    public TextField getImeFarmaceutFld() {
        return imeFarmaceutFld;
    }

    public void setImeFarmaceutFld(TextField imeFarmaceutFld) {
        this.imeFarmaceutFld = imeFarmaceutFld;
    }

    public TextField getAdresaFarmaceutFld() {
        return adresaFarmaceutFld;
    }

    public void setAdresaFarmaceutFld(TextField adresaFarmaceutFld) {
        this.adresaFarmaceutFld = adresaFarmaceutFld;
    }

    public TextField getStrucnaSpremaFamraceutFld() {
        return strucnaSpremaFamraceutFld;
    }

    public void setStrucnaSpremaFamraceutFld(TextField strucnaSpremaFamraceutFld) {
        this.strucnaSpremaFamraceutFld = strucnaSpremaFamraceutFld;
    }

    public Button getDodajBtn() {
        return dodajBtn;
    }

    public void setDodajBtn(Button dodajBtn) {
        this.dodajBtn = dodajBtn;
    }

    public Label getPrezimeFarmaceutLbl() {
        return prezimeFarmaceutLbl;
    }

    public void setPrezimeFarmaceutLbl(Label prezimeFarmaceutLbl) {
        this.prezimeFarmaceutLbl = prezimeFarmaceutLbl;
    }

    public TextField getPrezimeFarmaceutFld() {
        return prezimeFarmaceutFld;
    }

    public void setPrezimeFarmaceutFld(TextField prezimeFarmaceutFld) {
        this.prezimeFarmaceutFld = prezimeFarmaceutFld;
    }

    public Farmaceut getF1() {
        return f1;
    }

    public void setF1(Farmaceut f1) {
        this.f1 = f1;
    }
    
    

    


    
}
