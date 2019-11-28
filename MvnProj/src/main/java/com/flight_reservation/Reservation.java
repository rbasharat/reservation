package com.flight_reservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reservation {

	WebDriver driver;
	
	@FindBy(xpath="//a[@id='primary-header-flight']")
	WebElement header;
	@FindBy(xpath="//label[@id='flight-type-roundtrip-label-flp']")
	WebElement flighttype;
	@FindBy(xpath="//input[@id='flight-origin-flp']")
	WebElement flightfrom;
	@FindBy(xpath="//input[@id='flight-destination-flp']")
	WebElement flightto;
	@FindBy(xpath="//input[@id='flight-departing-flp']")
	WebElement departing;
	@FindBy(xpath="//button[@data-day='29' and @data-month='10']")
	WebElement flightdate;
	@FindBy(xpath="//input[@id='flight-returning-hp-flight']")
	WebElement returnbutton;
	@FindBy(xpath="//button[@data-day='30' and @data-month='10']")
	WebElement returndate;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	WebElement search;
	
	public Reservation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void clickflights() {
		header.click();	
	}
	public void click_roundtrip() {
		flighttype.click();
	}
	public void from(String ui) {
		flightfrom.sendKeys(ui);			
	}
	public void to(String ui) {
		flightto.sendKeys(ui);
	}	
	public void departfield() {
		departing.click();
	}
	public void depart_d() {
		flightdate.click();;
	}
	public void returnfield() {
		returnbutton.click();
	}	
	public void return_d() {
		returndate.click();
	}
	public void serchbutton() {
		search.click();
	}	

}
