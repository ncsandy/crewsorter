import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Sorter {

    public static void main(String[] args) {

        Pilot pc = new Pilot("bill","CW2",true);
        Pilot ip = new Pilot("bob","CW2",true);
        Pilot mtp = new Pilot("joe","CW2",true);
        Pilot pi1 = new Pilot("smooo","CW2",false);
        Pilot pi2 = new Pilot("soulja","CW2",false);
        Pilot pi3 = new Pilot("mike","CW2",false);
        Pilot pi4 = new Pilot("mark","CW2",false);

        ArrayList<Pilot> pcList = new ArrayList<>();
        pcList.add(pc);
        pcList.add(ip);
        pcList.add(mtp);
        ArrayList<Pilot> piList = new ArrayList<>();
        piList.add(pi1);
        piList.add(pi2);
        piList.add(pi3);
        piList.add(pi4);


        HashMap<Pilot, Pilot> crews = new HashMap<> ();

        Iterator<Pilot> pcpilot = pcList.iterator();

        for(Iterator<Pilot> it = pcpilot; it.hasNext(); ) {
                Pilot p = it.next();
                if(p.isPilotInCommand()) {
                    crews.put(p, copilot(piList));
                }
        }
        System.out.println(crews);
    }

    public static Pilot copilot(ArrayList<Pilot> pi) {
        Iterator<Pilot> nonpc = pi.iterator();
        Pilot pilot = null;
        for (Iterator<Pilot> it = nonpc; it.hasNext(); ) {
            Pilot p = it.next();
            if(!p.isPilotInCommand()) {
                pilot = p;
                pi.remove(p);
                break;
            }
        }
        return pilot;
    }
}
