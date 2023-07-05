package org.gkginfo.lecture;

public class Baby {
  String name;
  double weight = 5.0;
  boolean isMale;
  int numPoops = 0;
  Baby[] siblings;

  Baby(String myname, boolean maleBaby){
    name = myname;
    isMale = maleBaby;
  }

  void sayHi() {
    System.out.println("Hi, my name is.. " + name);
  }

  void eat(double foodWeight) {
    if (foodWeight >= 0 && foodWeight < weight) {
      weight = weight + foodWeight;
    }
  }
}
