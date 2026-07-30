---
title: "System::Xml::XmlElement::GetElementsByTagName 方法"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::GetElementsByTagName 方法。返回一个 XmlNodeList，其中包含所有匹配指定 XmlElement::get_LocalName 和 XmlElement::get_NamespaceURI 值的后代元素列表（在 C++ 中）。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


返回一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配指定 [XmlElement::get_LocalName](../get_localname/) 和 [XmlElement::get_NamespaceURI](../get_namespaceuri/) 值的后代元素列表。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要匹配的本地名称。星号 (*) 是一种特殊值，匹配所有标签。 |
| namespaceURI | String | 要匹配的命名空间 URI。 |

### ReturnValue

一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配节点的列表。如果没有匹配的节点，则列表为空。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


返回一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配指定 [XmlElement::get_Name](../get_name/) 的后代元素列表。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要匹配的名称标签。这是一个限定名称。它会与匹配节点的 **get_Name** 值进行比较。星号 (*) 是一种特殊值，匹配所有标签。 |

### ReturnValue

一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配节点的列表。如果没有匹配的节点，则列表为空。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
