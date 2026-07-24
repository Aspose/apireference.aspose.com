---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope 方法"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope 方法。返回一个以前缀为键的命名空间名称集合，可用于枚举 C++ 中当前作用域的命名空间。"
type: docs
weight: 600
url: /zh/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


返回一个以前缀为键的命名空间名称集合，可用于枚举当前作用域中的命名空间。

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 作用域 | XmlNamespaceScope | 一个枚举值，指定要返回的命名空间节点类型。 |

### ReturnValue

当前作用域内的命名空间和前缀对的集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
