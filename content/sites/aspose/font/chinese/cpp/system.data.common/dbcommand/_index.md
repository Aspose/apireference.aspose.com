---
title: "System::Data::Common::DbCommand 类"
linktitle: "DbCommand"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::Common::DbCommand 类。数据库命令。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.data.common/dbcommand/
---
## DbCommand class


数据库命令。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DbCommand : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | 执行非查询命令。 |
| virtual [ExecuteReader](./executereader/)() | 执行查询命令。 |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI 信息。 |
| virtual [get_Connection](./get_connection/)() const | 获取与命令关联的数据库连接。 |
| virtual [set_CommandText](./set_commandtext/)(String) const | 设置数据库命令文本。 |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | 获取与命令关联的数据库连接。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
