---
title: "System::DateTime::TryParseExact methode"
linktitle: "TryParseExact"
second_title: "Aspose.Page voor C++"
description: "Hoe de TryParseExact methode van de System::DateTime klasse te gebruiken in C++."
type: docs
weight: 7000
url: /nl/cpp/system/datetime/tryparseexact/
---
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](../) object met behulp van de opgegeven formaten, cultuur‑specifieke opmaakinformatie en stijl. Het formaat van de tekenreeksrepresentatie moet exact overeenkomen met een of meer van de opgegeven formaten.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
| formaten | const ArrayPtr\<String\>\& | De array van tekenreeks‑indelingen. |
| provider | const SharedPtr\<IFormatProvider\>\& | Het [IFormatProvider](../../iformatprovider/)‑object dat cultuurspecifieke opmaakinformatie levert. |
| styles | Globalization::DateTimeStyles | Een bitwise‑combinatie van de enumeratiewaarden die aanvullende informatie geeft over **s**, over stijlelementen die mogelijk aanwezig zijn in **s**, of over de conversie van **s** naar een [DateTime](../)‑object. |
| result | DateTime\& | Het uitvoerargument dat, indien de conversie slaagt, het resultaat van de conversie bevat. |

### ReturnValue

True als de conversie slaagt, anders - false.

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](../) object met behulp van het opgegeven formaat, cultuur‑specifieke opmaakinformatie en stijl. Het formaat van de tekenreeksrepresentatie moet exact overeenkomen met het opgegeven formaat.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
| formaat | const String\& | Het tekenreeksformaat. |
| provider | const SharedPtr\<IFormatProvider\>\& | Het [IFormatProvider](../../iformatprovider/)‑object dat cultuurspecifieke opmaakinformatie levert. |
| styles | Globalization::DateTimeStyles | Een bitwise‑combinatie van de enumeratiewaarden die aanvullende informatie geeft over **s**, over stijlelementen die mogelijk aanwezig zijn in **s**, of over de conversie van **s** naar een [DateTime](../)‑object. |
| result | DateTime\& | Het uitvoerargument dat, indien de conversie slaagt, het resultaat van de conversie bevat. |

### ReturnValue

True als de conversie slaagt, anders - false.

## Zie ook

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
