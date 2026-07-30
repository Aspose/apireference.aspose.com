---
title: "System::DateTime::TryParse Methode"
linktitle: "TryParse"
second_title: "Aspose.Font für C++"
description: "Wie man die TryParse‑Methode der System::DateTime‑Klasse in C++ verwendet."
type: docs
weight: 6900
url: /de/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes in das entsprechende [DateTime](../)-Objekt unter Verwendung der angegebenen kulturspezifischen Formatinformationen und des Stils.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| provider | const SharedPtr\<IFormatProvider\>\& | Das [IFormatProvider](../../iformatprovider/)‑Objekt, das kulturspezifische Formatinformationen bereitstellt. |
| styles | Globalization::DateTimeStyles | Eine bitweise Kombination der Enumerationswerte, die zusätzliche Informationen über **s**, über Stilelemente, die in **s** vorhanden sein können, oder über die Konvertierung von **s** zu einem [DateTime](../)‑Objekt liefert. |
| result | DateTime\\& | Das Ausgabeargument, das bei erfolgreicher Konvertierung das Ergebnis der Konvertierung enthält. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich ist, sonst - falsch.

## Siehe auch

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums- und Uhrzeitwerts in das entsprechende [DateTime](../)-Objekt.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| result | DateTime\\& | Das Ausgabeargument, das bei erfolgreicher Konvertierung das Ergebnis der Konvertierung enthält. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich ist, sonst - falsch.

## Siehe auch

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
