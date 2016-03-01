# MySQLBackup
用java调用mysqldump命令，对MySQL进行备份、压缩的类库

使用方式：

    1.将代码clone到本地，使用maven命令install到本地

    2.在项目中加入backup项目的依赖
    
        <dependency>
            <groupId>com.yuanheng100</groupId>
            <artifactId>backup</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>

    3.调用备份方法：
    
      3.1解析Spring的配置文件方式：

        MySQLBackup.backupAndSave(String springResourcePath);

        注：方法的参数是相对类路径而言的；在配置文件中，需要配置id为dataSource的bean,并且具有user、password、jdbcUrl属性。

      3.2自定义参数方式：

        MySQLBackup.backupAndSave(String user , String password , String database , String host , String port , String charsetName , String mysqlPath , String exportPath)

        注：用户名，密码，数据库，主机，端口号，编码字符集，mysql安装路径，备份文件导出路径。

    4.对于两种调用方式，若获取到的参数为null或者是空字符串,则使用默认参数：

        user = "root";		//连接数据库的用户名
	password = "root";	//连接数据库的密码
	host = "localhost";	//连接的主机名
	port = "3306";		//数据库的接口
	mysqlPath = "";		//mysql的安装目录，配置环境变量的情况下可以不设置值
        charsetName = "utf8";   //数据库的字符集，默认为utf8	
	exportPath = "/home/user.name//backup/mysql/";
                                //备份输出路径
       
        注：user.name为当前登陆用户的用户名

    5.备份的文件格式：

        5.1 window下生成的文件是zip文件，文件名为：yyyyMMddHHmm.zip
            解压后的文件为：yyyyMMddHHmm.sql

        5.2 linux下生成的文件是gz文件，文件名为：yyyyMMddHHmm.gz
                    
          
