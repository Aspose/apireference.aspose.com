---
title: "System::Reflection::ConstructorInfo 类"
linktitle: "ConstructorInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::ConstructorInfo 类。提供在 C++ 中访问构造函数元数据的功能。"
type: docs
weight: 500
url: /zh/cpp/system.reflection/constructorinfo/
---
## ConstructorInfo class


提供对构造函数元数据的访问。

```cpp
class ConstructorInfo : public System::Reflection::MethodBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ConstructorInfo](./constructorinfo/)(const String\&, std::function\<System::Object::ptr()>) | 初始化一个不带参数的构造函数的 [ConstructorInfo](./) 类的新实例。 |
| [get_DeclaringType](./get_declaringtype/)() | 获取声明此成员的类。未实现。 |
| [get_MemberType](./get_membertype/)() const override | 获取一个指示此成员为构造函数的 [MemberTypes](../membertypes/) 值。 |
| [Invoke](./invoke/)(const System::ArrayPtr\<System::SharedPtr\<System::Object\>\>\&) | 使用指定的参数调用当前实例所表示的方法或构造函数。 |
## 另见

* Class [MethodBase](../methodbase/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
