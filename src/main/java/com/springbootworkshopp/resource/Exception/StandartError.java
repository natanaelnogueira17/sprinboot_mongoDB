package com.springbootworkshopp.resource.Exception;

import java.io.Serializable;

public class StandartError implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long timestamp;
	private int status;
	private String erro;
	private String path;
	private String messenger;

	public StandartError() {
		super();
	}

	public StandartError(Long timestamp, int status, String erro, String path, String messenger) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.erro = erro;
		this.path = path;
		this.messenger = messenger;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessenger() {
		return messenger;
	}

	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}
	
	

}
