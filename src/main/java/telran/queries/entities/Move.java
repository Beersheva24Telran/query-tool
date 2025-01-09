package telran.queries.entities;
import jakarta.persistence.*;
@Table(name="move")
@Entity
public class Move {
@Id
@GeneratedValue
long id;
int bulls;
int cows;
@ManyToOne
@JoinColumn (name = "game_gamer_id")
GameGamer gameGamer;
}
