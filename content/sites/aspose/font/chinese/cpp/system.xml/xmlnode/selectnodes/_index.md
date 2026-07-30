---
title: "System::Xml::XmlNode::SelectNodes 方法"
linktitle: "SelectNodes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::SelectNodes 方法。选择与 XPath 表达式匹配的节点列表（在 C++ 中）。"
type: docs
weight: 3800
url: /zh/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


选择与 [XPath](../../../system.xml.xpath/) 表达式匹配的节点列表。

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | const String\& | 该 [XPath](../../../system.xml.xpath/) 表达式。 |

### ReturnValue

一个包含与 [XPath](../../../system.xml.xpath/) 查询匹配的节点集合的 [XmlNodeList](../../xmlnodelist/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


选择与 [XPath](../../../system.xml.xpath/) 表达式匹配的节点列表。对 [XPath](../../../system.xml.xpath/) 表达式中出现的任何前缀，使用提供的 [XmlNamespaceManager](../../xmlnamespacemanager/) 进行解析。

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | const String\& | 该 [XPath](../../../system.xml.xpath/) 表达式。 |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于在 [XPath](../../../system.xml.xpath/) 表达式中解析前缀命名空间的 [XmlNamespaceManager](../../xmlnamespacemanager/)。 |

### ReturnValue

一个包含与 [XPath](../../../system.xml.xpath/) 查询匹配的节点集合的 [XmlNodeList](../../xmlnodelist/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
