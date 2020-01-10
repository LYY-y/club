package entity;

public class ActivityModel {
    private String ac_no;
    private String ac_name;
    private String ac_time;
    private String ac_type;
    private String ac_detail;

    public ActivityModel(String ac_no, String ac_name, String ac_time, String ac_type, String ac_detail) {
        this.ac_no = ac_no;
        this.ac_name = ac_name;
        this.ac_time = ac_time;
        this.ac_type = ac_type;
        this.ac_detail = ac_detail;
    }

    public ActivityModel() {
    }

    public String getAc_no() {
        return ac_no;
    }

    public void setAc_no(String ac_no) {
        this.ac_no = ac_no;
    }

    public String getAc_name() {
        return ac_name;
    }

    public void setAc_name(String ac_name) {
        this.ac_name = ac_name;
    }

    public String getAc_time() {
        return ac_time;
    }

    public void setAc_time(String ac_time) {
        this.ac_time = ac_time;
    }

    public String getAc_type() {
        return ac_type;
    }

    public void setAc_type(String ac_type) {
        this.ac_type = ac_type;
    }

    public String getAc_detail() {
        return ac_detail;
    }

    public void setAc_detail(String ac_detail) {
        this.ac_detail = ac_detail;
    }
}
