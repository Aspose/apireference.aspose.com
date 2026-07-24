---
title: "System::IConvertible::ToDateTime メソッド"
linktitle: "ToDateTime"
second_title: "C++ 用 Aspose.Page"
description: "System::IConvertible::ToDateTime メソッド。C++ で指定されたカルチャ固有の書式情報を使用して、このインスタンスの値を同等の System::DateTime に変換します。"
type: docs
weight: 500
url: /ja/cpp/system/iconvertible/todatetime/
---
## IConvertible::ToDateTime method


このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [System::DateTime](../../datetime/) に変換します。

```cpp
virtual System::DateTime System::IConvertible::ToDateTime(System::SharedPtr<System::IFormatProvider> provider)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | カルチャ固有の書式情報を提供する [System::IFormatProvider](../../iformatprovider/) インターフェイスの実装。 |

### ReturnValue

このインスタンスの値に相当する [System::DateTime](../../datetime/) インスタンスです。

## 参照

* Class [DateTime](../../datetime/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
