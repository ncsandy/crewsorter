public class Pilot {
    private String name;
    private String rank;
    private boolean pilotInCommand;
    private boolean paired;

    public Pilot(String name, String rank, boolean pilotInCommand, boolean paired) {
        this.name = name;
        this.rank = rank;
        this.pilotInCommand = pilotInCommand;
        this.paired = paired;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", pilotInCommand=" + pilotInCommand +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isPilotInCommand() {
        return pilotInCommand;
    }

    public void setPilotInCommand(boolean pilotInCommand) {
        this.pilotInCommand = pilotInCommand;
    }

    public boolean isPaired() {
        return paired;
    }

    public void setPaired(boolean paired) {
        this.paired = paired;
    }
}
