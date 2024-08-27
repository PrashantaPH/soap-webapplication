package com.webservices.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.webservices.beans.DTPrintRequest;
import com.webservices.beans.DTPrintResponse;
import com.webservices.beans.PrintPDFRequest;
import com.webservices.beans.PrintPDFResponse;

@Endpoint
public class PrintPDFEndpoint {

	private static final String NAMESPACE = "http://beans.webservices.com";
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "printPDFRequest")
	@ResponsePayload
	public PrintPDFResponse get(@RequestPayload PrintPDFRequest printPDFRequest) {
		DTPrintRequest dtPrintRequest = printPDFRequest.getRequest();
		DTPrintResponse dtPrintResponse = new DTPrintResponse();
		
		dtPrintResponse.setSuccess(true);
		dtPrintResponse.setErrorMessage(null);
		dtPrintResponse.setDocumentStream(dtPrintRequest.getXMLDcoment().getBytes());
		
		PrintPDFResponse printPDFResponse = new PrintPDFResponse();
		printPDFResponse.setReturn(dtPrintResponse);
		
		return printPDFResponse;
	}
}
