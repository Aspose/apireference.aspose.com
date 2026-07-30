---
title: "System::DateTime::TryParseExact-Methode"
linktitle: "TryParseExact"
second_title: "Aspose.Font für C++"
description: "Wie man die TryParseExact-Methode der System::DateTime-Klasse in C++ verwendet."
type: docs
weight: 7000
url: /de/cpp/system/datetime/tryparseexact/
---
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums- und Uhrzeitwerts in das entsprechende [DateTime](../)-Objekt unter Verwendung der angegebenen Formate, kulturspezifischer Formatinformationen und des Stils. Das Format der Zeichenkettenrepräsentation muss exakt einem oder mehreren der angegebenen Formate entsprechen.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| Formate | const ArrayPtr\<String\>\& | Das Array der Zeichenkettenformate. |
| provider | const SharedPtr\<IFormatProvider\>\& | Das [IFormatProvider](../../iformatprovider/)‑Objekt, das kulturspezifische Formatinformationen bereitstellt. |
| styles | Globalization::DateTimeStyles | Eine bitweise Kombination der Enumerationswerte, die zusätzliche Informationen über **s**, über Stilelemente, die in **s** vorhanden sein können, oder über die Konvertierung von **s** zu einem [DateTime](../)‑Objekt liefert. |
| result | DateTime\\& | Das Ausgabeargument, das bei erfolgreicher Konvertierung das Ergebnis der Konvertierung enthält. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich ist, sonst - falsch.

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums- und Uhrzeitwerts in das entsprechende [DateTime](../)-Objekt unter Verwendung des angegebenen Formats, kulturspezifischer Formatinformationen und des Stils. Das Format der Zeichenkettenrepräsentation muss exakt dem angegebenen Format entsprechen.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Die Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwertes, die konvertiert werden soll. |
| Format | const String\& | Das Zeichenkettenformat. |
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
## DateTime::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
