---
title: "طريقة System::IConvertible::ToType"
linktitle: "ToType"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IConvertible::ToType. تقوم بتحويل قيمة هذا الكائن إلى System::Object من النوع System::Type المحدد والذي له قيمة مكافئة، باستخدام معلومات التنسيق الخاصة بالثقافة المحددة في C++."
type: docs
weight: 1400
url: /ar/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


يقوم بتحويل قيمة هذا الكائن إلى [System::Object](../../object/) من النوع System::Type المحدد والذي له قيمة مكافئة، باستخدام معلومات التنسيق الخاصة بالثقافة المحددة.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| conversionType | const TypeInfo\& | نوع System::Type الذي تُحول إليه قيمة هذا الكائن. |
| provider | System::SharedPtr\<System::IFormatProvider\> | تنفيذ لواجهة [System::IFormatProvider](../../iformatprovider/) التي تزود بمعلومات التنسيق الخاصة بالثقافة. |

### ReturnValue

كائن [System::Object](../../object/) من النوع conversionType تكون قيمته مكافئة لقيمة هذا الكائن.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
