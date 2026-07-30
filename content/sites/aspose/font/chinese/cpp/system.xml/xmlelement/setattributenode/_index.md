---
title: "System::Xml::XmlElement::SetAttributeNode 方法"
linktitle: "SetAttributeNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::SetAttributeNode 方法。在 C++ 中添加指定的 XmlAttribute。"
type: docs
weight: 2700
url: /zh/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


添加指定的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | 要添加到此元素属性集合的 [XmlAttribute](../../xmlattribute/) 节点。 |

### ReturnValue

如果该属性替换了同名的已有属性，则返回旧的 [XmlAttribute](../../xmlattribute/)；否则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


添加指定的 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

要添加的 [XmlAttribute](../../xmlattribute/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
