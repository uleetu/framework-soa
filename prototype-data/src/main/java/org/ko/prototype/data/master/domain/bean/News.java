package org.ko.prototype.data.master.domain.bean;

import java.io.Serializable;
import java.util.Date;

public class News extends AbstractDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.title
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.thumbnail
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String thumbnail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.local_path
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String localPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeU;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String hostName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_news.content
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_news
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.id
     *
     * @return the value of art_news.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.id
     *
     * @param id the value for art_news.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.title
     *
     * @return the value of art_news.title
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.title
     *
     * @param title the value for art_news.title
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.thumbnail
     *
     * @return the value of art_news.thumbnail
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.thumbnail
     *
     * @param thumbnail the value for art_news.thumbnail
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.url
     *
     * @return the value of art_news.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.url
     *
     * @param url the value for art_news.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.local_path
     *
     * @return the value of art_news.local_path
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.local_path
     *
     * @param localPath the value for art_news.local_path
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath == null ? null : localPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.delete_status
     *
     * @return the value of art_news.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.delete_status
     *
     * @param deleteStatus the value for art_news.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.trace_code_i
     *
     * @return the value of art_news.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeI() {
        return traceCodeI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.trace_code_i
     *
     * @param traceCodeI the value for art_news.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeI(String traceCodeI) {
        this.traceCodeI = traceCodeI == null ? null : traceCodeI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.trace_code_u
     *
     * @return the value of art_news.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeU() {
        return traceCodeU;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.trace_code_u
     *
     * @param traceCodeU the value for art_news.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeU(String traceCodeU) {
        this.traceCodeU = traceCodeU == null ? null : traceCodeU.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.host_name
     *
     * @return the value of art_news.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.host_name
     *
     * @param hostName the value for art_news.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.create_user_id
     *
     * @return the value of art_news.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.create_user_id
     *
     * @param createUserId the value for art_news.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.create_by
     *
     * @return the value of art_news.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.create_by
     *
     * @param createBy the value for art_news.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.create_date
     *
     * @return the value of art_news.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.create_date
     *
     * @param createDate the value for art_news.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.update_user_id
     *
     * @return the value of art_news.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.update_user_id
     *
     * @param updateUserId the value for art_news.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.update_by
     *
     * @return the value of art_news.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.update_by
     *
     * @param updateBy the value for art_news.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.update_date
     *
     * @return the value of art_news.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.update_date
     *
     * @param updateDate the value for art_news.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_news.content
     *
     * @return the value of art_news.content
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_news.content
     *
     * @param content the value for art_news.content
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_news
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", url=").append(url);
        sb.append(", localPath=").append(localPath);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", traceCodeI=").append(traceCodeI);
        sb.append(", traceCodeU=").append(traceCodeU);
        sb.append(", hostName=").append(hostName);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_news
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        News other = (News) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getLocalPath() == null ? other.getLocalPath() == null : this.getLocalPath().equals(other.getLocalPath()))
            && (this.getDeleteStatus() == null ? other.getDeleteStatus() == null : this.getDeleteStatus().equals(other.getDeleteStatus()))
            && (this.getTraceCodeI() == null ? other.getTraceCodeI() == null : this.getTraceCodeI().equals(other.getTraceCodeI()))
            && (this.getTraceCodeU() == null ? other.getTraceCodeU() == null : this.getTraceCodeU().equals(other.getTraceCodeU()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_news
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        result = prime * result + ((getDeleteStatus() == null) ? 0 : getDeleteStatus().hashCode());
        result = prime * result + ((getTraceCodeI() == null) ? 0 : getTraceCodeI().hashCode());
        result = prime * result + ((getTraceCodeU() == null) ? 0 : getTraceCodeU().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}