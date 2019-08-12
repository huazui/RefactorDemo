package rentalstore;

import java.util.List;

public abstract class Statement {
    public String getStatement(List<Rental> rentals){
        String result = this.getHtmlHeader();
        for (Rental each : rentals) {
            result += this.getHtmlBody(each);
        }
        result += this.getHtmlButton();
        return result;
    }
    public abstract String getHtmlHeader();
    public abstract  String getHtmlBody(Rental rental);
    public abstract  String getHtmlButton();

}
