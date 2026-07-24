---
title: "System::Drawing::ImageFormatConverter::ConvertTo メソッド"
linktitle: "ConvertTo"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::ImageFormatConverter::ConvertTo メソッド。C++ でオブジェクトを特定の型に変換します。"
type: docs
weight: 300
url: /ja/cpp/system.drawing/imageformatconverter/convertto/
---
## ImageFormatConverter::ConvertTo(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) method


オブジェクトを特定の型に変換します。

```cpp
SharedPtr<Object> System::Drawing::ImageFormatConverter::ConvertTo(const SharedPtr<ComponentModel::ITypeDescriptorContext> &context, const SharedPtr<Globalization::CultureInfo> &culture, const SharedPtr<Object> &value, const TypeInfo &destinationType) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| context | const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) 変換コンテキスト情報。 |
| カルチャ | const SharedPtr\<Globalization::CultureInfo\>\& | オブジェクトを変換する際に使用するカルチャ。 |
| value | const SharedPtr\<Object\>\& | [Object](../../../system/object/) を変換する。 |
| destinationType | const TypeInfo\& | 変換先の型。 |

### ReturnValue

変換されたオブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
