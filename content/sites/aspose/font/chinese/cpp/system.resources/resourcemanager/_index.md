---
title: "System::Resources::ResourceManager 类"
linktitle: "ResourceManager"
second_title: "Aspose.Font 适用于 C++"
description: "System::Resources::ResourceManager 类。提供管理资源的 API。未实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/system.resources/resourcemanager/
---
## ResourceManager class


提供管理资源的 API。未实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ResourceManager : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | 从资源获取对象。名称不是 GetObject()，以处理 GetObjectA 定义问题。 |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | 从资源获取对象。名称不是 GetObject()，以处理 GetObjectA 定义问题。 |
| virtual [GetString](./getstring/)(String) | 获取字符串资源。 |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | 获取字符串资源。 |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Font for C++](../../)
