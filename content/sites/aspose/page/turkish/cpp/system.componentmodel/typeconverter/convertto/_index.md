---
title: "System::ComponentModel::TypeConverter::ConvertTo metodu"
linktitle: "ConvertTo"
second_title: "Aspose.Page için C++"
description: "System::ComponentModel::TypeConverter::ConvertTo metodu. Nesneyi C++'da belirli bir tipe dönüştürür."
type: docs
weight: 500
url: /tr/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Nesneyi belirli bir tipe dönüştürür.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) dönüşüm bağlamı bilgisi. |
| kültür | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Nesneleri dönüştürürken kullanılacak kültür. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) dönüştürülecek. |
| destinationType | const System::TypeInfo\& | Dönüştürülecek tür. |

### ReturnValue

Dönüştürülmüş nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Nesneyi belirli bir tipe dönüştürür.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) dönüştürülecek. |
| destinationType | const System::TypeInfo\& | Dönüştürülecek tür. |

### ReturnValue

Dönüştürülmüş nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
