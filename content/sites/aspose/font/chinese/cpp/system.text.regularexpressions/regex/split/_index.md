---
title: "System::Text::RegularExpressions::Regex::Split 方法"
linktitle: "分割"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Regex::Split 方法。使用正则表达式匹配在 C++ 中拆分字符串。"
type: docs
weight: 900
url: /zh/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


按正则表达式匹配项拆分字符串。

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) 用于分割。 |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int) method


按正则表达式匹配项拆分字符串。

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) 用于分割。 |
| count | int | 子字符串数量限制。 |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int, int) method


将输入字符串在指定的最大次数内拆分为子字符串数组，拆分位置由在 [Regex](../) 构造函数中指定的正则表达式定义。正则表达式模式的搜索从输入字符串中指定的字符位置开始。

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 待拆分的字符串。 |
| count | int | 拆分可以发生的最大次数。 |
| startat | int | 搜索将在输入字符串中的字符位置开始。 |

### ReturnValue

字符串数组。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


按正则表达式拆分字符串。

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| count | int | [Match](../../match/) 数量限制。 |
| 选项 | RegexOptions | 匹配选项。 |
| matchTimeout | TimeSpan | 超时。 |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


按正则表达式拆分字符串。

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| 选项 | RegexOptions | 匹配选项。 |
| matchTimeout | TimeSpan | 超时。 |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
