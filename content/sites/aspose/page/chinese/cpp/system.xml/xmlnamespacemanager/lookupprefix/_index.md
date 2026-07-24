---
title: "System::Xml::XmlNamespaceManager::LookupPrefix 方法"
linktitle: "LookupPrefix"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNamespaceManager::LookupPrefix 方法。在 C++ 中查找给定命名空间 URI 声明的前缀。"
type: docs
weight: 900
url: /zh/cpp/system.xml/xmlnamespacemanager/lookupprefix/
---
## XmlNamespaceManager::LookupPrefix method


查找给定命名空间 URI 声明的前缀。

```cpp
String System::Xml::XmlNamespaceManager::LookupPrefix(const String &uri) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri | const String\& | 要为前缀解析的命名空间。 |

### ReturnValue

匹配的前缀。如果没有映射的前缀，方法返回 [String::Empty](../../../system/string/empty/)。如果提供了 null 值，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
