---
title: "System::Xml::XmlElement 类"
linktitle: "XmlElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement 类。表示 C++ 中的元素。"
type: docs
weight: 1700
url: /zh/cpp/system.xml/xmlelement/
---
## XmlElement class


表示一个元素。

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| virtual [get_HasAttributes](./get_hasattributes/)() | 返回一个 **bool** 值，指示当前节点是否具有任何属性。 |
| [get_InnerText](./get_innertext/)() override | 返回节点及其所有子节点的串联值。 |
| [get_InnerXml](./get_innerxml/)() override | 返回仅表示此节点子节点的标记。 |
| [get_IsEmpty](./get_isempty/)() | 返回元素的标签格式。 |
| [get_LocalName](./get_localname/)() override | 返回当前节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | 返回此节点的命名空间 URI。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | 返回此节点所属的 [XmlDocument](../xmldocument/)。 |
| [get_Prefix](./get_prefix/)() override | 返回此节点的命名空间前缀。 |
| [get_SchemaInfo](./get_schemainfo/)() override | 返回因模式验证而分配给此节点的后模式验证信息集。 |
| virtual [GetAttribute](./getattribute/)(String) | 返回具有指定名称的属性的值。 |
| virtual [GetAttribute](./getattribute/)(String, String) | 返回具有指定本地名称和命名空间 URI 的属性的值。 |
| virtual [GetAttributeNode](./getattributenode/)(String) | 返回具有指定名称的 [XmlAttribute](../xmlattribute/)。 |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | 返回具有指定本地名称和命名空间 URI 的 [XmlAttribute](../xmlattribute/)。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | 返回一个 [XmlNodeList](../xmlnodelist/)，其中包含所有匹配指定 [XmlElement::get_Name](./get_name/) 的后代元素的列表。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | 返回一个 [XmlNodeList](../xmlnodelist/)，其中包含所有匹配指定 [XmlElement::get_LocalName](./get_localname/) 和 [XmlElement::get_NamespaceURI](./get_namespaceuri/) 值的后代元素的列表。 |
| virtual [HasAttribute](./hasattribute/)(String) | 确定当前节点是否具有具有指定名称的属性。 |
| virtual [HasAttribute](./hasattribute/)(String, String) | 确定当前节点是否具有具有指定本地名称和命名空间 URI 的属性。 |
| [RemoveAll](./removeall/)() override | 移除当前节点的所有指定属性和子节点。默认属性不会被移除。 |
| virtual [RemoveAllAttributes](./removeallattributes/)() | 从元素中移除所有指定属性。默认属性不会被移除。 |
| virtual [RemoveAttribute](./removeattribute/)(String) | 按名称移除属性。 |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | 移除具有指定本地名称和命名空间 URI 的属性。（如果被移除的属性有默认值，则会立即替换）。 |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | 从元素中移除具有指定索引的属性节点。（如果被移除的属性有默认值，则会立即替换）。 |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | 移除指定的 [XmlAttribute](../xmlattribute/)。 |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | 移除由本地名称和命名空间 URI 指定的 [XmlAttribute](../xmlattribute/)。 （如果被移除的属性有默认值，则会立即替换）。 |
| [set_InnerText](./set_innertext/)(String) override | 设置节点及其所有子节点的连接值。 |
| [set_InnerXml](./set_innerxml/)(String) override | 设置仅表示此节点子节点的标记。 |
| [set_IsEmpty](./set_isempty/)(bool) | 设置元素的标签格式。 |
| [set_Prefix](./set_prefix/)(String) override | 设置此节点的命名空间前缀。 |
| virtual [SetAttribute](./setattribute/)(String, String) | 设置具有指定名称的属性的值。 |
| virtual [SetAttribute](./setattribute/)(String, String, String) | 设置具有指定本地名称和命名空间 URI 的属性的值。 |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | 添加指定的 [XmlAttribute](../xmlattribute/)。 |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | 添加指定的 [XmlAttribute](../xmlattribute/)。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将当前节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
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
