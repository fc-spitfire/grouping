import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static void main(String[] args) {

        String date1 = "2023-04-08 12:30";
        String date2 = "2023-04-08 13:30";
        String date3 = "2023-04-08 14:30";
        String date4 = "2023-04-08 15:30";
        String date5 = "2023-04-08 16:30";
        String date6 = "2023-04-08 17:30";
        String date7 = "2023-04-08 18:30";
        String date8 = "2023-04-08 19:30";

        Audit audit1 = new Audit(1, "John", LocalDateTime.parse(date1, formatter));
        Audit audit2 = new Audit(2, "Jack", LocalDateTime.parse(date2, formatter));
        Audit audit3 = new Audit(3, "John", LocalDateTime.parse(date3, formatter));
        Audit audit4 = new Audit(4, "John", LocalDateTime.parse(date4, formatter));
        Audit audit5 = new Audit(5, "John", LocalDateTime.parse(date5, formatter));
        Audit audit6 = new Audit(6, "John", LocalDateTime.parse(date6, formatter));
        Audit audit7 = new Audit(7, "Jim", LocalDateTime.parse(date7, formatter));
        Audit audit8 = new Audit(8, "John", LocalDateTime.parse(date8, formatter));

        String date01 = "2023-04-08 12:31";
        String date02 = "2023-04-08 12:32";
        String date03 = "2023-04-08 12:33";
        String date04 = "2023-04-08 15:34";
        String date05 = "2023-04-08 15:37";
        String date06 = "2023-04-08 17:38";
        String date07 = "2023-04-08 18:00";
        String date08 = "2023-04-08 19:31";

        Comment comment1 = new Comment(1, "comment 1", LocalDateTime.parse(date01, formatter));
        Comment comment2 = new Comment(2, "comment 2", LocalDateTime.parse(date02, formatter));
        Comment comment3 = new Comment(3, "comment 3", LocalDateTime.parse(date03, formatter));
        Comment comment4 = new Comment(4, "comment 4", LocalDateTime.parse(date04, formatter));
        Comment comment5 = new Comment(5, "comment 5", LocalDateTime.parse(date05, formatter));
        Comment comment6 = new Comment(6, "comment 6", LocalDateTime.parse(date06, formatter));
        Comment comment7 = new Comment(7, "comment 7", LocalDateTime.parse(date07, formatter));
        Comment comment8 = new Comment(8, "comment 8", LocalDateTime.parse(date08, formatter));

        List<Audit> auditList = List.of(audit1, audit2, audit3, audit4, audit5, audit6, audit7, audit8);
        List<Comment> commentList = List.of(comment1, comment2, comment3, comment4, comment5, comment6, comment7, comment8);

        auditList.forEach(System.out::println);
        commentList.forEach(System.out::println);

        Service service = new Service();

        List<AuditDto> auditDtoList = auditList.stream().map(service::toDto).toList();

        for (int i = 0; i < commentList.size(); i++) {
            for (int j = 0; j < auditDtoList.size(); j++) {
                if (commentList.get(i).getTime().isAfter(auditDtoList.get(j).getTime()) && ((j + 1) == auditDtoList.size() || commentList.get(i).getTime().isBefore(auditDtoList.get(j+1).getTime()))) {
                    auditDtoList.get(j).getComments().add(commentList.get(i));
                }
            }
        }

        auditDtoList.forEach(System.out::println);

    }
}