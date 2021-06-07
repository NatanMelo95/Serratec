package br.com.serratec.hotelserratec.model.exception.error;

public class ErrorMessage {
	private String title;
	private Integer status;
	private String datail;
	private String developerMessage;
	private Long timestamp;
	
	public ErrorMessage(String title, Integer status, String datail, String developerMessage, Long timestamp) {
		super();
		this.title = title;
		this.status = status;
		this.datail = datail;
		this.developerMessage = developerMessage;
		this.timestamp = timestamp;
	}
	public String getTitle() {
		return title;
	}
	public Integer getStatus() {
		return status;
	}
	public String getDatail() {
		return datail;
	}
	public String getDeveloperMessage() {
		return developerMessage;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	
}
