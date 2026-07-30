---
title: "System::Xml::XPath::XPathNavigator::GetNamespacesInScope 方法"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::GetNamespacesInScope 方法。 返回当前节点在 C++ 中的作用域内命名空间。"
type: docs
weight: 4000
url: /zh/cpp/system.xml.xpath/xpathnavigator/getnamespacesinscope/
---
## XPathNavigator::GetNamespacesInScope method


返回当前节点的作用域内命名空间。

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XPath::XPathNavigator::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| scope | XmlNamespaceScope | 一个指定要返回的命名空间的 [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/) 值。 |

### ReturnValue

一个以前缀为键的命名空间名称的 IDictionary 集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
