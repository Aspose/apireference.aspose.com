---
title: "System::Xml::XmlOutputMethod 枚举"
linktitle: "XmlOutputMethod"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlOutputMethod 枚举。指定在 C++ 中用于序列化 XmlWriter 输出的方法。"
type: docs
weight: 6300
url: /zh/cpp/system.xml/xmloutputmethod/
---
## XmlOutputMethod enum


指定用于序列化 [XmlWriter](../xmlwriter/) 输出的方法。

```cpp
enum class XmlOutputMethod
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Xml | 0 | 按照 XML 1.0 规则进行序列化。 |
| Html | 1 | 按照 XSLT 指定的 HTML 规则进行序列化。 |
| Text | 2 | 仅序列化文本块。 |
| AutoDetect | 3 | 在运行时使用 XSLT 规则在 [XmlOutputMethod::Xml](./) 和 [XmlOutputMethod::Html](./) 输出方法之间进行选择。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
