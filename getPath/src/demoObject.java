import java.util.List;

public class demoObject {

    private Integer id;
    private Integer pid;
    private String content;
    private List<demoObject> children = null;
    private Integer istraverse = -1;

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

    public List<demoObject> getChildren() {
        return children;
    }

    public void setChildren(List<demoObject> children) {
        this.children = children;
    }

    public Integer getIstraverse() {
        return istraverse;
    }

    public void setIstraverse(Integer istraverse) {
        this.istraverse = istraverse;
    }

    public demoObject(Integer id, Integer pid, String content, List<demoObject> children) {
        this.id = id;
        this.pid = pid;
        this.content = content;
        this.children = children;
    }

    public demoObject() {
    }

    @Override
    public String toString() {
        return "demoObject{" +
                "id=" + id +
                ", pid=" + pid +
                ", content='" + content + '\'' +
                ", children=" + children +
                ", istraverse=" + istraverse +
                '}';
    }
}
