---
title: "System::Xml::XmlConvert::ToDateTimeOffset yöntemi"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Font için C++"
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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. Dize, XML dateTime türü için W3C Önerisi'nin bir alt kümesine uymalıdır. Daha fazla bilgi için XML [Schema](../../../system.xml.schema/) spesifikasyonunun [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne bakın. |

### ReturnValue

Sağlanan dizenin [DateTimeOffset](../../../system/datetimeoffset/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Sağlanan [String](../../../system/string/) öğesini bir [DateTimeOffset](../../../system/datetimeoffset/) eşdeğerine dönüştürür.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| formats | const ArrayPtr\<String\>\& | **s**'nin dönüştürülebileceği biçimlerin bir dizisi. **formats** içindeki her biçim, XML dateTime türü için W3C Önerisi'nin herhangi bir alt kümesi olabilir. Daha fazla bilgi için XML [Schema](../../../system.xml.schema/) spesifikasyonunun [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne bakın. **s** dizesi bu biçimlerden biriyle doğrulanır. |

### ReturnValue

Sağlanan dizenin [DateTimeOffset](../../../system/datetimeoffset/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Sağlanan [String](../../../system/string/) öğesini bir [DateTimeOffset](../../../system/datetimeoffset/) eşdeğerine dönüştürür.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| format | const String\& | **s**'nin dönüştürüldüğü biçim. Biçim parametresi, XML dateTime türü için W3C Önerisi'nin herhangi bir alt kümesi olabilir. Daha fazla bilgi için XML [Schema](../../../system.xml.schema/) spesifikasyonunun [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne bakın. **s** dizesi bu biçimle doğrulanır. |

### ReturnValue

Sağlanan dizenin [DateTimeOffset](../../../system/datetimeoffset/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
