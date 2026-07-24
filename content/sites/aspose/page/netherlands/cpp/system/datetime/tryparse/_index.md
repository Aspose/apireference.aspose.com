---
title: "System::DateTime::TryParse methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "Hoe de TryParse-methode van de System::DateTime class te gebruiken in C++."
type: docs
weight: 6900
url: /nl/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Converteert de opgegeven tekenreeksrepresentatie van een datum- en tijdwaarde naar het equivalente [DateTime](../) object met behulp van de opgegeven cultuurspecifieke opmaakinformatie en stijl.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
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
## DateTime::TryParse(const String\&, DateTime\&) method


Converteert de opgegeven tekenreeksrepresentatie van een datum‑ en tijdwaarde naar het equivalente [DateTime](../) object.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | De tekenreeksrepresentatie van een datum‑ en tijdwaarde die moet worden geconverteerd. |
| result | DateTime\& | Het uitvoerargument dat, indien de conversie slaagt, het resultaat van de conversie bevat. |

### ReturnValue

True als de conversie slaagt, anders - false.

## Zie ook

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
