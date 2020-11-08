package com.finzly.csvtodb.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindByName;

@Entity
@Table(name = "rates")
public class Rate {
	
	
	@Id
	@CsvBindByName(column = "ID", required = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer rateId;
	
	@CsvBindByName(column = "DATE", required = true)
	Date date;
	
	@CsvBindByName(column = "CURRENCY_NAME", required = true)
	String currencyName;
	
	@CsvBindByName(column = "CURRENCY_CODE", required = true)
	String currencyCode;
	
	@CsvBindByName(column = "TERMS", required = true)
	String terms;
	
	@CsvBindByName(column = "INTERNAL_SPOT_RATE", required = true)
	Double internalSpotRate;
	
	@CsvBindByName(column = "BUY_RATE", required = true)
	Double buyRate;
	
	@CsvBindByName(column = "SELL_RATE", required = true)
	Double sellRate;
	
	@CsvBindByName(column = "BOSS_RATE", required = true)
	Double bossRate;
	
	@CsvBindByName(column = "CUTOFF_TIME", required = true)
	Date cutoffTime;
	
	
	public Integer getRateId() {
		return rateId;
	}


	public void setRateId(Integer id) {
		this.rateId = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getCurrencyName() {
		return currencyName;
	}


	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}


	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}


	public String getTerms() {
		return terms;
	}


	public void setTerms(String terms) {
		this.terms = terms;
	}


	public Double getInternalSpotRate() {
		return internalSpotRate;
	}


	public void setInternalSpotRate(Double record) {
		this.internalSpotRate = record;
		
	}


	public Double getBuyRate() {
		return buyRate;
	}


	public void setBuyRate(Double buyRate) {
		this.buyRate = buyRate;
	}


	public Double getSellRate() {
		return sellRate;
	}


	public void setSellRate(Double sellRate) {
		this.sellRate = sellRate;
	}


	public Double getBossRate() {
		return bossRate;
	}


	public void setBossRate(Double bossRate) {
		this.bossRate = bossRate;
	}


	public Date getCutoffTime() {
		return cutoffTime;
	}


	public void setCutoffTime(Date cutoffTime) {
	       this.cutoffTime = cutoffTime;
	}


	@Override
	public String toString() {
		return "Rate [rateId=" + rateId + ", date=" + date + ", currencyName=" + currencyName + ", currencyCode="
				+ currencyCode + ", terms=" + terms + ", internalSpotRate=" + internalSpotRate + ", buyRate=" + buyRate
				+ ", sellRate=" + sellRate + ", bossRate=" + bossRate + ", cutoffTime=" + cutoffTime + "]";
	}


	
	
	
	
}
