package unit9.pack3;

public class BandPass extends Filter {
	double lowCutOff, highCutOff;

	public BandPass(double lowCutOff, double highCutOff) {
		this.lowCutOff = lowCutOff;
		this.highCutOff = highCutOff;
	}

	public Waveform process(Waveform input) {
		return input;
	}
}
