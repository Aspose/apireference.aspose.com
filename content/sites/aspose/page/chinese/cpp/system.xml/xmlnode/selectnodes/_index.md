---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNode::SelectNodes 方法。在 C++ 中选择匹配 XPath 表达式的节点列表。"
type: docs
weight: 3800
url: /zh/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


选择匹配 [XPath](../../../system.xml.xpath/) 表达式的节点列表。

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| xpath | const String\& | 该 [XPath](../../../system.xml.xpath/) 表达式。 |

### ReturnValue

一个包含匹配 [XPath](../../../system.xml.xpath/) 查询的节点集合的 [XmlNodeList](../../xmlnodelist/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


选择匹配 [XPath](../../../system.xml.xpath/) 表达式的节点列表。 在 [XPath](../../../system.xml.xpath/) 表达式中发现的任何前缀都使用提供的 [XmlNamespaceManager](../../xmlnamespacemanager/) 进行解析。

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| xpath | const String\& | 该 [XPath](../../../system.xml.xpath/) 表达式。 |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于在 [XPath](../../../system.xml.xpath/) 表达式中解析前缀命名空间的 [XmlNamespaceManager](../../xmlnamespacemanager/)。 |

### ReturnValue

一个包含匹配 [XPath](../../../system.xml.xpath/) 查询的节点集合的 [XmlNodeList](../../xmlnodelist/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
