import java.util.ArrayList;
import java.util.HashMap;

public class Sorter {

    static HashMap<Pilot, Pilot> crews = new HashMap<>();
    static ArrayList<Pilot> pcList = new ArrayList<>();
    static ArrayList<Pilot> piList = new ArrayList<>();

    public static void main(String[] args) {

        Pilot pc = new Pilot("bill", "CW2", true, false);
        Pilot ip = new Pilot("bob", "CW2", true, false);
        Pilot mtp = new Pilot("joe", "CW2", true, false);
        Pilot pi1 = new Pilot("smooo", "CW2", false, false);
        Pilot pi2 = new Pilot("soulja", "CW2", false, false);
        Pilot pi3 = new Pilot("mike", "CW2", false, false);
        Pilot pi4 = new Pilot("mark", "CW2", false, false);

        pcList.add(pc);
        pcList.add(ip);
        pcList.add(mtp);

        piList.add(pi1);
        piList.add(pi2);
        piList.add(pi3);
        piList.add(pi4);

        for (Pilot p: pcList ) {
                if(p.isPaired()) {
                    continue;
                }
                crews.put(p, copilot(p));
                p.setPaired(true);

        }
        System.out.println(crews);
    }

    public static Pilot copilot(Pilot currentPC) {

        Pilot pilot = null;

        for (Pilot copilot: piList ) {
            if (!copilot.isPaired()) {
                pilot = copilot;
                copilot.setPaired(true);
                break;
            }
        }
        if(piList.size() == 0) {
                for (Pilot pc: pcList ) {
                    if (pc.getName().equals(currentPC.getName()) || pc.isPaired()) {
                        continue;
                    }
                        pilot = pc;
                        pc.setPaired(true);
                        break;
                    }
                }
        return pilot;
        }
    }
