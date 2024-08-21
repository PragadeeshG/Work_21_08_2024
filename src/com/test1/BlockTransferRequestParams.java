package com.test1;

public class BlockTransferRequestParams {
	private Integer requestURL;
	private String asOfDate;
	private boolean sorted;
	private Integer pageNo;
	private Integer pageSize;
	private String responseCount;
	private Integer accepts;
	private Integer produces;
	private String noCache;
	private Integer mustRevalidate;
	private Integer includeSubdomain;
	private String dateFormat;
	private String remarks;

	public BlockTransferRequestParams() {

	}

	public BlockTransferRequestParams(Integer requestURL, String asOfDate, boolean sorted, Integer pageNo,
			Integer pageSize, String responseCount, Integer accepts, Integer produces, String noCache,
			Integer mustRevalidate, Integer includeSubdomain, String dateFormat, String remarks) {
		super();
		this.requestURL = requestURL;
		this.asOfDate = asOfDate;
		this.sorted = sorted;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.responseCount = responseCount;
		this.accepts = accepts;
		this.produces = produces;
		this.noCache = noCache;
		this.mustRevalidate = mustRevalidate;
		this.includeSubdomain = includeSubdomain;
		this.dateFormat = dateFormat;
		this.remarks = remarks;
	}

	public Integer getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(Integer requestURL) {
		this.requestURL = requestURL;
	}

	public String getAsOfDate() {
		return asOfDate;
	}

	public void setAsOfDate(String asOfDate) {
		this.asOfDate = asOfDate;
	}

	public boolean isSorted() {
		return sorted;
	}

	public void setSorted(boolean sorted) {
		this.sorted = sorted;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getResponseCount() {
		return responseCount;
	}

	public void setResponseCount(String responseCount) {
		this.responseCount = responseCount;
	}

	public Integer getAccepts() {
		return accepts;
	}

	public void setAccepts(Integer accepts) {
		this.accepts = accepts;
	}

	public Integer getProduces() {
		return produces;
	}

	public void setProduces(Integer produces) {
		this.produces = produces;
	}

	public String getNoCache() {
		return noCache;
	}

	public void setNoCache(String noCache) {
		this.noCache = noCache;
	}

	public Integer getMustRevalidate() {
		return mustRevalidate;
	}

	public void setMustRevalidate(Integer mustRevalidate) {
		this.mustRevalidate = mustRevalidate;
	}

	public Integer getIncludeSubdomain() {
		return includeSubdomain;
	}

	public void setIncludeSubdomain(Integer includeSubdomain) {
		this.includeSubdomain = includeSubdomain;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
