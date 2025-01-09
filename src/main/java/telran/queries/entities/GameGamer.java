package telran.queries.entities;
import jakarta.persistence.*;
@Entity
@Table(name="game_gamer")
public class GameGamer {
    @Id
    @GeneratedValue
    long id;

}
