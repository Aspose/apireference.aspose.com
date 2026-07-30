---
title: "System::Xml::XmlTextReader::GetNamespacesInScope 方法"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope 方法。返回一个集合，其中包含当前在 C++ 中作用域内的所有命名空间。"
type: docs
weight: 3400
url: /zh/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


返回一个包含当前作用域内所有命名空间的集合。

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| scope | XmlNamespaceScope | 一个 [XmlNamespaceScope](../../xmlnamespacescope/) 值，指定要返回的命名空间节点类型。 |

### ReturnValue

一个 IDictionary 对象，包含所有当前作用域内的命名空间。如果读取器未定位在元素上，则返回一个空字典（无命名空间）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
