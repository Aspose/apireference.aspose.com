---
title: "System::Reflection::ConstructorInfo 类"
linktitle: "ConstructorInfo"
second_title: "Aspose.Page 适用于 C++"
description: "System::Reflection::ConstructorInfo 类。提供对 C++ 中构造函数元数据的访问。"
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
| [ConstructorInfo](./constructorinfo/)(const String\&, std::function\<System::Object::ptr()>) | 为无参数的构造函数初始化一个新的 [ConstructorInfo](./) 类实例。 |
| [get_DeclaringType](./get_declaringtype/)() | 获取声明此成员的类。未实现。 |
| [get_MemberType](./get_membertype/)() const override | 获取一个 [MemberTypes](../membertypes/) 值，指示此成员是构造函数。 |
| [Invoke](./invoke/)(const System::ArrayPtr\<System::SharedPtr\<System::Object\>\>\&) | 使用指定的参数调用当前实例所代表的方法或构造函数。 |
## 另见

* Class [MethodBase](../methodbase/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
