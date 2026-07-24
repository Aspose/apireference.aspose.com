---
title: "System::Text::RegularExpressions::RegexOptions 列挙体"
linktitle: "RegexOptions"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::RegexOptions 列挙体。C++ の正規表現オプションです。"
type: docs
weight: 900
url: /ja/cpp/system.text.regularexpressions/regexoptions/
---
## RegexOptions enum


[Regex](../regex/) options.

```cpp
enum class RegexOptions
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | デフォルトの動作です。 |
| Compiled | 1 | パフォーマンス向上のために正規表現をコンパイルします。デフォルトで常に実行されます。 |
| CultureInvariant | 2 | カルチャに依存しないマッチングを使用します。無視されます。 |
| ECMAScript | 4 | ECMAScript の構文を使用します。無視されます。 |
| ExplicitCapture | 8 | 明示的なキャプチャのみです。無視されます。 |
| IgnoreCase | 16 | マッチ時に大文字小文字を無視します。 |
| IgnorePatternWhitespace | 32 | パターン内の空白文字を無視します。サポートされていません。 |
| Multiline | 64 | ‘^’ と ‘$’ を文字列全体ではなく、行の開始と終了として扱います。 |
| RightToLeft | 128 | 右から左へのマッチングです。サポートされていません。 |
| Singleline | 256 | ‘.’ が例外なく任意の文字にマッチするようにします（通常、改行文字はマッチしません）。 |

## 参照

* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
