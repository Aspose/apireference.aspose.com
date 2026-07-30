---
title: "System::Xml::XmlEntity 类"
linktitle: "XmlEntity"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlEntity 类。表示实体声明，例如 C++ 中的 <!ENTITY...>。"
type: docs
weight: 1800
url: /zh/cpp/system.xml/xmlentity/
---
## XmlEntity class


表示实体声明，例如 **<!ENTITY... >**。

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。实体节点不能被克隆。对 [XmlEntity](./) 对象调用此方法会抛出异常。 |
| [get_BaseURI](./get_baseuri/)() override | 返回当前节点的基础统一资源标识符（URI）。 |
| [get_InnerText](./get_innertext/)() override | 返回实体节点及其所有子节点的连接值。 |
| [get_InnerXml](./get_innerxml/)() override | 返回表示此节点子节点的标记。 |
| [get_IsReadOnly](./get_isreadonly/)() override | 返回指示节点是否为只读的值。 |
| [get_LocalName](./get_localname/)() override | 返回节点的名称（不含命名空间前缀）。 |
| [get_Name](./get_name/)() override | 返回节点的名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回节点的类型。 |
| [get_NotationName](./get_notationname/)() | 返回实体声明中可选的 NDATA 属性的名称。 |
| [get_OuterXml](./get_outerxml/)() override | 返回表示此节点及其所有子节点的标记。 |
| [get_PublicId](./get_publicid/)() | 返回实体声明中公共标识符的值。 |
| [get_SystemId](./get_systemid/)() | 返回实体声明中系统标识符的值。 |
| [set_InnerText](./set_innertext/)(String) override | 设置实体节点及其所有子节点的连接值。 |
| [set_InnerXml](./set_innerxml/)(String) override | 设置表示此节点子节点的标记。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。对于 [XmlEntity](./) 节点，此方法无效。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。对于 [XmlEntity](./) 节点，此方法无效。 |
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
