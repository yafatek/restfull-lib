package dev.yafatek.restfull;import dev.yafatek.microservices.MicroService;import dev.yafatek.microservices.MicroServiceFactory;import org.junit.Test;public class ApiTests {	private MicroService<String> microService;	private MicroServicesProducerImpl producer;	private MicroServiceFactory factory;	@Test	public void TestApi() {		producer = new MicroServicesProducerImpl();		factory = producer.createMicroService("test");		microService = factory.createEndMicroService();		String result = microService.getFromMicroService();		System.out.println(result);	}}