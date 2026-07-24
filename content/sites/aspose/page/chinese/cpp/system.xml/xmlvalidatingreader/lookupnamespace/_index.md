---
title: "System::Xml::XmlValidatingReader::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlValidatingReader::LookupNamespace 方法。解析当前元素范围内的命名空间前缀，适用于 C++。"
type: docs
weight: 3400
url: /zh/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


解析当前元素范围内的命名空间前缀。

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 要解析其命名空间统一资源标识符（URI）的前缀。若要匹配默认命名空间，请传递空字符串。 |

### ReturnValue

前缀映射到的命名空间 URI，若未找到匹配的前缀则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
