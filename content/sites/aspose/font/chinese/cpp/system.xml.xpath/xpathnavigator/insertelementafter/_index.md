---
title: "System::Xml::XPath::XPathNavigator::InsertElementAfter 方法"
linktitle: "InsertElementAfter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::InsertElementAfter 方法。 使用指定的命名空间前缀、本地名称和命名空间 URI，在当前节点之后创建一个新的兄弟元素，并使用指定的值（C++）。"
type: docs
weight: 4300
url: /zh/cpp/system.xml.xpath/xpathnavigator/insertelementafter/
---
## XPathNavigator::InsertElementAfter method


使用指定的命名空间前缀、本地名称和命名空间 URI，并使用指定的值，在当前节点之后创建一个新兄弟元素。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertElementAfter(String prefix, String localName, String namespaceURI, String value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | String | 新子元素的命名空间前缀（如果有）。 |
| localName | String | 新子元素的本地名称（如果有）。 |
| namespaceURI | String | 新子元素的命名空间 URI（如果有）。[String::Empty](../../../system/string/empty/) 与 **nullptr** 等价。 |
| value | String | 新子元素的值。如果传入 [String::Empty](../../../system/string/empty/) 或 **nullptr**，则创建一个空元素。 |

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
