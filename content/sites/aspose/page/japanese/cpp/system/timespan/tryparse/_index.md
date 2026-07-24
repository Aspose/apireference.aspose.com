---
title: "System::TimeSpan::TryParse メソッド"
linktitle: "TryParse"
second_title: "C++ 用 Aspose.Page"
description: "C++ の System::TimeSpan クラスの TryParse メソッドの使用方法。"
type: docs
weight: 4400
url: /ja/cpp/system/timespan/tryparse/
---
## TimeSpan::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParse(const String &input, const SharedPtr<Globalization::CultureInfo> &culture, TimeSpan &result)
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParse(const String &input, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, TimeSpan &result)
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) method


指定された書式プロバイダーを使用して文字列を同等の [TimeSpan](../) オブジェクトに変換し、変換結果を返します。

```cpp
static bool System::TimeSpan::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, TimeSpan &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | カルチャ固有の書式情報を提供する書式プロバイダー。 |
| 結果 | TimeSpan\& | 文字列に対応する時間間隔。 |

### ReturnValue

文字列が正常に変換された場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::TryParse(const String\&, std::nullptr_t, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParse(const String &input, std::nullptr_t, TimeSpan &result)
```

## 参照

* Class [String](../../string/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::TryParse(const String\&, TimeSpan\&) method


文字列を同等の [TimeSpan](../) オブジェクトに変換し、変換結果を返します。

```cpp
static bool System::TimeSpan::TryParse(const String &input, TimeSpan &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const String\& | 入力文字列。 |
| 結果 | TimeSpan\& | 文字列に対応する時間間隔。 |

### ReturnValue

文字列が正常に変換された場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
