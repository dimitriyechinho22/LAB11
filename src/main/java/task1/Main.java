package task1;

import static task1.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Dima").age(18).gender(MALE).height(187.3).build();
        System.out.println(user);
    }
}


