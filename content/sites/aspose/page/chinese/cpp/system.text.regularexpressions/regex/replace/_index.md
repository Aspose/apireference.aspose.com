---
title: "System::Text::RegularExpressions::Regex::Replace 方法"
linktitle: "替换"
second_title: "Aspose.Page 适用于 C++"
description: "System::Text::RegularExpressions::Regex::Replace 方法。在 C++ 中将字符串中所有正则表达式的匹配项替换为替换字符串。"
type: docs
weight: 800
url: /zh/cpp/system.text.regularexpressions/regex/replace/
---
## Regex::Replace(const String\&, const char_t *) method


将字符串中正则表达式的所有匹配项替换为替换字符串。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *replacement)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 替换内容 | const char_t * | 替换字符串。 |

### ReturnValue

输入字符串，其中所有正则表达式匹配项已被替换字符串替换。

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&) method


用委托生成的替换字符串替换字符串中的所有匹配项。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 评估器 | const MatchEvaluator\& | 根据匹配项生成替换字符串的委托。 |

### ReturnValue

所有匹配项已被替换的输入字符串。

## 另见

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int) method


用委托生成的替换字符串替换字符串中的所有匹配项。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 评估器 | const MatchEvaluator\& | 根据匹配项生成替换字符串的委托。 |
| count | int | 替换次数限制。 |

### ReturnValue

所有匹配项已被替换的输入字符串。

## 另见

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int, int) method


用委托生成的替换字符串替换字符串中的所有匹配项。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count, int startat)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 评估器 | const MatchEvaluator\& | 根据匹配项生成替换字符串的委托。 |
| count | int | 替换次数限制。 |
| startat | int | 在输入字符串中开始替换的位置索引。 |

### ReturnValue

所有匹配项已被替换的输入字符串。

## 另见

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&) method


将字符串中正则表达式的所有匹配项替换为替换字符串。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 替换内容 | const String\& | 替换字符串。 |

### ReturnValue

输入字符串，其中所有正则表达式匹配项已被替换字符串替换。

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int) method


替换字符串中的子串。未实现。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count)
```

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int, int) method


替换字符串中的子串。未实现。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count, int startat)
```

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const char_t *, const char_t *) method


将字符串中正则表达式的所有匹配项替换为替换字符串。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *pattern, const char_t *replacement)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| pattern | const char_t * | [Regex](../) 模式。 |
| 替换内容 | const char_t * | 替换字符串。 |

### ReturnValue

输入字符串，其中所有正则表达式匹配项已被替换字符串替换。

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const char_t *) method


将字符串中正则表达式的所有匹配项替换为替换字符串。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const char_t *replacement)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| pattern | const String\& | [Regex](../) 模式。 |
| 替换内容 | const char_t * | 替换字符串。 |

### ReturnValue

输入字符串，其中所有正则表达式匹配项已被替换字符串替换。

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&) method


替换正则表达式匹配项。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| 评估器 | const MatchEvaluator\& | 委托用于为每个匹配生成替换字符串。 |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## 另见

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) method


用委托生成的替换字符串（静态函数）替换字符串中的所有匹配项。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator, RegexOptions options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| pattern | const String\& | [Regex](../) 模式。 |
| 评估器 | const MatchEvaluator\& | 根据匹配项生成替换字符串的委托。 |
| options | RegexOptions | [Regex](../) 选项。 |

### ReturnValue

所有匹配项已被替换的输入字符串。

## 另见

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&) method


替换正则表达式匹配项。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| 模式 | const String\& | 正则表达式模式。 |
| 替换内容 | const String\& | 替换字符串。 |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## 另见

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&, RegexOptions) method


将字符串中正则表达式的所有匹配项替换为替换字符串。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement, RegexOptions options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | const String\& | 输入字符串。 |
| pattern | const String\& | [Regex](../) 模式。 |
| 替换内容 | const String\& | 替换字符串。 |
| options | RegexOptions | [Regex](../) 选项。 |

### ReturnValue

输入字符串，其中所有正则表达式匹配项已被替换字符串替换。

## 另见

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
