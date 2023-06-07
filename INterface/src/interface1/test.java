package interface1;

public class test {
public static void main(String[] args) {
	CDPlayer a=new CDPlayer();
	a.audio();
	a.play();
	a.pause();
	a.stop();
	a.reverse();
	DVDPlayer i=new DVDPlayer();
	i.video();
	i.play();
	i.stop();
	i.pause();
	i.reverse();
	
}
}
