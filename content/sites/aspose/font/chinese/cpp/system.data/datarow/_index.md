---
title: "System::Data::DataRow 类"
linktitle: "DataRow"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::DataRow 类。数据集中的行。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 500
url: /zh/cpp/system.data/datarow/
---
## DataRow class


数据集中的行。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DataRow : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Table](./get_table/)() | 获取所属的表行。 |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | 获取通过指定关系被视为子项的行。 |
| [idx_get](./idx_get/)(const int32_t) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
