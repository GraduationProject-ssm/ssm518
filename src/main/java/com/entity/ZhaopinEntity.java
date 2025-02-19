package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 职位招聘
 *
 * @author 
 * @email
 */
@TableName("zhaopin")
public class ZhaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaopinEntity() {

	}

	public ZhaopinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 公司
     */
    @TableField(value = "gongsi_id")

    private Integer gongsiId;


    /**
     * 招聘信息名称
     */
    @TableField(value = "zhaopin_name")

    private String zhaopinName;


    /**
     * 招聘信息照片
     */
    @TableField(value = "zhaopin_photo")

    private String zhaopinPhoto;


    /**
     * 薪资待遇
     */
    @TableField(value = "zhaopin_daiyu")

    private String zhaopinDaiyu;


    /**
     * 上班地点
     */
    @TableField(value = "zhaopin_address")

    private String zhaopinAddress;


    /**
     * 联系人
     */
    @TableField(value = "lianxiren_name")

    private String lianxirenName;


    /**
     * 招聘电话
     */
    @TableField(value = "zhaopin_phone")

    private String zhaopinPhone;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 招聘岗位
     */
    @TableField(value = "zhaopin_types")

    private Integer zhaopinTypes;


    /**
     * 招聘人数
     */
    @TableField(value = "zhaopin_renshu_number")

    private Integer zhaopinRenshuNumber;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 招聘信息详情
     */
    @TableField(value = "zhaopin_content")

    private String zhaopinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：公司
	 */
    public Integer getGongsiId() {
        return gongsiId;
    }


    /**
	 * 获取：公司
	 */

    public void setGongsiId(Integer gongsiId) {
        this.gongsiId = gongsiId;
    }
    /**
	 * 设置：招聘信息名称
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }


    /**
	 * 获取：招聘信息名称
	 */

    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 设置：招聘信息照片
	 */
    public String getZhaopinPhoto() {
        return zhaopinPhoto;
    }


    /**
	 * 获取：招聘信息照片
	 */

    public void setZhaopinPhoto(String zhaopinPhoto) {
        this.zhaopinPhoto = zhaopinPhoto;
    }
    /**
	 * 设置：薪资待遇
	 */
    public String getZhaopinDaiyu() {
        return zhaopinDaiyu;
    }


    /**
	 * 获取：薪资待遇
	 */

    public void setZhaopinDaiyu(String zhaopinDaiyu) {
        this.zhaopinDaiyu = zhaopinDaiyu;
    }
    /**
	 * 设置：上班地点
	 */
    public String getZhaopinAddress() {
        return zhaopinAddress;
    }


    /**
	 * 获取：上班地点
	 */

    public void setZhaopinAddress(String zhaopinAddress) {
        this.zhaopinAddress = zhaopinAddress;
    }
    /**
	 * 设置：联系人
	 */
    public String getLianxirenName() {
        return lianxirenName;
    }


    /**
	 * 获取：联系人
	 */

    public void setLianxirenName(String lianxirenName) {
        this.lianxirenName = lianxirenName;
    }
    /**
	 * 设置：招聘电话
	 */
    public String getZhaopinPhone() {
        return zhaopinPhone;
    }


    /**
	 * 获取：招聘电话
	 */

    public void setZhaopinPhone(String zhaopinPhone) {
        this.zhaopinPhone = zhaopinPhone;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：招聘岗位
	 */
    public Integer getZhaopinTypes() {
        return zhaopinTypes;
    }


    /**
	 * 获取：招聘岗位
	 */

    public void setZhaopinTypes(Integer zhaopinTypes) {
        this.zhaopinTypes = zhaopinTypes;
    }
    /**
	 * 设置：招聘人数
	 */
    public Integer getZhaopinRenshuNumber() {
        return zhaopinRenshuNumber;
    }


    /**
	 * 获取：招聘人数
	 */

    public void setZhaopinRenshuNumber(Integer zhaopinRenshuNumber) {
        this.zhaopinRenshuNumber = zhaopinRenshuNumber;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：招聘信息详情
	 */
    public String getZhaopinContent() {
        return zhaopinContent;
    }


    /**
	 * 获取：招聘信息详情
	 */

    public void setZhaopinContent(String zhaopinContent) {
        this.zhaopinContent = zhaopinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zhaopin{" +
            "id=" + id +
            ", gongsiId=" + gongsiId +
            ", zhaopinName=" + zhaopinName +
            ", zhaopinPhoto=" + zhaopinPhoto +
            ", zhaopinDaiyu=" + zhaopinDaiyu +
            ", zhaopinAddress=" + zhaopinAddress +
            ", lianxirenName=" + lianxirenName +
            ", zhaopinPhone=" + zhaopinPhone +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", zhaopinTypes=" + zhaopinTypes +
            ", zhaopinRenshuNumber=" + zhaopinRenshuNumber +
            ", shangxiaTypes=" + shangxiaTypes +
            ", zhaopinContent=" + zhaopinContent +
            ", createTime=" + createTime +
        "}";
    }
}
