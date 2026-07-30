---
title: "System::TimeZoneInfo Klasse"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Font für C++"
description: "System::TimeZoneInfo Klasse. Stellt eine Information dar, die eine bestimmte Zeitzone beschreibt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 6300
url: /de/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Stellt eine Information dar, die eine bestimmte Zeitzone beschreibt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Zwischengespeicherte Zeitzonendaten löschen. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) Zeit von einer Zeitzone in eine andere konvertieren. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) Zeit in die Zeit einer angegebenen Zeitzone konvertieren. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) Zeit in die Zeit einer angegebenen Zeitzone konvertieren. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) Zeit in die Zeit einer angegebenen Zeitzone konvertieren. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) Zeit in die Zeit einer angegebenen Zeitzone konvertieren. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) Zeit in die Zeit einer angegebenen Zeitzone konvertieren. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Konvertiert UTC-Zeit in die Zeit einer angegebenen Zeitzone. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Konvertiert Zeit in UTC-Zeit. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Konvertiert Zeit in UTC-Zeit. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Konvertiert Zeit in UTC-Zeit. NUR FÜR INTERNEN GEBRAUCH. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Erstellt eine benutzerdefinierte Zeitzone. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Erstellt eine benutzerdefinierte Zeitzone. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Erstellt eine benutzerdefinierte Zeitzone. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Bestimmt, ob das aktuelle und das angegebene Objekt gleich sind. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Liefert die Zeitzone mit dem angegebenen Bezeichner. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Gibt eine Instanz von [TimeSpan](../timespan/) zurück, die ein Zeitintervall zwischen der Standardzeit der aktuellen Zeitzone und der UTC-Zeit darstellt. |
| [get_DaylightName](./get_daylightname/)() const | Liefert den Namen der Sommerzeit der aktuellen Zeitzone. |
| [get_DisplayName](./get_displayname/)() const | Liefert den Namen der aktuellen Zeitzone. |
| [get_Id](./get_id/)() const | Gibt den Bezeichner der Zeitzone zurück, die vom aktuellen Objekt repräsentiert wird. |
| static [get_Local](./get_local/)() | Gibt eine Instanz von [TimeZoneInfo](./) zurück, die eine lokale Zeitzone darstellt. |
| [get_StandardName](./get_standardname/)() const | Liefert den Namen der Standardzeit der aktuellen Zeitzone. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Liefert ein Flag, das angibt, ob die Zeitzone Regeln für die Sommerzeit hat. |
| static [get_Utc](./get_utc/)() | Gibt eine Instanz von [TimeZoneInfo](./) zurück, die eine UTC-Zeitzone darstellt. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Gibt ein Array zurück, das aus [AdjustmentRule](./adjustmentrule/)-Objekten besteht, die Anpassungsregeln darstellen, die auf das aktuelle [TimeZoneInfo](./)-Objekt angewendet werden. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Liefert UTC-Daten und -Uhrzeiten, auf die ein angegebenes Datum und eine angegebene Uhrzeit abgebildet werden können. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Liefert UTC-Daten und -Uhrzeiten, auf die ein angegebenes Datum und eine angegebene Uhrzeit abgebildet werden können. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Liefert eine sortierte Sammlung aller auf dem lokalen System verfügbaren Zeitzonen. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Berechnet die Differenz zwischen der Zeit in dieser Zeitzone und der UTC-Zeitzone für ein angegebenes Datum und eine angegebene Uhrzeit. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Berechnet die Differenz zwischen der Zeit in dieser Zeitzone und der UTC-Zeitzone für ein angegebenes Datum und eine angegebene Uhrzeit. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Interne Hilfsfunktion, die den UTC-Offset für ein UTC-Datum/Zeit in einer angegebenen Zeitzone zurückgibt. ZUR INTERNEN VERWENDUNG. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Interne Hilfsfunktion, die den UTC-Offset für ein UTC-Datum/Zeit in einer angegebenen Zeitzone zurückgibt. ZUR INTERNEN VERWENDUNG. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Berechnet die Differenz zwischen der Zeit in dieser Zeitzone und der UTC-Zeitzone für ein angegebenes Datum und eine angegebene Uhrzeit. ZUR INTERNEN VERWENDUNG. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Prüft, ob die aktuelle und eine andere Zeitzone dieselben Anpassungsregeln haben. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Prüft, ob das angegebene Datum und die angegebene Uhrzeit mehrdeutig ist und auf viele UTC-Zeiten abgebildet werden kann. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Prüft, ob das angegebene Datum und die angegebene Uhrzeit mehrdeutig ist und auf viele UTC-Zeiten abgebildet werden kann. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Prüft, ob das angegebene Datum und die angegebene Uhrzeit in den Zeitraum der Sommerzeit fällt. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Prüft, ob das angegebene Datum und die angegebene Uhrzeit in den Zeitraum der Sommerzeit fällt. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Prüft, ob das angegebene Datum und die angegebene Uhrzeit in den Zeitraum der Sommerzeit fällt. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Prüft, ob das angegebene Datum und die angegebene Uhrzeit ungültig ist. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Hilfsfunktion, die ein Jahr und [TransitionTime](./transitiontime/) in ein [DateTime](../datetime/) umwandelt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Ein Alias für einen Shared Pointer auf eine Instanz der Klasse [AdjustmentRule](./adjustmentrule/). |
## Siehe auch

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
