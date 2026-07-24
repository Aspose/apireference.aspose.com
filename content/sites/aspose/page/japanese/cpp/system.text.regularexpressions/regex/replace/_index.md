---
title: "System::Text::RegularExpressions::Regex::Replace method"
linktitle: "置換"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Replace メソッド。C++ で文字列中の正規表現のすべての一致を置換文字列に置き換えます。"
type: docs
weight: 800
url: /ja/cpp/system.text.regularexpressions/regex/replace/
---
## Regex::Replace(const String\&, const char_t *) method


文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *replacement)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| 置換文字列 | const char_t * | 置換文字列。 |

### ReturnValue

すべての正規表現一致が置換文字列に置き換えられた入力文字列。

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&) method


文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| 評価子 | const MatchEvaluator\& | 一致に基づいて置換文字列を生成するデリゲート。 |

### ReturnValue

すべての一致が置換された入力文字列。

## 参照

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int) method


文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| 評価子 | const MatchEvaluator\& | 一致に基づいて置換文字列を生成するデリゲート。 |
| count | int | 置換回数の上限。 |

### ReturnValue

すべての一致が置換された入力文字列。

## 参照

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int, int) method


文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count, int startat)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| 評価子 | const MatchEvaluator\& | 一致に基づいて置換文字列を生成するデリゲート。 |
| count | int | 置換回数の上限。 |
| startat | int | 置換を開始する入力文字列内のインデックス。 |

### ReturnValue

すべての一致が置換された入力文字列。

## 参照

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&) method


文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| 置換文字列 | const String\& | 置換文字列。 |

### ReturnValue

すべての正規表現一致が置換文字列に置き換えられた入力文字列。

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int) method


文字列内の部分文字列を置き換えます。未実装です。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count)
```

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int, int) method


文字列内の部分文字列を置き換えます。未実装です。

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count, int startat)
```

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const char_t *, const char_t *) method


文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *pattern, const char_t *replacement)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| pattern | const char_t * | [Regex](../) パターン。 |
| 置換文字列 | const char_t * | 置換文字列。 |

### ReturnValue

すべての正規表現一致が置換文字列に置き換えられた入力文字列。

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const char_t *) method


文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const char_t *replacement)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| pattern | const String\& | [Regex](../) パターン。 |
| 置換文字列 | const char_t * | 置換文字列。 |

### ReturnValue

すべての正規表現一致が置換文字列に置き換えられた入力文字列。

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&) method


正規表現の一致を置き換えます。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| パターン | const String\& | 正規表現パターン。 |
| 評価子 | const MatchEvaluator\& | 各マッチに対して置換文字列を生成するデリゲート。 |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## 参照

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) method


文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます（静的関数）。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator, RegexOptions options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| pattern | const String\& | [Regex](../) パターン。 |
| 評価子 | const MatchEvaluator\& | 一致に基づいて置換文字列を生成するデリゲート。 |
| options | RegexOptions | [Regex](../) オプション。 |

### ReturnValue

すべての一致が置換された入力文字列。

## 参照

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&) method


正規表現の一致を置き換えます。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| パターン | const String\& | 正規表現パターン。 |
| 置換文字列 | const String\& | 置換文字列。 |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&, RegexOptions) method


文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement, RegexOptions options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| pattern | const String\& | [Regex](../) パターン。 |
| 置換文字列 | const String\& | 置換文字列。 |
| options | RegexOptions | [Regex](../) オプション。 |

### ReturnValue

すべての正規表現一致が置換文字列に置き換えられた入力文字列。

## 参照

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
