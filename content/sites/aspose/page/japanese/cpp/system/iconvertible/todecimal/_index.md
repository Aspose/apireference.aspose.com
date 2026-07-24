---
title: "System::IConvertible::ToDecimal メソッド"
linktitle: "ToDecimal"
second_title: "C++ 用 Aspose.Page"
description: "System::IConvertible::ToDecimal メソッド。C++ で指定されたカルチャ固有の書式情報を使用して、このインスタンスの値を同等の System::Decimal 数値に変換します。"
type: docs
weight: 600
url: /ja/cpp/system/iconvertible/todecimal/
---
## IConvertible::ToDecimal method


このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [System::Decimal](../../decimal/) 数値に変換します。

```cpp
virtual System::Decimal System::IConvertible::ToDecimal(System::SharedPtr<System::IFormatProvider> provider)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | カルチャ固有の書式情報を提供する [System::IFormatProvider](../../iformatprovider/) インターフェイスの実装。 |

### ReturnValue

このインスタンスの値に相当する [System::Decimal](../../decimal/) 数値です。

## 参照

* Class [Decimal](../../decimal/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
