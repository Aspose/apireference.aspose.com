---
title: "System::Runtime::Serialization::IFormatterConverter::Convert method"
linktitle: "Μετατροπή"
second_title: "Aspose.Page για C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert method. Πληροφορίες RTTI σε C++."
type: docs
weight: 100
url: /el/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


Πληροφορίες RTTI.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | System::SharedPtr\<Object\> | Το αντικείμενο που θα μετατραπεί. |
| type | const TypeInfo\& | Το [System::TypeInfo](../../../system/typeinfo/) στο οποίο θα μετατραπεί η τιμή. |

### ReturnValue

Η μετατρεπόμενη τιμή.
## Παρατηρήσεις


Μετατρέπει μια τιμή στο δεδομένο [System::TypeInfo](../../../system/typeinfo/).
## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Μετατρέπει μια τιμή στο δεδομένο [System::TypeCode](../../../system/typecode/).

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | System::SharedPtr\<Object\> | Το αντικείμενο που θα μετατραπεί. |
| typeCode | TypeCode | Το [System::TypeCode](../../../system/typecode/) στο οποίο η τιμή πρέπει να μετατραπεί. |

### ReturnValue

Η μετατρεπόμενη τιμή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
