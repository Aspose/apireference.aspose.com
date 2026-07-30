---
title: "System::Xml::XmlElement::GetAttributeNode 方法"
linktitle: "GetAttributeNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::GetAttributeNode 方法。返回在 C++ 中具有指定本地名称和命名空间 URI 的 XmlAttribute。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


返回具有指定本地名称和命名空间 URI 的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

指定的 [XmlAttribute](../../xmlattribute/)，如果未找到匹配的属性则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttributeNode(String) method


返回具有指定名称的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要检索的属性的名称。这是一个限定名称。它会与匹配节点的 **get_Name** 值进行匹配。 |

### ReturnValue

指定的 [XmlAttribute](../../xmlattribute/)，如果未找到匹配的属性则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
