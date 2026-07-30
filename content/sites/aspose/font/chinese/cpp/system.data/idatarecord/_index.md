---
title: "System::Data::IDataRecord 类"
linktitle: "IDataRecord"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::IDataRecord 类。具有列的记录接口。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1300
url: /zh/cpp/system.data/idatarecord/
---
## IDataRecord class


具有列的记录接口。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IDataRecord : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI 信息。 |
| virtual [GetName](./getname/)(const int32_t) | 获取指定位置字段的名称。 |
| virtual [idx_get](./idx_get/)(const int32_t) | 获取指定索引处的值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
