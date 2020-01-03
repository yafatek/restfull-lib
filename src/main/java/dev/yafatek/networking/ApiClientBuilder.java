package dev.yafatek.networking;/** * Builder interface to initialize the  Api Client process. */public interface ApiClientBuilder {	/**	 * Builder Method to Create Customized Implementation Class	 *	 * @param clazz class Name to be init	 * @param <E>   Type of implementation Class	 * @return instance of the Class	 * @throws Exception Throw Exception if we Can't Create the Object.	 */	static <E> E builder(Class<E> clazz) throws Exception {		return clazz.getDeclaredConstructor().newInstance();	}	/**	 * builder To Init the Process With default implementation of the Interface.	 *	 * @return ApiClient Object witch is the Default implementation of hte interface	 */	static ApiClient buildWithDefaults() {		return ApiClient.ApiClientInit();	}	/**	 * init the Client	 */	void inti();	/**	 * perform operation	 */	void perform();	/**	 * retrieve the Data.	 */	void retrieve();}