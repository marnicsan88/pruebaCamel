package ar.com.tinchodev.processor;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import ar.com.tinchodev.model.Spell;
import ar.com.tinchodev.model.SpellList;
import ar.com.tinchodev.model.Student;

@Component(value = "StudentProcessor")
public class StudentProcessor implements Processor{
	final AtomicLong counter = new AtomicLong();
	
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getBody());
		//System.out.println(exchange.getIn().getHeader("perdido"));
		System.out.println(exchange.getIn().getHeader("nombre"));
		SpellList lista = exchange.getIn().getBody(SpellList.class);
		System.out.println(lista.getEstudiante());
		for(Spell s : lista.getData()) {
			System.out.println(s.getCountry());
		}
		final String name = exchange.getIn().getHeader("nombre", String.class);
		exchange.getIn().setBody(exchange.getIn().getBody());
	}
}
