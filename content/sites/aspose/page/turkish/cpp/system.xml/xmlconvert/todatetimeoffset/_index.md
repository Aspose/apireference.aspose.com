---
title: "System::Xml::XmlConvert::ToDateTimeOffset yöntemi"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset yöntemi. Sağlanan String'i C++'ta bir DateTimeOffset eşdeğerine dönüştürür."
type: docs
weight: 1500
url: /tr/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Sağlanan [String](../../../system/string/) öğesini bir [DateTimeOffset](../../../system/datetimeoffset/) eşdeğerine dönüştürür.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. Dize, XML dateTime türü için W3C Tavsiye'sinin bir alt kümesine uymalıdır. Daha fazla bilgi için [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne ve XML [Schema](../../../system.xml.schema/) spesifikasyonuna bakın. |

### ReturnValue

Sağlanan dizenin [DateTimeOffset](../../../system/datetimeoffset/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Sağlanan [String](../../../system/string/) öğesini bir [DateTimeOffset](../../../system/datetimeoffset/) eşdeğerine dönüştürür.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| formats | const ArrayPtr\<String\>\& | Bir dizi format, **s**'nin dönüştürülebileceği. **formats** içindeki her format, XML dateTime türü için W3C Tavsiye'sinin herhangi bir alt kümesi olabilir. Daha fazla bilgi için [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne ve XML [Schema](../../../system.xml.schema/) spesifikasyonuna bakın. **s** dizesi bu formatlardan birine göre doğrulanır. |

### ReturnValue

Sağlanan dizenin [DateTimeOffset](../../../system/datetimeoffset/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Sağlanan [String](../../../system/string/) öğesini bir [DateTimeOffset](../../../system/datetimeoffset/) eşdeğerine dönüştürür.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| format | const String\& | **s**'nin dönüştürüldüğü format. Format parametresi, XML dateTime türü için W3C Tavsiye'sinin herhangi bir alt kümesi olabilir. Daha fazla bilgi için [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne ve XML [Schema](../../../system.xml.schema/) spesifikasyonuna bakın. **s** dizesi bu formatla doğrulanır. |

### ReturnValue

Sağlanan dizenin [DateTimeOffset](../../../system/datetimeoffset/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
