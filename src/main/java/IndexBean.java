import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Douglas Souza on 29/03/2019
 */
@Named
@ViewScoped
public class IndexBean implements Serializable {
    private String message = "Woooooooooooooooooooooking";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
