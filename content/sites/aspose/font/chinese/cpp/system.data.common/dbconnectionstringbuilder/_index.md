---
title: "System::Data::Common::DbConnectionStringBuilder 类"
linktitle: "DbConnectionStringBuilder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::Common::DbConnectionStringBuilder 类。用于构建具名字段的连接字符串的 API。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.data.common/dbconnectionstringbuilder/
---
## DbConnectionStringBuilder class


用于构建具名字段的连接字符串的 API。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DbConnectionStringBuilder : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | 获取完整的连接字符串。 |
| virtual [idx_get](./idx_get/)(String) | RTTI 信息。 |
| virtual [idx_set](./idx_set/)(String, Object::ptr) | 设置具名值。 |
| virtual [set_ConnectionString](./set_connectionstring/)(String) | 设置完整的连接字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
