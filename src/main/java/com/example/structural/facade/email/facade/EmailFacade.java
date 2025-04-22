package com.example.structural.facade.email.facade;

import com.example.structural.facade.email.Email;
import com.example.structural.facade.email.Mailer;
import com.example.structural.facade.email.Stationary;
import com.example.structural.facade.email.StationaryFactory;
import com.example.structural.facade.email.Template;
import com.example.structural.facade.email.TemplateFactory;
import com.example.structural.facade.email.Template.TemplateType;
import com.example.structural.facade.order.Order;

//Facade provides simple methods for client to use
public class EmailFacade {
	
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
