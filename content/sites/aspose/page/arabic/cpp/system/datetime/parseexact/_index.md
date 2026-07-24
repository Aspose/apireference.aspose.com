---
title: "طريقة System::DateTime::ParseExact"
linktitle: "ParseExact"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة ParseExact من فئة System::DateTime في C++."
type: docs
weight: 6700
url: /ar/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


تحول تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](../) المكافئ باستخدام الصيغ المحددة، ومعلومات تنسيق خاصة بالثقافة، والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع واحد أو أكثر من الصيغ المحددة بدقة. تُطلق استثناءً إذا فشلت عملية التحويل.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | تمثيل السلسلة لقيمة تاريخ ووقت للتحويل. |
| الصيغ | const ArrayPtr\<String\>\& | مصفوفة صيغ السلاسل. |
| provider | const SharedPtr\<IFormatProvider\>\& | الكائن [IFormatProvider](../../iformatprovider/) الذي يوفر معلومات تنسيق خاصة بالثقافة. |
| styles | Globalization::DateTimeStyles | تركيبة بتية من قيم التعداد التي توفر معلومات إضافية حول **s**، حول عناصر النمط التي قد تكون موجودة في **s**، أو حول التحويل من **s** إلى كائن [DateTime](../). |

### ReturnValue

مثيل جديد من الفئة [DateTime](../) التي تمثل قيمة التاريخ والوقت المكافئة لتلك التي يمثلها السلسلة المحددة.

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


يحوّل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](../) المكافئ باستخدام التنسيق المحدد ومعلومات التنسيق الخاصة بالثقافة. يجب أن يتطابق تنسيق تمثيل السلسلة مع التنسيق المحدد تمامًا. يطرح استثناءً إذا فشل التحويل.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | تمثيل السلسلة لقيمة تاريخ ووقت للتحويل. |
| تنسيق | const String\& | تنسيق السلسلة. |
| provider | const SharedPtr\<IFormatProvider\>\& | الكائن [IFormatProvider](../../iformatprovider/) الذي يوفر معلومات تنسيق خاصة بالثقافة. |
| styles | Globalization::DateTimeStyles | تركيبة بتية من قيم التعداد التي توفر معلومات إضافية حول **s**، حول عناصر النمط التي قد تكون موجودة في **s**، أو حول التحويل من **s** إلى كائن [DateTime](../). |

### ReturnValue

مثيل جديد من الفئة [DateTime](../) التي تمثل قيمة التاريخ والوقت المكافئة لتلك التي يمثلها السلسلة المحددة.

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
