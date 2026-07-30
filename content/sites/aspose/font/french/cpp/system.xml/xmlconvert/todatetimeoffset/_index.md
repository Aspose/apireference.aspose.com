---
title: "System::Xml::XmlConvert::ToDateTimeOffset méthode"
linktitle: "VersDateTimeOffset"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset méthode. Convertit la String fournie en un équivalent DateTimeOffset en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Convertit la [String](../../../system/string/) fournie en un équivalent [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La chaîne à convertir. La chaîne doit se conformer à un sous‑ensemble de la recommandation W3C pour le type XML dateTime. Pour plus d’informations, voir la section [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) du XML [Schema](../../../system.xml.schema/) spécification. |

### ReturnValue

L’équivalent [DateTimeOffset](../../../system/datetimeoffset/) de la chaîne fournie.

## Voir aussi

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Convertit la [String](../../../system/string/) fournie en un équivalent [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La chaîne à convertir. |
| formats | const ArrayPtr\<String\>\& | Un tableau de formats à partir desquels **s** peut être converti. Chaque format dans **formats** peut être n'importe quel sous‑ensemble de la recommandation W3C pour le type XML dateTime. Pour plus d'informations, voir la section [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) du XML [Schema](../../../system.xml.schema/) spécification. La chaîne **s** est validée contre l'un de ces formats. |

### ReturnValue

L’équivalent [DateTimeOffset](../../../system/datetimeoffset/) de la chaîne fournie.

## Voir aussi

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Convertit la [String](../../../system/string/) fournie en un équivalent [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La chaîne à convertir. |
| format | const String\& | Le format à partir duquel **s** est converti. Le paramètre format peut être n'importe quel sous‑ensemble de la recommandation W3C pour le type XML dateTime. Pour plus d'informations, voir la section [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) du XML [Schema](../../../system.xml.schema/) spécification. La chaîne **s** est validée contre ce format. |

### ReturnValue

L’équivalent [DateTimeOffset](../../../system/datetimeoffset/) de la chaîne fournie.

## Voir aussi

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
