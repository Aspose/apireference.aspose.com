---
title: "System::IConvertible::ToChar メソッド"
linktitle: "ToChar"
second_title: "C++ 用 Aspose.Page"
description: "System::IConvertible::ToChar メソッド。このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して、同等の Unicode 文字に変換します（C++）。"
type: docs
weight: 400
url: /ja/cpp/system/iconvertible/tochar/
---
## IConvertible::ToChar method


このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の Unicode 文字に変換します。

```cpp
virtual char_t System::IConvertible::ToChar(System::SharedPtr<System::IFormatProvider> provider)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | カルチャ固有の書式情報を提供する [System::IFormatProvider](../../iformatprovider/) インターフェイスの実装。 |

### ReturnValue

このインスタンスの値に相当する Unicode 文字です。

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
