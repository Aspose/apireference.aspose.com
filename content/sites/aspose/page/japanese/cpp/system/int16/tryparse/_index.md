---
title: "System::Int16::TryParse メソッド"
linktitle: "TryParse"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Int16 クラスの TryParse メソッドを使用する方法。"
type: docs
weight: 200
url: /ja/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して等価な 16 ビット符号付き整数に変換します。

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |
| スタイル | Globalization::NumberStyles | NumberStyles 列挙体の値をビット単位で組み合わせたもので、数値の文字列表現に許可されるスタイルを指定します。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 文字列書式情報を含むオブジェクトへのポインタ。 |
| 結果 | int16_t\& | 変換結果が格納される 16 ビット符号付き整数変数への参照です。 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


指定された文字列（数値の文字列表現を含む）を等価な 16 ビット符号付き整数に変換します。

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列。 |
| 結果 | int16_t\& | 変換結果が格納される 16 ビット符号付き整数変数への参照です。 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false。

## 参照

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
