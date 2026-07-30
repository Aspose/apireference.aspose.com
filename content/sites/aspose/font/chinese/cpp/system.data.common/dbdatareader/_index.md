---
title: "System::Data::Common::DbDataReader class"
linktitle: "DbDataReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::Common::DbDataReader 类。用于从数据库接收数据的 API。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 400
url: /zh/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


用于从数据库接收数据的 API。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DbDataReader : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 关闭数据检索通道。 |
| virtual [idx_get](./idx_get/)(String) | 获取具名项。 |
| virtual [idx_get](./idx_get/)(int) | 通过索引获取项。 |
| virtual [Read](./read/)() | 读取数据库中的下一条记录。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
