---
title: "طريقة System::Runtime::Serialization::FormatterConverter::Convert"
linktitle: "Convert"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Runtime::Serialization::FormatterConverter::Convert. معلومات RTTI في C++."
type: docs
weight: 100
url: /ar/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


معلومات RTTI.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
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
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


يحول قيمة إلى الـ [System::TypeCode](../../../system/typecode/) المحدد.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
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
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
