---
title: "System::TimeZoneInfo::AdjustmentRule classe"
linktitle: "AdjustmentRule"
second_title: "Aspose.Font per C++"
description: "System::TimeZoneInfo::AdjustmentRule classe. Fornisce informazioni su una regolazione del fuso orario. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3300
url: /it/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Fornisce informazioni su una regolazione del fuso orario. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../makeobject/). Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Costruisce un'istanza della classe [AdjustmentRule](./) che rappresenta una regola di aggiustamento del tempo descritta con i parametri specificati. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Costruisce un'istanza della classe [AdjustmentRule](./) che rappresenta una regola di aggiustamento del tempo descritta con i parametri specificati. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Restituisce un delta dall'offset UTC predefinito. |
| [get_DateEnd](./get_dateend/)() const | Restituisce un oggetto [DateTime](../../datetime/) che rappresenta la data e l'ora in cui la regola di aggiustamento cessa di essere efficace. |
| [get_DateStart](./get_datestart/)() const | Restituisce un oggetto [DateTime](../../datetime/) che rappresenta la data e l'ora in cui la regola di aggiustamento entra in vigore. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Restituisce un oggetto [TimeSpan](../../timespan/) che rappresenta la quantità di tempo necessaria per formare l'ora legale del fuso orario. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Restituisce le informazioni sulla transizione dall'ora standard all'ora legale. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Restituisce le informazioni sulla transizione dall'ora legale all'ora standard. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | PER USO INTERNO. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
## Vedi anche

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
