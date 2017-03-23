package com.bkm.spring.gson;

import com.google.gson.JsonObject;

public interface GsonEnum<E> {
	JsonObject serialize();
	E deserialize(String jsonEnum);
}