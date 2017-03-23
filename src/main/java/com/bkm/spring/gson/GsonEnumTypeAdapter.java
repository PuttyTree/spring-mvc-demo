package com.bkm.spring.gson;

import com.google.gson.*;

import java.lang.reflect.Type;

public class GsonEnumTypeAdapter<E> implements JsonSerializer<E>, JsonDeserializer<E>{

	private final GsonEnum<E> gsonEnum;
	public GsonEnumTypeAdapter(GsonEnum<E> gsonEnum) {
		this.gsonEnum = gsonEnum;
	}
	public JsonElement serialize(E src, Type typeOfSrc, JsonSerializationContext context) {
		if (null != src && src instanceof GsonEnum) {
			return ((GsonEnum) src).serialize();
		}

		return null;
	}
	public E deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
	{
		if (null != json) {
			return gsonEnum.deserialize(json.getAsString());
		}
		return null;
	}

}
