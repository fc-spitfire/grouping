import java.time.LocalDateTime;

public class Comment {

    private Integer id;

    private String comment;

    private LocalDateTime time;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", time=" + time +
                '}';
    }

    public Comment(Integer id, String comment, LocalDateTime time) {
        this.id = id;
        this.comment = comment;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
