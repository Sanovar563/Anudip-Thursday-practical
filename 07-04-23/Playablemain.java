 /*Create an interface called ""Playable"" with a method called ""play"". 
Create two classes called ""Song"" and ""Video"" that implement the Playable interface and 
implement the ""play"" method. Create objects of both the Song and Video classes and call 
their respective ""play"" methods.*/
 
 
 interface Playable 
{
    public void Play();		//abstract method
}

 class Song implements Playable 	//class song to implement interface "playable"
 {
    public void Play() 
	{
        System.out.println("Song is Natu-Natu.");
    }
}
 class Video implements Playable 		//class video to implement Playable
 {
    public void Play() 
	{
        System.out.println("the video is awesome.");
    }
}

 class Playablemain 		//main class
 {
    public static void main(String[] args) 	//main method
	{
        Playable s = new Song();	
        Playable v = new Video();		//Create objects of both the Song and Video classes
        s.Play();					//invoking/calling method 
        v.Play();
    }
}