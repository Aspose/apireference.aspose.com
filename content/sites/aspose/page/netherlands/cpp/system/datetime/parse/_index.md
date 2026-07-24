---
title: "System::DateTime::Parse methode"
linktitle: "Parse"
second_title: "Aspose.Page voor C++"
description: "System::DateTime::Parse methode. Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente DateTime‑object in C++."
type: docs
weight: 6600
url: /nl/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](../) object.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |

### ReturnValue

Een nieuwe instantie van de [DateTime](../)‑klasse die de datum‑ en tijdwaarde vertegenwoordigt die gelijk is aan die welke wordt weergegeven door de opgegeven tekenreeks.

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](../) object met behulp van cultuurspecifieke opmaakinformatie.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
| provider | const SharedPtr\<IFormatProvider\>\& | Het [IFormatProvider](../../iformatprovider/)‑object dat cultuurspecifieke opmaakinformatie levert. |
| styles | Globalization::DateTimeStyles | Een bitwise‑combinatie van de enumeratiewaarden die aanvullende informatie geeft over **s**, over stijlelementen die mogelijk aanwezig zijn in **s**, of over de conversie van **s** naar een [DateTime](../)‑object. |

### ReturnValue

Een nieuwe instantie van de [DateTime](../)‑klasse die de datum‑ en tijdwaarde vertegenwoordigt die gelijk is aan die welke wordt weergegeven door de opgegeven tekenreeks.

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
