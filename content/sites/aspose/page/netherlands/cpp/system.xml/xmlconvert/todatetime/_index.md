---
title: "System::Xml::XmlConvert::ToDateTime methode"
linktitle: "ToDateTime"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlConvert::ToDateTime methode. Converteert de String naar een DateTime-equivalent in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


Converteert de [String](../../../system/string/) naar een [DateTime](../../../system/datetime/) equivalent.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De te converteren string. |

### ReturnValue

Een [DateTime](../../../system/datetime/) equivalent van de tekenreeks.

## Zie ook

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


Converteert de [String](../../../system/string/) naar een [DateTime](../../../system/datetime/) equivalent.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De te converteren string. |
| formats | const ArrayPtr\<String\>\& | Een array die de formatstructuren bevat die moeten worden toegepast op de geconverteerde [DateTime](../../../system/datetime/). Geldige formaten omvatten "yyyy-MM-ddTHH:mm:sszzzzzz" en de subsets daarvan. |

### ReturnValue

Een [DateTime](../../../system/datetime/) equivalent van de tekenreeks.

## Zie ook

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


Converteert de [String](../../../system/string/) naar een [DateTime](../../../system/datetime/) equivalent.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De te converteren string. |
| format | const String\& | De formatstructuur die moet worden toegepast op de geconverteerde [DateTime](../../../system/datetime/). Geldige formaten omvatten "yyyy-MM-ddTHH:mm:sszzzzzz" en de subsets daarvan. De tekenreeks wordt gevalideerd tegen dit formaat. |

### ReturnValue

Een [DateTime](../../../system/datetime/) equivalent van de tekenreeks.

## Zie ook

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


Converteert de [String](../../../system/string/) naar een [DateTime](../../../system/datetime/) met behulp van de opgegeven [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De [String](../../../system/string/) waarde die moet worden geconverteerd. |
| dateTimeOption | XmlDateTimeSerializationMode | Een van de enumeratiewaarden die aangeven of de datum moet worden geconverteerd naar lokale tijd of behouden als Coordinated Universal Time (UTC), indien het een UTC- datum is. |

### ReturnValue

Een [DateTime](../../../system/datetime/) equivalent van de [String](../../../system/string/).

## Zie ook

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
