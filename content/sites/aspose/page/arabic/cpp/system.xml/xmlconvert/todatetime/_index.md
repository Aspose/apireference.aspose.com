---
title: "System::Xml::XmlConvert::ToDateTime طريقة"
linktitle: "ToDateTime"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlConvert::ToDateTime طريقة. يحول الـ String إلى ما يعادل DateTime في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


يقوم بتحويل الـ [String](../../../system/string/) إلى ما يعادل [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للسلسلة.

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


يقوم بتحويل الـ [String](../../../system/string/) إلى ما يعادل [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| formats | const ArrayPtr\<String\>\& | مصفوفة تحتوي على هياكل الصيغة لتطبيقها على الـ [DateTime](../../../system/datetime/) المحول. تشمل الصيغ الصالحة "yyyy-MM-ddTHH:mm:sszzzzzz" ومشتقاتها. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للسلسلة.

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


يقوم بتحويل الـ [String](../../../system/string/) إلى ما يعادل [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | السلسلة للتحويل. |
| format | const String\& | هيكل الصيغة لتطبيقه على الـ [DateTime](../../../system/datetime/) المحول. تشمل الصيغ الصالحة "yyyy-MM-ddTHH:mm:sszzzzzz" ومشتقاتها. يتم التحقق من صحة السلسلة وفقًا لهذه الصيغة. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للسلسلة.

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


يقوم بتحويل الـ [String](../../../system/string/) إلى [DateTime](../../../system/datetime/) باستخدام [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) المحدد.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | قيمة الـ [String](../../../system/string/) للتحويل. |
| dateTimeOption | XmlDateTimeSerializationMode | إحدى قيم التعداد التي تحدد ما إذا كان يجب تحويل التاريخ إلى الوقت المحلي أو الحفاظ عليه كوقت عالمي منسق (UTC)، إذا كان التاريخ بتوقيت UTC. |

### ReturnValue

ما يعادل [DateTime](../../../system/datetime/) للـ [String](../../../system/string/).

## انظر أيضًا

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
