package com.demo.j11;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


/*
 * Java 11 way of doing things, new http client introduction
 */
public class HttpClientFeatures {
    
    public static int sendGet() throws Exception
    {
        
        HttpClient client = HttpClient.newHttpClient();
        URL url = new URL("https://google.com");

        HttpRequest req = HttpRequest.newBuilder().GET().uri(url.toURI()).build();

        var resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(resp);

        

        return resp.statusCode();
    }


    public static void sendGetAsync() throws Exception
    {
        
        HttpClient client = HttpClient.newHttpClient();
        URL url = new URL("https://google.com");

        HttpRequest req = HttpRequest.newBuilder()
                                     .GET()
                                     .uri(url.toURI())
                                     .build();

        CompletableFuture<HttpResponse<String>> response = client.sendAsync(req, HttpResponse.BodyHandlers.ofString());
        

        String result = response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);
        System.out.println(result);

    }

}
