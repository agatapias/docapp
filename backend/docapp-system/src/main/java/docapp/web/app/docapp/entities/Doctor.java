import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Doctor{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String speciality;
    private String phone;
    private String gender;
    List<Schedule_items> schedule_item;
    List<Schedule_time_id> schedule_time_id;
    List<Free_time_id> free_time_id;
    @OneToOne(cascade = CascadeType.ALL);
    @JoinColumn(name = "user_id")
    private User user;
}