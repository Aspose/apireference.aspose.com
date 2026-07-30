---
title: "System::DateTime::Parse Methode"
linktitle: "Parsen"
second_title: "Aspose.Font für C++"
description: "System::DateTime::Parse Methode. Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums- und Uhrzeitwerts in das entsprechende DateTime-Objekt in C++."
type: docs
weight: 6600
url: /de/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums- und Uhrzeitwerts in das entsprechende [DateTime](../)-Objekt.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |

### ReturnValue

Eine neue Instanz der [DateTime](../)‑Klasse, die den Datums‑ und Uhrzeitwert darstellt, der dem durch die angegebene Zeichenkette repräsentierten Wert entspricht.

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums- und Uhrzeitwerts in das entsprechende [DateTime](../)-Objekt unter Verwendung kulturspezifischer Formatinformationen.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| provider | const SharedPtr\<IFormatProvider\>\& | Das [IFormatProvider](../../iformatprovider/)‑Objekt, das kulturspezifische Formatinformationen bereitstellt. |
| styles | Globalization::DateTimeStyles | Eine bitweise Kombination der Enumerationswerte, die zusätzliche Informationen über **s**, über Stilelemente, die in **s** vorhanden sein können, oder über die Konvertierung von **s** zu einem [DateTime](../)‑Objekt liefert. |

### ReturnValue

Eine neue Instanz der [DateTime](../)‑Klasse, die den Datums‑ und Uhrzeitwert darstellt, der dem durch die angegebene Zeichenkette repräsentierten Wert entspricht.

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
