package com.test1;

public class BlockTransferResponsetHeaders {
	private Integer responseTime;
	private Integer responseSize;
	private String socketIntialization;
	private String dnsLookup;
	private String tcpHandshake;
	private String sslHandshake;
	private String transferStart;
	private String contentType;
	private String contentLength;
	private String connectionString;
	private String defaultSrc;
	private String unsafeInline;
	private String responseHeader;
	private String unsafeEval;

	public BlockTransferResponsetHeaders() {

	}

	public BlockTransferResponsetHeaders(Integer responseTime, Integer responseSize, String socketIntialization,
			String dnsLookup, String tcpHandshake, String sslHandshake, String transferStart, String contentType,
			String contentLength, String connectionString, String defaultSrc, String unsafeInline,
			String responseHeader, String unsafeEval) {
		super();
		this.responseTime = responseTime;
		this.responseSize = responseSize;
		this.socketIntialization = socketIntialization;
		this.dnsLookup = dnsLookup;
		this.tcpHandshake = tcpHandshake;
		this.sslHandshake = sslHandshake;
		this.transferStart = transferStart;
		this.contentType = contentType;
		this.contentLength = contentLength;
		this.connectionString = connectionString;
		this.defaultSrc = defaultSrc;
		this.unsafeInline = unsafeInline;
		this.responseHeader = responseHeader;
		this.unsafeEval = unsafeEval;
	}

	public Integer getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Integer responseTime) {
		this.responseTime = responseTime;
	}

	public Integer getResponseSize() {
		return responseSize;
	}

	public void setResponseSize(Integer responseSize) {
		this.responseSize = responseSize;
	}

	public String getSocketIntialization() {
		return socketIntialization;
	}

	public void setSocketIntialization(String socketIntialization) {
		this.socketIntialization = socketIntialization;
	}

	public String getDnsLookup() {
		return dnsLookup;
	}

	public void setDnsLookup(String dnsLookup) {
		this.dnsLookup = dnsLookup;
	}

	public String getTcpHandshake() {
		return tcpHandshake;
	}

	public void setTcpHandshake(String tcpHandshake) {
		this.tcpHandshake = tcpHandshake;
	}

	public String getSslHandshake() {
		return sslHandshake;
	}

	public void setSslHandshake(String sslHandshake) {
		this.sslHandshake = sslHandshake;
	}

	public String getTransferStart() {
		return transferStart;
	}

	public void setTransferStart(String transferStart) {
		this.transferStart = transferStart;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentLength() {
		return contentLength;
	}

	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getDefaultSrc() {
		return defaultSrc;
	}

	public void setDefaultSrc(String defaultSrc) {
		this.defaultSrc = defaultSrc;
	}

	public String getUnsafeInline() {
		return unsafeInline;
	}

	public void setUnsafeInline(String unsafeInline) {
		this.unsafeInline = unsafeInline;
	}

	public String getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(String responseHeader) {
		this.responseHeader = responseHeader;
	}

	public String getUnsafeEval() {
		return unsafeEval;
	}

	public void setUnsafeEval(String unsafeEval) {
		this.unsafeEval = unsafeEval;
	}

}