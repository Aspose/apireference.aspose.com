---
title: "System::Xml::XmlElement::RemoveAttributeNode 方法"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::RemoveAttributeNode 方法。移除指定的 XmlAttribute（在 C++ 中）。"
type: docs
weight: 2100
url: /zh/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


移除指定的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | 要移除的 [XmlAttribute](../../xmlattribute/) 节点。如果被移除的属性具有默认值，则会立即被替换。 |

### ReturnValue

被移除的 [XmlAttribute](../../xmlattribute/) 或 **nullptr**（如果 **oldAttr** 不是 [XmlElement](../) 的属性节点）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


移除由本地名称和命名空间 URI 指定的 [XmlAttribute](../../xmlattribute/)。(如果被移除的属性具有默认值，则会立即被替换)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

已删除的 [XmlAttribute](../../xmlattribute/)；如果 [XmlElement](../) 没有匹配的属性节点，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
