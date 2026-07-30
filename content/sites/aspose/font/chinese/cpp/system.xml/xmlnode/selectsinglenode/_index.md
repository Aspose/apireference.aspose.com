---
title: "System::Xml::XmlNode::SelectSingleNode 方法"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::SelectSingleNode 方法。选择在 C++ 中匹配 XPath 表达式的第一个 XmlNode。"
type: docs
weight: 3900
url: /zh/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


选择匹配 [XPath](../../../system.xml.xpath/) 表达式的第一个 [XmlNode](../)。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | const String\& | 该 [XPath](../../../system.xml.xpath/) 表达式。 |

### ReturnValue

匹配 [XPath](../../../system.xml.xpath/) 查询的第一个 [XmlNode](../)，如果未找到匹配的节点则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


选择匹配 [XPath](../../../system.xml.xpath/) 表达式的第一个 [XmlNode](../)。在 [XPath](../../../system.xml.xpath/) 表达式中发现的任何前缀均使用提供的 [XmlNamespaceManager](../../xmlnamespacemanager/) 进行解析。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | const String\& | 该 [XPath](../../../system.xml.xpath/) 表达式。 |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | 用于在 [XPath](../../../system.xml.xpath/) 表达式中解析前缀命名空间的 [XmlNamespaceManager](../../xmlnamespacemanager/)。 |

### ReturnValue

匹配 [XPath](../../../system.xml.xpath/) 查询的第一个 [XmlNode](../)，如果未找到匹配的节点则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
