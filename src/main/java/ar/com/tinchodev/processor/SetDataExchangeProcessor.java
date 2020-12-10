package ar.com.tinchodev.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import ar.com.tinchodev.model.Student;

@Component(value = "SetDataExchangeProcessor")
public class SetDataExchangeProcessor implements Processor{
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Grrrrrr");
		exchange.getOut().setBody("Esto me tiene que salir!!!!");
		exchange.getOut().setHeader("perdido", "POR MOMENTOS PERIDDISIMO");
		exchange.getOut().setHeader("nombre", exchange.getIn().getHeader("idPrestamo"));
	}
}
