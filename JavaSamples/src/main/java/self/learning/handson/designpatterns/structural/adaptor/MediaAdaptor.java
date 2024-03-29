/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.structural.adaptor;

/**
 *
 * @author DT234016
 */
public class MediaAdaptor implements MediaPlayer {

  AdvancedMediaPlayer advancedMusicPlayer;

  public MediaAdaptor(String audioType) {

    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMusicPlayer = new VlcPlayer();

    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMusicPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String fileName) {

    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMusicPlayer.playVlc(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMusicPlayer.playMp4(fileName);
    }
  }
}
