---
title: "System::IConvertible::ToType method"
linktitle: "ToType"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IConvertible::ToType. Mengonversi nilai dari instance ini ke System::Object dari System::Type yang ditentukan yang memiliki nilai yang setara, menggunakan informasi pemformatan spesifik budaya yang ditentukan dalam C++."
type: docs
weight: 1400
url: /id/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Mengonversi nilai dari instance ini ke [System::Object](../../object/) dari System::Type yang ditentukan yang memiliki nilai yang setara, menggunakan informasi pemformatan spesifik budaya yang ditentukan.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| conversionType | const TypeInfo\& | System::Type yang menjadi tujuan konversi nilai instance ini. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Implementasi antarmuka [System::IFormatProvider](../../iformatprovider/) yang menyediakan informasi pemformatan spesifik budaya. |

### ReturnValue

Instance [System::Object](../../object/) dengan tipe conversionType yang nilainya setara dengan nilai instance ini.

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
