---
title: "classe System::DateTimeOffset"
linktitle: "DateTimeOffset"
second_title: "Aspose.Font per C++"
description: "classe System::DateTimeOffset. Contiene la data e l'ora del giorno relative al Tempo Universale Coordinato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1700
url: /it/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Contiene la data e l'ora del giorno relative al Tempo Universale Coordinato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DateTimeOffset
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Aggiunge un intervallo di tempo specificato all'oggetto [DateTimeOffset](./). |
| [AddDays](./adddays/)(double) const | Aggiunge un numero specificato di giorni all'oggetto [DateTimeOffset](./). |
| [AddHours](./addhours/)(double) const | Aggiunge un numero specificato di ore all'oggetto [DateTimeOffset](./). |
| [AddMilliseconds](./addmilliseconds/)(double) const | Aggiunge un numero specificato di millisecondi all'oggetto [DateTimeOffset](./). |
| [AddMinutes](./addminutes/)(double) const | Aggiunge un numero specificato di minuti all'oggetto [DateTimeOffset](./). |
| [AddMonths](./addmonths/)(int) const | Aggiunge un numero specificato di mesi all'oggetto [DateTimeOffset](./). |
| [AddSeconds](./addseconds/)(double) const | Aggiunge un numero specificato di secondi all'oggetto [DateTimeOffset](./). |
| [AddTicks](./addticks/)(int64_t) const | Aggiunge un numero specificato di tick all'oggetto [DateTimeOffset](./). |
| [AddYears](./addyears/)(int) const | Aggiunge un numero specificato di anni all'oggetto [DateTimeOffset](./). |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | Confronta due oggetti [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | Confronta due oggetti [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Confronta due oggetti [DateTimeOffset](./). |
| [DateTimeOffset](./datetimeoffset/)() | Costruttore predefinito. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Costruttore. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Costruttore. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Costruttore. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Costruttore. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Costruttore. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Costruttore. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | Verifica se due oggetti [DateTimeOffset](./) rappresentano lo stesso istante temporale. |
| [Equals](./equals/)(const DateTimeOffset\&) const | Verifica se due oggetti [DateTimeOffset](./) rappresentano lo stesso istante temporale. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Verifica se due oggetti [DateTimeOffset](./) rappresentano lo stesso istante temporale. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | Verifica se due oggetti [DateTimeOffset](./) rappresentano lo stesso istante temporale e hanno lo stesso offset. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | Verifica se due oggetti [DateTimeOffset](./) rappresentano lo stesso istante temporale e hanno lo stesso offset. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) file time in data e ora con offset locale. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix-time in oggetto [DateTimeOffset](./). |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix-time in oggetto [DateTimeOffset](./). |
| [get_Date](./get_date/)() const | Ottiene la componente data dell'oggetto corrente. |
| [get_DateTime](./get_datetime/)() const | Ottiene il valore [DateTime](../datetime/). |
| [get_Day](./get_day/)() const | Ottiene il giorno del mese dell'oggetto corrente. |
| [get_DayOfWeek](./get_dayofweek/)() const | Ottiene il giorno della settimana dell'oggetto corrente. |
| [get_DayOfYear](./get_dayofyear/)() const | Ottiene il giorno dell'anno dell'oggetto corrente. |
| [get_Hour](./get_hour/)() const | Ottiene la componente ora dell'oggetto corrente. |
| [get_LocalDateTime](./get_localdatetime/)() const | Ottiene il valore [DateTime](../datetime/) che rappresenta la data e l'ora locali. |
| [get_Millisecond](./get_millisecond/)() const | Ottiene la componente millisecondo dell'oggetto corrente. |
| [get_Minute](./get_minute/)() const | Ottiene la componente minuto dell'oggetto corrente. |
| [get_Month](./get_month/)() const | Ottiene la componente mese dell'oggetto corrente. |
| static [get_Now](./get_now/)() | Ottiene il [DateTimeOffset](./) la cui data e ora sono impostate all'ora locale corrente e il cui offset è impostato all'offset dell'ora locale. |
| [get_Offset](./get_offset/)() const | Ottiene l'offset da UTC. |
| [get_Second](./get_second/)() const | Ottiene la componente secondo dell'oggetto corrente. |
| [get_Ticks](./get_ticks/)() const | Ottiene il numero di tick dell'oggetto corrente. |
| [get_TimeOfDay](./get_timeofday/)() const | Ottiene l'ora del giorno dell'oggetto corrente. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Ottiene il valore [DateTime](../datetime/) che rappresenta la data e l'ora UTC. |
| static [get_UtcNow](./get_utcnow/)() | Ottiene il [DateTimeOffset](./) la cui data e ora sono impostate all'ora UTC corrente e il cui offset è [TimeSpan::Zero](../timespan/zero/). |
| [get_UtcTicks](./get_utcticks/)() const | Restituisce il numero di tick dell'oggetto corrente in ora UTC. |
| [get_Year](./get_year/)() const | Restituisce la componente dell'anno dell'oggetto corrente. |
| [GetHashCode](./gethashcode/)() const | Restituisce il codice hash per l'oggetto [DateTimeOffset](./) corrente. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Determina se l'oggetto corrente e l'oggetto [DateTimeOffset](./) specificato rappresentano valori di data e ora distinti. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Restituisce una nuova istanza della classe [DateTimeOffset](./) che rappresenta il valore di data e ora risultante dalla somma del valore rappresentato dall'oggetto corrente e dell'intervallo di tempo specificato. |
| [operator-](./operator-/)(TimeSpan) const | Restituisce una nuova istanza della classe [DateTimeOffset](./) che rappresenta il valore di data e ora ottenuto sottraendo l'intervallo di tempo specificato dal valore rappresentato dall'oggetto corrente. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Restituisce un'istanza della classe [TimeSpan](../timespan/) che rappresenta l'intervallo di tempo tra i valori di data e ora rappresentati dall'oggetto corrente e da quello specificato. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Determina se l'oggetto corrente rappresenta il valore di data e ora precedente al valore rappresentato dall'oggetto [DateTimeOffset](./) specificato. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Determina se l'oggetto corrente rappresenta il valore di data e ora precedente o uguale al valore rappresentato dall'oggetto [DateTimeOffset](./) specificato. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Determina se l'oggetto corrente e l'oggetto [DateTimeOffset](./) specificato rappresentano lo stesso valore di data e ora. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Determina se l'oggetto corrente rappresenta il valore di data e ora successivo al valore rappresentato dall'oggetto [DateTimeOffset](./) specificato. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Determina se l'oggetto corrente rappresenta il valore di data e ora successivo o uguale al valore rappresentato dall'oggetto [DateTimeOffset](./) specificato. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Converte la stringa specificata in un equivalente [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converte la stringa specificata in un oggetto [DateTimeOffset](./) utilizzando il provider di formato e lo stile di formattazione specificati. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converte la stringa specificata in un oggetto [DateTimeOffset](./) utilizzando il formato, il provider di formato e lo stile di formattazione specificati. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Converte la stringa specificata in un oggetto [DateTimeOffset](./) utilizzando i formati, il provider di formato e lo stile di formattazione specificati. |
| [Subtract](./subtract/)(TimeSpan) const | Sottrae un intervallo di tempo specificato dall'oggetto corrente. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Sottrae un valore [DateTimeOffset](./) specificato dall'oggetto corrente. |
| [ToFileTime](./tofiletime/)() const | Converte l'oggetto corrente nel tempo file [Windows](../../system.windows/). |
| [ToLocalTime](./tolocaltime/)() const | Converte l'oggetto corrente in un oggetto che rappresenta l'ora locale. |
| [ToOffset](./tooffset/)(TimeSpan) const | Sostituisce l'offset dell'oggetto corrente con l'offset specificato. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Converte l'oggetto corrente in una stringa utilizzando il formato e il provider di formato specificati. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Converte l'oggetto corrente in una stringa utilizzando il provider di formato specificato. |
| [ToString](./tostring/)(const String\&) const | Converte l'oggetto corrente in una stringa utilizzando il formato specificato. |
| [ToString](./tostring/)() const | Converte l'oggetto corrente in una stringa. |
| [ToUniversalTime](./touniversaltime/)() const | Converte l'oggetto corrente in un oggetto che rappresenta l'ora UTC. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Ottiene i millisecondi trascorsi dall'inizio dell'epoca Unix. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Ottiene i secondi trascorsi dall'inizio dell'epoca Unix. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Prova a convertire la stringa specificata in un oggetto [DateTimeOffset](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Prova a convertire la stringa specificata in un oggetto [DateTimeOffset](./) usando il provider di formato e lo stile di formattazione specificati. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Prova a convertire la stringa specificata in un oggetto [DateTimeOffset](./) usando i formati, il provider di formato e lo stile di formattazione specificati. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Prova a convertire la stringa specificata in un oggetto [DateTimeOffset](./) usando il formato, il provider di formato e lo stile di formattazione specificati. |
| static [Type](./type/)() | Restituisce un oggetto [TypeInfo](../typeinfo/) che rappresenta la struttura [TimeSpan](../timespan/). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Ottiene l'offset massimo in tick. |
| static [MaxValue](./maxvalue/) | Ottiene il valore più grande di [DateTimeOffset](./). |
| static constexpr [MinOffset](./minoffset/) | Ottiene l'offset minimo in tick. |
| static [MinValue](./minvalue/) | Ottiene il valore più precoce di [DateTimeOffset](./). |
| static [UnixEpoch](./unixepoch/) | Ottiene l'inizio dell'epoca Unix. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
