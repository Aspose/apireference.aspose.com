---
title: "System::ICustomFormatter::Format メソッド"
linktitle: "フォーマット"
second_title: "C++ 用 Aspose.Page"
description: "System::ICustomFormatter::Format メソッド。指定されたフォーマットを使用して、現在のオブジェクトが表す値の文字列表現を C++ で返します。"
type: docs
weight: 100
url: /ja/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


指定されたフォーマットを使用して、現在のオブジェクトが表す値の文字列表現を返します。

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| フォーマット | System::String | 文字列フォーマット |
| arg | System::SharedPtr\<System::Object\> | 書式設定されるオブジェクト |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | 書式情報を提供するオブジェクト |

### ReturnValue

**arg** の文字列表現で、**format** と **formatProvider** で指定された書式に従ってフォーマットされたもの

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
