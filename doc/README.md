# 

HashMap�̳�AbstractMap��ʵ��Map�ӿ�
HashSet�̳�AbstractSet��ʵ��Set�ӿ�


- fail-fast
- fail-safe
fast �������߳�״̬�»�����쳣�����ǳ��򻹻���������

### java.sql

- Clob
- NClob
- SerialClob

# ParameterMetaData

һ�����󣬿����ڻ�ȡ�й�PreparedStatement������ÿ��������ǵ����ͺ����Ե���Ϣ ������ĳЩ��ѯ����������ʵ�֣���ִ��֮ǰ��ParameterMetaData ���󷵻ص����ݿ��ܲ�����PreparedStatement��
ĳЩ��������ʵ�ֿ����޷��ṩ�й�CallableStatement ������ÿ��������ǵ����ͺ����Ե���Ϣ��

### PseudoColumnUsage

α/������ʹ�õ�ö�١�

NO_USAGE_RESTRICTIONS
α/�����е�ʹ��û�����ơ�
SELECT_LIST_ONLY
α/������ֻ����SELECT�б���ʹ�á�
USAGE_UNKNOWN
�޷�ȷ��α/�����е�ʹ�á�
WHERE_CLAUSE_ONLY
α/������ֻ����WHERE�Ӿ���ʹ�á�

### Types
�������ڱ�ʶͨ��SQL���͵ĳ������࣬��ΪJDBC���͡�
�������Զ���ᱻʵ������

static int	ARRAY
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 ARRAY��
static int	BIGINT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 BIGINT��
static int	BINARY
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 BINARY��
static int	BIT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 BIT��
static int	BLOB
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 BLOB��
static int	BOOLEAN
Java��������еĳ�������ʱ��Ϊ���ʹ��룬���ڱ�ʶͨ��SQL����BOOLEAN��
static int	CHAR
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 CHAR��
static int	CLOB
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 CLOB��
static int	DATALINK
Java��������еĳ�������ʱ��Ϊ���ʹ��룬���ڱ�ʶͨ��SQL����DATALINK��
static int	DATE
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 DATE��
static int	DECIMAL
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 DECIMAL��
static int	DISTINCT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 DISTINCT��
static int	DOUBLE
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 DOUBLE��
static int	FLOAT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 FLOAT��
static int	INTEGER
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 INTEGER��
static int	JAVA_OBJECT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 JAVA_OBJECT��
static int	LONGNVARCHAR
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩LONGNVARCHAR��
static int	LONGVARBINARY
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 LONGVARBINARY��
static int	LONGVARCHAR
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 LONGVARCHAR��
static int	NCHAR
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 NCHAR
static int	NCLOB
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩NCLOB��
static int	NULL
��ʶһ��SQLֵ��Java��������еĳ��� NULL��
static int	NUMERIC
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 NUMERIC��
static int	NVARCHAR
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩NVARCHAR��
static int	OTHER
Java��������еĳ�����ָʾSQL�������ض������ݿ�ģ�����ӳ�䵽����ͨ������getObject�ͷ������ʵ�Java����setObject��
static int	REAL
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 REAL��
static int	REF
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 REF��
static int	ROWID
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 ROWID
static int	SMALLINT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 SMALLINT��
static int	SQLXML
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩XML��
static int	STRUCT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 STRUCT��
static int	TIME
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 TIME��
static int	TIMESTAMP
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 TIMESTAMP��
static int	TINYINT
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 TINYINT��
static int	VARBINARY
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 VARBINARY��
static int	VARCHAR
��ʶһ��SQL���͵�Java��������еĳ�������ʱ��Ϊ���ʹ��룩 VARCHAR��


HavingClauseParser

### java.sql.Types
�������ڱ�ʶͨ��SQL���͵ĳ������࣬��ΪJDBC���͡�

[mysql command options](https://dev.mysql.com/doc/refman/8.0/en/mysql-command-options.html)

```java

--password
--user

```

[java����xml��ע�⣺ JAXB](https://blog.csdn.net/xlxxcc/article/details/52789405)
