---
title: "طريقة System::DateTime::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة TryParse من فئة System::DateTime في C++."
type: docs
weight: 6900
url: /ar/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


تحوّل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](../) المكافئ باستخدام معلومات تنسيق محددة للثقافة والنمط.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | تمثيل السلسلة لقيمة تاريخ ووقت للتحويل. |
| provider | const SharedPtr\<IFormatProvider\>\& | الكائن [IFormatProvider](../../iformatprovider/) الذي يوفر معلومات تنسيق خاصة بالثقافة. |
| styles | Globalization::DateTimeStyles | تركيبة بتية من قيم التعداد التي توفر معلومات إضافية حول **s**، حول عناصر النمط التي قد تكون موجودة في **s**، أو حول التحويل من **s** إلى كائن [DateTime](../). |
| result | DateTime\& | معامل الإخراج الذي، إذا نجحت عملية التحويل، يحتوي على نتيجة التحويل. |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


يحول تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](../) المكافئ.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | تمثيل السلسلة لقيمة تاريخ ووقت للتحويل. |
| result | DateTime\& | معامل الإخراج الذي، إذا نجحت عملية التحويل، يحتوي على نتيجة التحويل. |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
