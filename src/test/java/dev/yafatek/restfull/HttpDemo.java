package dev.yafatek.restfull;import dev.yafatek.apicalls.ApiService;import dev.yafatek.models.DemoApiResponse;import dev.yafatek.networking.HttpResources;public class HttpDemo extends HttpResources<DemoApiResponse> {	public HttpDemo(ApiService apiService) {		super(apiService);	}	@Override	public DemoApiResponse post() {		return super.post();	}	@Override	public DemoApiResponse delete() {		return super.delete();	}	@Override	public DemoApiResponse update() {		return super.update();	}}