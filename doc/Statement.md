# Statement

- executeQuery
- executeUpdate
- execute

用于执行静态SQL语句并返回其生成的结果的对象。

默认情况下，ResultSet每个Statement 对象只能同时打开一个对象。因此，如果一个ResultSet对象的读取与另一个 对象的读取交错，则每个Statement对象必须由不同的对象生成。如果存在打开Statement的ResultSet对象，则接口中的所有执行方法都会 隐式关闭该属性的当前 对象。
