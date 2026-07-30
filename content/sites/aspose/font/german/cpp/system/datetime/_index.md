---
title: "System::DateTime-Klasse"
linktitle: "DateTime"
second_title: "Aspose.Font für C++"
description: "System::DateTime-Klasse. Stellt einen bestimmten Datum‑ und Zeitwert im Zeitkontinuum dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse System::SmartPtr, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 1600
url: /de/cpp/system/datetime/
---
## DateTime class


Stellt einen bestimmten Datum‑ und Zeitwert im Zeitkontinuum dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](../smartptr/), um Objekte dieses Typs zu verwalten.

```cpp
class DateTime
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die einen Datum‑ und Zeitwert darstellt, der durch Hinzufügen des angegebenen Zeitintervalls zum vom aktuellen Objekt repräsentierten Datum‑ und Zeitwert entsteht. |
| [AddDays](./adddays/)(double) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von Tagen ist. |
| [AddHours](./addhours/)(double) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von Stunden ist. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von Millisekunden ist. |
| [AddMinutes](./addminutes/)(double) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von Minuten ist. |
| [AddMonths](./addmonths/)(int) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von Monaten ist. |
| [AddSeconds](./addseconds/)(double) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von Sekunden ist. |
| [AddTicks](./addticks/)(int64_t) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der die Summe des vom aktuellen Objekt repräsentierten Werts und der angegebenen Anzahl von 100‑Nanosekunden‑Intervallen ist. |
| [AddYears](./addyears/)(int) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑ und Zeitwert darstellt, der dem vom aktuellen Objekt repräsentierten Wert entspricht, wobei die Jahreskomponente um die angegebene Zahl erhöht wird. |
| static [Compare](./compare/)(DateTime, DateTime) | Vergleicht zwei Werte, die von den angegebenen Instanzen der Klasse [DateTime](./) repräsentiert werden, und gibt den Wert zurück, der die relative Position der Werte auf der Zeitlinie angibt. |
| [CompareTo](./compareto/)(DateTime) const | Vergleicht zwei Datum‑ und Zeitwerte, die vom aktuellen Objekt und der angegebenen Instanz der Klasse [DateTime](./) repräsentiert werden, und gibt den Wert zurück, der die relative Position der Werte auf der Zeitlinie angibt. |
| [DateTime](./datetime/)() | Konstruiert eine Instanz, die den kleinsten möglichen Datum‑ und Zeitwert darstellt, gleich MinValue. |
| [DateTime](./datetime/)(int, int, int) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat und Tag angegeben ist. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat und Tag im angegebenen Kalender angegeben ist. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute und Sekunde angegeben ist. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute und Sekunde angegeben ist. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute und Sekunde im angegebenen Kalender angegeben ist. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute, Sekunde und Millisekunde angegeben ist. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute, Sekunde und Millisekunde im angegebenen Kalender angegeben ist. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Konstruiere eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als Anzahl von Ticks angegeben ist. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Konstruiere eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als Anzahl von Ticks angegeben ist. FÜR INTERNEN GEBRAUCH. |
| [DateTime](./datetime/)(const DateTime\&) | Kopierkonstruiert eine Instanz. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Gibt die Anzahl der Tage im angegebenen Monat des angegebenen Jahres zurück. |
| static [Equals](./equals/)(DateTime, DateTime) | Bestimmt, ob die angegebenen Instanzen der Klasse [DateTime](./) denselben Datums‑ und Uhrzeitwert darstellen. |
| [Equals](./equals/)(DateTime) const | Bestimmt, ob die angegebene Instanz der Klasse [DateTime](./) denselben Datums‑ und Uhrzeitwert wie das aktuelle Objekt darstellt. |
| static [FromBinary](./frombinary/)(int64_t) | Deserialisiert den Datums‑ und Uhrzeitwert aus der angegebenen vorzeichenlosen 64‑Bit‑Ganzzahl und setzt die neue Instanz der Klasse [DateTime](./) auf diesen Wert. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Konvertiert die angegebene Dateizeit in eine Instanz der Klasse [DateTime](./), die denselben Datums‑ und Uhrzeitwert wie die lokale Zeit darstellt. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Konvertiert die angegebene Dateizeit in eine Instanz der Klasse [DateTime](./), die denselben Datums‑ und Uhrzeitwert wie die UTC‑Zeit darstellt. |
| static [FromOADate](./fromoadate/)(double) | Gibt eine Instanz der Klasse [DateTime](./) zurück, die den Datums‑ und Uhrzeitwert darstellt, der dem angegebenen OLE‑Automation‑Datum entspricht. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Konvertiert den angegebenen Unix‑Zeitwert in eine Instanz der Klasse [DateTime](./). FÜR INTERNEN GEBRAUCH. |
| [get_Date](./get_date/)() const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datumsteil des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwertes darstellt, wobei jede Komponente des Zeitteils auf 0 gesetzt ist. |
| [get_Day](./get_day/)() const | Gibt die Ordnungszahl des Tages im Monat zurück, die vom aktuellen Objekt dargestellt wird. |
| [get_DayOfWeek](./get_dayofweek/)() const | Gibt einen Wert zurück, der einen Wochentag darstellt, der vom aktuellen Objekt repräsentiert wird. |
| [get_DayOfYear](./get_dayofyear/)() const | Gibt die Ordnungszahl des Tages im Jahr zurück, die vom aktuellen Objekt dargestellt wird. |
| [get_Hour](./get_hour/)() const | Gibt die Stundenkomponente des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwertes zurück. |
| [get_Kind](./get_kind/)() const | Gibt den Wert zurück, der angibt, ob das vom aktuellen Objekt dargestellte Datum und die Uhrzeit ein lokales oder UTC‑Datum und -Uhrzeit ist oder keines von beidem. |
| [get_Millisecond](./get_millisecond/)() const | Gibt die Millisekundenkomponente des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwertes zurück. |
| [get_Minute](./get_minute/)() const | Gibt die Minutenkomponente des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwertes zurück. |
| [get_Month](./get_month/)() const | Gibt die Ordnungszahl des Monats im Jahr zurück, die vom aktuellen Objekt dargestellt wird. |
| static [get_Now](./get_now/)() | Gibt eine Instanz der Klasse [DateTime](./) zurück, die die aktuelle Uhrzeit als lokale Zeit darstellt. |
| [get_Second](./get_second/)() const | Gibt die Sekundenkomponente des Datums‑Uhrzeit‑Werts zurück, der vom aktuellen Objekt dargestellt wird. |
| [get_Ticks](./get_ticks/)() const | Gibt die Anzahl der 100‑Nanosekunden‑Intervalle zurück, die seit 0:00:00 UTC, dem 1. Januar 0001, im gregorianischen Kalender bis zum vom aktuellen Objekt dargestellten Datum und zur Uhrzeit vergangen sind. |
| [get_TimeOfDay](./get_timeofday/)() const | Gibt den Wert zurück, der das Zeitintervall vom Beginn des vom aktuellen Objekt dargestellten Tages bis zum vom aktuellen Objekt dargestellten Datum und zur Uhrzeit repräsentiert. |
| static [get_Today](./get_today/)() | Gibt eine Instanz der Klasse [DateTime](./) zurück, die das aktuelle Datum darstellt, wobei jede Komponente des Zeitanteils des vom Objekt dargestellten Werts auf 0 gesetzt ist. |
| static [get_UtcNow](./get_utcnow/)() | Gibt eine Instanz der Klasse [DateTime](./) zurück, die die aktuelle Uhrzeit als UTC darstellt. |
| [get_Year](./get_year/)() const | Gibt das vom aktuellen Objekt dargestellte Jahr zurück. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Liest Datumsteile. FÜR INTERNEN GEBRAUCH. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Gibt ein Array von Zeichenketten zurück, wobei jedes Element die Zeichenkettenrepräsentation des aktuellen Objekts ist, formatiert mit einem der Standard‑Datum‑und‑Uhrzeit‑Formatbezeichner. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Gibt ein Array von Zeichenketten zurück, wobei jedes Element die Zeichenkettenrepräsentation des aktuellen Objekts ist, formatiert mit dem angegebenen Standard‑Datum‑und‑Uhrzeit‑Formatbezeichner. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Gibt ein Array von Zeichenketten zurück, wobei jedes Element die Zeichenkettenrepräsentation des aktuellen Objekts ist, formatiert mit einem der Standard‑Datum‑und‑Uhrzeit‑Formatbezeichner und dem angegebenen Formatprovider. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Gibt ein Array von Zeichenketten zurück, wobei jedes Element die Zeichenkettenrepräsentation des aktuellen Objekts ist, formatiert mit dem angegebenen Standard‑Datum‑und‑Uhrzeit‑Formatbezeichner und Formatprovider. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Ermittelt, ob der vom aktuellen Objekt dargestellte Datum‑Uhrzeit‑Wert in den Zeitraum der Sommerzeit für die aktuelle Zeitzone fällt. |
| static [IsLeapYear](./isleapyear/)(int) | Ermittelt, ob das angegebene Jahr ein Schaltjahr ist. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Ermittelt, ob das aktuelle Objekt und das angegebene [DateTime](./)-Objekt unterschiedliche Datum‑Uhrzeit‑Werte repräsentieren. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑Uhrzeit‑Wert darstellt, der die Summe des vom aktuellen Objekt dargestellten Werts und des angegebenen Zeitintervalls ist. |
| [operator+=](./operator+=/)(TimeSpan) | Setzt das aktuelle Objekt auf den Datum‑Uhrzeit‑Wert, der die Summe des vom aktuellen Objekt dargestellten Werts und des angegebenen Zeitintervalls ist. |
| [operator-](./operator-/)(TimeSpan) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑Uhrzeit‑Wert darstellt, der das Ergebnis der Subtraktion des angegebenen Zeitintervalls vom vom aktuellen Objekt dargestellten Wert ist. |
| [operator-](./operator-/)(DateTime) const | Gibt eine Instanz der Klasse [TimeSpan](../timespan/) zurück, die das Zeitintervall zwischen den vom aktuellen und dem angegebenen Objekt dargestellten Datums- und Zeitwerten repräsentiert. |
| [operator-=](./operator-=/)(TimeSpan) | Setzt das aktuelle Objekt auf den Datum‑Uhrzeit‑Wert, der das Ergebnis der Subtraktion des angegebenen Zeitintervalls vom vom aktuellen Objekt dargestellten Datum‑Uhrzeit‑Wert ist. |
| [operator<](./operator_/)(DateTime) const | Ermittelt, ob das aktuelle Objekt den Datum‑Uhrzeit‑Wert darstellt, der früher ist als der vom angegebenen [DateTime](./)-Objekt dargestellte Wert. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Ermittelt, ob das aktuelle Objekt den Datum‑Uhrzeit‑Wert darstellt, der früher oder gleich dem vom angegebenen [DateTime](./)-Objekt dargestellten Wert ist. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Weist dem aktuellen Objekt den vom angegebenen [DateTime](./)-Instanz dargestellten Wert zu. |
| [operator==](./operator==/)(DateTime) const | Ermittelt, ob das aktuelle Objekt und das angegebene [DateTime](./)-Objekt denselben Datum‑Uhrzeit‑Wert repräsentieren. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Ermittelt, ob das aktuelle Objekt den Datum‑Uhrzeit‑Wert darstellt, der später ist als der vom angegebenen [DateTime](./)-Objekt dargestellte Wert. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Bestimmt, ob das aktuelle Objekt den Datums‑ und Uhrzeitwert darstellt, der später als oder derselbe ist wie der von dem angegebenen [DateTime](./)-Objekt dargestellte Wert. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt unter Verwendung kulturspezifischer Formatinformationen. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt unter Verwendung des angegebenen Formats und kulturspezifischer Formatinformationen. Das Format der Zeichenkettenrepräsentation muss exakt dem angegebenen Format entsprechen. Wirft eine Ausnahme, wenn die Konvertierung fehlschlägt. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt unter Verwendung der angegebenen Formate, kulturspezifischer Formatinformationen und des Stils. Das Format der Zeichenkettenrepräsentation muss exakt einem oder mehreren der angegebenen Formate entsprechen. Wirft eine Ausnahme, wenn die Konvertierung fehlschlägt. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Erstellt ein neues [DateTime](./)-Objekt, das die gleiche Anzahl von Ticks wie das angegebene [DateTime](./)-Objekt darstellt und lokale Zeit, UTC‑Zeit oder weder noch repräsentiert, wie durch das Argument **kind** angegeben. |
| [Subtract](./subtract/)(TimeSpan) const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den Datum‑Uhrzeit‑Wert darstellt, der das Ergebnis der Subtraktion des angegebenen Zeitintervalls vom vom aktuellen Objekt dargestellten Wert ist. |
| [Subtract](./subtract/)(DateTime) const | Gibt eine Instanz der Klasse [TimeSpan](../timespan/) zurück, die das Zeitintervall zwischen den von dem aktuellen und dem angegebenen Objekt dargestellten Datums‑ und Uhrzeitwerten repräsentiert. |
| [ToBinary](./tobinary/)() const | Serialisiert das aktuelle Objekt. |
| [ToFileTime](./tofiletime/)() const | Gibt einen Wert zurück, der den vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwert als File‑Zeit repräsentiert. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Konvertiert den vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwert in UTC‑File‑Zeit. |
| [ToLocalTime](./tolocaltime/)() const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwert als lokale Zeit repräsentiert. |
| [ToLongDateString](./tolongdatestring/)() const | Gibt eine Zeichenkette zurück, die die lange Datumszeichenkettenrepräsentation des aktuellen Objekts enthält. |
| [ToLongTimeString](./tolongtimestring/)() const | Gibt eine Zeichenkette zurück, die die lange Zeitzeichenkettenrepräsentation des aktuellen Objekts enthält. |
| [ToOADate](./tooadate/)() const | Gibt den vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwert als OLE‑Automation‑Datum zurück. |
| [ToShortDateString](./toshortdatestring/)() const | Gibt eine Zeichenkette zurück, die die kurze Datumszeichenkettenrepräsentation des aktuellen Objekts enthält. |
| [ToShortTimeString](./toshorttimestring/)() const | Gibt eine Zeichenkette zurück, die die kurze Zeitzeichenkettenrepräsentation des aktuellen Objekts enthält. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwerts zurück, wobei die von der aktuellen Kultur definierten Formatierungskonventionen verwendet werden. |
| [ToString](./tostring/)(const String\&) const | Gibt eine Zeichenkettenrepräsentation des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwerts zurück, wobei das angegebene Format und die von der aktuellen Kultur definierten Formatierungskonventionen verwendet werden. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Gibt eine Zeichenkettenrepräsentation des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwerts zurück, wobei die angegebenen Formatinformationen verwendet werden. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Gibt eine Zeichenkettenrepräsentation des vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwerts zurück, wobei die angegebenen Formatinformationen verwendet werden. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Gibt eine neue Instanz der Klasse [DateTime](./) zurück, die den vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwert als UTC repräsentiert. |
| [ToUnixTime](./tounixtime/)() const | Gibt einen Wert zurück, der den vom aktuellen Objekt dargestellten Datums‑ und Uhrzeitwert als Unix‑Zeit repräsentiert. FÜR INTERNEN GEBRAUCH. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt unter Verwendung der angegebenen kulturspezifischen Formatinformationen und des Stils. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt unter Verwendung des angegebenen Formats, kulturspezifischer Formatinformationen und des Stils. Das Format der Zeichenkettenrepräsentation muss exakt dem angegebenen Format entsprechen. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Konvertiert die angegebene Zeichenkettenrepräsentation eines Datums‑ und Uhrzeitwerts in das entsprechende [DateTime](./)-Objekt unter Verwendung der angegebenen Formate, kulturspezifischer Formatinformationen und des Stils. Das Format der Zeichenkettenrepräsentation muss exakt einem oder mehreren der angegebenen Formate entsprechen. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Gibt ein [TypeInfo](../typeinfo/)-Objekt zurück, das Informationen über diese Klasse enthält. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Die Anzahl von 100-Nanosekunden im Zeitintervall zwischen dem minimal möglichen und maximal möglichen [DateTime](./)-Wert. |
| static [MaxValue](./maxvalue/) | Eine Instanz der [DateTime](./)-Klasse, die den maximal möglichen Datum‑ und Uhrzeitwert darstellt. |
| static constexpr [MinTicks](./minticks/) | Die minimale Anzahl von Ticks, die eine Instanz der [DateTime](./)-Klasse darstellen kann. |
| static [MinValue](./minvalue/) | Eine Instanz der [DateTime](./)-Klasse, die den minimal möglichen Datum‑ und Uhrzeitwert darstellt. |
| static constexpr [TicksPerDay](./ticksperday/) | Die Anzahl der Ticks in einem Tag. |
| static constexpr [TicksPerHour](./ticksperhour/) | Die Anzahl der Ticks in einer Stunde. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Die Anzahl der Ticks in einer Mikrosekunde. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Die Anzahl der Ticks in einer Millisekunde. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Die Anzahl der Ticks in einer Minute. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Die Anzahl der Ticks in einer Sekunde. |
| static [UnixEpoch](./unixepoch/) | Eine Instanz der [DateTime](./)-Klasse, die den Start der Unix‑Epoche (1970‑01‑01 00:00:00) darstellt. |
## Hinweise



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Erstelle eine Instanz der Klasse 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // Gib die Instanz in mehreren Formaten aus.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
