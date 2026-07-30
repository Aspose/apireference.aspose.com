---
title: "System::Xml::XmlReader::LookupNamespace 方法"
linktitle: "LookupNamespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::LookupNamespace 方法。当在派生类中重写时，解析当前元素''的作用域中的命名空间前缀（C++）。"
type: docs
weight: 3100
url: /zh/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


在派生类中重写时，解析当前元素作用域中的命名空间前缀。

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | const String\& | 要解析其命名空间 URI 的前缀。要匹配默认命名空间，请传递空字符串。 |

### ReturnValue

前缀映射到的命名空间 URI，如果未找到匹配的前缀，则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
