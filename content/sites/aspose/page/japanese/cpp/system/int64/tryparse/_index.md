---
title: "System::Int64::TryParse method"
linktitle: "TryParse"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Int64 クラスの TryParse メソッドを使用する方法です。"
type: docs
weight: 200
url: /ja/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して同等の64ビット符号付き整数に変換します。

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |
| スタイル | Globalization::NumberStyles | NumberStyles 列挙体の値をビット単位で組み合わせたもので、数値の文字列表現に許可されるスタイルを指定します。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 文字列書式情報を含むオブジェクトへのポインタ。 |
| 結果 | int64_t\& | 変換結果が格納される 64 ビット符号付き整数変数への参照です。 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


指定された文字列（数値の文字列表現を含む）を、同等の64ビット符号付き整数に変換します。

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |
| 結果 | int64_t\& | 変換結果が格納される 64 ビット符号付き整数変数への参照です。 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
