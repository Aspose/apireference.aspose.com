---
title: "System::Xml::XmlElement::RemoveAttributeNode method"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlElement::RemoveAttributeNode 方法。删除指定的 XmlAttribute（C++）。"
type: docs
weight: 2100
url: /zh/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


删除指定的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | 要删除的 [XmlAttribute](../../xmlattribute/) 节点。如果被删除的属性具有默认值，则会立即被替换。 |

### ReturnValue

被删除的 [XmlAttribute](../../xmlattribute/) 或 **nullptr**（如果 **oldAttr** 不是 [XmlElement](../) 的属性节点）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


删除由本地名称和命名空间 URI 指定的 [XmlAttribute](../../xmlattribute/)。 （如果被删除的属性具有默认值，则会立即被替换）。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 属性的本地名称。 |
| namespaceURI | 字符串 | 属性的命名空间 URI。 |

### ReturnValue

被删除的 [XmlAttribute](../../xmlattribute/) 或 **nullptr**（如果 [XmlElement](../) 没有匹配的属性节点）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
