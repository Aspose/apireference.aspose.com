---
title: "System::Decimal::Parse メソッド"
linktitle: "Parse"
second_title: "C++ 用 Aspose.Page"
description: "System::Decimal::Parse メソッド。C++ で10進数の文字列表現を Decimal クラスの同等のインスタンスに変換します。"
type: docs
weight: 4200
url: /ja/cpp/system/decimal/parse/
---
## Decimal::Parse(const String\&) method


10進数の文字列表現を [Decimal](../) クラスの同等のインスタンスに変換します。

```cpp
static Decimal System::Decimal::Parse(const String &s)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 数値の文字列表現 |

### ReturnValue

指定された文字列が表す値と同等の値を表す [Decimal](../) クラスの新しいインスタンス

## 参照

* Class [Decimal](../)
* Class [String](../../string/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


指定された書式プロバイダーを使用して、10進数の文字列表現を [Decimal](../) クラスの同等のインスタンスに変換します。

```cpp
static Decimal System::Decimal::Parse(const String &s, const SharedPtr<IFormatProvider> &provider)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する10進数値の文字列表現 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 書式プロバイダー |

### ReturnValue

指定された文字列が表す値と等価な値を表す [Decimal](../) クラスの新しいインスタンス

## 参照

* Class [Decimal](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Parse(const String\&, Globalization::NumberStyles) method


指定されたスタイルを使用して、10進数の文字列表現を [Decimal](../) クラスの等価なインスタンスに変換します。

```cpp
static Decimal System::Decimal::Parse(const String &s, Globalization::NumberStyles styles)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する10進数値の文字列表現 |
| styles | Globalization::NumberStyles | 列挙値のビット単位の組み合わせで、**s** に関する追加情報、**s** に存在する可能性のあるスタイル要素、または **s** から [Decimal](../) オブジェクトへの変換に関する情報を提供します。 |

### ReturnValue

指定された文字列が表す値と等価な値を表す [Decimal](../) クラスの新しいインスタンス

## 参照

* Class [Decimal](../)
* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


指定されたスタイルと書式プロバイダーを使用して、10進数の文字列表現を [Decimal](../) クラスの等価なインスタンスに変換します。

```cpp
static Decimal System::Decimal::Parse(const String &s, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する10進数値の文字列表現 |
| styles | Globalization::NumberStyles | 列挙値のビット単位の組み合わせで、**s** に関する追加情報、**s** に存在する可能性のあるスタイル要素、または **s** から [Decimal](../) オブジェクトへの変換に関する情報を提供します。 |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 書式プロバイダー |

### ReturnValue

指定された文字列が表す値と等価な値を表す [Decimal](../) クラスの新しいインスタンス

## 参照

* Class [Decimal](../)
* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
