package org.ko.prototype.data.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class UserActionLog extends AbstractDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.action_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String actionCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.message
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.mile_stone
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short mileStone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.session_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String sessionCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.thread_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String threadCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.page_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String pageCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.browser
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String browser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.remote_ip
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String remoteIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.app_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String appName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.trace_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_user_action_log.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_user_action_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.id
     *
     * @return the value of art_user_action_log.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.id
     *
     * @param id the value for art_user_action_log.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.user_id
     *
     * @return the value of art_user_action_log.user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.user_id
     *
     * @param userId the value for art_user_action_log.user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.action_code
     *
     * @return the value of art_user_action_log.action_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.action_code
     *
     * @param actionCode the value for art_user_action_log.action_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode == null ? null : actionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.message
     *
     * @return the value of art_user_action_log.message
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.message
     *
     * @param message the value for art_user_action_log.message
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.mile_stone
     *
     * @return the value of art_user_action_log.mile_stone
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getMileStone() {
        return mileStone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.mile_stone
     *
     * @param mileStone the value for art_user_action_log.mile_stone
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setMileStone(Short mileStone) {
        this.mileStone = mileStone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.session_code
     *
     * @return the value of art_user_action_log.session_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getSessionCode() {
        return sessionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.session_code
     *
     * @param sessionCode the value for art_user_action_log.session_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode == null ? null : sessionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.thread_code
     *
     * @return the value of art_user_action_log.thread_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getThreadCode() {
        return threadCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.thread_code
     *
     * @param threadCode the value for art_user_action_log.thread_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setThreadCode(String threadCode) {
        this.threadCode = threadCode == null ? null : threadCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.page_code
     *
     * @return the value of art_user_action_log.page_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getPageCode() {
        return pageCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.page_code
     *
     * @param pageCode the value for art_user_action_log.page_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setPageCode(String pageCode) {
        this.pageCode = pageCode == null ? null : pageCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.browser
     *
     * @return the value of art_user_action_log.browser
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.browser
     *
     * @param browser the value for art_user_action_log.browser
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.remote_ip
     *
     * @return the value of art_user_action_log.remote_ip
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getRemoteIp() {
        return remoteIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.remote_ip
     *
     * @param remoteIp the value for art_user_action_log.remote_ip
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp == null ? null : remoteIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.app_name
     *
     * @return the value of art_user_action_log.app_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.app_name
     *
     * @param appName the value for art_user_action_log.app_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.trace_code
     *
     * @return the value of art_user_action_log.trace_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCode() {
        return traceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.trace_code
     *
     * @param traceCode the value for art_user_action_log.trace_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode == null ? null : traceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.create_user_id
     *
     * @return the value of art_user_action_log.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.create_user_id
     *
     * @param createUserId the value for art_user_action_log.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.create_by
     *
     * @return the value of art_user_action_log.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.create_by
     *
     * @param createBy the value for art_user_action_log.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.create_date
     *
     * @return the value of art_user_action_log.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.create_date
     *
     * @param createDate the value for art_user_action_log.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.update_user_id
     *
     * @return the value of art_user_action_log.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.update_user_id
     *
     * @param updateUserId the value for art_user_action_log.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.update_by
     *
     * @return the value of art_user_action_log.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.update_by
     *
     * @param updateBy the value for art_user_action_log.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_user_action_log.update_date
     *
     * @return the value of art_user_action_log.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_user_action_log.update_date
     *
     * @param updateDate the value for art_user_action_log.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_user_action_log
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
        sb.append(", userId=").append(userId);
        sb.append(", actionCode=").append(actionCode);
        sb.append(", message=").append(message);
        sb.append(", mileStone=").append(mileStone);
        sb.append(", sessionCode=").append(sessionCode);
        sb.append(", threadCode=").append(threadCode);
        sb.append(", pageCode=").append(pageCode);
        sb.append(", browser=").append(browser);
        sb.append(", remoteIp=").append(remoteIp);
        sb.append(", appName=").append(appName);
        sb.append(", traceCode=").append(traceCode);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_user_action_log
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
        UserActionLog other = (UserActionLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getActionCode() == null ? other.getActionCode() == null : this.getActionCode().equals(other.getActionCode()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getMileStone() == null ? other.getMileStone() == null : this.getMileStone().equals(other.getMileStone()))
            && (this.getSessionCode() == null ? other.getSessionCode() == null : this.getSessionCode().equals(other.getSessionCode()))
            && (this.getThreadCode() == null ? other.getThreadCode() == null : this.getThreadCode().equals(other.getThreadCode()))
            && (this.getPageCode() == null ? other.getPageCode() == null : this.getPageCode().equals(other.getPageCode()))
            && (this.getBrowser() == null ? other.getBrowser() == null : this.getBrowser().equals(other.getBrowser()))
            && (this.getRemoteIp() == null ? other.getRemoteIp() == null : this.getRemoteIp().equals(other.getRemoteIp()))
            && (this.getAppName() == null ? other.getAppName() == null : this.getAppName().equals(other.getAppName()))
            && (this.getTraceCode() == null ? other.getTraceCode() == null : this.getTraceCode().equals(other.getTraceCode()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_user_action_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getActionCode() == null) ? 0 : getActionCode().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getMileStone() == null) ? 0 : getMileStone().hashCode());
        result = prime * result + ((getSessionCode() == null) ? 0 : getSessionCode().hashCode());
        result = prime * result + ((getThreadCode() == null) ? 0 : getThreadCode().hashCode());
        result = prime * result + ((getPageCode() == null) ? 0 : getPageCode().hashCode());
        result = prime * result + ((getBrowser() == null) ? 0 : getBrowser().hashCode());
        result = prime * result + ((getRemoteIp() == null) ? 0 : getRemoteIp().hashCode());
        result = prime * result + ((getAppName() == null) ? 0 : getAppName().hashCode());
        result = prime * result + ((getTraceCode() == null) ? 0 : getTraceCode().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}