---
title: "System::IConvertible::ToString メソッド"
linktitle: "ToString"
second_title: "C++ 用 Aspose.Page"
description: "System::IConvertible::ToString メソッド。C# の Object.ToString() メソッドの類似です。C++ でカスタムオブジェクトを文字列に変換できるようにします。"
type: docs
weight: 1300
url: /ja/cpp/system/iconvertible/tostring/
---
## IConvertible::ToString() const method


C# の [Object.ToString()](../../object/tostring/) メソッドの類似です。カスタムオブジェクトを文字列に変換できるようにします。

```cpp
virtual String System::Object::ToString() const
```


### ReturnValue

[String](../../string/) representation as provided by final class.

## 参照

* Class [String](../../string/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## IConvertible::ToString(System::SharedPtr\<System::IFormatProvider\>) method


このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [System::String](../../string/) に変換します。

```cpp
virtual System::String System::IConvertible::ToString(System::SharedPtr<System::IFormatProvider> provider)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | カルチャ固有の書式情報を提供する [System::IFormatProvider](../../iformatprovider/) インターフェイスの実装。 |

### ReturnValue

このインスタンスの値に相当する [System::String](../../string/) インスタンスです。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
