---
title: "System::Xml::XmlNotation 类"
linktitle: "XmlNotation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNotation 类。表示符号声明，例如 C++ 中的 <!NOTATION...>。"
type: docs
weight: 2900
url: /zh/cpp/system.xml/xmlnotation/
---
## XmlNotation class


表示符号声明，例如 **<!NOTATION... >**。

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。符号节点无法被克隆。在 [XmlNotation](./) 对象上调用此方法会抛出异常。 |
| [get_InnerXml](./get_innerxml/)() override | 返回表示此节点子节点的标记。 |
| [get_IsReadOnly](./get_isreadonly/)() override | 返回指示节点是否为只读的值。 |
| [get_LocalName](./get_localname/)() override | 返回当前节点不带命名空间前缀的名称。 |
| [get_Name](./get_name/)() override | 返回当前节点的名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_OuterXml](./get_outerxml/)() override | 返回表示此节点及其所有子节点的标记。 |
| [get_PublicId](./get_publicid/)() | 返回符号声明中公共标识符的值。 |
| [get_SystemId](./get_systemid/)() | 返回符号声明中系统标识符的值。 |
| [set_InnerXml](./set_innerxml/)(String) override | 设置表示此节点子节点的标记。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的子节点保存到指定的 [XmlWriter](../xmlwriter/)。此方法对 [XmlNotation](./) 节点没有影响。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。此方法对 [XmlNotation](./) 节点没有影响。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
