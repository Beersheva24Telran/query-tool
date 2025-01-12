package telran.queries.entities;
import jakarta.persistence.*;
@Entity
@Table(name="game_gamer")
public class GameGamer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    @ManyToOne
    @JoinColumn(name="game_id")
    Game game;
    @ManyToOne
    @JoinColumn(name = "gamer_id")
    Gamer gamer;
    @Column(name = "is_winner")
    boolean isWinner;
    @Override
    public String toString() {
        return "GameGamer [id=" + id + ", game=" + game.id + ", gamer=" + gamer.username + ", isWinner=" + isWinner + "]";
    }
    public GameGamer() {

    }
    public GameGamer(Game game, Gamer gamer) {
        this.game = game;
        this.gamer = gamer;
    }
    

}
