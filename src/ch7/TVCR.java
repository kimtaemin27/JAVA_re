package ch7;

class Tv2 {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class VCR {
	boolean power;
	int counter = 0;
	
	void power() {
		power = !power;
	}
	
	void play() {
		
	}
	
	void stop() {
		
	}
}

public class TVCR extends Tv2 {
	
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	}
}
