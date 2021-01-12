### tinyid-client 的使用demo
使用[tinyid](https://github.com/didi/tinyid)项目生成分布式唯一id。

需要我们自己部署一个（或者多个）tinyid-server，然后在需要获取id的服务依赖tinyid-client包，向tinyid-server请求id。

部署tinyid-server：

将整个tinyid项目拉下来git clone https://github.com/didi/tinyid.git。

修改tinyid-server/src/main/resources/offline下的配置文件。

用tinyid/tinyid-server/db.sql建表。

执行tinyid/tinyid-server/build.sh构建，java -jar output/tinyid-server-xxx.jar启动。


客户端：

添加依赖

`<dependency>`

`    <groupId>com.xiaoju.uemc.tinyid</groupId>`

`    <artifactId>tinyid-client</artifactId>`

`    <version>${tinyid.version}</version>`

`</dependency>`

添加配置文件tinyid_client.properties。

代码获取id  

Long id = TinyId.nextId("test");

List<Long> ids = TinyId.nextId("test", 10);



