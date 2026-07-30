---
title: "System::Data::SqlClient::SqlConnectionStringBuilder 类"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder 类。基于 SQL 的连接构建器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


基于 SQL 的连接构建器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | 获取数据源（例如主机名和端口）。 |
| [get_Encrypt](./get_encrypt/)() const | 检查是否在行上启用了加密。 |
| [get_InitialCatalog](./get_initialcatalog/)() const | 获取与连接关联的数据库名称。 |
| [get_NetworkLibrary](./get_networklibrary/)() const | 获取使用的网络库名称。 |
| [get_Password](./get_password/)() const | 获取用于连接数据库的密码。 |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | 检查连接是否使用受信任的服务器证书进行保护。 |
| [get_UserID](./get_userid/)() const | 获取用于连接的用户 ID。 |
| [idx_get](./idx_get/)(String) override | RTTI 信息。 |
| [idx_set](./idx_set/)(String, Object::ptr) override | 设置键控对象。 |
| [set_DataSource](./set_datasource/)(const String\&) | 获取数据源（例如主机名和端口）。 |
| [set_Encrypt](./set_encrypt/)(bool) | 切换加密的开启或关闭。 |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | 设置与连接关联的数据库名称。 |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | 选择要使用的网络库。 |
| [set_Password](./set_password/)(const String\&) | 设置用于连接数据库的密码。 |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | 确定连接是否使用受信任的服务器证书进行保护。 |
| [set_UserID](./set_userid/)(const String\&) | 设置用于连接的用户 ID。 |
## 另见

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Font for C++](../../)
