/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ws_johnsousa_atividadeweb1;

/**
 *
 * @author johnb
 */
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "PetShop")
public class AnimalListWrapper {

    private List<Animal> animais;

    public AnimalListWrapper() {}

    public AnimalListWrapper(List<Animal> animais) {
        this.animais = animais;
    }

    @XmlElement(name = "Animal")
    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}
