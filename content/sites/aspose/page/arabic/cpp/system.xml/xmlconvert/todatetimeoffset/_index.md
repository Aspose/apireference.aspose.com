---
title: "طريقة System::Xml::XmlConvert::ToDateTimeOffset"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlConvert::ToDateTimeOffset. يحول String المزوَّد إلى ما يعادل DateTimeOffset في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


يحول [String](../../../system/string/) المزوَّد إلى ما يعادل [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة المراد تحويلها. يجب أن تتوافق السلسلة مع جزء من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) في مواصفة XML [Schema](../../../system.xml.schema/). |

### ReturnValue

ما يعادل [DateTimeOffset](../../../system/datetimeoffset/) للسلسلة المزوَّدة.

## انظر أيضًا

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


يحول [String](../../../system/string/) المزوَّد إلى ما يعادل [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| formats | const ArrayPtr\<String\>\& | مصفوفة من الصيغ التي يمكن تحويل **s** منها. كل صيغة في **formats** يمكن أن تكون أي جزء من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) في مواصفة XML [Schema](../../../system.xml.schema/). يتم التحقق من صحة السلسلة **s** مقابل إحدى هذه الصيغ. |

### ReturnValue

ما يعادل [DateTimeOffset](../../../system/datetimeoffset/) للسلسلة المزوَّدة.

## انظر أيضًا

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


يحول [String](../../../system/string/) المزوَّد إلى ما يعادل [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| format | const String\& | الصيغة التي يتم تحويل **s** منها. يمكن أن يكون معامل الصيغة أي جزء من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) في مواصفة XML [Schema](../../../system.xml.schema/). يتم التحقق من صحة السلسلة **s** مقابل هذه الصيغة. |

### ReturnValue

ما يعادل [DateTimeOffset](../../../system/datetimeoffset/) للسلسلة المزوَّدة.

## انظر أيضًا

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
