---
title: "System::Text::RegularExpressions::Regex::IsMatch 方法"
linktitle: "IsMatch"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Regex::IsMatch 方法。在 C++ 中将正则表达式匹配到字符串。"
type: docs
weight: 500
url: /zh/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


将正则表达式与字符串匹配。

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 目标字符串。 |
| startat | int | 起始索引。 |

### ReturnValue

如果字符串匹配正则表达式则为 true，否则为 false。

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


检查字符串是否匹配模式。

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| 选项 | RegexOptions | 匹配选项。 |
| matchTimeout | TimeSpan | 超时。 |
| startat | int | [Match](../../match/) 起始位置。 |

### ReturnValue

如果找到匹配则为 true，否则为 false。

## 另见

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
