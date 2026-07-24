---
title: "System::DateTimeOffset Klasse"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page für C++"
description: "System::DateTimeOffset Klasse. Enthält das Datum und die Uhrzeit relativ zur koordinierten Weltzeit (UTC). Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Enthält das Datum und die Uhrzeit relativ zur koordinierten Weltzeit (UTC). Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class DateTimeOffset
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Fügt dem [DateTimeOffset](./)-Objekt ein angegebenes Zeitintervall hinzu. |
| [AddDays](./adddays/)(double) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Tagen hinzu. |
| [AddHours](./addhours/)(double) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Stunden hinzu. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Millisekunden hinzu. |
| [AddMinutes](./addminutes/)(double) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Minuten hinzu. |
| [AddMonths](./addmonths/)(int) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Monaten hinzu. |
| [AddSeconds](./addseconds/)(double) const | Fügt dem [DateTimeOffset](./)-Objekt eine angegebene Anzahl von Sekunden hinzu. |
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
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) Dateizeit in Datum und Uhrzeit mit lokalem Zeit-Offset umwandeln. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix-Zeit in ein [DateTimeOffset](./)-Objekt umwandeln. |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix-Zeit in ein [DateTimeOffset](./)-Objekt umwandeln. |
| [get_Date](./get_date/)() const | Ermittelt die Datumskomponente des aktuellen Objekts. |
| [get_DateTime](./get_datetime/)() const | Ermittelt den [DateTime](../datetime/)-Wert. |
| [get_Day](./get_day/)() const | Ermittelt den Tag des Monats des aktuellen Objekts. |
| [get_DayOfWeek](./get_dayofweek/)() const | Ermittelt den Wochentag des aktuellen Objekts. |
| [get_DayOfYear](./get_dayofyear/)() const | Ermittelt den Tag des Jahres des aktuellen Objekts. |
| [get_Hour](./get_hour/)() const | Ermittelt die Stundenkomponente des aktuellen Objekts. |
| [get_LocalDateTime](./get_localdatetime/)() const | Ermittelt den [DateTime](../datetime/)-Wert, der das lokale Datum und die lokale Uhrzeit darstellt. |
| [get_Millisecond](./get_millisecond/)() const | Ermittelt die Millisekundenkomponente des aktuellen Objekts. |
| [get_Minute](./get_minute/)() const | Ermittelt die Minutenkomponente des aktuellen Objekts. |
| [get_Month](./get_month/)() const | Ermittelt die Monatskomponente des aktuellen Objekts. |
| static [get_Now](./get_now/)() | Ermittelt ein [DateTimeOffset](./), dessen Datum und Uhrzeit auf die aktuelle lokale Zeit gesetzt sind und dessen Offset auf den Offset der lokalen Zeit gesetzt ist. |
| [get_Offset](./get_offset/)() const | Ermittelt den Offset zu UTC. |
| [get_Second](./get_second/)() const | Ermittelt die Sekundenkomponente des aktuellen Objekts. |
| [get_Ticks](./get_ticks/)() const | Ermittelt die Anzahl der Ticks des aktuellen Objekts. |
| [get_TimeOfDay](./get_timeofday/)() const | Ermittelt die Tageszeit des aktuellen Objekts. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Ermittelt den [DateTime](../datetime/)-Wert, der das UTC-Datum und die UTC-Uhrzeit darstellt. |
| static [get_UtcNow](./get_utcnow/)() | Ermittelt ein [DateTimeOffset](./), dessen Datum und Uhrzeit auf die aktuelle UTC-Zeit gesetzt sind und dessen Offset [TimeSpan::Zero](../timespan/zero/) ist. |
| [get_UtcTicks](./get_utcticks/)() const | Ermittelt die Anzahl der Ticks des aktuellen Objekts in UTC-Zeit. |
| [get_Year](./get_year/)() const | Ermittelt die Jahreskomponente des aktuellen Objekts. |
| [GetHashCode](./gethashcode/)() const | Ermittelt den Hashcode für das aktuelle [DateTimeOffset](./)-Objekt. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene [DateTimeOffset](./)-Objekt unterschiedliche Datums- und Uhrzeitwerte darstellen. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Gibt eine neue Instanz der [DateTimeOffset](./)-Klasse zurück, die den Datums- und Uhrzeitwert darstellt, der die Summe des vom aktuellen Objekt dargestellten Werts und des angegebenen Zeitintervalls ist. |
| [operator-](./operator-/)(TimeSpan) const | Gibt eine neue Instanz der [DateTimeOffset](./)-Klasse zurück, die den Datums- und Uhrzeitwert darstellt, der das Ergebnis der Subtraktion des angegebenen Zeitintervalls vom vom aktuellen Objekt dargestellten Wert ist. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Gibt eine Instanz der [TimeSpan](../timespan/)-Klasse zurück, die das Zeitintervall zwischen den vom aktuellen bzw. dem angegebenen Objekt dargestellten Datums- und Uhrzeitwerten darstellt. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Uhrzeitwert darstellt, der früher liegt als der vom angegebenen [DateTimeOffset](./)-Objekt dargestellte Wert. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Uhrzeitwert darstellt, der früher oder gleich dem vom angegebenen [DateTimeOffset](./)-Objekt dargestellten Wert ist. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene [DateTimeOffset](./)-Objekt denselben Datums- und Uhrzeitwert darstellen. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Uhrzeitwert darstellt, der später liegt als der vom angegebenen [DateTimeOffset](./)-Objekt dargestellte Wert. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Bestimmt, ob das aktuelle Objekt den Datums- und Uhrzeitwert darstellt, der später oder gleich dem vom angegebenen [DateTimeOffset](./)-Objekt dargestellten Wert ist. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Konvertiert die angegebene Zeichenfolge in das [DateTimeOffset](./)-Äquivalent. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenfolge in ein [DateTimeOffset](./)-Objekt unter Verwendung des angegebenen Formatproviders und des Formatstils. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenfolge in ein [DateTimeOffset](./)-Objekt unter Verwendung des angegebenen Formats, des Formatproviders und des Formatstils. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenfolge in ein [DateTimeOffset](./)-Objekt unter Verwendung der angegebenen Formate, des Formatproviders und des Formatstils. |
| [Subtract](./subtract/)(TimeSpan) const | Subtrahiert ein angegebenes Zeitintervall vom aktuellen Objekt. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Subtrahiert einen angegebenen [DateTimeOffset](./)-Wert vom aktuellen Objekt. |
| [ToFileTime](./tofiletime/)() const | Konvertiert das aktuelle Objekt in die [Windows](../../system.windows/)-Dateizeit. |
| [ToLocalTime](./tolocaltime/)() const | Konvertiert das aktuelle Objekt in ein Objekt, das die lokale Zeit darstellt. |
| [ToOffset](./tooffset/)(TimeSpan) const | Ersetzt den Offset des aktuellen Objekts durch den angegebenen Offset. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Konvertiert das aktuelle Objekt in einen String unter Verwendung des angegebenen Formats und des Formatproviders. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Konvertiert das aktuelle Objekt in einen String unter Verwendung des angegebenen Formatproviders. |
| [ToString](./tostring/)(const String\&) const | Konvertiert das aktuelle Objekt in einen String unter Verwendung des angegebenen Formats. |
| [ToString](./tostring/)() const | Konvertiert das aktuelle Objekt in einen String. |
| [ToUniversalTime](./touniversaltime/)() const | Konvertiert das aktuelle Objekt in ein Objekt, das die UTC-Zeit darstellt. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Ermittelt die seit Beginn der Unix-Epoche verstrichenen Millisekunden. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Ermittelt die seit dem Beginn der Unix-Epoche vergangenen Sekunden. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](./)-Objekt zu konvertieren. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette unter Verwendung des angegebenen Formatproviders und des Formatierungsstils in ein [DateTimeOffset](./)-Objekt zu konvertieren. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette unter Verwendung der angegebenen Formate, des Formatproviders und des Formatierungsstils in ein [DateTimeOffset](./)-Objekt zu konvertieren. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Versucht, die angegebene Zeichenkette unter Verwendung des angegebenen Formats, des Formatproviders und des Formatierungsstils in ein [DateTimeOffset](./)-Objekt zu konvertieren. |
| static [Type](./type/)() | Gibt ein [TypeInfo](../typeinfo/)-Objekt zurück, das die [TimeSpan](../timespan/)-Struktur repräsentiert. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Ermittelt den maximalen Versatz in Ticks. |
| static [MaxValue](./maxvalue/) | Ermittelt den größten [DateTimeOffset](./)-Wert. |
| static constexpr [MinOffset](./minoffset/) | Ermittelt den minimalen Versatz in Ticks. |
| static [MinValue](./minvalue/) | Ermittelt den frühesten [DateTimeOffset](./)-Wert. |
| static [UnixEpoch](./unixepoch/) | Ermittelt den Beginn der Unix-Epoche. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
