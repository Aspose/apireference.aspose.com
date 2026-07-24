---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Match メソッド。C++ で正規表現を文字列にマッチさせます。"
type: docs
weight: 600
url: /ja/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


文字列に対して正規表現をマッチさせます。

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 対象文字列。 |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## 参照

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


文字列に対して正規表現をマッチさせます。

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 対象文字列。 |
| startat | int | 開始インデックス。 |
| length | int | 検索する文字数 (0 は文字列全体を検索)。 |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## 参照

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


文字列とパターンをマッチさせます。

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| パターン | const String\& | 正規表現パターン。 |
| options | RegexOptions | マッチングオプション。 |
| matchTimeout | TimeSpan | タイムアウト。 |
| startat | int | [Match](../../match/) の開始位置。 |
| length | int | 検索する文字数 (0 は制限なし)。 |

### ReturnValue

最初に見つかった一致。

## 参照

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
