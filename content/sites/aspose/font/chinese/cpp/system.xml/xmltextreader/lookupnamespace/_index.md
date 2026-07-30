---
title: "System::Xml::XmlTextReader::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader::LookupNamespace 方法。解析 C++ 中当前元素范围内的命名空间前缀。"
type: docs
weight: 3700
url: /zh/cpp/system.xml/xmltextreader/lookupnamespace/
---
## XmlTextReader::LookupNamespace method


解析当前元素作用域中的命名空间前缀。

```cpp
String System::Xml::XmlTextReader::LookupNamespace(const String &prefix) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | const String\& | 要解析其命名空间 URI 的前缀。若要匹配默认命名空间，请传入空字符串。此字符串不必进行原子化。 |

### ReturnValue

前缀映射到的命名空间 URI，如果未找到匹配的前缀，则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
