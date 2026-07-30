---
title: "System::Diagnostics::TraceListener 类"
linktitle: "TraceListener"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::TraceListener 类。用于响应调试和跟踪信息的接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 800
url: /zh/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


用于响应调试和跟踪信息的接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TraceListener : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | 将失败信息写入调试器。 |
| virtual [Fail](./fail/)(System::String, System::String) | 将失败信息写入调试器。 |
| virtual [Write](./write/)(System::String) | RTTI 信息。 |
| virtual [WriteLine](./writeline/)(System::String) | 将行写入调试器。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
