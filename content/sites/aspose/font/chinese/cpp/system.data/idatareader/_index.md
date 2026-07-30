---
title: "System::Data::IDataReader 类"
linktitle: "IDataReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::IDataReader 类。用于读取后续数据的接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1200
url: /zh/cpp/system.data/idatareader/
---
## IDataReader class


用于读取后续数据的接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IDataReader : public System::Data::IDataRecord
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Read](./read/)() | RTTI 信息。 |
## 另见

* Class [IDataRecord](../idatarecord/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
