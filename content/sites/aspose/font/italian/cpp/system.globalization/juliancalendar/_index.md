---
title: "classe System::Globalization::JulianCalendar"
linktitle: "JulianCalendar"
second_title: "Aspose.Font per C++"
description: "Classe System::Globalization::JulianCalendar. Calendario giuliano. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1600
url: /it/cpp/system.globalization/juliancalendar/
---
## JulianCalendar class


Calendario giuliano. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class JulianCalendar : public System::Globalization::Calendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Restituisce il tipo di algoritmo. |
| [get_Eras](./get_eras/)() const override | Restituisce l'elenco delle ere presenti nel calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto temporale massimo supportato dal calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto temporale minimo supportato dal calendario. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Restituisce il numero di giorni nel mese specifico. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Restituisce il numero di giorni nel mese specifico. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Restituisce il numero di giorni nell'anno specifico. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Restituisce il numero di giorni nell'anno specifico. |
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
| [JulianCalendar](./juliancalendar/)() | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [JulianEra](./julianera/) | Era giuliana corrente. |
## Vedi anche

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
