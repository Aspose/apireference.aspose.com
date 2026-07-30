---
title: "System::Globalization::ChineseLunisolarCalendar classe"
linktitle: "ChineseLunisolarCalendar"
second_title: "Aspose.Font per C++"
description: "System::Globalization::ChineseLunisolarCalendar classe. Calendario lunisolare cinese. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.globalization/chineselunisolarcalendar/
---
## ChineseLunisolarCalendar class


Calendario lunisolare cinese. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ChineseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ChineseLunisolarCalendar](./chineselunisolarcalendar/)() | Costruttore predefinito. |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [get_Eras](./get_eras/)() const override | Restituisce l'elenco delle ere presenti nel calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto temporale massimo supportato dal calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto temporale minimo supportato dal calendario. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Restituisce il numero di giorni nel mese specifico. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Restituisce il numero di giorni nel mese specifico. |
| [GetEra](./getera/)(DateTime) const override | Restituisce l'era per il punto temporale specificato. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Restituisce il mese intercalare per l'anno specificato. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Restituisce il numero di mesi nell'anno specificato. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Informazioni RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Verifica se il giorno è bisestile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Verifica se il giorno è bisestile. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Verifica se il mese è bisestile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Verifica se il mese è bisestile. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Verifica se l'anno è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Verifica se l'anno è bisestile. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [ChineseEra](./chineseera/) | Era cinese corrente. |
## Vedi anche

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
