---
title: "System::Xml::Serialization::XmlSerializerNamespaces 类"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces 类。包含 Serialization::XmlSerializer 用于在 C++ 中生成 XML 文档实例中限定名称的 XML 命名空间和前缀。"
type: docs
weight: 800
url: /zh/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


包含 XML 命名空间和前缀，这些由 [Serialization::XmlSerializer](../xmlserializer/) 用于在 XML 文档实例中生成限定名称。

```cpp
class XmlSerializerNamespaces : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | 向 [Serialization::XmlSerializerNamespaces](./) 对象添加前缀和命名空间对。 |
| [get_Count](./get_count/)() | 返回集合中前缀和命名空间对的数量。 |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | 返回 [Serialization::XmlSerializerNamespaces](./) 对象中前缀和命名空间对的数组。 |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | 初始化 [Serialization::XmlSerializerNamespaces](./) 类的新实例。 |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | 使用包含前缀和命名空间对集合的指定 **[XmlSerializerNamespaces](./)** 实例，初始化 [Serialization::XmlSerializerNamespaces](./) 类的新实例。 |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | 初始化 [Serialization::XmlSerializerNamespaces](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
