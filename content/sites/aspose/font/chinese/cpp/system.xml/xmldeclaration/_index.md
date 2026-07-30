---
title: "System::Xml::XmlDeclaration 类"
linktitle: "XmlDeclaration"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDeclaration 类。表示 C++ 中的 XML 声明节点 <?xml version=''1.0''...?>。"
type: docs
weight: 1300
url: /zh/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


表示 XML 声明节点 **<?xml version='1.0'...?>**。

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [get_Encoding](./get_encoding/)() | 返回 XML 文档的编码级别。 |
| [get_InnerText](./get_innertext/)() override | 返回 [XmlDeclaration](./) 的连接值。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_Standalone](./get_standalone/)() | 返回 standalone 属性的值。 |
| [get_Value](./get_value/)() override | 返回 [XmlDeclaration](./) 的值。 |
| [get_Version](./get_version/)() | 返回文档的 XML 版本。 |
| [set_Encoding](./set_encoding/)(const String\&) | 设置 XML 文档的编码级别。 |
| [set_InnerText](./set_innertext/)(String) override | 设置 [XmlDeclaration](./) 的连接值。 |
| [set_Standalone](./set_standalone/)(const String\&) | 设置 standalone 属性的值。 |
| [set_Value](./set_value/)(String) override | 设置 [XmlDeclaration](./) 的值。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的子节点保存到指定的 [XmlWriter](../xmlwriter/)。由于 [XmlDeclaration](./) 节点没有子节点，此方法不产生任何作用。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
