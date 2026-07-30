---
title: "System::DateTime::ParseExact Methode"
linktitle: "ParseExact"
second_title: "Aspose.Font für C++"
description: "Wie man die ParseExact‑Methode der System::DateTime‑Klasse in C++ verwendet."
type: docs
weight: 6700
url: /de/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes in das entsprechende [DateTime](../)‑Objekt unter Verwendung der angegebenen Formate, kulturspezifischer Formatinformationen und des Stils. Das Format der Zeichenkettenrepräsentation muss exakt einem oder mehreren der angegebenen Formate entsprechen. Wirft eine Ausnahme, wenn die Konvertierung fehlschlägt.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| Formate | const ArrayPtr\<String\>\& | Das Array der Zeichenkettenformate. |
| provider | const SharedPtr\<IFormatProvider\>\& | Das [IFormatProvider](../../iformatprovider/)‑Objekt, das kulturspezifische Formatinformationen bereitstellt. |
| styles | Globalization::DateTimeStyles | Eine bitweise Kombination der Enumerationswerte, die zusätzliche Informationen über **s**, über Stilelemente, die in **s** vorhanden sein können, oder über die Konvertierung von **s** zu einem [DateTime](../)‑Objekt liefert. |

### ReturnValue

Eine neue Instanz der [DateTime](../)‑Klasse, die den Datums‑ und Uhrzeitwert darstellt, der dem durch die angegebene Zeichenkette repräsentierten Wert entspricht.

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes in das entsprechende [DateTime](../)‑Objekt unter Verwendung des angegebenen Formats und kulturspezifischer Formatinformationen. Das Format der Zeichenkettenrepräsentation muss exakt dem angegebenen Format entsprechen. Wirft eine Ausnahme, wenn die Konvertierung fehlschlägt.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| Format | const String\& | Das Zeichenkettenformat. |
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
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Siehe auch

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
