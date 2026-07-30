---
title: "System::Globalization::HebrewCalendar class"
linktitle: "HebrewCalendar"
second_title: "Aspose.Font per C++"
description: "System::Globalization::HebrewCalendar class. Calendario ebraico. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


Calendario ebraico. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Restituisce il tipo di algoritmo. |
| [get_Eras](./get_eras/)() const override | Restituisce l'elenco delle ere presenti nel calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto temporale massimo supportato dal calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto temporale minimo supportato dal calendario. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Restituisce il giorno della settimana per il punto temporale specificato. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Restituisce il numero di giorni nel mese specifico. |
| [GetEra](./getera/)(DateTime) const override | Restituisce l'era per il punto temporale specificato. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informazioni RTTI. |
| [GetMonth](./getmonth/)(DateTime) const override | Restituisce il mese per il punto temporale specificato. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Restituisce il numero di mesi nell'anno specificato. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Restituisce il numero di mesi nell'anno specificato. |
| [HebrewCalendar](./hebrewcalendar/)() | Costruttore. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Verifica se il giorno è bisestile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Verifica se il giorno è bisestile. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Verifica se il mese è bisestile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Verifica se il mese è bisestile. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Verifica se l'anno è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Verifica se l'anno è bisestile. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Imposta l'ultimo anno che può essere rappresentato con 2 cifre. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Costruisce l'oggetto [DateTime](../../system/datetime/) dai componenti. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Costruisce l'oggetto [DateTime](../../system/datetime/) dai componenti. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | Era ebraica corrente. |
## Vedi anche

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
