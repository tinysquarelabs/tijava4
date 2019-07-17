package com.course.ch08.polymorphism;

import static net.mindview.util.Print.*;

class Glyph {
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RouldGlyph(),radius=" + radius);
	}

	void draw() {
		print("RoundGlyhp.draw(),radius=" + radius);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);

	}

}