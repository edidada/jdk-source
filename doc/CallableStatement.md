# CallableStatement

用于执行SQL存储过程的接口。JDBC API提供了一个存储过程SQL转义语法，允许以标准方式为所有RDBMS调用存储过程。此转义语法有一个包含结果参数的表单和一个不包含结果参数的表单。如果使用，则必须将结果参数注册为OUT参数。其他参数可用于输入，输出或两者。参数按编号顺序引用，第一个参数为1。
   {？= call <procedure-name> [（<arg1>，<arg2>，...）]}
   {call <procedure-name> [（<arg1>，<arg2>，...）]}
IN参数值使用set从中继承的方法 设置PreparedStatement。必须在执行存储过程之前注册所有OUT参数的类型; 通过get此处提供的方法执行后检索它们的值。
A CallableStatement可以返回一个ResultSet对象或多个ResultSet对象。ResultSet使用从中继承的操作处理多个 对象Statement。
为了获得最大的可移植性，ResultSet应在获取输出参数值之前处理调用对象和更新计数。
