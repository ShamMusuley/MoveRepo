/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.structural.adaptor;

/**
 *
 * @author DT234016
 */
public class Mp4Player implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    //do nothing
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: " + fileName);
  }
}
