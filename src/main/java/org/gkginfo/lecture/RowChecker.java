package org.gkginfo.lecture;

import java.io.*;

public class RowChecker {
  public static void checkRows(BufferedReader file, String fileName) throws IOException {
    boolean rowSumIsConstant = true;
    String line = file.readLine();
    String[] nums;
    int rowSum = 0;

    if (line != null) {
      nums = line.split("\t");

      for (int i = 0; i < nums.length; i += 1) {
        rowSum += Integer.parseInt(nums[i]);
      }
    }

    line = file.readLine();

    while (line != null) {
      nums = line.split("\t");
      int runningSum = 0;

      for (int i = 0; i < nums.length; i += 1) {
        runningSum += Integer.parseInt(nums[i]);
      }

      if (runningSum != rowSum) {
        rowSumIsConstant = false;
        break;
      }

      line = file.readLine();
    }

    if (rowSumIsConstant) {
      System.out.println(
          "All of the rows in file " + fileName + " add to the constant " + rowSum + ".");
    } else {
      System.out.println("The rows in file " + fileName + " do not add to the same constant.");
    }
  }
}
