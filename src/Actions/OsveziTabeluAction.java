package Actions;


import Baza.Baza;
import Tabele.Zamena;
import Tabele.Recept;
import Tabele.Farmaceut;
import Tabele.Komercijalista;
import Tabele.Doktor;
import Tabele.Dobavljac;
import Tabele.Apoteka;
import Tabele.Maloprodajna_cena;
import Tabele.Ugovor;
import Tabele.Pacijent;
import Tabele.Lek;
import Tabele.Angazovanje;
import Controller.Controller;
import java.sql.Date;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Filip
 */
public class OsveziTabeluAction implements EventHandler<ActionEvent> {

    public OsveziTabeluAction() {
    }

    @Override
    public void handle(ActionEvent event) {
        int izbor = Controller.getInstance().getPocetniEkranView().getPocetniEkranTabeleCb().getSelectionModel().getSelectedIndex();

        switch (izbor) {
            case 0:
                TableColumn<Angazovanje, Integer> idAngazovanjeTC = new TableColumn("ID_ANGAZOVANJE");
                idAngazovanjeTC.setCellValueFactory(new PropertyValueFactory<>("id"));
                TableColumn<Angazovanje, Integer> idApotekaAngazovanjeTC = new TableColumn("ID_APOTEKA");
                idApotekaAngazovanjeTC.setCellValueFactory(new PropertyValueFactory<>("apoteka_id"));
                TableColumn<Angazovanje, String> jmbgFarmaceutAngazovanjeTC = new TableColumn("JMBG_FARMACEUT");
                jmbgFarmaceutAngazovanjeTC.setCellValueFactory(new PropertyValueFactory<>("jmbg_farmaceut"));
                TableColumn<Angazovanje, Integer> brojMeseciTC = new TableColumn("BROJ_MESECI");
                brojMeseciTC.setCellValueFactory(new PropertyValueFactory<>("broj_meseci"));
                TableColumn<Angazovanje, Integer> brojDanaTC = new TableColumn("BROJ_DANA");
                brojDanaTC.setCellValueFactory(new PropertyValueFactory<>("broj_dana"));
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(idAngazovanjeTC, idApotekaAngazovanjeTC, jmbgFarmaceutAngazovanjeTC, brojMeseciTC, brojDanaTC);
                Baza.connect();
                ArrayList<Angazovanje> angazovanja = Baza.getAllAngazovanje();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(angazovanja));
                break;
            case 1:
                TableColumn<Apoteka, Integer> idApotekaTC = new TableColumn("ID_APOTEKA");
                idApotekaTC.setCellValueFactory(new PropertyValueFactory<>("id"));
                TableColumn<Apoteka, String> imeApotekaTC = new TableColumn("IME_APOTEKA");
                imeApotekaTC.setCellValueFactory(new PropertyValueFactory<>("ime"));
                TableColumn<Apoteka, String> adresaApotekaTC = new TableColumn("ADRESA_APOTEKA");
                adresaApotekaTC.setCellValueFactory(new PropertyValueFactory<>("adresa"));
                TableColumn<Apoteka, String> br_telefonaApotekaTC = new TableColumn("TELEFON_APOTEKA");
                br_telefonaApotekaTC.setCellValueFactory(new PropertyValueFactory<>("br_telefona"));
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(idApotekaTC, imeApotekaTC, adresaApotekaTC, br_telefonaApotekaTC);
                Baza.connect();
                ArrayList<Apoteka> apoteke = Baza.getAllApoteka();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(apoteke));
                break;
            case 2:
                TableColumn<Dobavljac, Integer> idDobavljacTC = new TableColumn("ID_DOBAVLJAC");
                idDobavljacTC.setCellValueFactory(new PropertyValueFactory<>("id"));
                TableColumn<Dobavljac, String> imeDobavljacTC = new TableColumn("IME_DOBAVLJAC");
                imeDobavljacTC.setCellValueFactory(new PropertyValueFactory<>("ime"));
                TableColumn<Dobavljac, String> br_telefonaDobavljacTC = new TableColumn("TELEFON_DOBAVLJAC");
                br_telefonaDobavljacTC.setCellValueFactory(new PropertyValueFactory<>("br_telefona"));
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(idDobavljacTC, imeDobavljacTC, br_telefonaDobavljacTC);
                Baza.connect();
                ArrayList<Dobavljac> dobavljaci = Baza.getAllDobavljac();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(dobavljaci));
                break;
            case 3:
                TableColumn<Doktor, String> jmbgDoktorTC = new TableColumn("JMBG_DOKTOR");
                jmbgDoktorTC.setCellValueFactory(new PropertyValueFactory<>("jmbg"));
                TableColumn<Doktor, String> imeDoktorTC = new TableColumn("IME_DOKTOR");
                imeDoktorTC.setCellValueFactory(new PropertyValueFactory<>("ime"));
                TableColumn<Doktor, String> adresaDoktorTC = new TableColumn("ADRESA_DOKTOR");
                adresaDoktorTC.setCellValueFactory(new PropertyValueFactory<>("adresa"));
                TableColumn<Doktor, Integer> starostDoktorTC = new TableColumn("STAROST_DOKTOR");
                starostDoktorTC.setCellValueFactory(new PropertyValueFactory<>("starost"));
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(jmbgDoktorTC, imeDoktorTC, adresaDoktorTC, starostDoktorTC);
                Baza.connect();
                ArrayList<Doktor> doktori = Baza.getAllDoktor();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(doktori));
                break;
            case 4:
                TableColumn<Farmaceut, String> jmbgFarmaceutTC = new TableColumn("JMBG_FARMACEUT");
                jmbgFarmaceutTC.setCellValueFactory(new PropertyValueFactory<>("jmbg"));
                TableColumn<Farmaceut, String> imeFarmaceutTC = new TableColumn("IME_FARMACEUT");
                imeFarmaceutTC.setCellValueFactory(new PropertyValueFactory<>("ime"));
                TableColumn<Farmaceut, String> prezimeFarmaceutTC = new TableColumn("PREZIME FARMACEUT");
                prezimeFarmaceutTC.setCellValueFactory(new PropertyValueFactory<>("prezime"));
                TableColumn<Farmaceut, String> adresaFarmaceutTC = new TableColumn("ADRESA FARMACEUT");
                adresaFarmaceutTC.setCellValueFactory(new PropertyValueFactory<>("adresa"));
                TableColumn<Farmaceut, String> strucnaSpremaFarmaceutTC = new TableColumn("STRUCNA_SPREMA");
                strucnaSpremaFarmaceutTC.setCellValueFactory(new PropertyValueFactory<>("strucnaSprema"));
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(jmbgFarmaceutTC, imeFarmaceutTC, prezimeFarmaceutTC, adresaFarmaceutTC, strucnaSpremaFarmaceutTC);
                Baza.connect();
                ArrayList<Farmaceut> farmaceuti = Baza.getAllFarmaceut();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(farmaceuti));
                break;
            case 5:
                TableColumn<Komercijalista, String> jmbgKomercijalistaTC = new TableColumn("JMBG_KOMERCIJALISTA");
                jmbgKomercijalistaTC.setCellValueFactory(new PropertyValueFactory<>("jmbg"));

                TableColumn<Komercijalista, String> imeKomercijalistaTC = new TableColumn("IME_KOMERCIJALISTA");
                imeKomercijalistaTC.setCellValueFactory(new PropertyValueFactory<>("ime"));

                TableColumn<Komercijalista, String> prezimeKomercijalistaTC = new TableColumn("PREZIME_KOMERCIJALISTA");
                prezimeKomercijalistaTC.setCellValueFactory(new PropertyValueFactory<>("prezime"));

                TableColumn<Komercijalista, String> adresaKomercijalistaTC = new TableColumn("ADRESA_KOMERCIJALISTA");
                adresaKomercijalistaTC.setCellValueFactory(new PropertyValueFactory<>("adresa"));

                TableColumn<Komercijalista, String> telefonKomercijalistaTC = new TableColumn("TELEFON_KOMERCIJALISTA");
                telefonKomercijalistaTC.setCellValueFactory(new PropertyValueFactory<>("br_telefona"));
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(jmbgKomercijalistaTC, imeKomercijalistaTC, prezimeKomercijalistaTC, adresaKomercijalistaTC, telefonKomercijalistaTC);
                Baza.connect();
                ArrayList<Komercijalista> komercijalisti = Baza.getAllKomercijalista();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(komercijalisti));
                break;
            case 6:
                TableColumn<Lek, Integer> sifraLekLekTC = new TableColumn("SIFRA_LEK");
                sifraLekLekTC.setCellValueFactory(new PropertyValueFactory<>("sifra"));

                TableColumn<Lek, Integer> idDobavljackLekTC = new TableColumn("ID_DOBAVLJAC");
                idDobavljackLekTC.setCellValueFactory(new PropertyValueFactory<>("dobavljac_id"));

                TableColumn<Lek, String> imeLekLekTC = new TableColumn("IME_LEK");
                imeLekLekTC.setCellValueFactory(new PropertyValueFactory<>("ime"));

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(sifraLekLekTC, idDobavljackLekTC, imeLekLekTC);

                Baza.connect();
                ArrayList<Lek> lekovi = Baza.getAllLek();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(lekovi));
                break;
            case 7:
                TableColumn<Maloprodajna_cena, Integer> idCenaMaloprodajnaCenaTC = new TableColumn("ID_CENA");
                idCenaMaloprodajnaCenaTC.setCellValueFactory(new PropertyValueFactory<>("id"));

                TableColumn<Maloprodajna_cena, Integer> idApotekaMaloprodajnaCenaTC = new TableColumn("ID_APOTEKA");
                idApotekaMaloprodajnaCenaTC.setCellValueFactory(new PropertyValueFactory<>("apoteka_id"));

                TableColumn<Maloprodajna_cena, Integer> idSifraLekMaloprodajnaCenaTC = new TableColumn("SIFRA_LEK");
                idSifraLekMaloprodajnaCenaTC.setCellValueFactory(new PropertyValueFactory<>("sifra_lek"));

                TableColumn<Maloprodajna_cena, Integer> idCenaLekaMaloprodajnaCenaTC = new TableColumn("CENA_LEKA");
                idCenaLekaMaloprodajnaCenaTC.setCellValueFactory(new PropertyValueFactory<>("cena_leka"));

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(idCenaMaloprodajnaCenaTC, idApotekaMaloprodajnaCenaTC, idSifraLekMaloprodajnaCenaTC, idCenaLekaMaloprodajnaCenaTC);
                Baza.connect();
                ArrayList<Maloprodajna_cena> maloprodajnecene = Baza.getAllMaloprodajnaCena();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(maloprodajnecene));
                break;
            case 8:
                TableColumn<Pacijent, String> jmbgPacijentPacijentTC = new TableColumn("JMBG_PACIJENT");
                jmbgPacijentPacijentTC.setCellValueFactory(new PropertyValueFactory<>("jmbg"));

                TableColumn<Pacijent, String> jmbgDoktorPacijentTC = new TableColumn("JMBG_DOKTOR");
                jmbgDoktorPacijentTC.setCellValueFactory(new PropertyValueFactory<>("jmbg_doktor"));

                TableColumn<Pacijent, String> imePacijentPacijentTC = new TableColumn("IME_PACIJENT");
                imePacijentPacijentTC.setCellValueFactory(new PropertyValueFactory<>("ime"));

                TableColumn<Pacijent, String> adresaPacijentPacijentTC = new TableColumn("ADRESA_PACIJENT");
                adresaPacijentPacijentTC.setCellValueFactory(new PropertyValueFactory<>("adresa"));

                TableColumn<Pacijent, Integer> starostPacijentPacijentTC = new TableColumn("STAROST_PACIJENT");
                starostPacijentPacijentTC.setCellValueFactory(new PropertyValueFactory<>("starost_pacijent"));

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(jmbgPacijentPacijentTC, jmbgDoktorPacijentTC, imePacijentPacijentTC, adresaPacijentPacijentTC, starostPacijentPacijentTC);

                Baza.connect();
                ArrayList<Pacijent> pacijenti = Baza.getAllPacijent();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(pacijenti));

                break;
            case 9:
                TableColumn<Recept, Integer> idReceptTC = new TableColumn("ID_RECEPT");
                idReceptTC.setCellValueFactory(new PropertyValueFactory<>("id"));

                TableColumn<Recept, String> jmbgPacijentTC = new TableColumn("JMBG_PACIJENT");
                jmbgPacijentTC.setCellValueFactory(new PropertyValueFactory<>("jmbg_pacijent"));

                TableColumn<Recept, Integer> sifraLekTC = new TableColumn("SIFRA_LEK");
                sifraLekTC.setCellValueFactory(new PropertyValueFactory<>("sifra_lek"));

                TableColumn<Recept, String> jmbgDoktorReceptTC = new TableColumn("JMBG_DOKTOR");
                jmbgDoktorReceptTC.setCellValueFactory(new PropertyValueFactory<>("jmbg_doktor"));

                TableColumn<Recept, Date> datumReceptTC = new TableColumn("DATUM");
                datumReceptTC.setCellValueFactory(new PropertyValueFactory<>("datum"));

                TableColumn<Recept, Integer> kolicinaLekovaTC = new TableColumn("KOLICINA_LEKOVA");
                kolicinaLekovaTC.setCellValueFactory(new PropertyValueFactory<>("kolicina_lekova"));

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(idReceptTC, jmbgPacijentTC, sifraLekTC, jmbgDoktorReceptTC, datumReceptTC, kolicinaLekovaTC);

                Baza.connect();
                ArrayList<Recept> recepti = Baza.getAllRecept();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(recepti));
                break;
            case 10:
                TableColumn<Ugovor, Integer> ugovorIdTC = new TableColumn("UGOVOR_ID");
                ugovorIdTC.setCellValueFactory(new PropertyValueFactory<>("id"));

                TableColumn<Ugovor, Integer> idDobavljacUgovorTC = new TableColumn("ID_DOBAVLJAC");
                idDobavljacUgovorTC.setCellValueFactory(new PropertyValueFactory<>("id_dobavljac"));

                TableColumn<Ugovor, Integer> idApotekaUgovorTC = new TableColumn("ID_APOTEKA");
                idApotekaUgovorTC.setCellValueFactory(new PropertyValueFactory<>("id_apoteka"));

                TableColumn<Ugovor, String> jmbgKomercijalistaUgovorTC = new TableColumn("UGOVOR_ID");
                jmbgKomercijalistaUgovorTC.setCellValueFactory(new PropertyValueFactory<>("jmbg_komercijalista"));

                TableColumn<Ugovor, Date> pocetakVazenjaTC = new TableColumn("POCETAK_VAZENJA");
                pocetakVazenjaTC.setCellValueFactory(new PropertyValueFactory<>("pocetak_vazenja"));

                TableColumn<Ugovor, Date> krajVazenjaTC = new TableColumn("KRAJ_VAZENJA");
                krajVazenjaTC.setCellValueFactory(new PropertyValueFactory<>("kraj_vazenja"));

                TableColumn<Ugovor, String> tekstUgovorTC = new TableColumn("TEKST_UGOVOR");
                tekstUgovorTC.setCellValueFactory(new PropertyValueFactory<>("tekst_ugovor"));

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(ugovorIdTC, idDobavljacUgovorTC, idApotekaUgovorTC, jmbgKomercijalistaUgovorTC, pocetakVazenjaTC, krajVazenjaTC, tekstUgovorTC);

                Baza.connect();
                ArrayList<Ugovor> ugovori = Baza.getAllUgovor();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(ugovori));

                break;
            case 11:
                TableColumn<Zamena, Integer> zamenaIdTC = new TableColumn("ZAMENA_ID");
                zamenaIdTC.setCellValueFactory(new PropertyValueFactory<>("zamena_id"));

                TableColumn<Ugovor, Integer> sifraLekZamenaTC = new TableColumn("SIFRA_LEK");
                sifraLekZamenaTC.setCellValueFactory(new PropertyValueFactory<>("sifra_lek"));

                TableColumn<Ugovor, Integer> zamenaSifraLekZamenaTC = new TableColumn("ZAMENA_SIFRA_LEK");
                zamenaSifraLekZamenaTC.setCellValueFactory(new PropertyValueFactory<>("zamena_sifra_lek"));

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().clear();

                Controller.getInstance().getPocetniEkranView().getTabela()
                        .getColumns().addAll(zamenaIdTC, sifraLekZamenaTC, zamenaSifraLekZamenaTC);

                Baza.connect();
                ArrayList<Zamena> zamene = Baza.getAllZamena();
                Baza.disconnect();
                Controller.getInstance().getPocetniEkranView().getTabela()
                        .setItems(FXCollections.observableArrayList(zamene));

                break;
            default:
                break;
        }
    }
    

}
