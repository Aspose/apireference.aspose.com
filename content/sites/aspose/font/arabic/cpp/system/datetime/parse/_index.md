---
title: "System::DateTime::Parse طريقة"
linktitle: "تحليل"
second_title: "Aspose.Font لـ C++"
description: "System::DateTime::Parse طريقة. يحول تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن DateTime المكافئ في C++."
type: docs
weight: 6600
url: /ar/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


يحول تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](../) المكافئ.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | تمثيل السلسلة لقيمة تاريخ ووقت للتحويل. |

### ReturnValue

نسخة جديدة من فئة [DateTime](../) تمثل قيمة التاريخ والوقت المكافئة لتلك التي يمثلها النص المحدد.

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


يحول تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](../) المكافئ باستخدام معلومات تنسيق مخصصة للثقافة.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | تمثيل السلسلة لقيمة تاريخ ووقت للتحويل. |
| provider | const SharedPtr\<IFormatProvider\>\& | الكائن [IFormatProvider](../../iformatprovider/) الذي يوفر معلومات تنسيق خاصة بالثقافة. |
| styles | Globalization::DateTimeStyles | تركيبة بتية من قيم التعداد التي توفر معلومات إضافية حول **s**، حول عناصر النمط التي قد تكون موجودة في **s**، أو حول التحويل من **s** إلى كائن [DateTime](../). |

### ReturnValue

نسخة جديدة من فئة [DateTime](../) تمثل قيمة التاريخ والوقت المكافئة لتلك التي يمثلها النص المحدد.

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## انظر أيضًا

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
