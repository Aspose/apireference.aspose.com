---
title: "System::Int32::Parse メソッド"
linktitle: "Parse"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Int32 クラスの Parse メソッドを使用する方法。"
type: docs
weight: 100
url: /ja/cpp/system/int32/parse/
---
## Int32::Parse(const ReadOnlySpan\<char16_t\>\&) method




```cpp
static int32_t System::Int32::Parse(const ReadOnlySpan<char16_t> &span)
```

## 参照

* Class [ReadOnlySpan](../../readonlyspan/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const ReadOnlySpan\<char16_t\>\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method




```cpp
static int32_t System::Int32::Parse(const ReadOnlySpan<char16_t> &span, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```

## 参照

* Class [ReadOnlySpan](../../readonlyspan/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const ReadOnlySpan\<char16_t\>\&, std::nullptr_t) method




```cpp
static int32_t System::Int32::Parse(const ReadOnlySpan<char16_t> &span, std::nullptr_t)
```

## 参照

* Class [ReadOnlySpan](../../readonlyspan/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&) method


指定された文字列（数値の文字列表現を含む）を、同等の 32 ビット符号付き整数に変換します。

```cpp
static int32_t System::Int32::Parse(const String &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |

### ReturnValue

指定された文字列で表される数値に等しい 32 ビット符号付き整数。

## 参照

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, const SharedPtr<Globalization::CultureInfo> &culture)
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


指定された文字列（数値の文字列表現を含む）を、提供された書式情報を使用して同等の 32 ビット符号付き整数に変換します。

```cpp
static int32_t System::Int32::Parse(const String &value, const SharedPtr<IFormatProvider> &provider)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 文字列書式情報を含むオブジェクトへのポインタ。 |

### ReturnValue

指定された文字列で表される数値に等しい 32 ビット符号付き整数。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して同等の 32 ビット符号付き整数に変換します。

```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |
| スタイル | Globalization::NumberStyles | NumberStyles 列挙体の値をビット単位で組み合わせたもので、数値の文字列表現に許可されるスタイルを指定します。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 文字列書式情報を含むオブジェクトへのポインタ。 |

### ReturnValue

指定された文字列で表される数値に等しい 32 ビット符号付き整数。

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, std::nullptr_t) method




```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, std::nullptr_t=nullptr)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, std::nullptr_t) method




```cpp
static int32_t System::Int32::Parse(const String &value, std::nullptr_t)
```

## 参照

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
