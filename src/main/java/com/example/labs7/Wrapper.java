package com.example.labs7;

import javafx.collections.ObservableList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "Agreements")
public class Wrapper {
    private ArrayList<Agreement> agreements;
    @XmlElement(name = "Agrement")
    public ArrayList<Agreement> getAgreements() {return agreements;}
    public void setAgreements(ArrayList<Agreement> agreements) {this.agreements = agreements;}
}
