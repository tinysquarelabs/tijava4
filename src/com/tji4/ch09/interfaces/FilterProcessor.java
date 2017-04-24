//: interfaces/interfaceprocessor/FilterProcessor.java
package com.tji4.ch09.interfaces;

class FilterAdapter implements Processor2 {
	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	public String name() {
		return filter.name();
	}

	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply2.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply2.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply2.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
} /*
	 * Output: Using Processor LowPass Waveform 0 Using Processor HighPass
	 * Waveform 0 Using Processor BandPass Waveform 0
	 */// :~
