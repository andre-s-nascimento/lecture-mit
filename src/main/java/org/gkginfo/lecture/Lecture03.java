package org.gkginfo.lecture;

public class Lecture03 {
  public void firstAndSecondBestPerformer(double[] friendsTime) {
    if (friendsTime.length < 2) {
      System.out.println("Not enough data.");
      return;
    }
    double bestTime = Double.MAX_VALUE;
    double secondBestTime = Double.MAX_VALUE;
    System.out.println("For the runner's times below: ");

    for (int i=0; i<friendsTime.length; i++) {
      System.out.println(friendsTime[i]);
      if (friendsTime[i] < bestTime) {
        secondBestTime = bestTime;
        bestTime = friendsTime[i];
      } else if (friendsTime[i] < secondBestTime && friendsTime[i] != bestTime) {
        secondBestTime = friendsTime[i];
      }
    }
    System.out.println("The best performance is: " + bestTime);
    System.out.println("and the second best performance is: " + secondBestTime);
  }
}