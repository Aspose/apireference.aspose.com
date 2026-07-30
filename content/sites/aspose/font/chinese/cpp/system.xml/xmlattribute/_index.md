---
title: "System::Xml::XmlAttribute 类"
linktitle: "XmlAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttribute 类。表示属性。属性的有效值和默认值在文档类型定义 (DTD) 或模式中定义（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


表示属性。属性的有效值和默认值在文档类型定义 (DTD) 或模式中定义。

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | 将指定的节点添加到此节点的子节点列表的末尾。 |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [get_BaseURI](./get_baseuri/)() override | 返回节点的基础统一资源标识符 (URI)。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | 返回此节点的命名空间 URI。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | 返回此节点所属的 [XmlDocument](../xmldocument/)。 |
| virtual [get_OwnerElement](./get_ownerelement/)() | 返回属性所属的 [XmlElement](../xmlelement/)。 |
| [get_Prefix](./get_prefix/)() override | 返回此节点的命名空间前缀。 |
| [get_SchemaInfo](./get_schemainfo/)() override | 返回因模式验证而分配给此节点的后模式验证信息集 (post-schema-validation-infoset)。 |
| virtual [get_Specified](./get_specified/)() | 返回一个值，指示属性值是否已显式设置。 |
| [get_Value](./get_value/)() override | 返回节点的值。 |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 在指定的参考节点之后立即插入指定的节点。 |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 在指定的参考节点之前立即插入指定的节点。 |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | 将指定的节点添加到此节点的子节点列表的开头。 |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | 移除指定的子节点。 |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 用指定的新子节点替换指定的子节点。 |
| [set_InnerText](./set_innertext/)(String) override | 设置节点及其所有子节点的连接值。 |
| [set_InnerXml](./set_innerxml/)(String) override | 设置属性的值。 |
| [set_Prefix](./set_prefix/)(String) override | 设置此节点的命名空间前缀。 |
| [set_Value](./set_value/)(String) override | 设置节点的值。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
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
