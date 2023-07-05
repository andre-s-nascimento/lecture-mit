package org.gkginfo.lecture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lecture07 {
  public static void main(String[] args) throws IOException
  {
    String fileName1 = "/home/andre/Documentos/Pessoal/java/lecture/src/main/resources/Mercury.txt";
    String fileName2 = "/home/andre/Documentos/Pessoal/java/lecture/src/main/resources/Luna.txt";

    FileReader mercury = new FileReader(fileName1);
    FileReader luna = new FileReader(fileName2);

    BufferedReader mercuryTxt = new BufferedReader(mercury);
    BufferedReader lunaTxt = new BufferedReader(luna);

    RowChecker.checkRows(mercuryTxt,fileName1);
    RowChecker.checkRows(lunaTxt,fileName2);
  }
}
