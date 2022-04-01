package Team;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionChanges {
    public void Promote{
        ArrayList<User> team = new ArrayList<>();

        User jani = new User("Jani", "Manual Tester");

        String member1 = "John Doe";
        String position1 = "Manual Tester";
        String member2 = "Kate Smith";
        String position2 = "Developer";

        team.add(new User(member1,position1));
        team.add(new User(member2,position2));
        String tarolo = " ";
        tarolo = position1;
        position1 = position2;
        position2 = tarolo;

        System.out(team);
        }
    }
}