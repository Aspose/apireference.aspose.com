---
title: "System::Runtime::Serialization::FormatterConverter::Convert metode"
linktitle: "Konversi"
second_title: "Aspose.Page untuk C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert metode. Informasi RTTI dalam C++."
type: docs
weight: 100
url: /id/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


Informasi RTTI.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | Objek yang akan dikonversi. |
| type | const TypeInfo\& | [System::TypeInfo](../../../system/typeinfo/) yang menjadi tujuan konversi nilai. |

### ReturnValue

Nilai yang telah dikonversi.
## Catatan


Mengonversi nilai ke [System::TypeInfo](../../../system/typeinfo/) yang diberikan.
## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Mengonversi nilai ke [System::TypeCode](../../../system/typecode/) yang diberikan.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | Objek yang akan dikonversi. |
| typeCode | TypeCode | [System::TypeCode](../../../system/typecode/) ke mana nilai akan dikonversi. |

### ReturnValue

Nilai yang telah dikonversi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
