package com.rocky.mvcdemo.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	public String getProperty(String key) throws IOException {
		InputStream stream = this.getClass().getResourceAsStream("project.properties");
		Properties properties = new Properties();
		properties.load(stream);
		return properties.getProperty(key);
	}
}
