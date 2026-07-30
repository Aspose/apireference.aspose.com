---
title: "System::Diagnostics::PerformanceCounter 类"
linktitle: "PerformanceCounter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::PerformanceCounter 类。用于在翻译代码中使用 PerformanceCounter 的虚拟类，以便能够编译。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 200
url: /zh/cpp/system.diagnostics/performancecounter/
---
## PerformanceCounter class


用于在翻译代码中使用 PerformanceCounter 的虚拟类，以便能够编译。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PerformanceCounter : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() | 停止所有性能计数操作。 |
| [NextValue](./nextvalue/)() | 获取下一个测量值。 |
| [PerformanceCounter](./performancecounter/)() | 创建性能计数器。 |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&) | 创建特定类别的性能计数器。 |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&, const String\&, const String\&) | 创建特定实例名称的性能计数器。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
