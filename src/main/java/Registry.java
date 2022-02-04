import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {
    private Refferal refferal;

    public Refferal getRefferal() {
        return refferal;
    }

    @Autowired()
    @Qualifier("Refferal")
    public void setRefferal(Refferal refferal) {
        this.refferal = refferal;
    }

    public void issue_direction() {
        System.out.println("Направление выдано");
        refferal.direct();
    }
}
