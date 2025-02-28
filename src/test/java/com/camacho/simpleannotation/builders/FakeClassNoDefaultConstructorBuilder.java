package com.camacho.simpleannotation.builders;
import java.util.Map;
import java.util.HashMap;
public class FakeClassNoDefaultConstructorBuilder {
	private static FakeClassNoDefaultConstructorBuilder instance;
	private Map<String, Object> container;
	private FakeClassNoDefaultConstructorBuilder(){
		this.container = new HashMap<>();
	}
	public static FakeClassNoDefaultConstructorBuilder getInstance(){
		if (instance == null) {
			instance = new FakeClassNoDefaultConstructorBuilder();
		}
		return instance;
	}
	public final FakeClassNoDefaultConstructorBuilder setD(double value){
		this.container.putIfAbsent("d", value);
		return this;
	}
	public final FakeClassNoDefaultConstructorBuilder setObject(java.lang.Object value){
		this.container.putIfAbsent("object", value);
		return this;
	}
	public final FakeClassNoDefaultConstructorBuilder setI(int value){
		this.container.putIfAbsent("i", value);
		return this;
	}
	public final FakeClassNoDefaultConstructorBuilder setStrings(java.util.List<java.lang.String> value){
		this.container.putIfAbsent("strings", value);
		return this;
	}
	public final FakeClassNoDefaultConstructorBuilder setS(java.lang.String value){
		this.container.putIfAbsent("s", value);
		return this;
	}
	public final FakeClassNoDefaultConstructor build(){
		if(this.container.isEmpty()) {
			throw new IllegalStateException("Not enough information to build");
		}
		int i = (int) this.container.get("i");
		double d = (double) this.container.get("d");
		java.lang.String s = (java.lang.String) this.container.get("s");
		java.util.List<java.lang.String> strings = (java.util.List<java.lang.String>) this.container.get("strings");
		FakeClassNoDefaultConstructor result = new FakeClassNoDefaultConstructor(i, d, s, strings);
		java.lang.Object object = (java.lang.Object)this.container.get("object");
		result.setObject(object);
		this.container.clear();
		return result;
	}
}
