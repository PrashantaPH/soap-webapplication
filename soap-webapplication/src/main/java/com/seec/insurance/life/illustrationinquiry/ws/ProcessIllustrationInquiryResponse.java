
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
 *         <element name="processIllustrationInquiryReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "processIllustrationInquiryReturn"
})
@XmlRootElement(name = "processIllustrationInquiryResponse")
public class ProcessIllustrationInquiryResponse {

    @XmlElement(required = true)
    protected String processIllustrationInquiryReturn;

    /**
     * Gets the value of the processIllustrationInquiryReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIllustrationInquiryReturn() {
        return processIllustrationInquiryReturn;
    }

    /**
     * Sets the value of the processIllustrationInquiryReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIllustrationInquiryReturn(String value) {
        this.processIllustrationInquiryReturn = value;
    }

}
