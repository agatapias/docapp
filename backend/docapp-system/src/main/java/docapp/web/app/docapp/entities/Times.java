import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Times {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long hour;
}