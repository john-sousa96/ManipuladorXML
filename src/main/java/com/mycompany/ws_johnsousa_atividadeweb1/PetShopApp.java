/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ws_johnsousa_atividadeweb1;

/**
 *
 * @author johnb
 */
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PetShopApp {

    public static void main(String[] args) {
        try {
            List<Animal> animais = new ArrayList<>();
            animais.add(new Animal("Pituxo", "Cachorro", "Viralata", "macho", "2025-01-27"));
            animais.add(new Animal("Snake", "Cobra", "Coral", "femea", "2022-10-05"));
            animais.add(new Animal("Bola de neve", "Gato", "null", "macho", "2000-05-05"));

            criarXML(animais, "animais.xml");
            List<Animal> animaisDoXml = lerXML("animais.xml");
            animaisDoXml.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void criarXML(List<Animal> animais, String arquivoXml) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(AnimalListWrapper.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        AnimalListWrapper wrapper = new AnimalListWrapper(animais);
        marshaller.marshal(wrapper, new File(arquivoXml));

        System.out.println("XML criado com sucesso: " + arquivoXml);
    }

    private static List<Animal> lerXML(String arquivoXml) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(AnimalListWrapper.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        AnimalListWrapper wrapper = (AnimalListWrapper) unmarshaller.unmarshal(new File(arquivoXml));
        return wrapper.getAnimais();
    }
}
