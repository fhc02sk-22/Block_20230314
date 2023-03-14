package exceptions.ue.transporter;

public class Starship {
    private String name;
    private Transporter transporter1;

    public Starship(String name) {
        this.name = name;
        this.transporter1 = new Transporter();
    }

    public void beamUp(String person, String from)  {

        try {
            transporter1.beam(person, from, name, true);
        } catch (TransportMalfunctionException e) {
            // hier können wir auf den Fehler reagieren
            System.out.println("Fehler beim Beamen, schnell wieder abbrechen!!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            transporter1.shutdown();
        }


    }
}
