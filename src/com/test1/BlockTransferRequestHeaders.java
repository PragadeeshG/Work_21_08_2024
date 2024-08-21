package com.test1;

public class BlockTransferRequestHeaders {
	private String requestDate;
	private String server;
	private String xFrameOptions;
	private String sameOrigin;
	private String strictTransportSecurity;
	private String contentTypeOptions;
	private String xssProtection;
	private String cacheControl;
	private String pragma;
	private String expires;

	public BlockTransferRequestHeaders() {

	}

	public BlockTransferRequestHeaders(String requestDate, String server, String xFrameOptions, String sameOrigin,
			String strictTransportSecurity, String contentTypeOptions, String xssProtection, String cacheControl,
			String pragma, String expires) {
		super();
		this.requestDate = requestDate;
		this.server = server;
		this.xFrameOptions = xFrameOptions;
		this.sameOrigin = sameOrigin;
		this.strictTransportSecurity = strictTransportSecurity;
		this.contentTypeOptions = contentTypeOptions;
		this.xssProtection = xssProtection;
		this.cacheControl = cacheControl;
		this.pragma = pragma;
		this.expires = expires;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getxFrameOptions() {
		return xFrameOptions;
	}

	public void setxFrameOptions(String xFrameOptions) {
		this.xFrameOptions = xFrameOptions;
	}

	public String getSameOrigin() {
		return sameOrigin;
	}

	public void setSameOrigin(String sameOrigin) {
		this.sameOrigin = sameOrigin;
	}

	public String getStrictTransportSecurity() {
		return strictTransportSecurity;
	}

	public void setStrictTransportSecurity(String strictTransportSecurity) {
		this.strictTransportSecurity = strictTransportSecurity;
	}

	public String getContentTypeOptions() {
		return contentTypeOptions;
	}

	public void setContentTypeOptions(String contentTypeOptions) {
		this.contentTypeOptions = contentTypeOptions;
	}

	public String getXssProtection() {
		return xssProtection;
	}

	public void setXssProtection(String xssProtection) {
		this.xssProtection = xssProtection;
	}

	public String getCacheControl() {
		return cacheControl;
	}

	public void setCacheControl(String cacheControl) {
		this.cacheControl = cacheControl;
	}

	public String getPragma() {
		return pragma;
	}

	public void setPragma(String pragma) {
		this.pragma = pragma;
	}

	public String getExpires() {
		return expires;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}

}
