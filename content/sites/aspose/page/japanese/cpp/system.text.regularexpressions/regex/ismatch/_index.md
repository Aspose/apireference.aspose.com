---
title: "System::Text::RegularExpressions::Regex::IsMatch メソッド"
linktitle: "IsMatch"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::IsMatch メソッド。C++ で正規表現を文字列に対して照合します。"
type: docs
weight: 500
url: /ja/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


文字列に対して正規表現をマッチさせます。

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 対象文字列。 |
| startat | int | 開始インデックス。 |

### ReturnValue

文字列が正規表現にマッチすれば true、そうでなければ false。

## 参照

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


文字列がパターンにマッチするか確認します。

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| パターン | const String\& | 正規表現パターン。 |
| options | RegexOptions | マッチングオプション。 |
| matchTimeout | TimeSpan | タイムアウト。 |
| startat | int | [Match](../../match/) の開始位置。 |

### ReturnValue

マッチが見つかれば true、見つからなければ false。

## 参照

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
