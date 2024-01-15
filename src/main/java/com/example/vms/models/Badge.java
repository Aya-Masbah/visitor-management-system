package com.example.vms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private String visitorName;
    private byte[] eventLogo;
    private byte[] visitorPhoto;
    private String barcodeOrQrCode;
    
    @OneToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;
    
    @OneToOne(mappedBy = "badge")
    private Security security;

    // Constructors
    public Badge() {}

    public Badge(String eventName, String visitorName, byte[] eventLogo, byte[] visitorPhoto, String barcodeOrQrCode) {
        this.eventName = eventName;
        this.visitorName = visitorName;
        this.eventLogo = eventLogo;
        this.visitorPhoto = visitorPhoto;
        this.barcodeOrQrCode = barcodeOrQrCode;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public byte[] getEventLogo() {
		return eventLogo;
	}

	public void setEventLogo(byte[] eventLogo) {
		this.eventLogo = eventLogo;
	}

	public byte[] getVisitorPhoto() {
		return visitorPhoto;
	}

	public void setVisitorPhoto(byte[] visitorPhoto) {
		this.visitorPhoto = visitorPhoto;
	}

	public String getBarcodeOrQrCode() {
		return barcodeOrQrCode;
	}

	public void setBarcodeOrQrCode(String barcodeOrQrCode) {
		this.barcodeOrQrCode = barcodeOrQrCode;
	}

    
}
