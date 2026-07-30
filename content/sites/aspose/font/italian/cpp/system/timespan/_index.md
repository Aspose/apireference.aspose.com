---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "Aspose.Font per C++"
description: "System::TimeSpan class. Rappresenta un intervallo di tempo. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 6100
url: /it/cpp/system/timespan/
---
## TimeSpan class


Rappresenta un intervallo di tempo. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
class TimeSpan
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Restituisce una nuova istanza della classe [TimeSpan](./) che rappresenta un intervallo di tempo pari alla somma degli intervalli di tempo rappresentati dall'oggetto corrente e da quello specificato. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | Confronta due oggetti [TimeSpan](./). |
| [CompareTo](./compareto/)(TimeSpan) const | Confronta l'oggetto corrente e quello specificato. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Confronta l'oggetto corrente e quello specificato. |
| [Duration](./duration/)() const | Restituisce una nuova istanza dell'oggetto [TimeSpan](./) il cui valore è il valore assoluto dell'oggetto corrente. |
| [Equals](./equals/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è uguale all'intervallo di tempo rappresentato dall'oggetto specificato. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è uguale all'intervallo di tempo rappresentato dall'oggetto specificato. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Restituisce true se gli oggetti specificati rappresentano lo stesso intervallo di tempo, altrimenti false. |
| static [FromDays](./fromdays/)(double) | Restituisce un nuovo oggetto [TimeSpan](./) che rappresenta l'intervallo specificato. |
| static [FromHours](./fromhours/)(double) | Restituisce un nuovo oggetto [TimeSpan](./) che rappresenta l'intervallo specificato. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Restituisce un nuovo oggetto [TimeSpan](./) che rappresenta l'intervallo specificato. |
| static [FromMinutes](./fromminutes/)(double) | Restituisce un nuovo oggetto [TimeSpan](./) che rappresenta l'intervallo specificato. |
| static [FromSeconds](./fromseconds/)(double) | Restituisce un nuovo oggetto [TimeSpan](./) che rappresenta l'intervallo specificato. |
| static [FromTicks](./fromticks/)(int64_t) | Restituisce un nuovo oggetto [TimeSpan](./) che rappresenta l'intervallo specificato. |
| [get_Days](./get_days/)() const | Restituisce la componente giorni dell'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [get_Hours](./get_hours/)() const | Restituisce la componente ore dell'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [get_Milliseconds](./get_milliseconds/)() const | Restituisce la componente millisecondi dell'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [get_Minutes](./get_minutes/)() const | Restituisce la componente minuti dell'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [get_Seconds](./get_seconds/)() const | Restituisce la componente secondi dell'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [get_Ticks](./get_ticks/)() const | Restituisce il numero di intervalli di 100 nanosecondi che costituiscono l'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [get_TotalDays](./get_totaldays/)() const | Restituisce il valore dell'oggetto [TimeSpan](./) corrente espresso in giorni interi e frazionari. |
| [get_TotalHours](./get_totalhours/)() const | Restituisce il valore dell'oggetto [TimeSpan](./) corrente espresso in ore intere e frazionarie. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Restituisce il valore dell'oggetto [TimeSpan](./) corrente espresso in millisecondi interi e frazionari. |
| [get_TotalMinutes](./get_totalminutes/)() const | Restituisce il valore dell'oggetto [TimeSpan](./) corrente espresso in minuti interi e frazionari. |
| [get_TotalSeconds](./get_totalseconds/)() const | Restituisce il valore dell'oggetto [TimeSpan](./) corrente espresso in secondi interi e frazionari. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Restituisce una nuova istanza dell'oggetto [TimeSpan](./) che rappresenta il valore negato rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [operator!=](./operator!=/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente non è uguale all'intervallo di tempo rappresentato dall'oggetto specificato. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Restituisce una nuova istanza della classe [TimeSpan](./) che rappresenta un intervallo di tempo pari alla somma degli intervalli di tempo rappresentati dall'oggetto corrente e da quello specificato. |
| [operator+](./operator+/)() const | Restituisce se stesso. |
| [operator+=](./operator+=/)(TimeSpan) | Assegna all'oggetto corrente l'intervallo di tempo che è la somma dell'intervallo di tempo rappresentato dall'oggetto corrente e da quello specificato. |
| [operator-](./operator-/)(TimeSpan) const | Restituisce una nuova istanza della classe [TimeSpan](./) che rappresenta un intervallo di tempo risultato della sottrazione dell'intervallo di tempo rappresentato dall'oggetto specificato da quello rappresentato dall'oggetto corrente. |
| [operator-](./operator-/)() const | Restituisce una nuova istanza dell'oggetto [TimeSpan](./) che rappresenta il valore negato rappresentato dall'oggetto [TimeSpan](./) corrente. |
| [operator-=](./operator-=/)(TimeSpan) | Assegna all'oggetto corrente l'intervallo di tempo risultato della sottrazione dell'intervallo di tempo rappresentato dall'oggetto specificato da quello rappresentato dall'oggetto corrente. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è più breve dell'intervallo di tempo rappresentato dall'oggetto specificato. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è più breve o uguale all'intervallo di tempo rappresentato dall'oggetto specificato. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Imposta l'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) specificato sull'oggetto [TimeSpan](./) corrente. |
| [operator==](./operator==/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è uguale all'intervallo di tempo rappresentato dall'oggetto specificato. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è più lungo dell'intervallo di tempo rappresentato dall'oggetto specificato. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Determina se l'intervallo di tempo rappresentato dall'oggetto corrente è più lungo o uguale all'intervallo di tempo rappresentato dall'oggetto specificato. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando il provider di formato specificato. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando i formati specificati, il provider di formato e gli stili. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando il formato specificato, il provider di formato e gli stili. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Restituisce una nuova istanza della classe [TimeSpan](./) che rappresenta un intervallo di tempo risultato della sottrazione dell'intervallo di tempo rappresentato dall'oggetto specificato da quello rappresentato dall'oggetto corrente. |
| [TimeSpan](./timespan/)() | Crea un oggetto [TimeSpan](./) che rappresenta un intervallo di tempo zero. |
| explicit [TimeSpan](./timespan/)(int64_t) | Crea un'istanza della classe [TimeSpan](./) che rappresenta l'intervallo di tempo specificato. |
| [TimeSpan](./timespan/)(int, int, int) | Crea un'istanza della classe [TimeSpan](./) che rappresenta l'intervallo di tempo pari alla somma del numero specificato di ore, minuti e secondi. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Crea un'istanza della classe [TimeSpan](./) che rappresenta l'intervallo di tempo pari alla somma del numero specificato di ore, minuti, secondi e millisecondi. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Crea un oggetto [TimeSpan](./) che rappresenta l'intervallo di tempo uguale all'intervallo di tempo rappresentato dall'oggetto [TimeSpan](./) specificato. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa dell'intervallo di tempo rappresentato dall'oggetto corrente. |
| [ToString](./tostring/)(const String\&) const | Converte il valore dell'oggetto corrente in una rappresentazione stringa equivalente, utilizzando il formato specificato. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Converte il valore dell'oggetto corrente in una rappresentazione stringa equivalente, utilizzando il formato e il provider di formato specificati. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente e restituisce il risultato della conversione. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando il provider di formato specificato e restituisce il risultato della conversione. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando i formati e il provider di formato specificati, e restituisce il risultato della conversione. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando il formato, il provider di formato e gli stili specificati, e restituisce il risultato della conversione. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando i formati, il provider di formato e gli stili specificati, e restituisce il risultato della conversione. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Converte la stringa in un oggetto [TimeSpan](./) equivalente utilizzando il formato e il provider di formato specificati, e restituisce il risultato della conversione. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | Restituisce un oggetto [TypeInfo](../typeinfo/) che rappresenta la struttura [TimeSpan](./). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [MaxValue](./maxvalue/) | L'oggetto [TimeSpan](./) che rappresenta l'intervallo più lungo possibile. |
| static [MinValue](./minvalue/) | /// L'oggetto [TimeSpan](./) che rappresenta l'intervallo più breve possibile. |
| static constexpr [TicksPerDay](./ticksperday/) | Il numero di intervalli di 100 nanosecondi in un giorno (intervallo di 24 ore). |
| static constexpr [TicksPerHour](./ticksperhour/) | Il numero di intervalli di 100 nanosecondi in un'ora. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Il numero di intervalli di 100 nanosecondi in un millisecondo. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Il numero di intervalli di 100 nanosecondi in un minuto. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Il numero di intervalli di 100 nanosecondi in un secondo. |
| static [Zero](./zero/) | L'oggetto [TimeSpan](./) che rappresenta l'intervallo zero. |
## Osservazioni



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
