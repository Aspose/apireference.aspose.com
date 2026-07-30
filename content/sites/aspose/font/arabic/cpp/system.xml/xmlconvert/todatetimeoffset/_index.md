---
title: "طريقة System::Xml::XmlConvert::ToDateTimeOffset"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlConvert::ToDateTimeOffset. يحول الـ String المقدم إلى ما يعادل DateTimeOffset في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


يحول الـ [String](../../../system/string/) المقدم إلى ما يعادل [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة المراد تحويلها. يجب أن تتوافق السلسلة مع مجموعة فرعية من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) من مواصفة XML [Schema](../../../system.xml.schema/). |

### ReturnValue

المكافئ من نوع [DateTimeOffset](../../../system/datetimeoffset/) للسلسلة المقدمة.

## انظر أيضًا

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


يحول الـ [String](../../../system/string/) المقدم إلى ما يعادل [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| formats | const ArrayPtr\<String\>\& | مصفوفة من الصيغ التي يمكن تحويل **s** منها. كل صيغة في **formats** يمكن أن تكون أي مجموعة فرعية من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) من مواصفة XML [Schema](../../../system.xml.schema/). يتم التحقق من صحة السلسلة **s** مقابل إحدى هذه الصيغ. |

### ReturnValue

المكافئ من نوع [DateTimeOffset](../../../system/datetimeoffset/) للسلسلة المقدمة.

## انظر أيضًا

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


يحول الـ [String](../../../system/string/) المقدم إلى ما يعادل [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| format | const String\& | الصيغة التي يتم تحويل **s** منها. يمكن أن يكون معامل الصيغة أي مجموعة فرعية من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) من مواصفة XML [Schema](../../../system.xml.schema/). يتم التحقق من صحة السلسلة **s** مقابل هذه الصيغة. |

### ReturnValue

المكافئ من نوع [DateTimeOffset](../../../system/datetimeoffset/) للسلسلة المقدمة.

## انظر أيضًا

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
