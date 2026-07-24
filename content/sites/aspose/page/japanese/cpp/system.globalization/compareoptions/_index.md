---
title: "System::Globalization::CompareOptions enum"
linktitle: "CompareOptions"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::CompareOptions enum. C++ における文字列比較オプションです。"
type: docs
weight: 3300
url: /ja/cpp/system.globalization/compareoptions/
---
## CompareOptions enum


[String](../../system/string/) comparison options.

```cpp
enum class CompareOptions : int32_t
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | 特別なオプションはありません。 |
| IgnoreCase | 1 | 大文字と小文字を無視します。 |
| IgnoreNonSpace | 2 | 結合文字（非間隔文字）を無視します。例: ダイアクリティック。 |
| IgnoreSymbols | 4 | 空白文字や句読点などを含みます。 |
| IgnoreKanaType | 8 | かな種別を無視します（日本語）。 |
| IgnoreWidth | 16 | 文字列比較時に文字幅を無視します。 |
| OrdinalIgnoreCase | 268435456 | 大文字小文字の違いを無視した順序比較です。 |
| StringSort | 536870912 | 文字を比較するために文字列ソートアルゴリズムを使用します。 |
| Ordinal | 1073741824 | 最初の比較のために UTF コードを直接比較します。 |

## 参照

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
