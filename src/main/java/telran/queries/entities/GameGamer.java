package telran.queries.entities;
import jakarta.persistence.*;
@Entity
@Table(name="game_gamer")
public class GameGamer {
    @Id
    @GeneratedValue
    long id;
    @ManyToOne
    @JoinColumn(name="game_id")
    Game game;
    @ManyToOne
    @JoinColumn(name = "gamer_id")
    Gamer gamer;
    @Column(name = "is_winner")
    boolean isWinner;

}
