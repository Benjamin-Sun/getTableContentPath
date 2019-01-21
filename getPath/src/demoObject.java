public class demoObject {

    private Integer id;
    private Integer pid;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public demoObject(Integer id, Integer pid, String content) {
        this.id = id;
        this.pid = pid;
        this.content = content;
    }

    public demoObject() {
    }

    @Override
    public String toString() {
        return "demoObject{" +
                "id=" + id +
                ", pid=" + pid +
                ", content='" + content + '\'' +
                '}';
    }
}
