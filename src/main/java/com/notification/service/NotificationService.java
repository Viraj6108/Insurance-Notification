package com.notification.service;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.notification.entity.Policy;
import com.notification.mapper.Mapper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;



@Service
public class NotificationService {

	@Value("${spring.mail.username}")
	private String from;
	@Autowired
	JavaMailSender mailSender;
	@Autowired
	private TemplateEngine templateEngine;
	ObjectMapper objectmapper = new ObjectMapper();
	
	@KafkaListener(topics = "email-notification", groupId = "notification-group")
	public void sendEmailForPolicyCompletion(String policyDetails) throws MessagingException, JsonMappingException, JsonProcessingException
	{
		objectmapper.registerModule(new JavaTimeModule());
		Policy policy =  objectmapper.readValue(policyDetails, Policy.class);
//		Policy policy = gson.fromJson(policyDetails, Policy.class);
		
		
		objectmapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		Map<String, Object>data = new HashMap<>();
		Mapper mapper = new Mapper();
		data = mapper.toMap(policy);
		Context context = new Context();
		context.setVariables(data);
		String htmlContent = templateEngine.process("email-template", context);
		
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom("from");
		helper.setTo("veer6676@gmail.com");
		helper.setSubject("Complete policy details");
		helper.setText(htmlContent, true);
		
		mailSender.send(message);	
	}
	
	
		
	
	public byte[] generatePdf(Policy policy) throws IOException, JRException
	{
		InputStream inputstream = new ClassPathResource("policy.jrxml").getInputStream();
		JasperReport jasperReport = JasperCompileManager.compileReport(inputstream);
		
		return null;
		
	}
		
}
