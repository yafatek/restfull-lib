package dev.yafatek.restfull;import dev.yafatek.microservices.MicroService;import java.util.List;public class MicroServiceImpl implements MicroService<String> {	@Override	public String getFromMicroService() {		return "testing";	}	@Override	public String getFromMicroService(Object params) {		return null;	}	@Override	public String postToMicroService(Object params) {		return null;	}	@Override	public List<String> postToMicroServiceRespToList(Object param) {		return null;	}	@Override	public String deleteFromMicroService(Object params) {		return null;	}	@Override	public String updateInMicroService(Object params) {		return null;	}}