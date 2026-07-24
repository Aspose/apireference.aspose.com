---
title: "System::Xml::XmlElement::GetAttributeNode 方法"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlElement::GetAttributeNode 方法。返回具有指定本地名称和命名空间 URI 的 XmlAttribute（C++）。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


返回具有指定本地名称和命名空间 URI 的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 属性的本地名称。 |
| namespaceURI | 字符串 | 属性的命名空间 URI。 |

### ReturnValue

指定的 [XmlAttribute](../../xmlattribute/) 或 **nullptr**（如果未找到匹配的属性）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


返回具有指定名称的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 要检索的属性的名称。这是一个限定名称。它会与匹配节点的 **get_Name** 值进行匹配。 |

### ReturnValue

指定的 [XmlAttribute](../../xmlattribute/) 或 **nullptr**（如果未找到匹配的属性）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
