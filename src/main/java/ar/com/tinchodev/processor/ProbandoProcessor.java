package ar.com.tinchodev.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import ar.com.tinchodev.model.Student;

@Component(value = "PProcessor")
public class ProbandoProcessor implements Processor{
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getHeader("idPrestamo"));
		exchange.getOut().setHeader("nombre", exchange.getIn().getHeader("idPrestamo"));
	}
}
