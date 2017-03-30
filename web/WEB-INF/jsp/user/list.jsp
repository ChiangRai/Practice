<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/bootstrap/bootstrap-table.min.css" rel="stylesheet"/>
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<table id="table">
</table>

</body>
<script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootstrap/bootstrap-table.min.js"></script>
<%--国际化，表格汉化--%>
<script type="text/javascript" src="/js/bootstrap//bootstrap-table-zh-CN.min.js"></script>

<script type="text/javascript">
    var $table = $('#table');
    $table.bootstrapTable({
        url: "/user/list_json.do",
        dataType: "json",
        method: 'get',
        contentType: "application/x-www-form-urlencoded",//必须的
        cache:true,
        striped: true,
        pagination: true,
        singleSelect: false,
        pageSize: 10,
        pageNum: 1,
        showColumns: true, //不显示下拉框（选择显示的列）
        pageList: [10,50,100,200,500],
        search: false, //不显示 搜索框
        showColumns: false, //不显示下拉框（选择显示的列）
        sidePagination: "server", //服务端请求
        sortName:"id", //默认排序字段
        sortOrder:"desc", //默认
        queryParamsType:'',
        queryParams: queryParams,
        minimunCountColumns: 2,
        columns: [
            {
              field:'id',
              title:'标示'
            },
            {
                field:'uname',
                title:'用户名'
            },
            {
                field:'phone',
                title:'手机号码'
            },
            {
                title: '操作',
                field: 'id',
                align: 'center',
                formatter: function (value, row, index) {
                    var e = '<a href="#" mce_href="#" onclick="edit(\'' + row.id + '\')">编辑</a> ';
                    var d = '<a href="#" mce_href="#" onclick="del(\'' + row.id + '\')">删除</a> ';
                    return e + d;
                }
            }
        ]
    });


    //传递的参数
    function queryParams(params) {
        return {
            /* "filters['id']":$("#id").val(), */
            pageNumber: params.pageNumber,
            pageSize: params.pageSize,
            sortProperty: params.sortName,
            sortDirection: params.sortOrder
        };
    }

</script>
</html>
