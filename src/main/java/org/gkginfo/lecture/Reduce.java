package org.gkginfo.lecture;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {
  public static void main(String[] args) {

    List<User> users = new ArrayList<>();
    users.add(new User("Frank", "Rome", LocalDate.of(1979, 11, 23)));
    users.add(new User("Peter", "London", LocalDate.of(1985, 1, 18)));
    users.add(new User("Lucy", "Santiago", LocalDate.of(2002, 5, 14)));
    users.add(new User("Albert", "Sao Paulo", LocalDate.of(1996, 8, 30)));
    users.add(new User("Frank", "Brasilia", LocalDate.of(1967, 10, 6)));

    int maxAge = users.stream().mapToInt(User::getAge).reduce(0, Math::max);



    List<Object[]> newUsers = users.stream()
        .map(user -> new Object[]{user.getName(), user.getCity()})
        .toList();

    for (Object[] user : newUsers) {
      String name = (String) user[0];
      String city = (String) user[1];
      System.out.println("Name: " + name + ", City: " + city);
    }

    List<Object[]> automaticRefundData =
        new ArrayList<>();

    for (int i = 0; i < newUsers.size(); i++) {
      automaticRefundData.add(new Object[] {
          users.get(i).getName(),
          users.get(i).getCity()
      });
    }



    // [ F ] mostrando os "n" contatos da agenda (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    var i = 0;
    Iterator<Object[]> iterator = automaticRefundData.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, Arrays.toString(iterator.next()));
      i++;
    }

    System.out.printf("The oldest user's age: %s%n", maxAge);
  }
}
