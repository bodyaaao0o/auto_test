package com.bohdanjj.readProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public interface ConfigProvider {
    Properties properties = loadProperties();

    static Properties loadProperties() {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Не вдалося завантажити конфігураційний файл", e);
        }
        return props;
    }

    String URL = properties.getProperty("url");
}
