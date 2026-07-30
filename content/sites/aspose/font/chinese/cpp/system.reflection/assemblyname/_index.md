---
title: "System::Reflection::AssemblyName 类"
linktitle: "AssemblyName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::AssemblyName 类。定义程序集名称。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.reflection/assemblyname/
---
## AssemblyName class


定义程序集名称。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class AssemblyName : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AssemblyName](./assemblyname/)() | 构造函数。 |
| [AssemblyName](./assemblyname/)(const String\&) | 构造函数。 |
| [AssemblyName](./assemblyname/)(const String\&, const Version\&) | 构造函数。 |
| [get_Name](./get_name/)() | 获取程序集名称。 |
| [get_Version](./get_version/)() | 获取程序集版本。 |
| [set_Name](./set_name/)(const String\&) | 设置程序集名称。 |
| [set_Version](./set_version/)(const Version\&) | 设置程序集版本。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
