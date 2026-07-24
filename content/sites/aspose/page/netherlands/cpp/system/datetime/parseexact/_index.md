---
title: "System::DateTime::ParseExact methode"
linktitle: "ParseExact"
second_title: "Aspose.Page voor C++"
description: "Hoe de ParseExact‑methode van de System::DateTime‑klasse te gebruiken in C++."
type: docs
weight: 6700
url: /nl/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](../)‑object met behulp van de opgegeven indelingen, cultuurspecifieke opmaakinformatie en stijl. De indeling van de tekenreeksrepresentatie moet exact overeenkomen met een of meer van de opgegeven indelingen. Werpt een uitzondering als de conversie mislukt.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
| formaten | const ArrayPtr\<String\>\& | De array van tekenreeks‑indelingen. |
| provider | const SharedPtr\<IFormatProvider\>\& | Het [IFormatProvider](../../iformatprovider/)‑object dat cultuurspecifieke opmaakinformatie levert. |
| styles | Globalization::DateTimeStyles | Een bitwise‑combinatie van de enumeratiewaarden die aanvullende informatie geeft over **s**, over stijlelementen die mogelijk aanwezig zijn in **s**, of over de conversie van **s** naar een [DateTime](../)‑object. |

### ReturnValue

Een nieuwe instantie van de [DateTime](../)‑klasse die de datum‑ en tijdwaarde vertegenwoordigt die gelijk is aan die welke wordt weergegeven door de opgegeven tekenreeks.

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](../)‑object met behulp van de opgegeven indeling en cultuurspecifieke opmaakinformatie. De indeling van de tekenreeksrepresentatie moet exact overeenkomen met de opgegeven indeling. Werpt een uitzondering als de conversie mislukt.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
| formaat | const String\& | Het tekenreeksformaat. |
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
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Zie ook

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
