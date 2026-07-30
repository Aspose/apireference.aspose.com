---
title: "System::DateTimeOffset Klasse"
linktitle: "DateTimeOffset"
second_title: "Aspose.Font für C++"
description: "System::DateTimeOffset Klasse. Enthält das Datum und die Uhrzeit relativ zur koordinierten Weltzeit. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Enthält das Datum und die Uhrzeit relativ zur koordinierten Weltzeit. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class DateTimeOffset
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Fügt dem [DateTimeOffset](./) Objekt ein angegebenes Zeitintervall hinzu. |
| [AddDays](./adddays/)(double) const | Fügt dem [DateTimeOffset](./) Objekt eine angegebene Anzahl von Tagen hinzu. |
| [AddHours](./addhours/)(double) const | Fügt dem [DateTimeOffset](./) Objekt eine angegebene Anzahl von Stunden hinzu. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Fügt dem [DateTimeOffset](./) Objekt eine angegebene Anzahl von Millisekunden hinzu. |
| [AddMinutes](./addminutes/)(double) const | Fügt dem [DateTimeOffset](./) Objekt eine angegebene Anzahl von Minuten hinzu. |
| [AddMonths](./addmonths/)(int) const | Fügt dem [DateTimeOffset](./) Objekt eine angegebene Anzahl von Monaten hinzu. |
| [AddSeconds](./addseconds/)(double) const | Fügt dem [DateTimeOffset](./) Objekt eine angegebene Anzahl von Sekunden hinzu. |
| [AddTicks](./addticks/)(int64_t) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Ticks hinzu. |
| [AddYears](./addyears/)(int) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Jahren hinzu. |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | Vergleicht zwei [DateTimeOffset](./)-Objekte. |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | Vergleicht zwei [DateTimeOffset](./)-Objekte. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Vergleicht zwei [DateTimeOffset](./)-Objekte. |
| [DateTimeOffset](./datetimeoffset/)() | Standardkonstruktor. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Konstruktor. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | Prüft, ob zwei [DateTimeOffset](./)-Objekte denselben Zeitpunkt darstellen. |
| [Equals](./equals/)(const DateTimeOffset\&) const | Prüft, ob zwei [DateTimeOffset](./)-Objekte denselben Zeitpunkt darstellen. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Prüft, ob zwei [DateTimeOffset](./)-Objekte denselben Zeitpunkt darstellen. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | Prüft, ob zwei [DateTimeOffset](./)-Objekte denselben Zeitpunkt darstellen und denselben Offset haben. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | Prüft, ob zwei [DateTimeOffset](./)-Objekte denselben Zeitpunkt darstellen und denselben Offset haben. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) Dateizeit in Datum und Uhrzeit mit lokalem Zeitversatz. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix-Zeit in [DateTimeOffset](./)-Objekt. |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix-Zeit in [DateTimeOffset](./)-Objekt. |
| [get_Date](./get_date/)() const | Gibt die Datumskomponente des aktuellen Objekts zurück. |
| [get_DateTime](./get_datetime/)() const | Gibt den [DateTime](../datetime/)-Wert zurück. |
| [get_Day](./get_day/)() const | Gibt den Tag des Monats des aktuellen Objekts zurück. |
| [get_DayOfWeek](./get_dayofweek/)() const | Gibt den Wochentag des aktuellen Objekts zurück. |
| [get_DayOfYear](./get_dayofyear/)() const | Gibt den Tag des Jahres des aktuellen Objekts zurück. |
| [get_Hour](./get_hour/)() const | Gibt die Stundenkomponente des aktuellen Objekts zurück. |
| [get_LocalDateTime](./get_localdatetime/)() const | Gibt den [DateTime](../datetime/)-Wert zurück, der das lokale Datum und die lokale Uhrzeit darstellt. |
| [get_Millisecond](./get_millisecond/)() const | Gibt die Millisekundenkomponente des aktuellen Objekts zurück. |
| [get_Minute](./get_minute/)() const | Gibt die Minutenkomponente des aktuellen Objekts zurück. |
| [get_Month](./get_month/)() const | Gibt die Monatskomponente des aktuellen Objekts zurück. |
| static [get_Now](./get_now/)() | Gibt das [DateTimeOffset](./) zurück, dessen Datum und Uhrzeit auf die aktuelle Ortszeit gesetzt sind und dessen Offset auf den Offset der Ortszeit gesetzt ist. |
| [get_Offset](./get_offset/)() const | Gibt den Offset zu UTC zurück. |
| [get_Second](./get_second/)() const | Gibt die Sekundenkomponente des aktuellen Objekts zurück. |
| [get_Ticks](./get_ticks/)() const | Gibt die Anzahl der Ticks des aktuellen Objekts zurück. |
| [get_TimeOfDay](./get_timeofday/)() const | Gibt die Tageszeit des aktuellen Objekts zurück. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Gibt den [DateTime](../datetime/)-Wert zurück, der das UTC-Datum und die UTC-Uhrzeit darstellt. |
| static [get_UtcNow](./get_utcnow/)() | Gibt das [DateTimeOffset](./) zurück, dessen Datum und Uhrzeit auf die aktuelle UTC‑Zeit gesetzt sind und dessen Offset [TimeSpan::Zero](../timespan/zero/) ist. |
| [get_UtcTicks](./get_utcticks/)() const | Ermittelt die Anzahl der Ticks des aktuellen Objekts in UTC-Zeit. |
| [get_Year](./get_year/)() const | Ermittelt die Jahreskomponente des aktuellen Objekts. |
| [GetHashCode](./gethashcode/)() const | Ermittelt den Hashcode für das aktuelle [DateTimeOffset](./)-Objekt. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene [DateTimeOffset](./)-Objekt unterschiedliche Datums- und Zeitwerte darstellen. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Gibt eine neue Instanz der Klasse [DateTimeOffset](./) zurück, die den Datums- und Zeitwert darstellt, der die Summe des vom aktuellen Objekt dargestellten Werts und des angegebenen Zeitintervalls ist. |
| [operator-](./operator-/)(TimeSpan) const | Gibt eine neue Instanz der Klasse [DateTimeOffset](./) zurück, die den Datums- und Zeitwert darstellt, der das Ergebnis der Subtraktion des angegebenen Zeitintervalls vom vom aktuellen Objekt dargestellten Wert ist. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Gibt eine Instanz der Klasse [TimeSpan](../timespan/) zurück, die das Zeitintervall zwischen den vom aktuellen und dem angegebenen Objekt dargestellten Datums- und Zeitwerten repräsentiert. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Zeitwert darstellt, der früher ist als der vom angegebenen [DateTimeOffset](./)-Objekt dargestellte Wert. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Zeitwert darstellt, der früher oder gleich dem vom angegebenen [DateTimeOffset](./)-Objekt dargestellten Wert ist. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene [DateTimeOffset](./)-Objekt denselben Datums- und Zeitwert darstellen. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Zeitwert darstellt, der später ist als der vom angegebenen [DateTimeOffset](./)-Objekt dargestellte Wert. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Zeitwert darstellt, der später oder gleich dem vom angegebenen [DateTimeOffset](./)-Objekt dargestellten Wert ist. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Konvertiert die angegebene Zeichenkette in das entsprechende [DateTimeOffset](./)-Objekt. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt unter Verwendung des angegebenen Formatproviders und des Formatstils. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt unter Verwendung des angegebenen Formats, des Formatproviders und des Formatstils. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt unter Verwendung der angegebenen Formate, des Formatproviders und des Formatstils. |
| [Subtract](./subtract/)(TimeSpan) const | Subtrahiert ein angegebenes Zeitintervall vom aktuellen Objekt. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Subtrahiert einen angegebenen [DateTimeOffset](./)-Wert vom aktuellen Objekt. |
| [ToFileTime](./tofiletime/)() const | Konvertiert das aktuelle Objekt in die [Windows](../../system.windows/)-Dateizeit. |
| [ToLocalTime](./tolocaltime/)() const | Konvertiert das aktuelle Objekt in ein Objekt, das die lokale Zeit darstellt. |
| [ToOffset](./tooffset/)(TimeSpan) const | Ersetzt den Offset des aktuellen Objekts durch den angegebenen Offset. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Konvertiert das aktuelle Objekt in einen String unter Verwendung des angegebenen Formats und des Formatproviders. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Konvertiert das aktuelle Objekt in einen String unter Verwendung des angegebenen Formatproviders. |
| [ToString](./tostring/)(const String\&) const | Konvertiert das aktuelle Objekt in einen String unter Verwendung des angegebenen Formats. |
| [ToString](./tostring/)() const | Konvertiert das aktuelle Objekt in einen String. |
| [ToUniversalTime](./touniversaltime/)() const | Konvertiert das aktuelle Objekt in ein Objekt, das die UTC-Zeit darstellt,. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Ermittelt die seit dem Start der Unix-Epoche vergangenen Millisekunden. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Ermittelt die seit dem Start der Unix-Epoche vergangenen Sekunden. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt zu konvertieren. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt zu konvertieren, wobei der angegebene Formatprovider und der Formatstil verwendet werden. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt zu konvertieren, wobei die angegebenen Formate, der Formatprovider und der Formatstil verwendet werden. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt zu konvertieren, wobei das angegebene Format, der Formatprovider und der Formatstil verwendet werden. |
| static [Type](./type/)() | Gibt ein [TypeInfo](../typeinfo/)-Objekt zurück, das die [TimeSpan](../timespan/)-Struktur darstellt. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Ermittelt den maximalen Offset in Ticks. |
| static [MaxValue](./maxvalue/) | Ermittelt den größten [DateTimeOffset](./)-Wert. |
| static constexpr [MinOffset](./minoffset/) | Ermittelt den minimalen Offset in Ticks. |
| static [MinValue](./minvalue/) | Ermittelt den frühesten [DateTimeOffset](./)-Wert. |
| static [UnixEpoch](./unixepoch/) | Ermittelt den Start der Unix-Epoche. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
