---
title: "System::Runtime::Serialization::IFormatterConverter::Convert طريقة"
linktitle: "Convert"
second_title: "Aspose.Font لـ C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert طريقة. معلومات RTTI في C++."
type: docs
weight: 100
url: /ar/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


معلومات RTTI.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | System::SharedPtr\<Object\> | الكائن الذي سيتم تحويله. |
| type | const TypeInfo\& | الـ [System::TypeInfo](../../../system/typeinfo/) الذي سيتم تحويل القيمة إليه. |

### ReturnValue

القيمة المحوّلة.
## ملاحظات


يحول قيمة إلى الـ [System::TypeInfo](../../../system/typeinfo/) المحدد.
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


يحول قيمة إلى الـ [System::TypeCode](../../../system/typecode/) المحدد.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | System::SharedPtr\<Object\> | الكائن الذي سيتم تحويله. |
| typeCode | TypeCode | الـ [System::TypeCode](../../../system/typecode/) الذي سيتم تحويل القيمة إليه. |

### ReturnValue

القيمة المحوّلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
