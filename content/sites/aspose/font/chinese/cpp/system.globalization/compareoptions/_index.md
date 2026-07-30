---
title: "System::Globalization::CompareOptions enum"
linktitle: "CompareOptions"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::CompareOptions 枚举。C++ 中的字符串比较选项。"
type: docs
weight: 3300
url: /zh/cpp/system.globalization/compareoptions/
---
## CompareOptions enum


[String](../../system/string/) comparison options.

```cpp
enum class CompareOptions : int32_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 无特殊选项。 |
| IgnoreCase | 1 | 忽略大小写。 |
| IgnoreNonSpace | 2 | 忽略非间距组合字符，例如变音符号。 |
| IgnoreSymbols | 4 | 包括空格、标点符号等。 |
| IgnoreKanaType | 8 | 忽略假名类型（日语）。 |
| IgnoreWidth | 16 | 在比较字符串时忽略字符宽度。 |
| OrdinalIgnoreCase | 268435456 | 忽略大小写差异的序数比较。 |
| StringSort | 536870912 | 使用字符串排序算法比较字符。 |
| Ordinal | 1073741824 | 在第一次比较时直接比较 UTF 代码。 |

## 另见

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
