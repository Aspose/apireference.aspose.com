---
title: "System::Reflection::Assembly 类"
linktitle: "程序集"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::Assembly 类。描述程序集的反射类。由于 C# 与 C++ 的规则差异很大，支持有限。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建该类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 100
url: /zh/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Assembly](./assembly/)() | 构造函数。 |
| virtual [get_CodeBase](./get_codebase/)() const | 获取当前程序集的目录。支持有限。 |
| virtual [get_FullName](./get_fullname/)() const | 获取程序集的完整名称。 |
| virtual [get_Location](./get_location/)() const | 获取程序集位置。未实现。 |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | 获取定义特定类型的程序集。 |
| static [GetCallingAssembly](./getcallingassembly/)() | 获取调用程序集。 |
| static [GetEntryAssembly](./getentryassembly/)() | 获取入口程序集。 |
| static [GetExecutingAssembly](./getexecutingassembly/)() | 获取执行程序集。 |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | 获取清单资源的名称。 |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | 获取连接到清单资源的流。 |
| virtual [GetName](./getname/)() const | 获取程序集名称。 |
| virtual [GetTypes](./gettypes/)() const | 获取程序集声明的类型。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
