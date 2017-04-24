package com.tji4.ch07.reusingClasses;

class Instrument{
	public void play(){
		System.out.println("play");
	}
	static void tune(Instrument i){
		i.play();
	}
}
public class Wind extends Instrument{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		Instrument.tune(flute);

	}

}
