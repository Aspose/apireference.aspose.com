---
title: "System::Xml::XmlValidatingReader::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::LookupNamespace 方法。解析当前元素范围内的命名空间前缀（在 C++ 中）。"
type: docs
weight: 3400
url: /zh/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


解析当前元素作用域中的命名空间前缀。

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | const String\& | 要解析其命名空间统一资源标识符（URI）的前缀。若要匹配默认命名空间，请传递空字符串。 |

### ReturnValue

前缀映射到的命名空间 URI，如果未找到匹配的前缀，则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
