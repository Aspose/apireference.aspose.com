---
title: "System::Xml::XmlNamespaceManager::AddNamespace 方法"
linktitle: "AddNamespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace 方法。在 C++ 中将给定的命名空间添加到集合中。"
type: docs
weight: 200
url: /zh/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


将给定的命名空间添加到集合中。

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prefix | String | 要与要添加的命名空间关联的前缀。使用 [String::Empty](../../../system/string/empty/) 添加默认命名空间。如果将使用 [XmlNamespaceManager](../) 来解析 XML 路径语言（[XPath](../../../system.xml.xpath/)）表达式，则必须指定前缀。如果 [XPath](../../../system.xml.xpath/) 表达式未包含前缀，则假定命名空间统一资源标识符 (URI) 为空命名空间。有关 [XPath](../../../system.xml.xpath/) 表达式和 [XmlNamespaceManager](../) 的更多信息，请参阅 XmlNode::SelectNodes(String) 和 XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) 方法。 |
| uri | String | 要添加的命名空间。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
