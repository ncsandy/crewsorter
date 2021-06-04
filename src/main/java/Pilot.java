public class Pilot {
    private String name;
    private String rank;
    private boolean pilotInCommand;

    public Pilot(String name, String rank, boolean pilotInCommand) {
        this.name = name;
        this.rank = rank;
        this.pilotInCommand = pilotInCommand;
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
}
