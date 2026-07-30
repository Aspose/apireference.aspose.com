---
title: "System::Drawing::ImageConverter::ConvertTo yöntemi"
linktitle: "ConvertTo"
second_title: "Aspose.Font için C++"
description: "System::Drawing::ImageConverter::ConvertTo yöntemi. Nesneyi belirli bir türe C++'da dönüştürür."
type: docs
weight: 200
url: /tr/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Nesneyi belirli bir tipe dönüştürür.

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) dönüşüm bağlamı bilgisi |
| kültür | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Nesneleri dönüştürürken kullanılacak kültür |
| değer | const System::SharedPtr\<System::Object\>\& | Dönüştürülecek bir nesne. |
| destinationType | const System::TypeInfo\& | Dönüştürülecek bir tür. |

### ReturnValue

Dönüştürülmüş nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Nesneyi belirli bir tipe dönüştürür.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) dönüştürülecek. |
| destinationType | const System::TypeInfo\& | Dönüştürülecek tür. |

### ReturnValue

Dönüştürülmüş nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
