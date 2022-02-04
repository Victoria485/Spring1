import org.springframework.stereotype.Component;

@Component("Refferal")
public class RefferalStomatologist implements Refferal {
    public void direct() {
        System.out.println("Выдано направление к стоматологу");
    }
}