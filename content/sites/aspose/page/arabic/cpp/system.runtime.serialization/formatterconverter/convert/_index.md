---
title: "System::Runtime::Serialization::FormatterConverter::Convert طريقة"
linktitle: "تحويل"
second_title: "Aspose.Page لـ C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert طريقة. معلومات RTTI في C++."
type: docs
weight: 100
url: /ar/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


معلومات RTTI.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | الكائن المراد تحويله. |
| type | const TypeInfo\& | الـ [System::TypeInfo](../../../system/typeinfo/) الذي سيُحوَّل إليه القيمة. |

### ReturnValue

القيمة المحوّلة.
## ملاحظات


يحوّل قيمة إلى الـ [System::TypeInfo](../../../system/typeinfo/).
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


يحوّل قيمة إلى الـ [System::TypeCode](../../../system/typecode/).

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | الكائن المراد تحويله. |
| typeCode | TypeCode | الـ [System::TypeCode](../../../system/typecode/) التي سيتم تحويل القيمة إليها. |

### ReturnValue

القيمة المحوّلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
