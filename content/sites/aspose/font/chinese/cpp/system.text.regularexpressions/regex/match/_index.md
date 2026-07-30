---
title: "System::Text::RegularExpressions::Regex::Match 方法"
linktitle: "Match"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Regex::Match 方法。 在 C++ 中将正则表达式匹配到字符串。"
type: docs
weight: 600
url: /zh/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


将正则表达式与字符串匹配。

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 目标字符串。 |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## 另见

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Match(const String\&, int, int) method


将正则表达式与字符串匹配。

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 目标字符串。 |
| startat | int | 起始索引。 |
| 长度 | int | 要遍历的字符数（0 表示遍历整个字符串）。 |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## 另见

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


匹配字符串和模式。

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| 选项 | RegexOptions | 匹配选项。 |
| matchTimeout | TimeSpan | 超时。 |
| startat | int | [Match](../../match/) 起始位置。 |
| 长度 | int | 要检查的字符数（0 表示无限制）。 |

### ReturnValue

找到的第一个匹配。

## 另见

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
