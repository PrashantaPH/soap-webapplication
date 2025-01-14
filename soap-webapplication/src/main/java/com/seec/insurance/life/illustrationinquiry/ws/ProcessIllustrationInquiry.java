
package com.seec.insurance.life.illustrationinquiry.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="txlifeRequest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "txlifeRequest"
})
@XmlRootElement(name = "processIllustrationInquiry")
public class ProcessIllustrationInquiry {

    @XmlElement(required = true)
    protected String txlifeRequest;

    /**
     * Gets the value of the txlifeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxlifeRequest() {
        return txlifeRequest;
    }

    /**
     * Sets the value of the txlifeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxlifeRequest(String value) {
        this.txlifeRequest = value;
    }

}
