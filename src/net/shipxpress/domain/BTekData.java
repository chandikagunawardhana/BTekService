package net.shipxpress.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="FACILITYOPS", name="B_TEK_DATA")
public class BTekData implements Serializable {

	private static final long serialVersionUID = 1L;

	public BTekData(Long number, Long accessCard, String active, String carrier, String customer, Date bTekDataDate, String destination,
			String grade, BigDecimal gross, String initials, String location, BigDecimal inWeight, String inYard, BigDecimal net,
			BigDecimal tare, Date inDateTime, Date outDateTime, BigDecimal tons, BigDecimal totalTons, Long truck, String poNumber) {
		this.bTekNumber = number;
		this.accessCard = accessCard;
		this.active = active;
		this.carrier = carrier;
		this.customer = customer;
		this.bTekDataDate = bTekDataDate;
		this.destination = destination;
		this.grade = grade;
		this.gross = gross;
		this.initials = initials;
		this.location = location;
		this.inWeight = inWeight;
		this.inYard = inYard;
		this.net = net;
		this.tare = tare;
		this.inDateTime = inDateTime;
		this.outDateTime = outDateTime;
		this.tons = tons;
		this.totalTons = totalTons;
		this.poNumber = poNumber;
	}
	
	public BTekData() {
		
	}
	
	@Id
	@SequenceGenerator(name="SEQ_GEN", sequenceName="FACILITYOPS.B_TEK_DATA_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	private Long bTekDataId;

	@Column
	private Long bTekNumber;

	@Column
	private Long accessCard;
	
	@Column
	private String active;

	@Column
	private String carrier;

	@Column
	private String customer;

	@Column
	private Date bTekDataDate;

	@Column
	private String destination;

	@Column
	private String grade;

	@Column
	private BigDecimal gross;

	@Column
	private String initials;

	@Column
	private String location;

	@Column
	private BigDecimal inWeight;

	@Column
	private String inYard;

	@Column
	private BigDecimal net;

	@Column
	private BigDecimal tare;

	@Column
	private Date inDateTime;

	@Column
	private Date outDateTime;

	@Column
	private BigDecimal tons;
	
	@Column
	private BigDecimal totalTons;

	@Column
	private Long truck;

	@Column
	private String poNumber;

	public Long getbTekDataId() {
		return bTekDataId;
	}

	public void setbTekDataId(Long bTekDataId) {
		this.bTekDataId = bTekDataId;
	}

	public Long getbTekNumber() {
		return bTekNumber;
	}

	public void setbTekNumber(Long bTekNumber) {
		this.bTekNumber = bTekNumber;
	}

	public Long getAccessCard() {
		return accessCard;
	}

	public void setAccessCard(Long accessCard) {
		this.accessCard = accessCard;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public BigDecimal getGross() {
		return gross;
	}

	public void setGross(BigDecimal gross) {
		this.gross = gross;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BigDecimal getInWeight() {
		return inWeight;
	}

	public void setInWeight(BigDecimal inWeight) {
		this.inWeight = inWeight;
	}

	public String getInYard() {
		return inYard;
	}

	public void setInYard(String inYard) {
		this.inYard = inYard;
	}

	public BigDecimal getNet() {
		return net;
	}

	public void setNet(BigDecimal net) {
		this.net = net;
	}

	public BigDecimal getTare() {
		return tare;
	}

	public void setTare(BigDecimal tare) {
		this.tare = tare;
	}

	public Date getInDateTime() {
		return inDateTime;
	}

	public void setInDateTime(Date inDateTime) {
		this.inDateTime = inDateTime;
	}

	public Date getOutDateTime() {
		return outDateTime;
	}

	public void setOutDateTime(Date outDateTime) {
		this.outDateTime = outDateTime;
	}

	public BigDecimal getTons() {
		return tons;
	}

	public void setTons(BigDecimal tons) {
		this.tons = tons;
	}

	public Long getTruck() {
		return truck;
	}

	public void setTruck(Long truck) {
		this.truck = truck;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@Override
	public String toString() {
		return "BTekData bTekDataId:" + bTekDataId;
	}

	public Date getbTekDataDate() {
		return bTekDataDate;
	}

	public void setbTekDataDate(Date bTekDataDate) {
		this.bTekDataDate = bTekDataDate;
	}

	public BigDecimal getTotalTons() {
		return totalTons;
	}

	public void setTotalTons(BigDecimal totalTons) {
		this.totalTons = totalTons;
	}
}
