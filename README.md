jehr
====
##项目框架
    easyui+struts2+guice+mybatis
##添加Microsoft SQL JDBC driver到本地Maven
1.  本地下载sqljdbc4.jar
2.  切换到sqljdbc4.jar的当前路径
3.  打开命令窗口，执行以下语句
    mvn install:install-file -Dfile=sqljdbc4.jar -DgroupId=com.microsoft.sqlserver -DartifactId=sqljdbc4 -Dversion=4.0 -Dpackaging=jar
4.  `<dependency>
        <groupId>com.microsoft.sqlserver</groupId>
        <artifactId>sqljdbc4</artifactId>
        <version>4.0</version>
    </dependency>`
