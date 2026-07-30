---
title: "System::IDisposable 类"
linktitle: "IDisposable"
second_title: "Aspose.Font 适用于 C++"
description: "System::IDisposable 类。定义释放当前对象拥有的资源的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3600
url: /zh/cpp/system/idisposable/
---
## IDisposable class


定义释放当前对象拥有的资源的方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IDisposable : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Dispose](./dispose/)() | 不执行任何操作。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
