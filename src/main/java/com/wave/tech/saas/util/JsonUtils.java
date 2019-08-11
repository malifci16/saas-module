package com.wave.tech.saas.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author mohamed.abdelsalam
 */
public class JsonUtils {

    private final static Gson GSON_INSTANCE = new Gson();

    public static JsonObject getJsonObject(InputStream inputStream) throws UnsupportedEncodingException {
        Reader reader = new InputStreamReader(inputStream, "UTF-8");
        return GSON_INSTANCE.fromJson(reader, JsonObject.class);
    }

    public static JsonObject buildErrorJsonObject(String errorMessage) {
        JsonObject object = new JsonObject();
        object.addProperty("error", errorMessage);
        return object;
    }
}
