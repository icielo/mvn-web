package com.lezic.app.crud.table.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lezic.core.crud.annotation.WebField;

/**
 * SysUser generated by codeTool
 * 
 * @author cielo
 * @date 2016-01-26 17:28:17
 */
@Entity
@Table(name = "crud_table")
public class CrudTable implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", length = 36, unique = true, nullable = false)
	@WebField(label = "", placeholder = "请输入", rules = "required;length(~36);", length = 36, unique = true, nullable = false)
	private String id;

	@Column(name = "TABLE_NAME", length = 20, nullable = false)
	@WebField(label = "表名", placeholder = "请输入表名", rules = "required;length(~20);", length = 20, nullable = false)
	private String tableName;

	@Column(name = "MENU_NAME", length = 50, nullable = false)
	@WebField(label = "菜单名", placeholder = "请输入菜单名", rules = "required;length(~50);", length = 50, nullable = false)
	private String menuName;

	@Column(name = "MODULE_NAME", length = 50, nullable = false)
	@WebField(label = "模块名", placeholder = "请输入模块名", rules = "required;length(~50);", length = 50, nullable = false)
	private String moduleName;

	@Column(name = "MODULE_CODE", length = 20, nullable = false)
	@WebField(label = "模块代码", placeholder = "请输入模块代码", rules = "required;length(~20);", length = 20, nullable = false)
	private String moduleCode;

	@Column(name = "ENTITY", length = 255, nullable = false)
	@WebField(label = "实体类名", placeholder = "请输入实体类名", rules = "required;length(~255);", length = 255, nullable = false)
	private String entity;

	@Column(name = "CONTROLLER_URL", length = 255, nullable = false)
	@WebField(label = "控制器映射路径", placeholder = "请输入控制器映射路径", rules = "required;length(~255);", length = 255, nullable = false)
	private String controllerUrl;

	@Column(name = "CONTROLLER", length = 255, nullable = false)
	@WebField(label = "控制器", placeholder = "请输入控制器", rules = "required;length(~255);", length = 255, nullable = false)
	private String controller;

	@Column(name = "SERVICE", length = 255, nullable = false)
	@WebField(label = "服务层", placeholder = "请输入服务层", rules = "required;length(~255);", length = 255, nullable = false)
	private String service;

	@Column(name = "LIST_URL", length = 255, nullable = false)
	@WebField(label = "列表映射", placeholder = "请输入列表映射", rules = "required;length(~255);", length = 255, nullable = false)
	private String listUrl;

	@Column(name = "LIST_JSP", length = 255, nullable = false)
	@WebField(label = "列表JSP", placeholder = "请输入列表JSP", rules = "required;length(~255);", length = 255, nullable = false)
	private String listJsp;

	@Column(name = "ADD_URL", length = 255, nullable = false)
	@WebField(label = "新增映射", placeholder = "请输入新增映射", rules = "required;length(~255);", length = 255, nullable = false)
	private String addUrl;

	@Column(name = "ADD_JSP", length = 255, nullable = false)
	@WebField(label = "新增JSP", placeholder = "请输入新增JSP", rules = "required;length(~255);", length = 255, nullable = false)
	private String addJsp;

	@Column(name = "UPD_URL", length = 255, nullable = false)
	@WebField(label = "修改映射", placeholder = "请输入修改映射", rules = "required;length(~255);", length = 255, nullable = false)
	private String updUrl;

	@Column(name = "UPD_JSP", length = 255, nullable = false)
	@WebField(label = "修改JSP", placeholder = "请输入修改JSP", rules = "required;length(~255);", length = 255, nullable = false)
	private String updJsp;

	@Column(name = "OP_USER_ID", length = 36)
	@WebField(label = "操作用户", placeholder = "请输入操作用户", rules = "length(~36);", length = 36)
	private String opUserId;

	@Column(name = "OP_TIME", length = 0)
	@WebField(label = "操作时间", placeholder = "请输入操作时间", rules = "", length = 0)
	private Date opTime;

	/**
	 * 设置
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * 设置 表名
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * 获取 表名
	 */
	public String getTableName() {
		return this.tableName;
	}

	/**
	 * 设置 菜单名
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * 获取 菜单名
	 */
	public String getMenuName() {
		return this.menuName;
	}

	/**
	 * 设置 模块名
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	/**
	 * 获取 模块名
	 */
	public String getModuleName() {
		return this.moduleName;
	}

	/**
	 * 设置 模块代码
	 */
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	/**
	 * 获取 模块代码
	 */
	public String getModuleCode() {
		return this.moduleCode;
	}

	/**
	 * 设置 实体类名
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}

	/**
	 * 获取 实体类名
	 */
	public String getEntity() {
		return this.entity;
	}

	/**
	 * 设置 控制器映射路径
	 */
	public void setControllerUrl(String controllerUrl) {
		this.controllerUrl = controllerUrl;
	}

	/**
	 * 获取 控制器映射路径
	 */
	public String getControllerUrl() {
		return this.controllerUrl;
	}

	/**
	 * 设置 控制器
	 */
	public void setController(String controller) {
		this.controller = controller;
	}

	/**
	 * 获取 控制器
	 */
	public String getController() {
		return this.controller;
	}

	/**
	 * 设置 服务层
	 */
	public void setService(String service) {
		this.service = service;
	}

	/**
	 * 获取 服务层
	 */
	public String getService() {
		return this.service;
	}

	/**
	 * 设置 列表映射
	 */
	public void setListUrl(String listUrl) {
		this.listUrl = listUrl;
	}

	/**
	 * 获取 列表映射
	 */
	public String getListUrl() {
		return this.listUrl;
	}

	/**
	 * 设置 列表JSP
	 */
	public void setListJsp(String listJsp) {
		this.listJsp = listJsp;
	}

	/**
	 * 获取 列表JSP
	 */
	public String getListJsp() {
		return this.listJsp;
	}

	/**
	 * 设置 新增映射
	 */
	public void setAddUrl(String addUrl) {
		this.addUrl = addUrl;
	}

	/**
	 * 获取 新增映射
	 */
	public String getAddUrl() {
		return this.addUrl;
	}

	/**
	 * 设置 新增JSP
	 */
	public void setAddJsp(String addJsp) {
		this.addJsp = addJsp;
	}

	/**
	 * 获取 新增JSP
	 */
	public String getAddJsp() {
		return this.addJsp;
	}

	/**
	 * 设置 修改映射
	 */
	public void setUpdUrl(String updUrl) {
		this.updUrl = updUrl;
	}

	/**
	 * 获取 修改映射
	 */
	public String getUpdUrl() {
		return this.updUrl;
	}

	/**
	 * 设置 修改JSP
	 */
	public void setUpdJsp(String updJsp) {
		this.updJsp = updJsp;
	}

	/**
	 * 获取 修改JSP
	 */
	public String getUpdJsp() {
		return this.updJsp;
	}

	/**
	 * 设置 操作用户
	 */
	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	/**
	 * 获取 操作用户
	 */
	public String getOpUserId() {
		return this.opUserId;
	}

	/**
	 * 设置 操作时间
	 */
	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	/**
	 * 获取 操作时间
	 */
	public Date getOpTime() {
		return this.opTime;
	}

}
