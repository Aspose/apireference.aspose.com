---
title: "System::DateTimeOffset::TryParse メソッド"
linktitle: "TryParse"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTimeOffset::TryParse メソッド。C++ で指定された書式プロバイダーと書式スタイルを使用して、指定された文字列を DateTimeOffset オブジェクトに変換しようとします。"
type: docs
weight: 5700
url: /ja/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


指定された書式プロバイダーと書式スタイルを使用して、指定された文字列を [DateTimeOffset](../) オブジェクトに変換しようとします。

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
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
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


指定された文字列を [DateTimeOffset](../) オブジェクトに変換しようとします。

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) は **input** と同等です。 |

### ReturnValue

**input** が正常に変換された場合は true、そうでない場合は false です。

## 参照

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
