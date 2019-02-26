
package com.htp.redcompany.jaxb.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subcategory" type="{http://www.example.org/category}subCategory_type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subcategory"
})
@XmlRootElement(name = "category")
public class Category {

    @XmlElement(required = true)
    protected List<SubCategoryType> subcategory;

    /**
     * Gets the value of the subcategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategoryType }
     * 
     * 
     */
    public List<SubCategoryType> getSubcategory() {
        if (subcategory == null) {
            subcategory = new ArrayList<SubCategoryType>();
        }
        return this.subcategory;
    }

}
