---
title: "System::Xml::XPath::XPathNavigator::InsertElementBefore 方法"
linktitle: "InsertElementBefore"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::InsertElementBefore 方法。使用指定的命名空间前缀、局部名称和命名空间 URI，在当前节点之前创建一个新的同级元素，并使用 C++ 中指定的值。"
type: docs
weight: 4400
url: /zh/cpp/system.xml.xpath/xpathnavigator/insertelementbefore/
---
## XPathNavigator::InsertElementBefore method


使用指定的命名空间前缀、本地名称和命名空间 URI，在当前节点之前创建一个新的同级元素，使用指定的值。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertElementBefore(String prefix, String localName, String namespaceURI, String value)
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
