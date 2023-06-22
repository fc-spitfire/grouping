public class Service {

    public AuditDto toDto(Audit audit) {
        return new AuditDto(audit.getId(), audit.getName(), audit.getTime());
    }
}
