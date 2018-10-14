package server.domain;



import java.io.Serializable;

/**
 * Book 实体类
 *
 * Created by bysocket on 30/09/2017.
 */
public class Baby implements Serializable {

    /**
     * 编号
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;
    /**
     * 床号
     */
    private String bedNum;


    /**
     * 各项信息
     */
    //todo 待增加
    private String info;


    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }



    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
