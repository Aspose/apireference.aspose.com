---
title: "System::DateTime::TryParse メソッド"
linktitle: "TryParse"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::DateTime クラスの TryParse メソッドを使用する方法。"
type: docs
weight: 6900
url: /ja/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


指定された文化固有の書式情報とスタイルを使用して、日付と時刻値の文字列表現を同等の [DateTime](../) オブジェクトに変換します。

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換対象となる日付時刻値の文字列表現。 |
| provider | const SharedPtr\<IFormatProvider\>\& | 文化固有の書式情報を提供する [IFormatProvider](../../iformatprovider/) オブジェクトです。 |
| styles | Globalization::DateTimeStyles | 列挙値のビット単位の組み合わせで、**s** に関する追加情報、**s** に存在する可能性のあるスタイル要素、または **s** から [DateTime](../) オブジェクトへの変換に関する情報を提供します。 |
| 結果 | DateTime\& | 変換が成功した場合に変換結果を格納する出力引数。 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


指定された日付と時刻の文字列表現を、同等の [DateTime](../) オブジェクトに変換します。

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換対象となる日付時刻値の文字列表現。 |
| 結果 | DateTime\& | 変換が成功した場合に変換結果を格納する出力引数。 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## 参照

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
