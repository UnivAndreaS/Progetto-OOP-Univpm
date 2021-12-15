package com.univpm.openweather.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class JsonApi {

	final String url = "api.openweathermap.org/data/2.5/weather";
	int lat;
	int lon;
	final String appId = "ed69896bfbd4e9b535cf4034ba9ac3f9"; 
	
	JSONParser parseMeteo = new JSONParser();
	FileReader leggiMeteo = new FileReader("ProvaMeteo");
	
	
	
}
