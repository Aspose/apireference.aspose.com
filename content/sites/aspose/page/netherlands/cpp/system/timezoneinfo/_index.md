---
title: "System::TimeZoneInfo klasse"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Page voor C++"
description: "System::TimeZoneInfo klasse. Vertegenwoordigt een informatie die een bepaalde tijdzone beschrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 6300
url: /nl/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Vertegenwoordigt een informatie die een bepaalde tijdzone beschrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Wis gecachte tijdzonegegevens. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) tijd van de ene tijdzone naar de andere. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) tijd naar de tijd in een opgegeven tijdzone. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) tijd naar de tijd in een opgegeven tijdzone. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) tijd naar de tijd in een opgegeven tijdzone. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) tijd naar de tijd in een opgegeven tijdzone. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) tijd naar de tijd in een opgegeven tijdzone. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Converteert UTC-tijd naar de tijd in een opgegeven tijdzone. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Converteert tijd naar UTC-tijd. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Converteert tijd naar UTC-tijd. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Converteert tijd naar UTC-tijd. VOOR INTERN GEBRUIK. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Maakt een aangepaste tijdzone. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Maakt een aangepaste tijdzone. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Maakt een aangepaste tijdzone. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Bepaalt of de huidige en opgegeven objecten gelijk zijn. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Haalt tijdzone op met opgegeven identifier. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Retourneert een instantie van [TimeSpan](../timespan/) die een tijdsinterval vertegenwoordigt tussen de standaardtijd van de huidige tijdzone en UTC-tijd. |
| [get_DaylightName](./get_daylightname/)() const | Haalt de naam op voor de zomertijd van de huidige tijdzone. |
| [get_DisplayName](./get_displayname/)() const | Haalt de naam op voor de huidige tijdzone. |
| [get_Id](./get_id/)() const | Retourneert de identifier van de tijdzone die door het huidige object wordt vertegenwoordigd. |
| static [get_Local](./get_local/)() | Retourneert een instantie van [TimeZoneInfo](./) die een lokale tijdzone vertegenwoordigt. |
| [get_StandardName](./get_standardname/)() const | Haalt de naam op voor de standaardtijd van de huidige tijdzone. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Haalt de vlag op die aangeeft of de tijdzone regels voor zomertijd heeft. |
| static [get_Utc](./get_utc/)() | Retourneert een instantie van [TimeZoneInfo](./) die een UTC-tijdzone vertegenwoordigt. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Retourneert een array bestaande uit [AdjustmentRule](./adjustmentrule/) objecten die de aanpassingsregels weergeven die van toepassing zijn op het huidige [TimeZoneInfo](./) object. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Haalt UTC-datums en -tijden op waarnaar een opgegeven datum en tijd kan worden gemapt. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Haalt UTC-datums en -tijden op waarnaar een opgegeven datum en tijd kan worden gemapt. |
| [GetHashCode](./gethashcode/)() const override | Analoge van de C#-methode [Object.GetHashCode()](../object/gethashcode/). Maakt het hashen van aangepaste objecten mogelijk. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Haalt een gesorteerde collectie op van alle tijdzones die beschikbaar zijn op het lokale systeem. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Berekent het verschil tussen de tijd in deze tijdzone en de UTC-tijdzone voor een opgegeven datum en tijd. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Berekent het verschil tussen de tijd in deze tijdzone en de UTC-tijdzone voor een opgegeven datum en tijd. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Interne hulpfunctie die de UTC-offset retourneert voor een UTC-datumtijd in een opgegeven tijdzone. VOOR INTERN GEBRUIK. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Interne hulpfunctie die de UTC-offset retourneert voor een UTC-datumtijd in een opgegeven tijdzone. VOOR INTERN GEBRUIK. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Berekent het verschil tussen de tijd in deze tijdzone en de UTC-tijdzone voor een opgegeven datum en tijd. VOOR INTERN GEBRUIK. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Controleert of de huidige en een andere tijdzone dezelfde aanpassingsregels hebben. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Controleert of de opgegeven datum en tijd dubbelzinnig is en naar meerdere UTC-tijden kan worden gemapt. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Controleert of de opgegeven datum en tijd dubbelzinnig is en naar meerdere UTC-tijden kan worden gemapt. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Controleert of de opgegeven datum en tijd binnen de periode van zomertijd valt. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Controleert of de opgegeven datum en tijd binnen de periode van zomertijd valt. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Controleert of de opgegeven datum en tijd binnen de periode van zomertijd valt. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Controleert of de opgegeven datum en tijd ongeldig is. |
| [ToString](./tostring/)() const override | Analoge van de C#-methode [Object.ToString()](../object/tostring/). Maakt het converteren van aangepaste objecten naar een string mogelijk. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Hulpfunctie die een jaar en [TransitionTime](./transitiontime/) converteert naar een [DateTime](../datetime/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Een alias voor een gedeelde pointer naar een instantie van de klasse [AdjustmentRule](./adjustmentrule/). |
## Zie ook

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
