package telran.queries.entities;
import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
@Table(name="gamer")
public class Gamer {
    @Id
    String username;
    LocalDate birthdate;

}
