package Controller;

import Views.AddAngazovanjeView;
import Views.AddApotekaView;
import Views.AddDobavljacView;
import Views.AddDoktorView;
import Views.AddFarmaceutView;
import Views.AddKomercijalistaView;
import Views.AddLekView;
import Views.AddMaloprodajnaCenaView;
import Views.AddPacijentView;
import Views.AddReceptView;
import Views.AddUgovorView;
import Views.AddZamenaView;
import Views.PocetniEkranView;
import Views.UpdateAngazovanjeView;
import Views.UpdateApotekaView;
import Views.UpdateFarmaceutView;
import Views.UpdateLekView;
import Views.UpdatePacijentView;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Filip
 */
public class Controller {

    private static Controller instance = null;

    private PocetniEkranView pocetniEkranView;
    private AddAngazovanjeView addAngazovanjeView;
    private AddApotekaView addApotekaView;
    private AddDobavljacView addDobavljacView;
    private AddDoktorView addDoktorView;
    private AddFarmaceutView addFarmaceutView;
    private AddKomercijalistaView addKomercijalistaView;
    private AddLekView addLekView;
    private AddMaloprodajnaCenaView addMaloprodajnaCenaView;
    private AddPacijentView addPacijentView;
    private AddReceptView addReceptView;
    private AddUgovorView addUgovorView;
    private AddZamenaView addZamenaView;
    private UpdateAngazovanjeView updateAngazovanjeView;
    private UpdateApotekaView updateApotekaView;
    private UpdateFarmaceutView updateFarmaceutView;
    private UpdateLekView updateLekView;
    private UpdatePacijentView updatePacijentView;

    
    private Stage primaryStage = new Stage();
    private Scene mainScene = null;
    private Stage sideStage = new Stage();
    private ComboBox tabeleCb = new ComboBox();

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public PocetniEkranView getPocetniEkranView() {
        return pocetniEkranView;
    }

    public void setPocetniEkranView(PocetniEkranView pocetniEkranView) {
        this.pocetniEkranView = pocetniEkranView;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    public AddAngazovanjeView getAddAngazovanjeView() {
        return addAngazovanjeView;
    }

    public AddDobavljacView getAddDobavljacView() {
        return addDobavljacView;
    }

    public void setAddDobavljacView(AddDobavljacView addDobavljacView) {
        this.addDobavljacView = addDobavljacView;
    }

    public void setAddAngazovanjeView(AddAngazovanjeView addAngazovanjeView) {
        this.addAngazovanjeView = addAngazovanjeView;
    }

    public Stage getSideStage() {
        return sideStage;
    }

    public void setSideStage(Stage sideStage) {
        this.sideStage = sideStage;
    }

    public ComboBox getTabeleCb() {
        return tabeleCb;
    }

    public void setTabeleCb(ComboBox tabeleCb) {
        this.tabeleCb = tabeleCb;
    }

    public AddApotekaView getAddApotekaView() {
        return addApotekaView;
    }

    public void setAddApotekaView(AddApotekaView addApotekaView) {
        this.addApotekaView = addApotekaView;
    }

    public AddDoktorView getAddDoktorView() {
        return addDoktorView;
    }

    public void setAddDoktorView(AddDoktorView addDoktorView) {
        this.addDoktorView = addDoktorView;
    }

    public AddFarmaceutView getAddFarmaceutView() {
        return addFarmaceutView;
    }

    public void setAddFarmaceutView(AddFarmaceutView addFarmaceutView) {
        this.addFarmaceutView = addFarmaceutView;
    }

    public AddKomercijalistaView getAddKomercijalistaView() {
        return addKomercijalistaView;
    }

    public void setAddKomercijalistaView(AddKomercijalistaView addKomercijalistaView) {
        this.addKomercijalistaView = addKomercijalistaView;
    }

    public AddLekView getAddLekView() {
        return addLekView;
    }

    public void setAddLekView(AddLekView addLekView) {
        this.addLekView = addLekView;
    }

    public AddMaloprodajnaCenaView getAddMaloprodajnaCenaView() {
        return addMaloprodajnaCenaView;
    }

    public void setAddMaloprodajnaCenaView(AddMaloprodajnaCenaView addMaloprodajnaCenaView) {
        this.addMaloprodajnaCenaView = addMaloprodajnaCenaView;
    }

    public AddPacijentView getAddPacijentView() {
        return addPacijentView;
    }

    public void setAddPacijentView(AddPacijentView addPacijentView) {
        this.addPacijentView = addPacijentView;
    }

    public AddReceptView getAddReceptView() {
        return addReceptView;
    }

    public void setAddReceptView(AddReceptView addReceptView) {
        this.addReceptView = addReceptView;
    }

    public AddUgovorView getAddUgovorView() {
        return addUgovorView;
    }

    public void setAddUgovorView(AddUgovorView addUgovorView) {
        this.addUgovorView = addUgovorView;
    }

    public AddZamenaView getAddZamenaView() {
        return addZamenaView;
    }

    public void setAddZamenaView(AddZamenaView addZamenaView) {
        this.addZamenaView = addZamenaView;
    }

    public UpdateAngazovanjeView getUpdateAngazovanjeView() {
        return updateAngazovanjeView;
    }

    public void setUpdateAngazovanjeView(UpdateAngazovanjeView updateangazovanjeview) {
        this.updateAngazovanjeView = updateangazovanjeview;
    }

    public UpdateApotekaView getUpdateApotekaView() {
        return updateApotekaView;
    }

    public void setUpdateApotekaView(UpdateApotekaView updateApotekaView) {
        this.updateApotekaView = updateApotekaView;
    }

    public UpdateFarmaceutView getUpdateFarmaceutView() {
        return updateFarmaceutView;
    }

    public void setUpdateFarmaceutView(UpdateFarmaceutView updateFarmaceutView) {
        this.updateFarmaceutView = updateFarmaceutView;
    }

    public UpdateLekView getUpdateLekView() {
        return updateLekView;
    }

    public void setUpdateLekView(UpdateLekView updateLekView) {
        this.updateLekView = updateLekView;
    }

    public UpdatePacijentView getUpdatePacijentView() {
        return updatePacijentView;
    }

    public void setUpdatePacijentView(UpdatePacijentView updatePacijentView) {
        this.updatePacijentView = updatePacijentView;
    }
    
}
