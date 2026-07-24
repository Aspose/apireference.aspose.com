---
title: "System::Globalization::CharUnicodeInfo::GetNumericValue 方法"
linktitle: "GetNumericValue"
second_title: "Aspose.Page 适用于 C++"
description: "System::Globalization::CharUnicodeInfo::GetNumericValue 方法。获取与指定字符关联的数值（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.globalization/charunicodeinfo/getnumericvalue/
---
## CharUnicodeInfo::GetNumericValue(char16_t) method


获取指定字符关联的数值。

```cpp
static double System::Globalization::CharUnicodeInfo::GetNumericValue(char16_t ch)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ch | char16_t | Unicode 字符。 |

### ReturnValue

数值，若指定字符不是数字字符则返回 -1。

## 另见

* Class [CharUnicodeInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CharUnicodeInfo::GetNumericValue(const String\&, int) method


获取字符串中指定索引处字符的数值。

```cpp
static double System::Globalization::CharUnicodeInfo::GetNumericValue(const String &str, int index)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 包含 Unicode 字符的字符串。 |
| 索引 | int | Unicode 字符的索引。 |

### ReturnValue

数值，若指定字符不是数字字符则返回 -1。

## 另见

* Class [String](../../../system/string/)
* Class [CharUnicodeInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
