---
title: "System::Data::Common::DbConnection 类"
linktitle: "DbConnection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::Common::DbConnection 类。数据库连接。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 200
url: /zh/cpp/system.data.common/dbconnection/
---
## DbConnection class


数据库连接。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DbConnection : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI 信息。 |
| virtual [Open](./open/)() | 打开到数据库的连接。 |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | 设置连接信息（例如服务器和端口）。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
