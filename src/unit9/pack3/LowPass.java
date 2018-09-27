package unit9.pack3;

public class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff){
		this.cutoff=cutoff;
	}
	public Waveform proccess(Waveform input){
		return input;
	}
}
