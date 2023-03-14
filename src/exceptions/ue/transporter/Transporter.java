package exceptions.ue.transporter;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent)
            throws TransportMalfunctionException {
        System.out.println("beaming person " + person + " from " + from + " to " + to);

        if (urgent/* == true*/) {
            if (Math.random() > 0.5) {
                throw new TransportMalfunctionException("Error on beaming person "
                        + person + " from " + from + " to " + to);
            }
        }

        /*if (urgent && Math.random() > 0.5) {

        }*/
    }

    public void shutdown() {
        System.out.println("transporter shutting down ....");
    }
}
