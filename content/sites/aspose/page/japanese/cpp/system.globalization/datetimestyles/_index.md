---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::DateTimeStyles enum. 日付と時刻の書式設定オプションを定義します。C++ のビットフラグです。"
type: docs
weight: 3500
url: /ja/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


日付と時刻の書式設定オプションを定義します。ビットフラグ。

```cpp
enum class DateTimeStyles : int32_t
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | デフォルト。 |
| AllowLeadingWhite | 1 | 先頭の空白文字を無視します。 |
| AllowTrailingWhite | 2 | 末尾の空白文字を無視します。 |
| AllowInnerWhite | 4 | 内部の空白文字を無視します。 |
| AllowWhiteSpaces | n/a | すべての空白文字を無視します。 |
| NoCurrentDateDefault | 8 | 日付/時刻文字列を解析する際、年・月・日がすべて欠落している場合、現在の年/月/日ではなく、デフォルトの日付を 0001/1/1 に設定します。 |
| AdjustToUniversal | 16 | 日付/時刻文字列を解析する際、タイムゾーン指定子（"GMT","Z","+xxxx","-xxxx"）が存在する場合、解析された時刻を GMT に基づいて調整します。 |
| AssumeLocal | 32 | タイムゾーンが指定されていない場合、ローカルタイムゾーンを使用します。 |
| AssumeUniversal | 64 | タイムゾーンが指定されていない場合、UTC を使用します。 |
| RoundtripKind | 128 | 入力が未指定、ローカル、または UTC のどれであるかを保持しようとします。 |

## 参照

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
