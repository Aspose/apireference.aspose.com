---
title: "System::Text::RegularExpressions::Regex::Split メソッド"
linktitle: "分割"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Split メソッド。C++ で正規表現の一致に基づいて文字列を分割します。"
type: docs
weight: 900
url: /ja/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


文字列を正規表現の一致で分割します。

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) を分割する文字列。 |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


文字列を正規表現の一致で分割します。

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) を分割する文字列。 |
| count | int | 部分文字列の数の上限。 |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


入力文字列を、[Regex](../) コンストラクタで指定された正規表現で定義された位置で、指定された最大回数だけ部分文字列の配列に分割します。正規表現パターンの検索は、入力文字列の指定された文字位置から開始されます。

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 分割対象の文字列。 |
| count | int | 分割が発生できる最大回数。 |
| startat | int | 検索を開始する入力文字列内の文字位置。 |

### ReturnValue

文字列の配列。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


文字列を正規表現で分割します。

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| パターン | const String\& | 正規表現パターン。 |
| count | int | [Match](../../match/) の数の上限。 |
| options | RegexOptions | マッチングオプション。 |
| matchTimeout | TimeSpan | タイムアウト。 |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


文字列を正規表現で分割します。

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| パターン | const String\& | 正規表現パターン。 |
| options | RegexOptions | マッチングオプション。 |
| matchTimeout | TimeSpan | タイムアウト。 |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
