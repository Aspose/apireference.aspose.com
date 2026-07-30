---
title: "System::Xml::NewLineHandling 枚举"
linktitle: "NewLineHandling"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::NewLineHandling 枚举。指定在 C++ 中如何处理换行符。"
type: docs
weight: 5200
url: /zh/cpp/system.xml/newlinehandling/
---
## NewLineHandling enum


指定如何处理换行符。

```cpp
enum class NewLineHandling
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Replace | 0 | 换行字符将被替换，以匹配在 [XmlWriterSettings::set_NewLineChars](../xmlwritersettings/set_newlinechars/) 值中指定的字符。 |
| Entitize | 1 | 换行字符会被实体化。当输出被标准化的 [XmlReader](../xmlreader/) 读取时，此设置会保留所有字符。 |
| 无 | 2 | 换行字符保持不变。输出与输入相同。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
