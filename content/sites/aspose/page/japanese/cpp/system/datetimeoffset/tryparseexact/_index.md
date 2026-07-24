---
title: "System::DateTimeOffset::TryParseExact メソッド"
linktitle: "TryParseExact"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTimeOffset::TryParseExact メソッド。指定された文字列を、指定されたフォーマット、フォーマットプロバイダー、書式設定スタイルを使用して C++ で DateTimeOffset オブジェクトに変換しようとします。"
type: docs
weight: 5800
url: /ja/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


指定された文字列を、指定されたフォーマット、フォーマットプロバイダー、書式設定スタイルを使用して [DateTimeOffset](../) オブジェクトに変換しようとします。

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
| フォーマット | const ArrayPtr\<String\>\& | フォーマット文字列の配列です。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | フォーマットプロバイダー。 |
| スタイル | Globalization::DateTimeStyles | 日付と時刻の書式設定スタイル。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) は **input** と同等です。 |

### ReturnValue

**input** が正常に変換された場合は true、そうでない場合は false です。

## 参照

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


指定された文字列を、指定されたフォーマット、フォーマットプロバイダー、書式設定スタイルを使用して [DateTimeOffset](../) オブジェクトに変換しようとします。

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
| フォーマット | const String\& | 書式文字列です。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | フォーマットプロバイダー。 |
| スタイル | Globalization::DateTimeStyles | 日付と時刻の書式設定スタイル。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) は **input** と同等です。 |

### ReturnValue

**input** が正常に変換された場合は true、そうでない場合は false です。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
