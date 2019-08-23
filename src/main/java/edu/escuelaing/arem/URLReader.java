package edu.escuelaing.arem;

import java.io.*;
import java.net.*;

/**
 * Class of an App
 * 
 * @author Sergio Ruiz
 * 
 */
public class URLReader {
    /**
     * Encapsulates the application's main entry point.
     * 
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws IOException {

        URL google = new URL("https://www.github.com//Sergyo97");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            PrintWriter file = new PrintWriter("resultado.html");
            while ((inputLine = reader.readLine()) != null) {
                file.println(inputLine);
                // System.out.println(inputLine);
            }
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        URL twitter = new URL("https://www.twitter.com:2000/?xD=123#ab");
        System.out.println("Protocol: " + twitter.getProtocol());
        System.out.println("Authority: " + twitter.getAuthority());
        System.out.println("Host: " + twitter.getHost());
        System.out.println("Port: " + twitter.getPort());
        System.out.println("Path: " + twitter.getPath());
        System.out.println("Query: " + twitter.getQuery());
        System.out.println("File: " + twitter.getFile());
        System.out.println("Ref: " + twitter.getRef());
    }
}