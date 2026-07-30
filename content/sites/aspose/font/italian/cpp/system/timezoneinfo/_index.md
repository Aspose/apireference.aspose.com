---
title: "classe System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Font per C++"
description: "Classe System::TimeZoneInfo. Rappresenta un'informazione che descrive un fuso orario particolare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 6300
url: /it/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Rappresenta un'informazione che descrive un fuso orario particolare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Cancella i dati del fuso orario memorizzati nella cache. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) il tempo da un fuso orario a un altro. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) il tempo nell'orario di un fuso orario specificato. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) il tempo nell'orario di un fuso orario specificato. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) il tempo nell'orario di un fuso orario specificato. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) il tempo nell'orario di un fuso orario specificato. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) il tempo nell'orario di un fuso orario specificato. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Converte l'ora UTC nell'orario di un fuso orario specificato. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Converte l'ora in ora UTC. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Converte l'ora in ora UTC. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Converte l'ora in ora UTC. PER USO INTERNO. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Crea un fuso orario personalizzato. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Crea un fuso orario personalizzato. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Crea un fuso orario personalizzato. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Determina se gli oggetti corrente e specificato sono uguali. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Ottiene il fuso orario con l'identificatore specificato. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Restituisce un'istanza di [TimeSpan](../timespan/) che rappresenta un intervallo di tempo tra l'ora standard del fuso orario corrente e l'ora UTC. |
| [get_DaylightName](./get_daylightname/)() const | Ottiene il nome per l'ora legale del fuso orario corrente. |
| [get_DisplayName](./get_displayname/)() const | Ottiene il nome del fuso orario corrente. |
| [get_Id](./get_id/)() const | Restituisce l'identificatore del fuso orario rappresentato dall'oggetto corrente. |
| static [get_Local](./get_local/)() | Restituisce un'istanza di [TimeZoneInfo](./) che rappresenta un fuso orario locale. |
| [get_StandardName](./get_standardname/)() const | Ottiene il nome per l'ora standard del fuso orario corrente. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Ottiene il flag che indica se il fuso orario ha regole di ora legale. |
| static [get_Utc](./get_utc/)() | Restituisce un'istanza di [TimeZoneInfo](./) che rappresenta un fuso orario UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Restituisce un array composto da oggetti [AdjustmentRule](./adjustmentrule/) che rappresentano le regole di aggiustamento applicabili all'oggetto [TimeZoneInfo](./) corrente. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Ottiene le date e le ore UTC a cui può essere mappata una data e ora specificate. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Ottiene le date e le ore UTC a cui può essere mappata una data e ora specificate. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Ottiene una collezione ordinata di tutti i fusi orari disponibili sul sistema locale. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Calcola la differenza tra l'ora in questo fuso orario e il fuso orario UTC per una data e ora specificate. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Calcola la differenza tra l'ora in questo fuso orario e il fuso orario UTC per una data e ora specificate. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Funzione di supporto interna che restituisce l'offset UTC per una data/ora UTC in un fuso orario specificato. PER USO INTERNO. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Funzione di supporto interna che restituisce l'offset UTC per una data/ora UTC in un fuso orario specificato. PER USO INTERNO. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Calcola la differenza tra l'ora in questo fuso orario e il fuso orario UTC per una data e ora specificate. PER USO INTERNO. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Verifica se il fuso orario corrente e un altro fuso orario hanno le stesse regole di adeguamento. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Verifica se la data e ora specificate sono ambigue e possono essere mappate a molte ore UTC. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Verifica se la data e ora specificate sono ambigue e possono essere mappate a molte ore UTC. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Verifica se la data e ora specificate rientrano nell'intervallo dell'ora legale. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Verifica se la data e ora specificate rientrano nell'intervallo dell'ora legale. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Verifica se la data e ora specificate rientrano nell'intervallo dell'ora legale. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Verifica se la data e ora specificate sono non valide. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../object/tostring/). Consente di convertire oggetti personalizzati in stringa. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Funzione di supporto che converte un anno e un [TransitionTime](./transitiontime/) in un [DateTime](../datetime/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Un alias per un puntatore condiviso a un'istanza della classe [AdjustmentRule](./adjustmentrule/). |
## Vedi anche

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
