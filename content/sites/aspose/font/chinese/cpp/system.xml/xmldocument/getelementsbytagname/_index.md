---
title: "System::Xml::XmlDocument::GetElementsByTagName 方法"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::GetElementsByTagName 方法。返回一个 XmlNodeList，其中包含所有匹配指定 XmlDocument::get_LocalName 和 XmlNode::get_NamespaceURI 的后代元素列表（在 C++ 中）。"
type: docs
weight: 3200
url: /zh/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


返回一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配指定的 [XmlDocument::get_LocalName](../get_localname/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 的后代元素列表。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要匹配的 LocalName。特殊值 **\"*\"** 匹配所有标签。 |
| namespaceURI | String | 要匹配的 NamespaceURI。 |

### ReturnValue

一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配的节点列表。如果没有节点匹配指定的 **localName** 和 **namespaceURI**，返回的集合将为空。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


返回一个 [XmlNodeList](../../xmlnodelist/)，其中包含所有匹配指定名称的后代元素列表。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要匹配的限定名称。它会与匹配节点的 **get_Name** 值进行比较。特殊值 **\"*\"** 匹配所有标签。 |

### ReturnValue

一个包含所有匹配节点列表的[XmlNodeList](../../xmlnodelist/)。如果没有节点匹配 **name**，返回的集合将为空。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
