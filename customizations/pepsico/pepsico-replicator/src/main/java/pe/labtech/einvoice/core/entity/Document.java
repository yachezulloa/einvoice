/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.labtech.einvoice.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "BL_DOCUMENT")
@SequenceGenerator(name = "DOCUMENT_ID_GENERATOR", sequenceName = "DOCUMENT_SEQ")
public class Document implements Serializable {

    @Id
    @Column(name = "DOCUMENT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOCUMENT_ID_GENERATOR")
    private Long id;

    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;

    @Column(name = "DOCUMENT_DATE")
    private String documentDate;

    @Column(name = "CLIENT_ID")
    private String clientId;

    @Column(name = "PDF_URL")
    private String pdfURL;

    @Column(name = "XML_URL")
    private String xmlURL;

    @Column(name = "SIGNATURE")
    private String signature;

    @Column(name = "HASH")
    private String hash;

    @OneToMany(orphanRemoval = true, mappedBy = "document", cascade = CascadeType.ALL)
    private List<Item> items;

    @OneToMany(orphanRemoval = true, mappedBy = "document", cascade = CascadeType.ALL)
    private List<DocumentAttribute> attributes;

    @OneToMany(orphanRemoval = true, mappedBy = "document", cascade = CascadeType.ALL)
    private List<DocumentAuxiliar> auxiliars;

    @Column(name = "DOCUMENT_STEP")
    private String step;

    @Column(name = "DOCUMENT_STATUS")
    private String status;

    @OneToMany(orphanRemoval = true, mappedBy = "document")
    private List<EventTrace> trace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPdfURL() {
        return pdfURL;
    }

    public void setPdfURL(String pdfURL) {
        this.pdfURL = pdfURL;
    }

    public String getXmlURL() {
        return xmlURL;
    }

    public void setXmlURL(String xmlURL) {
        this.xmlURL = xmlURL;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<DocumentAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<DocumentAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<DocumentAuxiliar> getAuxiliars() {
        return auxiliars;
    }

    public void setAuxiliars(List<DocumentAuxiliar> auxiliars) {
        this.auxiliars = auxiliars;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<EventTrace> getTrace() {
        return trace;
    }

    public void setTrace(List<EventTrace> trace) {
        this.trace = trace;
    }

}
