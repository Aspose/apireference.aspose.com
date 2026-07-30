---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope 方法"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope 方法。返回在 C++ 中当前作用域内的已定义前缀-命名空间映射的集合。"
type: docs
weight: 100
url: /zh/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


返回当前作用域中已定义的前缀-命名空间映射集合。

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| scope | XmlNamespaceScope | 一个 [XmlNamespaceScope](../../xmlnamespacescope/) 值，指定要返回的命名空间节点类型。 |

### ReturnValue

一个包含当前作用域内命名空间的 IDictionary 集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
