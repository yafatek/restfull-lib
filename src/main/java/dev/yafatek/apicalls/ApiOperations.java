package dev.yafatek.apicalls;import retrofit2.Call;import retrofit2.http.GET;import retrofit2.http.Path;import java.util.List;public interface ApiOperations<T> {	String GET_REQUEST = "";	String REQUEST_PARAM = "";	@GET(GET_REQUEST)	Call<List<T>> getData(@Path(REQUEST_PARAM) String requestParam);}