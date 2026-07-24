---
title: "System::Text::RegularExpressions::Regex::Matches 方法"
linktitle: "匹配"
second_title: "Aspose.Page 适用于 C++"
description: "System::Text::RegularExpressions::Regex::Matches 方法。在 C++ 中通过反复匹配获取给定字符串中正则表达式的所有匹配项。"
type: docs
weight: 700
url: /zh/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


通过重复匹配获取正则表达式在给定字符串中的所有匹配项。

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| startat | int | 开始匹配的索引。 |

### ReturnValue

所有找到的匹配项的集合。

## 另见

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


获取字符串和模式之间的所有匹配项。

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| 选项 | RegexOptions | 匹配选项。 |
| matchTimeout | TimeSpan | 超时。 |
| startat | int | [Match](../../match/) 起始位置。 |
| length | int | 要查找的字符数 (0 禁用限制)。 |

### ReturnValue

通过反复匹配找到的所有匹配项。

## 另见

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
