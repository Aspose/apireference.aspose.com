---
title: "System::Text::RegularExpressions::RegexOptions 枚举"
linktitle: "RegexOptions"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::RegexOptions 枚举。C++ 中的正则表达式选项。"
type: docs
weight: 900
url: /zh/cpp/system.text.regularexpressions/regexoptions/
---
## RegexOptions enum


[Regex](../regex/) options.

```cpp
enum class RegexOptions
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 默认行为。 |
| 已编译 | 1 | 编译正则表达式以提升性能。默认情况下始终执行。 |
| CultureInvariant | 2 | 使用不区分文化的匹配。已忽略。 |
| ECMAScript | 4 | 使用 ECMAScript 语法。已忽略。 |
| ExplicitCapture | 8 | 仅显式捕获。已忽略。 |
| IgnoreCase | 16 | 匹配时忽略大小写。 |
| IgnorePatternWhitespace | 32 | 模式中的空白字符将被忽略。不受支持。 |
| Multiline | 64 | 将 '^' 和 '$' 视为行的开始和结束，而不是整个字符串的开始和结束。 |
| RightToLeft | 128 | 从右到左匹配。不受支持。 |
| Singleline | 256 | 使 '.' 匹配任何字符且不例外（通常情况下，换行符不会被匹配）。 |

## 另见

* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
