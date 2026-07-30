---
title: "classe System::Globalization::HijriCalendar"
linktitle: "HijriCalendar"
second_title: "Aspose.Font per C++"
description: "classe System::Globalization::HijriCalendar. Calendario Hijri. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.globalization/hijricalendar/
---
## HijriCalendar class


Calendario Hijri. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class HijriCalendar : public System::Globalization::Calendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Restituisce il tipo di algoritmo. |
| [get_Eras](./get_eras/)() const override | Restituisce l'elenco delle ere presenti nel calendario. |
| [get_HijriAdjustment](./get_hijriadjustment/)() const | Ottiene la correzione Hijri. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto temporale massimo supportato dal calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto temporale minimo supportato dal calendario. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Restituisce il giorno della settimana per il punto temporale specificato. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informazioni RTTI. |
| [HijriCalendar](./hijricalendar/)() | Costruttore. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Verifica se il giorno è bisestile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Verifica se il giorno è bisestile. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Verifica se il mese è bisestile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Verifica se il mese è bisestile. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Verifica se l'anno è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Verifica se l'anno è bisestile. |
| [set_HijriAdjustment](./set_hijriadjustment/)(int) | Imposta la correzione Hijri. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [HijriEra](./hijriera/) | Era Hijri corrente. |
## Vedi anche

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
