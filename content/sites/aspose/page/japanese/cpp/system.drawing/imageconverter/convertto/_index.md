---
title: "System::Drawing::ImageConverter::ConvertTo メソッド"
linktitle: "ConvertTo"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::ImageConverter::ConvertTo メソッド。C++ でオブジェクトを特定の型に変換します。"
type: docs
weight: 200
url: /ja/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


オブジェクトを特定の型に変換します。

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) 変換コンテキスト情報 |
| カルチャ | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | オブジェクトを変換する際に使用するカルチャ |
| value | const System::SharedPtr\<System::Object\>\& | 変換対象のオブジェクト。 |
| destinationType | const System::TypeInfo\& | 変換先の型。 |

### ReturnValue

変換されたオブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
