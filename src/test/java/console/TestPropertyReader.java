package console;

import java.io.IOException;

import com.rocky.mvcdemo.common.PropertyReader;

public class TestPropertyReader {
	public static void main(String[] args) throws IOException {
		PropertyReader reader = new PropertyReader();
		System.out.println(reader.getProperty("jdbcUsername"));
	}
}
