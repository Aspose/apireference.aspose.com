---
title: "طريقة System::Xml::XmlConvert::ToDateTime"
linktitle: "ToDateTime"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlConvert::ToDateTime. يحوّل الـ String إلى ما يعادل DateTime في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


يحوّل [String](../../../system/string/) إلى ما يعادل [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للنص.

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


يحوّل [String](../../../system/string/) إلى ما يعادل [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| formats | const ArrayPtr\<String\>\& | مصفوفة تحتوي على هياكل التنسيق لتطبيقها على الـ [DateTime](../../../system/datetime/) المحوَّل. تشمل الصيغ الصالحة "yyyy-MM-ddTHH:mm:sszzzzzz" وتفرعاتها. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للنص.

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


يحوّل [String](../../../system/string/) إلى ما يعادل [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| format | const String\& | هيكل التنسيق لتطبيقه على الـ [DateTime](../../../system/datetime/) المحوَّل. تشمل الصيغ الصالحة "yyyy-MM-ddTHH:mm:sszzzzzz" وتفرعاتها. يتم التحقق من صحة السلسلة وفقًا لهذا التنسيق. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للنص.

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


يحوّل [String](../../../system/string/) إلى [DateTime](../../../system/datetime/) باستخدام [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) المحدد.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | قيمة [String](../../../system/string/) المراد تحويلها. |
| dateTimeOption | XmlDateTimeSerializationMode | أحد قيم التعداد التي تحدد ما إذا كان يجب تحويل التاريخ إلى الوقت المحلي أو الحفاظ عليه كوقت عالمي منسق (UTC)، إذا كان التاريخ بتوقيت UTC. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للـ [String](../../../system/string/).

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
