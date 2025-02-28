package com.camacho.simpleannotation.builders;

import com.camacho.simpleannotation.annotations.Builder;

@Builder
public abstract class FakeClassFalseAnnotation {
	
	public FakeClassFalseAnnotation() {
		this.b = (byte) 0xff;
	}
	
	private byte b;

	public byte getB() {
		return b;
	}

	public void setB(byte b) {
		this.b = b;
	}
}
