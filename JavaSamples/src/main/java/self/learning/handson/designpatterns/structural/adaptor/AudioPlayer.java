/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.structural.adaptor;

/**
 *
 * @author DT234016
 */
public class AudioPlayer implements MediaPlayer {

  MediaAdaptor mediaAdaptor;

  @Override
  public void play(String audioType, String fileName) {

    //inbuilt support to play mp3 music files
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file. Name: " + fileName);
    } //mediaAdapter is providing support to play other file formats
    else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
      mediaAdaptor = new MediaAdaptor(audioType);
      mediaAdaptor.play(audioType, fileName);
    } else {
      System.out.println("Invalid media. " + audioType + " format not supported");
    }
  }
}
