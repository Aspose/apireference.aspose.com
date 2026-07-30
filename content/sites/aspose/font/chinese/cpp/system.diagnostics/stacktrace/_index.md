---
title: "System::Diagnostics::StackTrace 类"
linktitle: "StackTrace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::StackTrace 类。堆栈帧的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


堆栈帧的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StackTrace : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | 获取堆栈跟踪中帧的数量。 |
| virtual [GetFrame](./getframe/)(uint32_t) | 获取堆栈帧。 |
| [operator=](./operator=/)(const StackTrace\&) const | 不允许赋值。 |
| [StackTrace](./stacktrace/)() | 创建描述当前堆栈状态的堆栈跟踪。 |
| [StackTrace](./stacktrace/)(bool) | 创建描述当前堆栈状态的堆栈跟踪。 |
| [StackTrace](./stacktrace/)(const StackTrace\&) | 不支持复制。 |
| virtual [~StackTrace](./~stacktrace/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
