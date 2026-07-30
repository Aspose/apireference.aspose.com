---
title: "System::Xml::XmlConvert::ToDateTimeOffset metodo"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset metodo. Converte la String fornita in un equivalente DateTimeOffset in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Converte la [String](../../../system/string/) fornita in un equivalente [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La stringa da convertire. La stringa deve conformarsi a un sottoinsieme della Raccomandazione W3C per il tipo XML dateTime. Per ulteriori informazioni, vedere la sezione [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) dello [Schema](../../../system.xml.schema/) XML. |

### ReturnValue

L'equivalente [DateTimeOffset](../../../system/datetimeoffset/) della stringa fornita.

## Vedi anche

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Converte la [String](../../../system/string/) fornita in un equivalente [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La stringa da convertire. |
| formats | const ArrayPtr\<String\>\& | Un array di formati da cui **s** può essere convertita. Ogni formato in **formats** può essere qualsiasi sottoinsieme della Raccomandazione W3C per il tipo XML dateTime. Per ulteriori informazioni, vedere la sezione [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) dello [Schema](../../../system.xml.schema/) XML. La stringa **s** è convalidata rispetto a uno di questi formati. |

### ReturnValue

L'equivalente [DateTimeOffset](../../../system/datetimeoffset/) della stringa fornita.

## Vedi anche

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Converte la [String](../../../system/string/) fornita in un equivalente [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La stringa da convertire. |
| format | const String\& | Il formato da cui **s** è convertita. Il parametro format può essere qualsiasi sottoinsieme della Raccomandazione W3C per il tipo XML dateTime. Per ulteriori informazioni, vedere la sezione [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) dello [Schema](../../../system.xml.schema/) XML. La stringa **s** è convalidata rispetto a questo formato. |

### ReturnValue

L'equivalente [DateTimeOffset](../../../system/datetimeoffset/) della stringa fornita.

## Vedi anche

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
