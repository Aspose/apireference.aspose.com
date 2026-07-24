---
title: "System::Xml::XmlNamespaceManager::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace 方法。返回指定前缀的命名空间 URI（在 C++ 中）。"
type: docs
weight: 800
url: /zh/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


返回指定前缀的命名空间 URI。

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 您想要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传递 [String::Empty](../../../system/string/empty/)。 |

### ReturnValue

如果存在映射的命名空间，则返回 **prefix** 的命名空间 URI；如果没有映射的命名空间，则返回 **nullptr**。返回的字符串已原子化。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../../xmlnametable/) 类。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
