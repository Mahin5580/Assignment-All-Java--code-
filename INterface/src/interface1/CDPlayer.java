package interface1;

public class CDPlayer implements Player {

	public void audio() {
		System.out.println("Song audio");
		
	}
	public void play() {
		System.out.println("play audio");
	}
	public void stop() {
		System.out.println("stop audio");
	}
	public void pause() {
		System.out.println("pause audio");
	}
	public void reverse() {
		System.out.println("reverse audio\n");
	}

}
