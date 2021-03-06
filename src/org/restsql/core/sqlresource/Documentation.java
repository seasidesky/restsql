//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 08:37:51 PM EDT 
//


package org.restsql.core.sqlresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Documentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Documentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resource" type="{http://restsql.org/schema}Resource" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://restsql.org/schema}Columns" minOccurs="0"/>
 *         &lt;element name="examples" type="{http://restsql.org/schema}Examples" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documentation", propOrder = {
    "resource",
    "columns",
    "examples"
})
public class Documentation {

    protected DocumentationResource resource;
    protected DocumentationColumns columns;
    protected DocumentationExamples examples;

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationResource }
     *     
     */
    public DocumentationResource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationResource }
     *     
     */
    public void setResource(DocumentationResource value) {
        this.resource = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationColumns }
     *     
     */
    public DocumentationColumns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationColumns }
     *     
     */
    public void setColumns(DocumentationColumns value) {
        this.columns = value;
    }

    /**
     * Gets the value of the examples property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationExamples }
     *     
     */
    public DocumentationExamples getExamples() {
        return examples;
    }

    /**
     * Sets the value of the examples property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationExamples }
     *     
     */
    public void setExamples(DocumentationExamples value) {
        this.examples = value;
    }

}
