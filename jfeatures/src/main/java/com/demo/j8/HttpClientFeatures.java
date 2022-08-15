package com.demo.j8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * Java 8 way of doing things, soo much of boilerpate code if we are not using a library
 */
public class HttpClientFeatures {

    public static int sendGet(){
        
        HttpURLConnection connection = null;
        try {

            URL url = new URL("https://google.com");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int statusCode = connection.getResponseCode();

            BufferedReader bread = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String respLines;

            StringBuilder respbody = new StringBuilder();

            while ((respLines = bread.readLine()) != null) {
                respbody.append(respLines).append(System.lineSeparator());

            }

            System.out.println(respbody);

            bread.close();
            connection.disconnect();
            return statusCode;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

    }

}
