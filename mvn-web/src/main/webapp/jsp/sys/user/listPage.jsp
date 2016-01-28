<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../../common/list.jsp"%>
<title>首页</title>
<script type="text/javascript">
	$(function() {
		$('#dataTable').myBootstrapTable({
			idField : "id",
			columns : [ {
				checkbox : true,
				align : 'center',
				valign : 'middle'
			}, {
				title : '账号',
				field : 'account',
				align : 'center'
			}, {
				title : '姓名',
				field : 'name',
				align : 'center'
			}, {
				title : '性别',
				field : 'sex',
				align : 'center'
			}, {
				title : '联系电话',
				field : 'phone',
				align : 'center'
			}, {
				title : '邮箱',
				field : 'email',
				align : 'center'
			}, {
				title : '状态',
				field : 'status',
				align : 'center',
				formatter : function(value, row, index) {
					if (value == "on") {
						return "<span title=\"启用\" class=\"glyphicon glyphicon-check\"></span>";
					} else {
						return "<span title=\"禁用\" class=\"glyphicon glyphicon-unchecked\"></span>";
					}
				}
			} ],
			url : "${CP}/sys/sysUser.do?method=loadData",
			queryParams : getQueryParams
		});
	});

	//新增
	function addEntity() {
		MyLayer.open({
			title : "新增用户",
			content : '${CP}/sys/sysUser.do?method=addPage'
		});
	}

	//修改
	function updEntity() {
		var rows = $("#dataTable").bootstrapTable('getSelections');
		if (rows.length != 1) {
			MyLayer.msg("请选择要修改的单条记录！");
			return;
		}
		MyLayer.open({
			title : "修改用户",
			content : "${CP}/sys/sysUser.do?method=updPage&id=" + rows[0].id
		});
	}

	//删除
	function delEntity() {
		var rows = $("#dataTable").bootstrapTable('getSelections');
		if (rows.length == 0) {
			MyLayer.msg("请选择要删除的记录！");
			return;
		}
		var ids = [];
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].id);
		}
		MyLayer.confirm("是否真的删除？", function(index) {
			Common.ajax({
				url : "${CP}/sys/sysUser.do?method=delEntity",
				data : {
					ids : ids.join(",")
				},
				success : function(data) {
					query();
				}
			})
		});
	}

	/*查询*/
	function query() {
		$("#dataTable").bootstrapTable('refresh');
	}

	/* 查询参数 */
	function getQueryParams(params) {
		$(".search-are input,.search-are select").each(function(i, obj) {
			params[$(obj).prop("name")] = $(obj).val();
		});
		return params;
	}
</script>
</head>
<body>
	<section class="panel">
		<header class="panel-heading"> Dynamic Table </header>
		<div class="panel-body">
			<div id="toolbar">
				<button class="btn btn-primary " onclick="addEntity()">
					<i class="glyphicon glyphicon-plus-sign"></i>&nbsp;新&nbsp;增
				</button>
				<button class="btn btn-primary" onclick="updEntity()">
					<i class="glyphicon glyphicon-edit"></i>&nbsp;修&nbsp;改
				</button>
				<button class="btn btn-primary ">
					<i class="glyphicon glyphicon-ok-circle"></i>启用
				</button>
				<button class="btn btn-primary ">
					<i class="glyphicon glyphicon-ban-circle"></i>禁用
				</button>
				<button class="btn btn-danger " onclick="delEntity()">
					<i class="glyphicon glyphicon-remove"></i>&nbsp;删&nbsp;除
				</button>
			</div>
			<table id="dataTable"></table>
		</div>
	</section>
</body>
</html>