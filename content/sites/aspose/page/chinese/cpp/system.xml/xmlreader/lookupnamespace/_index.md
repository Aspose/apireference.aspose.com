---
title: "System::Xml::XmlReader::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::LookupNamespace 方法。当在派生类中重写时，解析当前元素范围内的命名空间前缀（在 C++ 中）。"
type: docs
weight: 3100
url: /zh/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


当在派生类中被重写时，解析当前元素作用域中的命名空间前缀。

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传入空字符串。 |

### ReturnValue

前缀映射到的命名空间 URI，若未找到匹配的前缀则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
