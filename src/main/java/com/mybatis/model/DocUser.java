package com.mybatis.model;

import java.math.BigDecimal;

public class DocUser extends BaseEntity {
    private Integer id;

    private String uname;

    private String phone;

    private String pwd;

    private String code;

    private String white;

    private String red;

    private BigDecimal money;

    private Integer role;

    private String msgcode;

    private Integer msgtime;

    private Integer recId;

    private Integer audit;

    private Integer status;

    private String remember;

    private Integer cid;

    private Integer flag;

    private Integer ccid;

    private Integer timeline;

    private Integer sortId;

    private Integer loginTimes;

    private String drawUser;

    private String drawPhone;

    private String drawBank;

    private String drawCard;

    private String provinceName;

    private String cityName;

    private String areaName;

    private String conPeople;

    private String conWay;

    private String conPhone;

    private String address;

    private String qq;

    private String email;

    private Integer vip;

    private String codeimg;

    private Integer cimg;

    public DocUser(Integer id, String uname, String phone, String pwd, String code, String white, String red, BigDecimal money, Integer role, String msgcode, Integer msgtime, Integer recId, Integer audit, Integer status, String remember, Integer cid, Integer flag, Integer ccid, Integer timeline, Integer sortId, Integer loginTimes, String drawUser, String drawPhone, String drawBank, String drawCard, String provinceName, String cityName, String areaName, String conPeople, String conWay, String conPhone, String address, String qq, String email, Integer vip, String codeimg, Integer cimg) {
        this.id = id;
        this.uname = uname;
        this.phone = phone;
        this.pwd = pwd;
        this.code = code;
        this.white = white;
        this.red = red;
        this.money = money;
        this.role = role;
        this.msgcode = msgcode;
        this.msgtime = msgtime;
        this.recId = recId;
        this.audit = audit;
        this.status = status;
        this.remember = remember;
        this.cid = cid;
        this.flag = flag;
        this.ccid = ccid;
        this.timeline = timeline;
        this.sortId = sortId;
        this.loginTimes = loginTimes;
        this.drawUser = drawUser;
        this.drawPhone = drawPhone;
        this.drawBank = drawBank;
        this.drawCard = drawCard;
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.areaName = areaName;
        this.conPeople = conPeople;
        this.conWay = conWay;
        this.conPhone = conPhone;
        this.address = address;
        this.qq = qq;
        this.email = email;
        this.vip = vip;
        this.codeimg = codeimg;
        this.cimg = cimg;
    }

    public DocUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white == null ? null : white.trim();
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red == null ? null : red.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getMsgcode() {
        return msgcode;
    }

    public void setMsgcode(String msgcode) {
        this.msgcode = msgcode == null ? null : msgcode.trim();
    }

    public Integer getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(Integer msgtime) {
        this.msgtime = msgtime;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember == null ? null : remember.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public Integer getTimeline() {
        return timeline;
    }

    public void setTimeline(Integer timeline) {
        this.timeline = timeline;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getDrawUser() {
        return drawUser;
    }

    public void setDrawUser(String drawUser) {
        this.drawUser = drawUser == null ? null : drawUser.trim();
    }

    public String getDrawPhone() {
        return drawPhone;
    }

    public void setDrawPhone(String drawPhone) {
        this.drawPhone = drawPhone == null ? null : drawPhone.trim();
    }

    public String getDrawBank() {
        return drawBank;
    }

    public void setDrawBank(String drawBank) {
        this.drawBank = drawBank == null ? null : drawBank.trim();
    }

    public String getDrawCard() {
        return drawCard;
    }

    public void setDrawCard(String drawCard) {
        this.drawCard = drawCard == null ? null : drawCard.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getConPeople() {
        return conPeople;
    }

    public void setConPeople(String conPeople) {
        this.conPeople = conPeople == null ? null : conPeople.trim();
    }

    public String getConWay() {
        return conWay;
    }

    public void setConWay(String conWay) {
        this.conWay = conWay == null ? null : conWay.trim();
    }

    public String getConPhone() {
        return conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone == null ? null : conPhone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public String getCodeimg() {
        return codeimg;
    }

    public void setCodeimg(String codeimg) {
        this.codeimg = codeimg == null ? null : codeimg.trim();
    }

    public Integer getCimg() {
        return cimg;
    }

    public void setCimg(Integer cimg) {
        this.cimg = cimg;
    }
}