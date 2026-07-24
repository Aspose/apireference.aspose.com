---
title: "طريقة System::DateTime::ToString"
linktitle: "ToString"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::DateTime::ToString. تُرجع تمثيل السلسلة لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام قواعد التنسيق المحددة من قبل الثقافة الحالية في C++."
type: docs
weight: 5200
url: /ar/cpp/system/datetime/tostring/
---
## DateTime::ToString() const method


يعيد تمثيل السلسلة لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام قواعد التنسيق المعرفة من قبل الثقافة الحالية.

```cpp
String System::DateTime::ToString() const
```


### ReturnValue

تمثيل السلسلة للقيمة التي يمثلها الكائن الحالي

## انظر أيضًا

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::CultureInfo> &culture) const
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<IFormatProvider\>\&) const method


يعيد تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام معلومات التنسيق المحددة.

```cpp
String System::DateTime::ToString(const SharedPtr<IFormatProvider> &provider) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مزود | const SharedPtr\<IFormatProvider\>\& | كائن يمثل معلومات التنسيق |

### ReturnValue

تمثيل السلسلة للقيمة التي يمثلها الكائن الحالي مُنسق وفقًا لمعلومات التنسيق المقدمة من **formatProvider**.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&) const method


يعيد تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام التنسيق المحدد وقواعد التنسيق المعرفة من قبل الثقافة الحالية.

```cpp
String System::DateTime::ToString(const String &format) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| تنسيق | const String\& | سلسلة تنسيق |

### ReturnValue

تمثيل السلسلة للقيمة التي يمثلها الكائن الحالي مُنسق وفقًا للتنسيق المحدد بواسطة **format** والثقافة الحالية.

## انظر أيضًا

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::CultureInfo> &culture) const
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<IFormatProvider\>\&) const method


يعيد تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام معلومات التنسيق المحددة.

```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<IFormatProvider> &provider) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| تنسيق | const String\& | سلسلة تنسيق |
| مزود | const SharedPtr\<IFormatProvider\>\& | كائن يمثل معلومات التنسيق |

### ReturnValue

تمثيل السلسلة للقيمة التي يمثلها الكائن الحالي مُنسق وفقًا لمعلومات التنسيق المقدمة من **provider** وسلسلة التنسيق **format**.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, std::nullptr_t) const method




```cpp
String System::DateTime::ToString(const String &format, std::nullptr_t) const
```

## انظر أيضًا

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(std::nullptr_t) const method




```cpp
String System::DateTime::ToString(std::nullptr_t) const
```

## انظر أيضًا

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
