---
title: "System::TimeZoneInfo::AdjustmentRule klasse"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page voor C++"
description: "System::TimeZoneInfo::AdjustmentRule klasse. Biedt informatie over een tijdzone-aanpassing. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3300
url: /nl/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Biedt informatie over een tijdzone‑aanpassing. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Construeert een instantie van de klasse [AdjustmentRule](./) die een tijdsaanpassingsregel vertegenwoordigt, beschreven met de opgegeven parameters. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Construeert een instantie van de klasse [AdjustmentRule](./) die een tijdsaanpassingsregel vertegenwoordigt, beschreven met de opgegeven parameters. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Retourneert een delta ten opzichte van de standaard UTC‑offset. |
| [get_DateEnd](./get_dateend/)() const | Retourneert een [DateTime](../../datetime/) object dat de datum en tijd weergeeft waarop de aanpassingsregel niet meer van kracht is. |
| [get_DateStart](./get_datestart/)() const | Retourneert een [DateTime](../../datetime/) object dat de datum en tijd weergeeft waarop de aanpassingsregel van kracht wordt. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Retourneert een [TimeSpan](../../timespan/) object dat de hoeveelheid tijd weergeeft die nodig is om de zomertijd van de tijdzone te vormen. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Retourneert de informatie over de overgang van standaardtijd naar zomertijd. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Retourneert de informatie over de overgang van zomertijd naar standaardtijd. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | VOOR INTERN GEBRUIK. |
| [GetHashCode](./gethashcode/)() const override | Analoge van de C#-methode [Object.GetHashCode()](../../object/gethashcode/). Maakt het hashen van aangepaste objecten mogelijk. |
## Zie ook

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
