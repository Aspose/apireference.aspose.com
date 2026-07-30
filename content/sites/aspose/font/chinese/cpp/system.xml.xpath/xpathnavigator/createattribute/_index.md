---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute 方法"
linktitle: "CreateAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute 方法。使用在 C++ 中指定的命名空间前缀、本地名称和命名空间 URI 以及指定的值，在当前元素节点上创建属性节点。"
type: docs
weight: 700
url: /zh/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


使用指定的命名空间前缀、本地名称和命名空间 URI，以及指定的值，在当前元素节点上创建属性节点。

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | String | 新属性节点的命名空间前缀（如果有）。 |
| localName | String | 新属性节点的本地名称，不能为 [String::Empty](../../../system/string/empty/) 或 **nullptr**。 |
| namespaceURI | String | 新属性节点的命名空间 URI（如果有）。 |
| value | String | 新属性节点的值。如果传入 [String::Empty](../../../system/string/empty/) 或 **nullptr**，则创建一个空属性节点。 |

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
