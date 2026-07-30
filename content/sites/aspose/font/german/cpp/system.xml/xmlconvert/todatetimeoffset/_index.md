---
title: "System::Xml::XmlConvert::ToDateTimeOffset-Methode"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset-Methode. Konvertiert die bereitgestellte String in ein DateTimeOffset‑Äquivalent in C++."
type: docs
weight: 1500
url: /de/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Konvertiert die bereitgestellte [String](../../../system/string/) in ein [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die zu konvertierende Zeichenkette. Die Zeichenkette muss einem Teil der W3C-Empfehlung für den XML dateTime‑Typ entsprechen. Weitere Informationen finden Sie im Abschnitt [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) der XML [Schema](../../../system.xml.schema/) Spezifikation. |

### ReturnValue

Das [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent der bereitgestellten Zeichenkette.

## Siehe auch

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Konvertiert die bereitgestellte [String](../../../system/string/) in ein [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkette zum Konvertieren. |
| formats | const ArrayPtr\<String\>\& | Ein Array von Formaten, aus denen **s** konvertiert werden kann. Jedes Format in **formats** kann ein beliebiger Teil der W3C-Empfehlung für den XML dateTime‑Typ sein. Weitere Informationen finden Sie im Abschnitt [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) der XML [Schema](../../../system.xml.schema/)‑Spezifikation. Die Zeichenkette **s** wird gegen eines dieser Formate validiert. |

### ReturnValue

Das [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent der bereitgestellten Zeichenkette.

## Siehe auch

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Konvertiert die bereitgestellte [String](../../../system/string/) in ein [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkette zum Konvertieren. |
| format | const String\& | Das Format, aus dem **s** konvertiert wird. Der Format‑Parameter kann ein beliebiger Teil der W3C-Empfehlung für den XML dateTime‑Typ sein. Weitere Informationen finden Sie im Abschnitt [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) der XML [Schema](../../../system.xml.schema/)‑Spezifikation. Die Zeichenkette **s** wird gegen dieses Format validiert. |

### ReturnValue

Das [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent der bereitgestellten Zeichenkette.

## Siehe auch

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
