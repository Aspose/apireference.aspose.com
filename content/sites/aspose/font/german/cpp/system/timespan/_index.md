---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "Aspose.Font für C++"
description: "System::TimeSpan class. Stellt ein Zeitintervall dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr‑Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 6100
url: /de/cpp/system/timespan/
---
## TimeSpan class


Stellt ein Zeitintervall dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../smartptr/) Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class TimeSpan
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Gibt eine neue Instanz der [TimeSpan](./) Klasse zurück, die ein Zeitintervall darstellt, das die Summe der von dem aktuellen und dem angegebenen Objekt dargestellten Zeitintervalle ist. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | Vergleicht zwei [TimeSpan](./)-Objekte. |
| [CompareTo](./compareto/)(TimeSpan) const | Vergleicht das aktuelle und das angegebene Objekt. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Vergleicht das aktuelle und das angegebene Objekt. |
| [Duration](./duration/)() const | Gibt eine neue Instanz des [TimeSpan](./)-Objekts zurück, dessen Wert der absolute Wert des aktuellen Objekts ist. |
| [Equals](./equals/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall dem vom angegebenen Objekt dargestellten Zeitintervall entspricht. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall dem vom angegebenen Objekt dargestellten Zeitintervall entspricht. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Gibt true zurück, wenn die angegebenen Objekte dasselbe Zeitintervall darstellen, andernfalls false. |
| static [FromDays](./fromdays/)(double) | Gibt ein neues [TimeSpan](./)-Objekt zurück, das das angegebene Intervall darstellt. |
| static [FromHours](./fromhours/)(double) | Gibt ein neues [TimeSpan](./)-Objekt zurück, das das angegebene Intervall darstellt. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Gibt ein neues [TimeSpan](./)-Objekt zurück, das das angegebene Intervall darstellt. |
| static [FromMinutes](./fromminutes/)(double) | Gibt ein neues [TimeSpan](./)-Objekt zurück, das das angegebene Intervall darstellt. |
| static [FromSeconds](./fromseconds/)(double) | Gibt ein neues [TimeSpan](./)-Objekt zurück, das das angegebene Intervall darstellt. |
| static [FromTicks](./fromticks/)(int64_t) | Gibt ein neues [TimeSpan](./)-Objekt zurück, das das angegebene Intervall darstellt. |
| [get_Days](./get_days/)() const | Gibt die Tageskomponente des vom aktuellen [TimeSpan](./)-Objekt dargestellten Zeitintervalls zurück. |
| [get_Hours](./get_hours/)() const | Gibt die Stundenkomponente des vom aktuellen [TimeSpan](./)-Objekt dargestellten Zeitintervalls zurück. |
| [get_Milliseconds](./get_milliseconds/)() const | Gibt die Millisekundenkomponente des vom aktuellen [TimeSpan](./)-Objekt dargestellten Zeitintervalls zurück. |
| [get_Minutes](./get_minutes/)() const | Gibt die Minutenkomponente des vom aktuellen [TimeSpan](./)-Objekt dargestellten Zeitintervalls zurück. |
| [get_Seconds](./get_seconds/)() const | Gibt die Sekundenkomponente des vom aktuellen [TimeSpan](./)-Objekt dargestellten Zeitintervalls zurück. |
| [get_Ticks](./get_ticks/)() const | Gibt die Anzahl der 100‑Nanosekunden‑Intervalle zurück, aus denen das vom aktuellen [TimeSpan](./)-Objekt dargestellte Zeitintervall besteht. |
| [get_TotalDays](./get_totaldays/)() const | Gibt den Wert des aktuellen [TimeSpan](./)-Objekts zurück, ausgedrückt in ganzen und Bruchteil‑Tagen. |
| [get_TotalHours](./get_totalhours/)() const | Gibt den Wert des aktuellen [TimeSpan](./)-Objekts zurück, ausgedrückt in ganzen und Bruchteil‑Stunden. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Gibt den Wert des aktuellen [TimeSpan](./)-Objekts zurück, ausgedrückt in ganzen und Bruchteil‑Millisekunden. |
| [get_TotalMinutes](./get_totalminutes/)() const | Gibt den Wert des aktuellen [TimeSpan](./)-Objekts zurück, ausgedrückt in ganzen und Bruchteil‑Minuten. |
| [get_TotalSeconds](./get_totalseconds/)() const | Gibt den Wert des aktuellen [TimeSpan](./)-Objekts zurück, ausgedrückt in ganzen und Bruchteil‑Sekunden. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Gibt eine neue Instanz des [TimeSpan](./)-Objekts zurück, das den negierten Wert des aktuellen [TimeSpan](./)-Objekts darstellt. |
| [operator!=](./operator!=/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall nicht dem vom angegebenen Objekt dargestellten Zeitintervall entspricht. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Gibt eine neue Instanz der [TimeSpan](./) Klasse zurück, die ein Zeitintervall darstellt, das die Summe der von dem aktuellen und dem angegebenen Objekt dargestellten Zeitintervalle ist. |
| [operator+](./operator+/)() const | Gibt sich selbst zurück. |
| [operator+=](./operator+=/)(TimeSpan) | Weist dem aktuellen Objekt das Zeitintervall zu, das die Summe der vom aktuellen und vom angegebenen Objekt dargestellten Zeitintervalle ist. |
| [operator-](./operator-/)(TimeSpan) const | Gibt eine neue Instanz der [TimeSpan](./)-Klasse zurück, die ein Zeitintervall darstellt, das sich aus der Subtraktion des vom angegebenen Objekt dargestellten Zeitintervalls vom vom aktuellen Objekt dargestellten Zeitintervall ergibt. |
| [operator-](./operator-/)() const | Gibt eine neue Instanz des [TimeSpan](./)-Objekts zurück, das den negierten Wert des aktuellen [TimeSpan](./)-Objekts darstellt. |
| [operator-=](./operator-=/)(TimeSpan) | Weist dem aktuellen Objekt das Zeitintervall zu, das das Ergebnis der Subtraktion des vom angegebenen Objekt dargestellten Zeitintervalls vom vom aktuellen Objekt dargestellten Zeitintervall ist. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall kürzer ist als das vom angegebenen Objekt dargestellte Zeitintervall. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall kürzer oder gleich dem vom angegebenen Objekt dargestellten Zeitintervall ist. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Setzt das Zeitintervall, das vom angegebenen [TimeSpan](./)-Objekt repräsentiert wird, auf das aktuelle [TimeSpan](./)-Objekt. |
| [operator==](./operator==/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall dem vom angegebenen Objekt dargestellten Zeitintervall entspricht. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall länger ist als das vom angegebenen Objekt dargestellte Zeitintervall. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Bestimmt, ob das vom aktuellen Objekt dargestellte Zeitintervall länger oder gleich dem vom angegebenen Objekt dargestellten Zeitintervall ist. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung des angegebenen Formatproviders. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung der angegebenen Formate, des Formatproviders und der Stile. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung des angegebenen Formats, des Formatproviders und der Stile. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Gibt eine neue Instanz der [TimeSpan](./)-Klasse zurück, die ein Zeitintervall darstellt, das sich aus der Subtraktion des vom angegebenen Objekt dargestellten Zeitintervalls vom vom aktuellen Objekt dargestellten Zeitintervall ergibt. |
| [TimeSpan](./timespan/)() | Erstellt ein [TimeSpan](./)-Objekt, das ein Nullzeitintervall darstellt. |
| explicit [TimeSpan](./timespan/)(int64_t) | Erstellt eine Instanz der [TimeSpan](./)-Klasse, die das angegebene Zeitintervall darstellt. |
| [TimeSpan](./timespan/)(int, int, int) | Erstellt eine Instanz der [TimeSpan](./)-Klasse, die das Zeitintervall darstellt, das der Summe der angegebenen Anzahl von Stunden, Minuten und Sekunden entspricht. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Erstellt eine Instanz der [TimeSpan](./)-Klasse, die das Zeitintervall darstellt, das der Summe der angegebenen Anzahl von Stunden, Minuten, Sekunden und Millisekunden entspricht. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Erstellt ein [TimeSpan](./)-Objekt, das das Zeitintervall darstellt, das dem vom angegebenen [TimeSpan](./)-Objekt dargestellten Zeitintervall entspricht. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des vom aktuellen Objekt dargestellten Zeitintervalls zurück. |
| [ToString](./tostring/)(const String\&) const | Konvertiert den Wert des aktuellen Objekts in eine entsprechende Zeichenkettenrepräsentation unter Verwendung des angegebenen Formats. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Konvertiert den Wert des aktuellen Objekts in eine entsprechende Zeichenkettenrepräsentation unter Verwendung des angegebenen Formats und des Formatproviders. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt und gibt das Ergebnis der Konvertierung zurück. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung des angegebenen Formatproviders und gibt das Ergebnis der Konvertierung zurück. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung der angegebenen Formate und des Formatproviders und gibt das Ergebnis der Konvertierung zurück. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung des angegebenen Formats, des Formatproviders und der Stile und gibt das Ergebnis der Konvertierung zurück. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung der angegebenen Formate, des Formatproviders und der Stile und gibt das Ergebnis der Konvertierung zurück. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Konvertiert eine Zeichenkette in ein entsprechendes [TimeSpan](./)-Objekt unter Verwendung des angegebenen Formats und des Formatproviders und gibt das Ergebnis der Konvertierung zurück. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | Gibt ein [TypeInfo](../typeinfo/)-Objekt zurück, das die [TimeSpan](./)-Struktur repräsentiert. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [MaxValue](./maxvalue/) | Das [TimeSpan](./)-Objekt, das das längstmögliche Intervall darstellt. |
| static [MinValue](./minvalue/) | /// Das [TimeSpan](./)-Objekt, das das kürzestmögliche Intervall darstellt. |
| static constexpr [TicksPerDay](./ticksperday/) | Die Anzahl der 100‑Nanosekunden‑Intervalle in einem Tag (24‑Stunden‑Intervall). |
| static constexpr [TicksPerHour](./ticksperhour/) | Die Anzahl der 100‑Nanosekunden‑Intervalle in einer Stunde. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Die Anzahl der 100‑Nanosekunden‑Intervalle in einer Millisekunde. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Die Anzahl der 100‑Nanosekunden‑Intervalle in einer Minute. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Die Anzahl der 100‑Nanosekunden‑Intervalle in einer Sekunde. |
| static [Zero](./zero/) | Das [TimeSpan](./)-Objekt, das ein Null‑Intervall darstellt. |
## Hinweise



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
