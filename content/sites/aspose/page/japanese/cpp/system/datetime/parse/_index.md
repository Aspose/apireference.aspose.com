---
title: "System::DateTime::Parse メソッド"
linktitle: "Parse"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTime::Parse メソッド。指定された日付と時刻の文字列表現を、同等の DateTime オブジェクトに変換します（C++）。"
type: docs
weight: 6600
url: /ja/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


指定された日付と時刻の文字列表現を、同等の [DateTime](../) オブジェクトに変換します。

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換対象となる日付時刻値の文字列表現。 |

### ReturnValue

指定された文字列が表す日時と等価な日時値を表す [DateTime](../) クラスの新しいインスタンスです。

## 参照

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 参照

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 参照

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


指定された日付と時刻の文字列表現を、文化固有の書式情報を使用して同等の [DateTime](../) オブジェクトに変換します。

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換対象となる日付時刻値の文字列表現。 |
| provider | const SharedPtr\<IFormatProvider\>\& | 文化固有の書式情報を提供する [IFormatProvider](../../iformatprovider/) オブジェクトです。 |
| styles | Globalization::DateTimeStyles | 列挙値のビット単位の組み合わせで、**s** に関する追加情報、**s** に存在する可能性のあるスタイル要素、または **s** から [DateTime](../) オブジェクトへの変換に関する情報を提供します。 |

### ReturnValue

指定された文字列が表す日時と等価な日時値を表す [DateTime](../) クラスの新しいインスタンスです。

## 参照

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 参照

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
