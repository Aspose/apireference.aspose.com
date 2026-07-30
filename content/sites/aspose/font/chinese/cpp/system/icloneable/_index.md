---
title: "System::ICloneable 类"
linktitle: "ICloneable"
second_title: "Aspose.Font 适用于 C++"
description: "System::ICloneable 类。定义了一个允许对象克隆——创建对象副本的方法。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 3200
url: /zh/cpp/system/icloneable/
---
## ICloneable class


定义了一个允许对象克隆——创建对象副本的方法。此类的对象应仅使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ICloneable : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clone](./clone/)() | RTTI 信息。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
