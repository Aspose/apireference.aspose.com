---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement 方法"
linktitle: "AppendChildElement"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement 方法。使用指定的命名空间前缀、本地名称和命名空间 URI，并使用 C++ 中指定的值，在当前节点的子节点列表末尾创建一个新的子元素节点。"
type: docs
weight: 200
url: /zh/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


使用指定的命名空间前缀、本地名称和命名空间 URI，以及指定的值，在当前节点的子节点列表末尾创建一个新的子元素节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | 字符串 | 新子元素节点的命名空间前缀（如果有）。 |
| localName | 字符串 | 新子元素节点的本地名称（如果有）。 |
| namespaceURI | String | 新子元素节点的命名空间 URI（如果有）。[String::Empty](../../../system/string/empty/) 和 **nullptr** 等价。 |
| value | String | 新子元素节点的值。如果传入 [String::Empty](../../../system/string/empty/) 或 **nullptr**，将创建一个空元素。 |

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
