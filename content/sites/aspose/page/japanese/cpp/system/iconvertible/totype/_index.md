---
title: "System::IConvertible::ToType メソッド"
linktitle: "ToType"
second_title: "C++ 用 Aspose.Page"
description: "System::IConvertible::ToType メソッド。このインスタンスの値を、指定された System::Type の等価値を持つ System::Object に変換します。指定されたカルチャ固有の書式情報を使用します（C++）。"
type: docs
weight: 1400
url: /ja/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


このインスタンスの値を、指定された System::Type の等価値を持つ [System::Object](../../object/) に変換します。指定されたカルチャ固有の書式情報を使用します。

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| conversionType | const TypeInfo\& | このインスタンスの値が変換される System::Type。 |
| provider | System::SharedPtr\<System::IFormatProvider\> | カルチャ固有の書式情報を提供する [System::IFormatProvider](../../iformatprovider/) インターフェイスの実装。 |

### ReturnValue

このインスタンスの値と等価な値を持つ型 conversionType の [System::Object](../../object/) インスタンス。

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
