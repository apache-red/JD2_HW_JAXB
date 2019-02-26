package com.htp.redcompany.jaxb.start;

import com.htp.redcompany.jaxb.entity.Category;
import com.htp.redcompany.jaxb.entity.SubCategoryType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Start {




    public static void main(String[] args) throws JAXBException {


        //read  !!!!!!!!!!!!не забыть изменить pom.xml после авто создания сущностей

        File file = new File("p:\\JavaProjects\\jd2-hw-jaxb\\src\\main\\resources\\category.xml");
        JAXBContext context =  JAXBContext.newInstance("com.htp.redcompany.jaxb.entity");

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Category category = (Category) unmarshaller.unmarshal(file);

        System.out.println();

        for (SubCategoryType subCategoryType : category.getSubcategory()) {
            System.out.println(subCategoryType.getMovie());
        }

//            File file = new File("p:\\JavaProjects\\jd2-hw-jaxb\\src\\main\\resources\\notes.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance("com.htp.redcompany.jaxb.entity");
//
//        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//        Notes notes = (Notes) jaxbUnmarshaller.unmarshal(file);
//
//        System.out.println();
//        for (Note n : notes.getNote()) {
//            System.out.println(n.getBody());
//        }



        }
    }



