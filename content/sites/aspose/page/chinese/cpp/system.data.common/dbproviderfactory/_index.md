---
title: "System::Data::Common::DbProviderFactory 类"
linktitle: "DbProviderFactory"
second_title: "Aspose.Page 适用于 C++"
description: "System::Data::Common::DbProviderFactory 类。用于访问数据库的提供程序。该类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 600
url: /zh/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


用于访问数据库的提供程序。该类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DbProviderFactory : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | RTTI 信息。 |
| virtual [CreateConnection](./createconnection/)() | 创建数据库连接。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
