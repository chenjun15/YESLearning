package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by moonwolfzy on 2017-12-12.
 */
@Entity
public class Appearances {
    private int aId;
    private Integer need;
    private String aPath;

    @Id
    @Column(name = "AId", nullable = false)
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Basic
    @Column(name = "Need", nullable = true)
    public Integer getNeed() {
        return need;
    }

    public void setNeed(Integer need) {
        this.need = need;
    }

    @Basic
    @Column(name = "APath", nullable = true, length = -1)
    public String getaPath() {
        return aPath;
    }

    public void setaPath(String aPath) {
        this.aPath = aPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appearances that = (Appearances) o;

        if (aId != that.aId) return false;
        if (need != null ? !need.equals(that.need) : that.need != null) return false;
        if (aPath != null ? !aPath.equals(that.aPath) : that.aPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId;
        result = 31 * result + (need != null ? need.hashCode() : 0);
        result = 31 * result + (aPath != null ? aPath.hashCode() : 0);
        return result;
    }
}