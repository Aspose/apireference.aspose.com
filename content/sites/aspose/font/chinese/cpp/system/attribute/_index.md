---
title: "System::Attribute 类"
linktitle: "Attribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Attribute 类。自定义属性的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 400
url: /zh/cpp/system/attribute/
---
## Attribute class


自定义属性的基类。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Attribute : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | 返回指定类型应用于指定类型的自定义属性。 |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | 返回应用于指定类型的所有自定义属性。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
