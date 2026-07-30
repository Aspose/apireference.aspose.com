---
title: "System::Runtime::Serialization::IFormatterConverter::Convert yöntemi"
linktitle: "Convert"
second_title: "Aspose.Font için C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert yöntemi. C++'ta RTTI bilgisi."
type: docs
weight: 100
url: /tr/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI bilgisi.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | System::SharedPtr\<Object\> | Dönüştürülecek nesne. |
| type | const TypeInfo\& | Değerin dönüştürüleceği [System::TypeInfo](../../../system/typeinfo/). |

### ReturnValue

Dönüştürülmüş değer.
## Açıklamalar


Bir değeri verilen [System::TypeInfo](../../../system/typeinfo/) tipine dönüştürür.
## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Bir değeri verilen [System::TypeCode](../../../system/typecode/) tipine dönüştürür.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | System::SharedPtr\<Object\> | Dönüştürülecek nesne. |
| typeCode | TypeCode | Değerin dönüştürüleceği [System::TypeCode](../../../system/typecode/). |

### ReturnValue

Dönüştürülmüş değer.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
