---
title: "System::Xml::XmlConvert::ToDateTimeOffset-Methode"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset-Methode. Konvertiert den übergebenen String in ein DateTimeOffset-Äquivalent in C++."
type: docs
weight: 1500
url: /de/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Konvertiert den übergebenen [String](../../../system/string/) in ein [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Der zu konvertierende String. Der String muss einem Teil der W3C-Empfehlung für den XML dateTime-Typ entsprechen. Weitere Informationen finden Sie im Abschnitt [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) des XML [Schema](../../../system.xml.schema/) Spezifikation. |

### ReturnValue

Das [DateTimeOffset](../../../system/datetimeoffset/)-Äquivalent des übergebenen Strings.

## Siehe auch

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Konvertiert den übergebenen [String](../../../system/string/) in ein [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Der zu konvertierende String. |
| formats | const ArrayPtr\<String\>\& | Ein Array von Formaten, aus denen **s** konvertiert werden kann. Jedes Format in **formats** kann ein Teil der W3C-Empfehlung für den XML dateTime-Typ sein. Weitere Informationen finden Sie im Abschnitt [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) des XML [Schema](../../../system.xml.schema/) Spezifikation. Der String **s** wird gegen eines dieser Formate validiert. |

### ReturnValue

Das [DateTimeOffset](../../../system/datetimeoffset/)-Äquivalent des übergebenen Strings.

## Siehe auch

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Konvertiert den übergebenen [String](../../../system/string/) in ein [DateTimeOffset](../../../system/datetimeoffset/) Äquivalent.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Der zu konvertierende String. |
| format | const String\& | Das Format, aus dem **s** konvertiert wird. Der Formatparameter kann ein Teil der W3C-Empfehlung für den XML dateTime-Typ sein. Weitere Informationen finden Sie im Abschnitt [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) des XML [Schema](../../../system.xml.schema/) Spezifikation. Der String **s** wird gegen dieses Format validiert. |

### ReturnValue

Das [DateTimeOffset](../../../system/datetimeoffset/)-Äquivalent des übergebenen Strings.

## Siehe auch

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
