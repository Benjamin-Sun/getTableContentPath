public class demoObject {

    private int id;
    private int pid;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public demoObject(int id, int pid, String content) {
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
