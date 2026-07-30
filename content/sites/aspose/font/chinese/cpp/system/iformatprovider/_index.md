---
title: "System::IFormatProvider 类"
linktitle: "IFormatProvider"
second_title: "Aspose.Font 适用于 C++"
description: "System::IFormatProvider 类。定义提供格式化信息的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3800
url: /zh/cpp/system/iformatprovider/
---
## IFormatProvider class


定义提供格式化信息的方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IFormatProvider : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | 返回一个为指定类型提供格式化服务的对象。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
