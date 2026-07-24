---
title: "System::Xml::XmlElement::GetElementsByTagName method"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlElement::GetElementsByTagName 方法。返回一个 XmlNodeList，其中包含所有匹配指定 XmlElement::get_LocalName 和 XmlElement::get_NamespaceURI 值的后代元素列表（C++）。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


返回一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配指定的 [XmlElement::get_LocalName](../get_localname/) 和 [XmlElement::get_NamespaceURI](../get_namespaceuri/) 值的后代元素列表。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 要匹配的本地名称。星号 (*) 是一种特殊值，可匹配所有标签。 |
| namespaceURI | 字符串 | 要匹配的命名空间 URI。 |

### ReturnValue

一个包含所有匹配节点列表的 [XmlNodeList](../../xmlnodelist/)。如果没有匹配的节点，列表为空。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


返回一个包含所有匹配指定 [XmlElement::get_Name](../get_name/) 的后代元素列表的 [XmlNodeList](../../xmlnodelist/)。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 要匹配的名称标签。这是一个限定名称。它会与匹配节点的 **get_Name** 值进行比较。星号 (*) 是一种匹配所有标签的特殊值。 |

### ReturnValue

一个包含所有匹配节点列表的 [XmlNodeList](../../xmlnodelist/)。如果没有匹配的节点，列表为空。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
