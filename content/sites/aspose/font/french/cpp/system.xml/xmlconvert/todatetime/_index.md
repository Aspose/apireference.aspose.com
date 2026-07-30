---
title: "System::Xml::XmlConvert::ToDateTime méthode"
linktitle: "ToDateTime"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlConvert::ToDateTime méthode. Convertit la String en un équivalent DateTime en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


Convertit le [String](../../../system/string/) en un équivalent [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La chaîne à convertir. |

### ReturnValue

Un équivalent [DateTime](../../../system/datetime/) de la chaîne.

## Voir aussi

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


Convertit le [String](../../../system/string/) en un équivalent [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La chaîne à convertir. |
| formats | const ArrayPtr\<String\>\& | Un tableau contenant les structures de format à appliquer au [DateTime](../../../system/datetime/) converti. Les formats valides incluent "yyyy-MM-ddTHH:mm:sszzzzzz" et leurs sous-ensembles. |

### ReturnValue

Un équivalent [DateTime](../../../system/datetime/) de la chaîne.

## Voir aussi

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


Convertit le [String](../../../system/string/) en un équivalent [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La chaîne à convertir. |
| format | const String\& | La structure de format à appliquer au [DateTime](../../../system/datetime/) converti. Les formats valides incluent "yyyy-MM-ddTHH:mm:sszzzzzz" et leurs sous-ensembles. La chaîne est validée selon ce format. |

### ReturnValue

Un équivalent [DateTime](../../../system/datetime/) de la chaîne.

## Voir aussi

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


Convertit le [String](../../../system/string/) en un [DateTime](../../../system/datetime/) en utilisant le [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) spécifié.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La valeur [String](../../../system/string/) à convertir. |
| optionDateHeure | XmlDateTimeSerializationMode | L'une des valeurs d'énumération qui spécifient si la date doit être convertie en heure locale ou conservée en Temps Universel Coordonné (UTC), si c'est une date UTC. |

### ReturnValue

Un équivalent [DateTime](../../../system/datetime/) du [String](../../../system/string/).

## Voir aussi

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
