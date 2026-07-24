---
title: "System::Xml::XPath::XPathNavigator::InsertElementAfter 方法"
linktitle: "InsertElementAfter"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::InsertElementAfter 方法。使用指定的命名空间前缀、本地名称和命名空间 URI，在当前节点之后创建一个新的兄弟元素，并使用 C++ 中指定的值。"
type: docs
weight: 4300
url: /zh/cpp/system.xml.xpath/xpathnavigator/insertelementafter/
---
## XPathNavigator::InsertElementAfter method


使用指定的命名空间前缀、本地名称和命名空间 URI，以及指定的值，在当前节点之后创建新兄弟元素。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertElementAfter(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | 字符串 | 新子元素的命名空间前缀（如果有）。 |
| localName | 字符串 | 新子元素的局部名称（如果有）。 |
| namespaceURI | String | 新子元素的命名空间 URI（如果有）。[String::Empty](../../../system/string/empty/) 与 **nullptr** 等价。 |
| value | String | 新子元素的值。如果 [String::Empty](../../../system/string/empty/) 或 **nullptr** 被传入，则创建一个空元素。 |

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
