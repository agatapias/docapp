import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ScheduleItem {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private Long day;
     private String day_name;

     @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "time_id")
     private TimeId time_id;


}