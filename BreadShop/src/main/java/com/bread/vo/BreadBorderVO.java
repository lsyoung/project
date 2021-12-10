package com.bread.vo;

public class BreadBorderVO {

	private int borderId;
	private String borderTitle;
	private String borderContent;
	private String borderWriter;
	
	
	
	public BreadBorderVO() {
		super();
	}
	
	public BreadBorderVO(int borderId, String borderTitle, String borderContent, String borderWriter) {
		super();
		this.borderId = borderId;
		this.borderTitle = borderTitle;
		this.borderContent = borderContent;
		this.borderWriter = borderWriter;
	}
	
	public int getBorderId() {
		return borderId;
	}
	public void setBorderId(int borderId) {
		this.borderId = borderId;
	}
	public String getBorderTitle() {
		return borderTitle;
	}
	public void setBorderTitle(String borderTitle) {
		this.borderTitle = borderTitle;
	}
	public String getBorderContent() {
		return borderContent;
	}
	public void setBorderContent(String borderContent) {
		this.borderContent = borderContent;
	}
	public String getBorderWriter() {
		return borderWriter;
	}
	public void setBorderWriter(String borderWriter) {
		this.borderWriter = borderWriter;
	}
	@Override
	public String toString() {
		return "BreadBorderVO [borderId=" + borderId + ", borderTitle=" + borderTitle + ", borderContent="
				+ borderContent + ", borderWriter=" + borderWriter + "]";
	}
	
	
	
}
