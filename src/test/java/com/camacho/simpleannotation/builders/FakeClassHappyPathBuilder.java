package com.camacho.simpleannotation.builders;
import java.util.Map;
import java.util.HashMap;
import com.camacho.simpleannotation.builders.FakeClassHappyPath;
public class FakeClassHappyPathBuilder {
	private static FakeClassHappyPathBuilder instance;
	private Map<String, Object> container;
	private FakeClassHappyPathBuilder(){
		this.container = new HashMap<>();
	}
	public static FakeClassHappyPathBuilder getInstance(){
		if (instance == null) {
			instance = new FakeClassHappyPathBuilder();
		}
		return instance;
	}
	public final FakeClassHappyPathBuilder setD(double value){
		this.container.putIfAbsent("d", value);
		return this;
	}
	public final FakeClassHappyPathBuilder setStrings(java.util.List<java.lang.String> value){
		this.container.putIfAbsent("strings", value);
		return this;
	}
	public final FakeClassHappyPathBuilder setI(int value){
		this.container.putIfAbsent("i", value);
		return this;
	}
	public final FakeClassHappyPathBuilder setS(java.lang.String value){
		this.container.putIfAbsent("s", value);
		return this;
	}
	public final FakeClassHappyPath build(){
		if(this.container.isEmpty()) {
			throw new IllegalStateException("Not enough information to build");
		}
		FakeClassHappyPath result = new FakeClassHappyPath();
		result.setD((double)this.container.get("d"));
		result.setStrings((java.util.List<java.lang.String>)this.container.get("strings"));
		result.setI((int)this.container.get("i"));
		result.setS((java.lang.String)this.container.get("s"));
		this.container.clear();
		return result;
	}
}
