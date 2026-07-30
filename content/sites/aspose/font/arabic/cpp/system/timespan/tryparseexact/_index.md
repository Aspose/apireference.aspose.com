---
title: "طريقة System::TimeSpan::TryParseExact"
linktitle: "TryParseExact"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة TryParseExact من فئة System::TimeSpan في C++."
type: docs
weight: 4500
url: /ar/cpp/system/timespan/tryparseexact/
---
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::TimeSpanStyles styles, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::TimeSpanStyles styles, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) method


يحوّل السلسلة إلى كائن [TimeSpan](../) مكافئ باستخدام الصيغ المحددة ومزود الصيغ والأنماط، ويُعيد نتيجة التحويل.

```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::TimeSpanStyles styles, TimeSpan &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | سلسلة الإدخال. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الصيغ. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة الذي يوفّر معلومات تنسيق خاصة بالثقافة. |
| الأنماط | Globalization::TimeSpanStyles | يحدد العناصر التي قد تكون موجودة في السلسلة المدخلة. |
| result | TimeSpan\& | الفاصل الزمني الذي يتطابق مع السلسلة. |

### ReturnValue

صحيح إذا تم تحويل السلسلة بنجاح؛ وإلا، خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) method


يحوّل السلسلة إلى كائن [TimeSpan](../) مكافئ باستخدام الصيغ المحددة ومزود الصيغ، ويُعيد نتيجة التحويل.

```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, TimeSpan &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | سلسلة الإدخال. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الصيغ. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة الذي يوفّر معلومات تنسيق خاصة بالثقافة. |
| result | TimeSpan\& | الفاصل الزمني الذي يتطابق مع السلسلة. |

### ReturnValue

صحيح إذا تم تحويل السلسلة بنجاح؛ وإلا، خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::TimeSpanStyles styles, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const ArrayPtr<String> &formats, std::nullptr_t, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::TimeSpanStyles styles, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::TimeSpanStyles styles, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) method


يحوّل السلسلة إلى كائن [TimeSpan](../) مكافئ باستخدام الصيغة المحددة ومزود الصيغ والأنماط، ويُعيد نتيجة التحويل.

```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::TimeSpanStyles styles, TimeSpan &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | سلسلة الإدخال. |
| صيغة | const String\& | سلسلة صيغة قياسية أو مخصصة. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة الذي يوفّر معلومات تنسيق خاصة بالثقافة. |
| الأنماط | Globalization::TimeSpanStyles | يحدد العناصر التي قد تكون موجودة في السلسلة المدخلة. |
| result | TimeSpan\& | الفاصل الزمني الذي يتطابق مع السلسلة. |

### ReturnValue

صحيح إذا تم تحويل السلسلة بنجاح؛ وإلا، خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) method


يحوّل السلسلة إلى كائن [TimeSpan](../) مكافئ باستخدام الصيغة المحددة ومزود الصيغ، ويُعيد نتيجة التحويل.

```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, TimeSpan &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | سلسلة الإدخال. |
| صيغة | const String\& | سلسلة صيغة قياسية أو مخصصة. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة الذي يوفّر معلومات تنسيق خاصة بالثقافة. |
| result | TimeSpan\& | الفاصل الزمني الذي يتطابق مع السلسلة. |

### ReturnValue

صحيح إذا تم تحويل السلسلة بنجاح؛ وإلا، خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, std::nullptr_t, Globalization::TimeSpanStyles styles, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeSpan::TryParseExact(const String\&, const String\&, std::nullptr_t, TimeSpan\&) method




```cpp
static bool System::TimeSpan::TryParseExact(const String &input, const String &format, std::nullptr_t, TimeSpan &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Class [TimeSpan](../)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
