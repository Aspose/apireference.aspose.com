---
title: "System::ComponentModel::TypeConverter::ConvertTo メソッド"
linktitle: "ConvertTo"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::TypeConverter::ConvertTo メソッド. C++ でオブジェクトを特定の型に変換します。"
type: docs
weight: 500
url: /ja/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


オブジェクトを特定の型に変換します。

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) 変換コンテキスト情報。 |
| カルチャ | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | オブジェクトを変換する際に使用するカルチャ。 |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) を変換する。 |
| destinationType | const System::TypeInfo\& | 変換先の型。 |

### ReturnValue

変換されたオブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


オブジェクトを特定の型に変換します。

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) を変換する。 |
| destinationType | const System::TypeInfo\& | 変換先の型。 |

### ReturnValue

変換されたオブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
