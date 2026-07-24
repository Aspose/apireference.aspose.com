---
title: "System::Globalization::RegionInfo classe"
linktitle: "RegionInfo"
second_title: "Aspose.Page per C++"
description: "System::Globalization::RegionInfo classe. Fornisce informazioni sulla regione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.globalization/regioninfo/
---
## RegionInfo class


Fornisce informazioni sulla regione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class RegionInfo : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | Ottiene il nome inglese della valuta. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | Ottiene il nome nativo della valuta. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | Ottiene il simbolo della valuta. |
| static [get_CurrentRegion](./get_currentregion/)() | Ottiene la regione impostata nel sistema. |
| virtual [get_DisplayName](./get_displayname/)() const | Ottiene il nome completo della regione. |
| virtual [get_EnglishName](./get_englishname/)() const | Ottiene il nome inglese della regione. |
| virtual [get_GeoId](./get_geoid/)() const | Ottiene l'identificatore unico per una regione. |
| virtual [get_IsMetric](./get_ismetric/)() const | Verifica se la regione utilizza il sistema metrico. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | Ottiene il simbolo ISO della valuta. |
| virtual [get_Name](./get_name/)() const | Ottiene il nome della regione. |
| virtual [get_NativeName](./get_nativename/)() const | Ottiene il nome nativo della regione. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | Ottiene il codice ISO della regione a 3 lettere. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | Ottiene il codice della regione a 3 lettere di [Windows](../../system.windows/). |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | Ottiene il codice ISO della regione a 2 lettere. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | Informazioni RTTI. |
| [RegionInfo](./regioninfo/)(int) | Costruttore. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
