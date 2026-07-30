---
title: "System::Runtime::Serialization::FormatterConverter::Convert yöntemi"
linktitle: "Convert"
second_title: "Aspose.Font için C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert yöntemi. C++'da RTTI bilgisi."
type: docs
weight: 100
url: /tr/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI bilgisi.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
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
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Bir değeri verilen [System::TypeCode](../../../system/typecode/) tipine dönüştürür.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
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
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
