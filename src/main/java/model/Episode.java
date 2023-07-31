package model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EPISODE")
public class Episode {
    @Id
    @Column(name = "EPISODE_NUMBER", nullable = false, unique = true)
    private Integer episodeNumber;
    @Column(name = "EPISODE_TITLE", nullable = false, unique = false)
    private String episodeTitle;
    @Column(name = "EPISODE_COUNTRY", nullable = false, unique = false)
    private String country;
}
