---
title: "Classe System::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Font per C++"
description: "Classe System::DateTime. Rappresenta un valore di data e ora specifico sul continuum temporale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 1600
url: /it/cpp/system/datetime/
---
## DateTime class


Rappresenta un valore di data e ora specifico sul continuum temporale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
class DateTime
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta un valore di data e ora risultante dall'aggiunta dell'intervallo di tempo specificato al valore di data e ora rappresentato dall'oggetto corrente. |
| [AddDays](./adddays/)(double) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di giorni. |
| [AddHours](./addhours/)(double) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di ore. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di millisecondi. |
| [AddMinutes](./addminutes/)(double) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di minuti. |
| [AddMonths](./addmonths/)(int) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di mesi. |
| [AddSeconds](./addseconds/)(double) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di secondi. |
| [AddTicks](./addticks/)(int64_t) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora ottenuto dalla somma del valore rappresentato dall'oggetto corrente e del numero specificato di intervalli di 100 nanosecondi. |
| [AddYears](./addyears/)(int) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora uguale a quello rappresentato dall'oggetto corrente con la componente dell'anno aumentata del numero specificato. |
| static [Compare](./compare/)(DateTime, DateTime) | Confronta due valori rappresentati dalle istanze specificate della classe [DateTime](./) e restituisce il valore che indica le posizioni relative dei valori sulla linea temporale. |
| [CompareTo](./compareto/)(DateTime) const | Confronta due valori di data e ora rappresentati dall'oggetto corrente e dall'istanza specificata della classe [DateTime](./) e restituisce il valore che indica le posizioni relative dei valori sulla linea temporale. |
| [DateTime](./datetime/)() | Costruisce un'istanza che rappresenta il valore di data e ora più piccolo possibile, uguale a MinValue. |
| [DateTime](./datetime/)(int, int, int) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese e giorno particolari. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese e giorno particolari nel calendario specificato. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto e secondo particolari. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto e secondo particolari. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto e secondo particolari nel calendario specificato. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto, secondo e millisecondo particolari. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto, secondo e millisecondo particolari nel calendario specificato. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Crea un'istanza che rappresenta un valore di data e ora specificato come un numero di tick. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Crea un'istanza che rappresenta un valore di data e ora specificato come un numero di tick. PER USO INTERNO. |
| [DateTime](./datetime/)(const DateTime\&) | Copia costruttore di un'istanza. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Restituisce il numero di giorni nel mese specificato dell'anno specificato. |
| static [Equals](./equals/)(DateTime, DateTime) | Determina se le istanze specificate della classe [DateTime](./) rappresentano lo stesso valore di data e ora. |
| [Equals](./equals/)(DateTime) const | Determina se l'istanza specificata della classe [DateTime](./) rappresenta lo stesso valore di data e ora dell'oggetto corrente. |
| static [FromBinary](./frombinary/)(int64_t) | Deserializza il valore di data e ora dal numero intero senza segno a 64 bit specificato e imposta la nuova istanza della classe [DateTime](./) a quel valore. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Converte il tempo di file specificato in un'istanza della classe [DateTime](./) che rappresenta lo stesso valore di data e ora dell'ora locale. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Converte il tempo di file specificato in un'istanza della classe [DateTime](./) che rappresenta lo stesso valore di data e ora dell'ora UTC. |
| static [FromOADate](./fromoadate/)(double) | Restituisce un'istanza della classe [DateTime](./) che rappresenta il valore di data e ora equivalente alla data OLE Automation specificata. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Converte il valore di tempo Unix specificato in un'istanza della classe [DateTime](./). PER USO INTERNO. |
| [get_Date](./get_date/)() const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta la parte data della data e ora rappresentata dall'oggetto corrente, con ogni componente della parte ora impostata a 0. |
| [get_Day](./get_day/)() const | Restituisce il numero ordinale del giorno nel mese rappresentato dall'oggetto corrente. |
| [get_DayOfWeek](./get_dayofweek/)() const | Restituisce un valore che rappresenta il giorno della settimana rappresentato dall'oggetto corrente. |
| [get_DayOfYear](./get_dayofyear/)() const | Restituisce il numero ordinale del giorno nell'anno rappresentato dall'oggetto corrente. |
| [get_Hour](./get_hour/)() const | Restituisce la componente ora del valore di data e ora rappresentato dall'oggetto corrente. |
| [get_Kind](./get_kind/)() const | Restituisce il valore che indica se la data e ora rappresentata dall'oggetto corrente è una data e ora locale, UTC o nessuna delle due. |
| [get_Millisecond](./get_millisecond/)() const | Restituisce la componente millisecondo del valore di data e ora rappresentato dall'oggetto corrente. |
| [get_Minute](./get_minute/)() const | Restituisce la componente minuto del valore di data e ora rappresentato dall'oggetto corrente. |
| [get_Month](./get_month/)() const | Restituisce il numero ordinale del mese nell'anno rappresentato dall'oggetto corrente. |
| static [get_Now](./get_now/)() | Restituisce un'istanza della classe [DateTime](./) che rappresenta l'ora corrente come ora locale. |
| [get_Second](./get_second/)() const | Restituisce la componente dei secondi del valore data e ora rappresentato dall'oggetto corrente. |
| [get_Ticks](./get_ticks/)() const | Restituisce un numero di intervalli di 100 nanosecondi trascorsi dal 0:00:00 UTC, 1 gennaio 0001, nel calendario gregoriano fino alla data e ora rappresentate dall'oggetto corrente. |
| [get_TimeOfDay](./get_timeofday/)() const | Restituisce il valore che rappresenta l'intervallo di tempo dall'inizio della giornata rappresentata dall'oggetto corrente fino al valore data e ora rappresentato dall'oggetto corrente. |
| static [get_Today](./get_today/)() | Restituisce un'istanza della classe [DateTime](./) che rappresenta la data corrente con ogni componente della parte temporale del valore rappresentato dall'oggetto impostata a 0. |
| static [get_UtcNow](./get_utcnow/)() | Restituisce un'istanza della classe [DateTime](./) che rappresenta l'ora corrente come UTC. |
| [get_Year](./get_year/)() const | Restituisce l'anno rappresentato dall'oggetto corrente. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Ottiene le parti della data. PER USO INTERNO. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Restituisce un array di stringhe in cui ogni elemento è la rappresentazione testuale dell'oggetto corrente formattata con uno dei specificatori di formato data e ora standard. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Restituisce un array di stringhe in cui ogni elemento è la rappresentazione testuale dell'oggetto corrente formattata con lo specificatore di formato data e ora standard specificato. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Restituisce un array di stringhe in cui ogni elemento è la rappresentazione testuale dell'oggetto corrente formattata con uno dei specificatori di formato data e ora standard e con il provider di formato specificato. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Restituisce un array di stringhe in cui ogni elemento è la rappresentazione testuale dell'oggetto corrente formattata con lo specificatore di formato data e ora standard specificato e con il provider di formato. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Determina se il valore data e ora rappresentato dall'oggetto corrente rientra nell'intervallo dell'ora legale per il fuso orario corrente. |
| static [IsLeapYear](./isleapyear/)(int) | Determina se l'anno specificato è un anno bisestile. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Determina se l'oggetto corrente e l'oggetto [DateTime](./) specificato rappresentano valori data e ora distinti. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore data e ora che è la somma del valore rappresentato dall'oggetto corrente e dell'intervallo di tempo specificato. |
| [operator+=](./operator+=/)(TimeSpan) | Imposta l'oggetto corrente al valore data e ora che è la somma del valore rappresentato dall'oggetto corrente e dell'intervallo di tempo specificato. |
| [operator-](./operator-/)(TimeSpan) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore data e ora risultato dalla sottrazione dell'intervallo di tempo specificato dal valore rappresentato dall'oggetto corrente. |
| [operator-](./operator-/)(DateTime) const | Restituisce un'istanza della classe [TimeSpan](../timespan/) che rappresenta l'intervallo di tempo tra i valori di data e ora rappresentati dall'oggetto corrente e da quello specificato. |
| [operator-=](./operator-=/)(TimeSpan) | Imposta l'oggetto corrente al valore data e ora che è il risultato della sottrazione dell'intervallo di tempo specificato dal valore data e ora rappresentato dall'oggetto corrente. |
| [operator<](./operator_/)(DateTime) const | Determina se l'oggetto corrente rappresenta il valore data e ora che è precedente al valore rappresentato dall'oggetto [DateTime](./) specificato. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Determina se l'oggetto corrente rappresenta il valore data e ora che è precedente o uguale al valore rappresentato dall'oggetto [DateTime](./) specificato. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Assegna il valore rappresentato dall'istanza [DateTime](./) specificata all'oggetto corrente. |
| [operator==](./operator==/)(DateTime) const | Determina se l'oggetto corrente e l'oggetto [DateTime](./) specificato rappresentano lo stesso valore data e ora. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Determina se l'oggetto corrente rappresenta il valore data e ora che è successivo al valore rappresentato dall'oggetto [DateTime](./) specificato. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Determina se l'oggetto corrente rappresenta il valore di data e ora che è successivo o uguale al valore rappresentato dall'oggetto [DateTime](./) specificato. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente utilizzando informazioni di formato specifiche della cultura. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente utilizzando il formato specificato e informazioni di formato specifiche della cultura. Il formato della rappresentazione stringa deve corrispondere esattamente al formato specificato. Genera un'eccezione se la conversione fallisce. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente utilizzando i formati specificati, informazioni di formato specifiche della cultura e lo stile. Il formato della rappresentazione stringa deve corrispondere esattamente a uno o più dei formati specificati. Genera un'eccezione se la conversione fallisce. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Crea un nuovo oggetto [DateTime](./) che rappresenta lo stesso numero di tick dell'oggetto [DateTime](./) specificato e rappresenta l'ora locale, l'ora UTC o nessuna delle due, come specificato dall'argomento **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore data e ora risultato dalla sottrazione dell'intervallo di tempo specificato dal valore rappresentato dall'oggetto corrente. |
| [Subtract](./subtract/)(DateTime) const | Restituisce un'istanza della classe [TimeSpan](../timespan/) che rappresenta l'intervallo di tempo tra i valori di data e ora rappresentati dall'oggetto corrente e da quello specificato. |
| [ToBinary](./tobinary/)() const | Serializza l'oggetto corrente. |
| [ToFileTime](./tofiletime/)() const | Restituisce un valore che rappresenta il valore di data e ora rappresentato dall'oggetto corrente come File time. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Converte il valore di data e ora rappresentato dall'oggetto corrente in File time UTC. |
| [ToLocalTime](./tolocaltime/)() const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora rappresentato dall'oggetto corrente come ora locale. |
| [ToLongDateString](./tolongdatestring/)() const | Restituisce una stringa che contiene la rappresentazione della data lunga dell'oggetto corrente. |
| [ToLongTimeString](./tolongtimestring/)() const | Restituisce una stringa che contiene la rappresentazione dell'ora lunga dell'oggetto corrente. |
| [ToOADate](./tooadate/)() const | Restituisce il valore di data e ora rappresentato dall'oggetto corrente come OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | Restituisce una stringa che contiene la rappresentazione della data breve dell'oggetto corrente. |
| [ToShortTimeString](./toshorttimestring/)() const | Restituisce una stringa che contiene la rappresentazione dell'ora breve dell'oggetto corrente. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa del valore di data e ora rappresentato dall'oggetto corrente utilizzando le convenzioni di formattazione definite dalla cultura corrente. |
| [ToString](./tostring/)(const String\&) const | Restituisce una rappresentazione stringa del valore di data e ora rappresentato dall'oggetto corrente utilizzando il formato specificato e le convenzioni di formattazione definite dalla cultura corrente. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Restituisce una rappresentazione stringa del valore di data e ora rappresentato dall'oggetto corrente utilizzando le informazioni di formato specificate. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Restituisce una rappresentazione stringa del valore di data e ora rappresentato dall'oggetto corrente utilizzando le informazioni di formato specificate. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Restituisce una nuova istanza della classe [DateTime](./) che rappresenta il valore di data e ora rappresentato dall'oggetto corrente come UTC. |
| [ToUnixTime](./tounixtime/)() const | Restituisce un valore che rappresenta il valore di data e ora rappresentato dall'oggetto corrente come Unix time. PER USO INTERNO. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente utilizzando le informazioni di formato specifiche della cultura e lo stile specificati. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente utilizzando il formato specificato, le informazioni di formato specifiche della cultura e lo stile. Il formato della rappresentazione stringa deve corrispondere esattamente al formato specificato. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](./) equivalente utilizzando i formati specificati, le informazioni di formato specifiche della cultura e lo stile. Il formato della rappresentazione stringa deve corrispondere esattamente a uno o più dei formati specificati. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Restituisce un oggetto [TypeInfo](../typeinfo/) che contiene informazioni su questa classe. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Il numero di 100 nanosecondi nell'intervallo di tempo tra il valore minimo possibile e quello massimo possibile di [DateTime](./). |
| static [MaxValue](./maxvalue/) | Un'istanza della classe [DateTime](./) che rappresenta il valore di data e ora massimo possibile. |
| static constexpr [MinTicks](./minticks/) | Il numero minimo di tick che un'istanza della classe [DateTime](./) può rappresentare. |
| static [MinValue](./minvalue/) | Un'istanza della classe [DateTime](./) che rappresenta il valore di data e ora minimo possibile. |
| static constexpr [TicksPerDay](./ticksperday/) | Il numero di tick in un giorno. |
| static constexpr [TicksPerHour](./ticksperhour/) | Il numero di tick in un'ora. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Il numero di tick in un microsecondo. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Il numero di tick in un millisecondo. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Il numero di tick in un minuto. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Il numero di tick in un secondo. |
| static [UnixEpoch](./unixepoch/) | Un'istanza della classe [DateTime](./) che rappresenta l'inizio dell'epoca Unix (1970.01.01 00:00:00). |
## Osservazioni



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Crea l'istanza della classe 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // Stampa l'istanza in diversi formati.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
