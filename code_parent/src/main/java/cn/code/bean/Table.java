package cn.code.bean;

import cn.code.util.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * <p></p>
 * <p/>
 * Created by 北大课工场
 */
public class Table implements Serializable {

    private String tableName;

    private String comment;

    private List<Cloumn> cloumns;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Cloumn> getCloumns() {
        return cloumns;
    }

    public void setCloumns(List<Cloumn> cloumns) {
        this.cloumns = cloumns;
    }

    public String getClassName(){
      return  StringUtils.captureName(StringUtils.putOffUnderline(this.tableName));
    }
}
