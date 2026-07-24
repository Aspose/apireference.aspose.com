---
title: "System::DateTime::ToString メソッド"
linktitle: "ToString"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTime::ToString メソッド。現在のオブジェクトが表す日付と時刻の値を、現在のカルチャで定義された書式規則を使用して C++ で文字列として返します。"
type: docs
weight: 5200
url: /ja/cpp/system/datetime/tostring/
---
## DateTime::ToString() const method


現在のオブジェクトが表す日付と時刻の値を、現在のカルチャで定義された書式規則を使用して文字列として返します。

```cpp
String System::DateTime::ToString() const
```


### ReturnValue

現在のオブジェクトが表す値の文字列表現

## 参照

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::CultureInfo> &culture) const
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<IFormatProvider\>\&) const method


現在のオブジェクトが表す日付と時刻の値を、指定された書式情報を使用して文字列として返します。

```cpp
String System::DateTime::ToString(const SharedPtr<IFormatProvider> &provider) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 書式情報を表すオブジェクト |

### ReturnValue

現在のオブジェクトが表す値を、**formatProvider** が提供する書式情報に従ってフォーマットした文字列表現。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&) const method


現在のオブジェクトが表す日付と時刻の値を、指定された書式と現在のカルチャで定義された書式規則を使用して文字列として返します。

```cpp
String System::DateTime::ToString(const String &format) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| フォーマット | const String\& | 書式文字列 |

### ReturnValue

現在のオブジェクトが表す値を、**format** で定義された書式と現在のカルチャに従ってフォーマットした文字列表現。

## 参照

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::CultureInfo> &culture) const
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<IFormatProvider\>\&) const method


現在のオブジェクトが表す日付と時刻の値を、指定された書式情報を使用して文字列として返します。

```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<IFormatProvider> &provider) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| フォーマット | const String\& | 書式文字列 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 書式情報を表すオブジェクト |

### ReturnValue

現在のオブジェクトが表す値を、**provider** が提供する書式情報と書式文字列 **format** に従ってフォーマットした文字列表現。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, std::nullptr_t) const method




```cpp
String System::DateTime::ToString(const String &format, std::nullptr_t) const
```

## 参照

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(std::nullptr_t) const method




```cpp
String System::DateTime::ToString(std::nullptr_t) const
```

## 参照

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
