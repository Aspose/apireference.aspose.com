---
title: "System::Globalization::KoreanCalendar class"
linktitle: "KoreanCalendar"
second_title: "Aspose.Font per C++"
description: "System::Globalization::KoreanCalendar class. Calendario coreano. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1700
url: /it/cpp/system.globalization/koreancalendar/
---
## KoreanCalendar class


Korean calendar. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class KoreanCalendar : public System::Globalization::Calendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Restituisce il tipo di algoritmo. |
| [get_Eras](./get_eras/)() const override | Restituisce l'elenco delle ere presenti nel calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto temporale massimo supportato dal calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto temporale minimo supportato dal calendario. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Restituisce il giorno del mese per il punto temporale specificato. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Restituisce il giorno della settimana per il punto temporale specificato. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Restituisce il giorno dell'anno per il punto temporale specificato. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Restituisce il numero di giorni nel mese specifico. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Restituisce il numero di giorni nel mese specifico. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Restituisce il numero di giorni nell'anno specifico. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Restituisce il numero di giorni nell'anno specifico. |
| [GetEra](./getera/)(DateTime) const override | Restituisce l'era per il punto temporale specificato. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Restituisce il mese intercalare per l'anno specificato. |
| [GetMonth](./getmonth/)(DateTime) const override | Restituisce il mese per il punto temporale specificato. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Restituisce il numero di mesi nell'anno specificato. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Informazioni RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Restituisce l'anno per il punto temporale specificato. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Verifica se il giorno è bisestile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Verifica se il giorno è bisestile. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Verifica se il mese è bisestile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Verifica se il mese è bisestile. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Verifica se l'anno è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Verifica se l'anno è bisestile. |
| [KoreanCalendar](./koreancalendar/)() | Costruttore. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Costruisce l'oggetto [DateTime](../../system/datetime/) dai componenti. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Costruisce l'oggetto [DateTime](../../system/datetime/) dai componenti. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [KoreanEra](./koreanera/) | Era coreana corrente. |
## Vedi anche

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
