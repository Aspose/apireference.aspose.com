---
title: "classe System::Globalization::Calendar"
linktitle: "Calendar"
second_title: "Aspose.Font per C++"
description: "classe System::Globalization::Calendar. Calendario che definisce come le date sono gestite, calcolate, formattate, ecc. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Aggiunge giorni al punto temporale. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Aggiunge ore al punto temporale. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Aggiunge millisecondi al punto temporale. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Aggiunge minuti al punto temporale. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Aggiunge mesi al punto temporale. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Aggiunge secondi al punto temporale. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Aggiunge settimane al punto temporale. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Aggiunge anni al punto temporale. |
| [Calendar](./calendar/)(const Calendar\&) | Informazioni RTTI. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Restituisce il tipo di algoritmo. |
| [get_CurrentEra](./get_currentera/)() const | Ottiene l'indice dell'era corrente. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Ottiene il valore dell'era corrente. |
| virtual [get_Eras](./get_eras/)() const | Restituisce l'elenco delle ere presenti nel calendario. |
| virtual [get_ID](./get_id/)() const | Ottiene l'identificatore del calendario. |
| [get_IsReadOnly](./get_isreadonly/)() const | Verifica se il calendario è di sola lettura. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Punto temporale massimo supportato dal calendario. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Punto temporale minimo supportato dal calendario. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | Ottiene l'ultimo anno che può essere rappresentato con 2 cifre. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Restituisce il giorno del mese per il punto temporale specificato. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Restituisce il giorno della settimana per il punto temporale specificato. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Restituisce il giorno dell'anno per il punto temporale specificato. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Restituisce il numero di giorni nel mese specifico. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Restituisce il numero di giorni nel mese specifico. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Restituisce il numero di giorni nell'anno specifico. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Restituisce il numero di giorni nell'anno specifico. |
| virtual [GetEra](./getera/)(DateTime) const | Restituisce l'era per il punto temporale specificato. |
| virtual [GetHour](./gethour/)(DateTime) const | Ottiene le ore per il punto temporale specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Ottiene i millisecondi per il punto temporale specificato. |
| virtual [GetMinute](./getminute/)(DateTime) const | Ottiene i minuti per il punto temporale specificato. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Restituisce il mese per il punto temporale specificato. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Restituisce il numero di mesi nell'anno specificato. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Restituisce il numero di mesi nell'anno specificato. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Ottiene i secondi per il punto temporale specificato. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Ottiene la settimana dell'anno per il punto temporale specificato. |
| virtual [GetYear](./getyear/)(DateTime) const | Restituisce l'anno per il punto temporale specificato. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Verifica se il giorno è bisestile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Verifica se il giorno è bisestile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Verifica se il mese è bisestile. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Verifica se il mese è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Verifica se l'anno è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Verifica se l'anno è bisestile. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Verifica i valori di anno, mese, giorno e era. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Ottiene la versione di sola lettura del calendario. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | Imposta l'ultimo anno che può essere rappresentato con 2 cifre. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Costruisce l'oggetto [DateTime](../../system/datetime/) dai componenti. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Costruisce l'oggetto [DateTime](../../system/datetime/) dai componenti. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | Converte l'anno in un anno a 4 cifre usando la proprietà TwoDigitYearMax. |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
