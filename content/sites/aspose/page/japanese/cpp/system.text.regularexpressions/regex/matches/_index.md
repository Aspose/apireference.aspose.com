---
title: "System::Text::RegularExpressions::Regex::Matches メソッド"
linktitle: "一致"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Matches メソッド。C++ で繰り返しマッチングすることにより、指定された文字列中の正規表現のすべての一致を取得します。"
type: docs
weight: 700
url: /ja/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


与えられた文字列内で正規表現のすべてのマッチを繰り返しマッチさせて取得します。

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| startat | int | マッチングを開始するインデックス。 |

### ReturnValue

見つかったすべての一致のコレクション。

## 参照

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


文字列とパターン間のすべてのマッチを取得します。

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

繰り返しマッチングして見つかったすべての一致。

## 参照

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
