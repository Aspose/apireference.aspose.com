---
title: "System::Xml::XmlReader::IsStartElement 方法"
linktitle: "IsStartElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::IsStartElement 方法。调用 XmlReader::MoveToContent 并测试当前内容节点是否为开始标签或空元素标签（C++）。"
type: docs
weight: 3000
url: /zh/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


调用 [XmlReader::MoveToContent](../movetocontent/) 并测试当前内容节点是否为开始标签或空元素标签。

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## 另见

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String, String) method


调用 [XmlReader::MoveToContent](../movetocontent/) 并测试当前内容节点是否为开始标签或空元素标签，以及找到的元素的 [XmlReader::get_LocalName](../get_localname/) 和 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 值是否与给定字符串匹配。

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 本地名称 | String | 用于匹配找到的元素 **LocalName** 值的字符串。 |
| ns | String | 用于匹配找到的元素 **NamespaceURI** 值的字符串。 |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String) method


调用 [XmlReader::MoveToContent](../movetocontent/) 并测试当前内容节点是否为开始标签或空元素标签，以及找到的元素的 [XmlReader::get_Name](../get_name/) 值是否与给定参数匹配。

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 该字符串与找到的元素的 **Name** 值匹配。 |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
