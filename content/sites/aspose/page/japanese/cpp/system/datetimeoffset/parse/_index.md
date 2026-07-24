---
title: "System::DateTimeOffset::Parse メソッド"
linktitle: "Parse"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTimeOffset::Parse メソッド。指定された文字列を DateTimeOffset に相当する形式に変換します（C++）。"
type: docs
weight: 5500
url: /ja/cpp/system/datetimeoffset/parse/
---
## DateTimeOffset::Parse(const String\&) method


指定された文字列を [DateTimeOffset](../) に変換します。

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 参照

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


指定された書式プロバイダーと書式スタイルを使用して、指定された文字列を [DateTimeOffset](../) オブジェクトに変換します。

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) を変換します。 |
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
