<%--
  Created by IntelliJ IDEA.
  User: ChanX
  Date: 2020/1/3
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--&lt;%&ndash;    请求参数绑定&ndash;%&gt;--%>
<%--    <a href="param/testParam">请求参数绑定</a>--%>

<%--    <form action="param/saveAccount" method="post">--%>
<%--&lt;%&ndash;        属性名应与bean对象变量名一致&ndash;%&gt;--%>
<%--        姓名：<input type="text" name="username" /><br/>--%>
<%--        密码：<input type="text" name="password" /><br/>--%>
<%--        金额：<input type="text" name="money" /><br/>--%>
<%--&lt;%&ndash;        复杂类型&ndash;%&gt;--%>
<%--        用户姓名：<input type="text" name="user.uname" /><br/>--%>
<%--        用户年龄：<input type="text" name="user.age" /><br/>--%>
<%--        <input type="submit" value="提交" />--%>
<%--    </form>--%>

<%--    类中存在List和Map集合--%>
<%--    <form action="param/saveAccount" method="post">--%>
<%--        姓名：<input type="text" name="username" /><br/>--%>
<%--        密码：<input type="text" name="password" /><br/>--%>
<%--        金额：<input type="text" name="money" /><br/>--%>
<%--        &lt;%&ndash;        集合类型&ndash;%&gt;--%>
<%--        用户姓名：<input type="text" name="list[0].uname" /><br/>--%>
<%--        用户年龄：<input type="text" name="list[0].age" /><br/>--%>

<%--        用户姓名：<input type="text" name="map['one'].uname" /><br/>--%>
<%--        用户年龄：<input type="text" name="map['one'].age" /><br/>--%>
<%--        <input type="submit" value="提交" />--%>
<%--    </form>--%>
<%--    自定义类型转换器--%>
<%--    <form action="param/saveUser" method="post">--%>
<%--        用户姓名：<input type="text" name="uname" /><br/>--%>
<%--        用户年龄：<input type="text" name="age" /><br/>--%>
<%--        用户生日：<input type="text" name="date" /><br/>--%>
<%--        <input type="submit" value="提交" />--%>
<%--    </form>--%>

    <a href="param/testServlet">Servlet原生api</a>
</body>
</html>
