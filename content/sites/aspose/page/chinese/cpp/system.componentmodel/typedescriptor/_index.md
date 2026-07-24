---
title: "System::ComponentModel::TypeDescriptor 类"
linktitle: "TypeDescriptor"
second_title: "Aspose.Page 适用于 C++"
description: "System::ComponentModel::TypeDescriptor 类。用于在翻译后编译使用 TypeDescriptor 的代码的虚拟类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1500
url: /zh/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


用于在翻译后编译的 TypeDescriptor 使用代码的虚拟类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上创建此类型的实例或使用 new 运算符，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TypeDescriptor : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
