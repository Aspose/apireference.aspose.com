---
title: "System::Diagnostics::StackFrame 类"
linktitle: "StackFrame"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::StackFrame 类。获取单个堆栈帧的信息。仅限 MSVS。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 500
url: /zh/cpp/system.diagnostics/stackframe/
---
## StackFrame class


获取单个堆栈帧的信息。仅限 MSVS。此类的对象只能使用[System::MakeObject()](../../system/makeobject/)函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到[System::SmartPtr](../../system/smartptr/)指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StackFrame : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | 获取列号。 |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | 获取行号。 |
| virtual [GetFileName](./getfilename/)() | 获取文件名。 |
| [GetMethod](./getmethod/)() | 获取方法信息。 |
| [operator=](./operator=/)(const StackFrame\&) const | 不可更改。 |
| [StackFrame](./stackframe/)(int) | 在当前堆栈偏移处创建堆栈帧。 |
| [StackFrame](./stackframe/)(const StackFrame\&) | 不支持复制。 |
| virtual [~StackFrame](./~stackframe/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
