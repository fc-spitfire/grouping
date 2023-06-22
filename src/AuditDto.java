import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AuditDto {

    private Integer id;

    private String name;

    private LocalDateTime time;

    private List<Comment> comments = new ArrayList<>();

    public AuditDto(Integer id, String name, LocalDateTime time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "AuditDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", comments=" + comments +
                '}';
    }
}
