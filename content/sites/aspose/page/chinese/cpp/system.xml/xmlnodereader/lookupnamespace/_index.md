---
title: "System::Xml::XmlNodeReader::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNodeReader::LookupNamespace 方法。解析当前元素范围内的命名空间前缀（C++）。"
type: docs
weight: 2500
url: /zh/cpp/system.xml/xmlnodereader/lookupnamespace/
---
## XmlNodeReader::LookupNamespace method


解析当前元素范围内的命名空间前缀。

```cpp
String System::Xml::XmlNodeReader::LookupNamespace(const String &prefix) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传入空字符串。此字符串不必进行原子化。 |

### ReturnValue

前缀映射到的命名空间 URI，若未找到匹配的前缀则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
