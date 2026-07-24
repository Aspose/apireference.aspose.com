---
title: "System::Decimal::TryParse メソッド"
linktitle: "TryParse"
second_title: "C++ 用 Aspose.Page"
description: "System::Decimal::TryParse メソッド。数値の文字列表現を含む指定された文字列を C++ で等価な Decimal 値に変換します。"
type: docs
weight: 5800
url: /ja/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


数値の文字列表現を含む指定された文字列を等価な [Decimal](../) 値に変換します。

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列 |
| result | Decimal\& | 変換結果が格納される [Decimal](../) 変数への参照 |

### ReturnValue

変換が成功した場合は true、そうでない場合は false

## 参照

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


提供された書式情報と数値スタイルを使用して、数値の文字列表現を含む指定された文字列を等価な [Decimal](../) 値に変換します。

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 変換する文字列 |
| スタイル | Globalization::NumberStyles | 数値の文字列表現に許可されるスタイルを指定する NumberStyles 列挙体の値のビット単位の組み合わせ |
| プロバイダー | const SharedPtr\<IFormatProvider\>\& | 文字列書式情報を含むオブジェクトへのポインタ |
| 結果 | Decimal\& | 出力引数；変換結果を含みます |

### ReturnValue

変換が成功した場合は true、そうでない場合は false

## 参照

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
