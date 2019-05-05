# 

HashMap继承AbstractMap，实现Map接口
HashSet继承AbstractSet，实现Set接口


- fail-fast
- fail-safe
fast 报错，多线程状态下会产生异常，但是程序还会正常运行

### java.sql

- Clob
- NClob
- SerialClob

# ParameterMetaData

一个对象，可用于获取有关PreparedStatement对象中每个参数标记的类型和属性的信息 。对于某些查询和驱动程序实现，在执行之前，ParameterMetaData 对象返回的数据可能不可用PreparedStatement。
某些驱动程序实现可能无法提供有关CallableStatement 对象中每个参数标记的类型和属性的信息。

### PseudoColumnUsage

伪/隐藏列使用的枚举。

NO_USAGE_RESTRICTIONS
伪/隐藏列的使用没有限制。
SELECT_LIST_ONLY
伪/隐藏列只能在SELECT列表中使用。
USAGE_UNKNOWN
无法确定伪/隐藏列的使用。
WHERE_CLAUSE_ONLY
伪/隐藏列只能在WHERE子句中使用。

### Types
定义用于标识通用SQL类型的常量的类，称为JDBC类型。
这个类永远不会被实例化。

static int	ARRAY
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） ARRAY。
static int	BIGINT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） BIGINT。
static int	BINARY
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） BINARY。
static int	BIT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） BIT。
static int	BLOB
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） BLOB。
static int	BOOLEAN
Java编程语言中的常量，有时称为类型代码，用于标识通用SQL类型BOOLEAN。
static int	CHAR
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） CHAR。
static int	CLOB
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） CLOB。
static int	DATALINK
Java编程语言中的常量，有时称为类型代码，用于标识通用SQL类型DATALINK。
static int	DATE
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） DATE。
static int	DECIMAL
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） DECIMAL。
static int	DISTINCT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） DISTINCT。
static int	DOUBLE
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） DOUBLE。
static int	FLOAT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） FLOAT。
static int	INTEGER
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） INTEGER。
static int	JAVA_OBJECT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） JAVA_OBJECT。
static int	LONGNVARCHAR
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码）LONGNVARCHAR。
static int	LONGVARBINARY
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） LONGVARBINARY。
static int	LONGVARCHAR
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） LONGVARCHAR。
static int	NCHAR
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） NCHAR
static int	NCLOB
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码）NCLOB。
static int	NULL
标识一般SQL值的Java编程语言中的常量 NULL。
static int	NUMERIC
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） NUMERIC。
static int	NVARCHAR
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码）NVARCHAR。
static int	OTHER
Java编程语言中的常量，指示SQL类型是特定于数据库的，并且映射到可以通过方法getObject和方法访问的Java对象setObject。
static int	REAL
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） REAL。
static int	REF
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） REF。
static int	ROWID
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） ROWID
static int	SMALLINT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） SMALLINT。
static int	SQLXML
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码）XML。
static int	STRUCT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） STRUCT。
static int	TIME
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） TIME。
static int	TIMESTAMP
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） TIMESTAMP。
static int	TINYINT
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） TINYINT。
static int	VARBINARY
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） VARBINARY。
static int	VARCHAR
标识一般SQL类型的Java编程语言中的常量（有时称为类型代码） VARCHAR。


HavingClauseParser

### java.sql.Types
定义用于标识通用SQL类型的常量的类，称为JDBC类型。

[mysql command options](https://dev.mysql.com/doc/refman/8.0/en/mysql-command-options.html)

```java

--password
--user

```

[java关于xml的注解： JAXB](https://blog.csdn.net/xlxxcc/article/details/52789405)
