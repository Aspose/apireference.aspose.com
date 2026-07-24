---
title: "System::DateTimeOffset::ParseExact メソッド"
linktitle: "ParseExact"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTimeOffset::ParseExact メソッド。指定された文字列を、指定されたフォーマット、フォーマットプロバイダー、書式スタイルを使用して C++ で DateTimeOffset オブジェクトに変換します。"
type: docs
weight: 5600
url: /ja/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


指定された文字列を、指定されたフォーマット、フォーマットプロバイダー、書式スタイルを使用して [DateTimeOffset](../) オブジェクトに変換します。

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
| formats | const ArrayPtr\<String\>\& | 書式文字列の [Array](../../array/)。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | フォーマットプロバイダー。 |
| スタイル | Globalization::DateTimeStyles | 日付と時刻の書式設定スタイル。 |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 参照

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


指定された文字列を、指定された形式、フォーマットプロバイダー、および書式設定スタイルを使用して [DateTimeOffset](../) オブジェクトに変換します。

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
| フォーマット | const String\& | 書式文字列です。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | フォーマットプロバイダー。 |
| スタイル | Globalization::DateTimeStyles | 日付と時刻の書式設定スタイル。 |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 参照

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
