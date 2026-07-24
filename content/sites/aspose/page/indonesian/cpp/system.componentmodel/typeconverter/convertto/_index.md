---
title: "Metode System::ComponentModel::TypeConverter::ConvertTo"
linktitle: "ConvertTo"
second_title: "Aspose.Page untuk C++"
description: "Metode System::ComponentModel::TypeConverter::ConvertTo. Mengonversi objek ke tipe spesifik dalam C++."
type: docs
weight: 500
url: /id/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Mengonversi objek ke tipe tertentu.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) informasi konteks konversi. |
| budaya | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Budaya yang digunakan saat mengonversi objek. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) untuk dikonversi. |
| destinationType | const System::TypeInfo\& | Tipe untuk dikonversi ke. |

### ReturnValue

Objek yang dikonversi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Mengonversi objek ke tipe tertentu.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) untuk dikonversi. |
| destinationType | const System::TypeInfo\& | Tipe untuk dikonversi ke. |

### ReturnValue

Objek yang dikonversi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
