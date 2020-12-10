package ar.com.tinchodev.router;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import ar.com.tinchodev.model.Spell;
import ar.com.tinchodev.model.SpellList;

@Component
public class CamelRouter extends RouteBuilder{
	
	@Value("${rest.host}") 
	private String host;
    @Value("${rest.port}") 
	private String port;
    
    JacksonDataFormat spellDataFormat = new JacksonDataFormat(SpellList.class);
	
	@Override
	public void configure() {
		restConfiguration()
		.apiProperty("api.title", "prestamos-precancelacion")
		.apiProperty("api.description","Microservicio que simula y precancela prestamos")
		.apiProperty("api.version", "0.0.1-SNAPSHOT")
		.apiProperty("cors", "true")
		.apiProperty("base.path", "v1/precancelacion/")
		.apiProperty("api.path", "/")
		.component("jetty")
		.host(host).port(port)
		.bindingMode(RestBindingMode.json);

		rest("/cuotas").produces("application/json")
		.get("/{idPrestamo}")
		.to("direct:procesarRequest");
		
		rest("/simulacion").produces("application/json")
		.get("/{idPrestamo}").to("direct:records");
		
		from("direct:procesarRequest").process("PProcessor").to("direct:apiPrueba");

		from("direct:records").process("SetDataExchangeProcessor").to("direct:daleLoco").end();
		
		from("direct:apiPrueba")
		.log("Http Route started")
        .setHeader(Exchange.HTTP_METHOD).constant(HttpMethod.GET)
        //.to("https://5f6a9065d808b90016bc1301.mockapi.io/spellmarketapi/v1/spell")
        .to("https://fakerapi.it/api/v1/addresses?_quantity=15")
        .unmarshal(spellDataFormat)
        .log("Response : ${body}")
        .process("StudentProcessor").end();
		
		from("direct:daleLoco").process("StudentProcessor").end();
		
		
		/*
		rest("prueba")
		.get("/student/")
		.route()
		.to("direct:records");

		from("direct:records")
		.log("dale loco")
		.setBody(constant("REQUEST PROCESADA CORRECTAMENTE"))
		.end();*/
	
	}
}
