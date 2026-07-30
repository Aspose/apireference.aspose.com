---
title: "System::ICustomFormatter 类"
linktitle: "ICustomFormatter"
second_title: "Aspose.Font 适用于 C++"
description: "System::ICustomFormatter 类。定义一个方法，对由指定对象表示的值的字符串表示执行自定义格式化。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 3500
url: /zh/cpp/system/icustomformatter/
---
## ICustomFormatter class


定义一个方法，对由指定对象表示的值的字符串表示执行自定义格式化。此类的对象只能通过 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ICustomFormatter : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | 返回使用指定格式的当前对象表示的值的字符串表示。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
