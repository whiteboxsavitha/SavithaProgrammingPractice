package com.httpcleint.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

/**
 * Hello world!
 *
 */
public class HTTPClientDemo 
{
    public static void main( String[] args ) throws URISyntaxException, ClientProtocolException, IOException
    {
    		HttpClient hc = HttpClients.createDefault();
    		HttpGet getmethod = new HttpGet();
    		getmethod.setURI(new URI("http://localhost:8081/RestDemo/Employee/getEmployee/123"));
    		
    		HttpResponse response = hc.execute(getmethod);
    		BufferedReader ir = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
    	
    	
    	System.out.println(ir.readLine());
    }
}
