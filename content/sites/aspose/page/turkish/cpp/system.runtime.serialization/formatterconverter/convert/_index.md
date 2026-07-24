---
title: "System::Runtime::Serialization::FormatterConverter::Convert metodu"
linktitle: "Dönüştür"
second_title: "Aspose.Page için C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert metodu. C++'da RTTI bilgisi."
type: docs
weight: 100
url: /tr/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI bilgisi.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| Parameter | Type | Açıklama |
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
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Bir değeri verilen [System::TypeCode](../../../system/typecode/) tipine dönüştürür.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| Parameter | Type | Açıklama |
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
* Library [Aspose.Page for C++](../../../)
