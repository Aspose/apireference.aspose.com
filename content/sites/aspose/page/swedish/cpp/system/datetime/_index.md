---
title: "System::DateTime klass"
linktitle: "DateTime"
second_title: "Aspose.Page för C++"
description: "System::DateTime klass. Representerar ett specifikt datum- och tidsvärde på tidskontinuumet. Denna typ bör allokeras på stacken och skickas till funktioner som värde eller referens. Använd aldrig System::SmartPtr klass för att hantera objekt av denna typ i C++."
type: docs
weight: 1600
url: /sv/cpp/system/datetime/
---
## DateTime class


Representerar ett specifikt datum- och tidsvärde på tidskontinuumet. Denna typ bör allokeras på stacken och skickas till funktioner som värde eller referens. Använd aldrig [System::SmartPtr](../smartptr/) klass för att hantera objekt av denna typ.

```cpp
class DateTime
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Returnerar en ny instans av [DateTime](./) klass som representerar ett datum- och tidsvärde som erhålls genom att lägga till det specificerade tidsintervallet till datum- och tidsvärdet som representeras av det aktuella objektet. |
| [AddDays](./adddays/)(double) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet dagar. |
| [AddHours](./addhours/)(double) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet timmar. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet millisekunder. |
| [AddMinutes](./addminutes/)(double) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet minuter. |
| [AddMonths](./addmonths/)(int) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet månader. |
| [AddSeconds](./addseconds/)(double) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet sekunder. |
| [AddTicks](./addticks/)(int64_t) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det specificerade antalet 100-nanosekundintervall. |
| [AddYears](./addyears/)(int) const | Returnerar en ny instans av [DateTime](./) klass som representerar datum- och tidsvärdet som är lika med det som representeras av det aktuella objektet men med årskomponenten ökad med det specificerade antalet. |
| static [Compare](./compare/)(DateTime, DateTime) | Jämför två värden som representeras av de specificerade instanserna av [DateTime](./) klass och returnerar ett värde som indikerar värdenas relativa positioner på tidslinjen. |
| [CompareTo](./compareto/)(DateTime) const | Jämför två datum- och tidsvärden som representeras av det aktuella objektet och den specificerade instansen av [DateTime](./) klass och returnerar ett värde som indikerar värdenas relativa positioner på tidslinjen. |
| [DateTime](./datetime/)() | Skapar en instans som representerar det minsta möjliga datum- och tidsvärdet, lika med MinValue. |
| [DateTime](./datetime/)(int, int, int) | Skapar en instans som representerar ett datum- och tidsvärde specificerat som ett visst år, månad och dag. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Skapar en instans som representerar ett datum- och tidsvärde specificerat som ett visst år, månad och dag i den specificerade kalendern. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Skapar en instans som representerar ett datum- och tidsvärde angivet som ett specifikt år, månad, dag, timme, minut och sekund. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Skapar en instans som representerar ett datum- och tidsvärde angivet som ett specifikt år, månad, dag, timme, minut och sekund. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Skapar en instans som representerar ett datum- och tidsvärde angivet som ett specifikt år, månad, dag, timme, minut och sekund i den angivna kalendern. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Skapar en instans som representerar ett datum- och tidsvärde angivet som ett specifikt år, månad, dag, timme, minut, sekund och millisekund. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Skapar en instans som representerar ett datum- och tidsvärde angivet som ett specifikt år, månad, dag, timme, minut, sekund och millisekund i den angivna kalendern. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Skapa en instans som representerar ett datum- och tidsvärde angivet som ett antal tick. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Skapa en instans som representerar ett datum- och tidsvärde angivet som ett antal tick. FÖR INTERN ANVÄNDNING. |
| [DateTime](./datetime/)(const DateTime\&) | Kopierar en instans. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Returnerar antalet dagar i den angivna månaden för det angivna året. |
| static [Equals](./equals/)(DateTime, DateTime) | Avgör om de angivna instanserna av [DateTime](./)-klassen representerar samma datum- och tidsvärde. |
| [Equals](./equals/)(DateTime) const | Avgör om den angivna instansen av [DateTime](./)-klassen representerar samma datum- och tidsvärde som det aktuella objektet. |
| static [FromBinary](./frombinary/)(int64_t) | Deserialiserar datum- och tidsvärdet från det angivna osignerade 64-bitars heltalet och sätter den nya instansen av [DateTime](./)-klassen till det värdet. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Konverterar den angivna filtiden till en instans av [DateTime](./)-klassen som representerar samma datum- och tidsvärde som lokal tid. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Konverterar den angivna filtiden till en instans av [DateTime](./)-klassen som representerar samma datum- och tidsvärde som UTC-tid. |
| static [FromOADate](./fromoadate/)(double) | Returnerar en instans av [DateTime](./)-klassen som representerar datum- och tidsvärdet som motsvarar det angivna OLE Automation Date. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Konverterar det angivna Unix-tidsvärdet till en instans av [DateTime](./)-klassen. FÖR INTERN ANVÄNDNING. |
| [get_Date](./get_date/)() const | Returnerar en ny instans av [DateTime](./)-klassen som representerar datumdelen av datumet och tiden som representeras av det aktuella objektet, där varje komponent i tidsdelen är satt till 0. |
| [get_Day](./get_day/)() const | Returnerar det ordningsnummer för dagen i månaden som representeras av det aktuella objektet. |
| [get_DayOfWeek](./get_dayofweek/)() const | Returnerar ett värde som representerar veckodagen som det aktuella objektet representerar. |
| [get_DayOfYear](./get_dayofyear/)() const | Returnerar det ordningsnummer för dagen på året som representeras av det aktuella objektet. |
| [get_Hour](./get_hour/)() const | Returnerar timkomponenten för datum- och tidsvärdet som representeras av det aktuella objektet. |
| [get_Kind](./get_kind/)() const | Returnerar värdet som indikerar om datumet och tiden som representeras av det aktuella objektet är lokalt, UTC eller ingen av delarna. |
| [get_Millisecond](./get_millisecond/)() const | Returnerar millisekundkomponenten för datum- och tidsvärdet som representeras av det aktuella objektet. |
| [get_Minute](./get_minute/)() const | Returnerar minutkomponenten för datum- och tidsvärdet som representeras av det aktuella objektet. |
| [get_Month](./get_month/)() const | Returnerar det ordningsnummer för månaden i året som representeras av det aktuella objektet. |
| static [get_Now](./get_now/)() | Returnerar en instans av [DateTime](./)-klassen som representerar den aktuella tiden som lokal tid. |
| [get_Second](./get_second/)() const | Returnerar den andra komponenten av datum- och tidsvärdet som representeras av det aktuella objektet. |
| [get_Ticks](./get_ticks/)() const | Returnerar ett antal 100‑nanosekundintervall som har passerat sedan 0:00:00 UTC den 1 januari 0001 i den gregorianska kalendern tills datumet och tiden som representeras av det aktuella objektet. |
| [get_TimeOfDay](./get_timeofday/)() const | Returnerar värdet som representerar tidsintervallet från början av dagen som representeras av det aktuella objektet till datum- och tidsvärdet som representeras av det aktuella objektet. |
| static [get_Today](./get_today/)() | Returnerar en instans av klassen [DateTime](./) som representerar det aktuella datumet med varje komponent i tidsdelen av värdet som representeras av objektet satt till 0. |
| static [get_UtcNow](./get_utcnow/)() | Returnerar en instans av klassen [DateTime](./) som representerar den aktuella tiden som UTC. |
| [get_Year](./get_year/)() const | Returnerar året som representeras av det aktuella objektet. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Hämtar datumdelar. FÖR INTERNT BRUK. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Returnerar en array av strängar där varje element är strängrepresentationen av det aktuella objektet formaterad med en av de standardiserade datum- och tidsformatspecifierarna. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Returnerar en array av strängar där varje element är strängrepresentationen av det aktuella objektet formaterad med den angivna standardiserade datum- och tidsformatspecifieraren. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Returnerar en array av strängar där varje element är strängrepresentationen av det aktuella objektet formaterad med en av de standardiserade datum- och tidsformatspecifierarna och den angivna formatleverantören. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Returnerar en array av strängar där varje element är strängrepresentationen av det aktuella objektet formaterad med den angivna standardiserade datum- och tidsformatspecifieraren och formatleverantören. |
| [GetHashCode](./gethashcode/)() const | Returnerar en hashkod för det aktuella objektet. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Avgör om datum- och tidsvärdet som representeras av det aktuella objektet faller inom intervallet för sommartid för den aktuella tidszonen. |
| static [IsLeapYear](./isleapyear/)(int) | Avgör om det angivna året är ett skottår. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Avgör om det aktuella objektet och det angivna [DateTime](./)-objektet representerar olika datum- och tidsvärden. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Returnerar en ny instans av klassen [DateTime](./) som representerar datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det angivna tidsintervallet. |
| [operator+=](./operator+=/)(TimeSpan) | Sätter det aktuella objektet till datum- och tidsvärdet som är summan av värdet som representeras av det aktuella objektet och det angivna tidsintervallet. |
| [operator-](./operator-/)(TimeSpan) const | Returnerar en ny instans av klassen [DateTime](./) som representerar datum- och tidsvärdet som är resultatet av subtraktion av det angivna tidsintervallet från värdet som representeras av det aktuella objektet. |
| [operator-](./operator-/)(DateTime) const | Returnerar en instans av klassen [TimeSpan](../timespan/) som representerar tidsintervallet mellan datum- och tidsvärdena som representeras av det aktuella och det angivna objektet. |
| [operator-=](./operator-=/)(TimeSpan) | Sätter det aktuella objektet till datum- och tidsvärdet som är resultatet av subtraktion av det angivna tidsintervallet från datum- och tidsvärdet som representeras av det aktuella objektet. |
| [operator<](./operator_/)(DateTime) const | Avgör om det aktuella objektet representerar datum- och tidsvärdet som är tidigare än värdet som representeras av det angivna [DateTime](./)-objektet. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Avgör om det aktuella objektet representerar datum- och tidsvärdet som är tidigare än eller samma som värdet som representeras av det angivna [DateTime](./)-objektet. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Tilldelar värdet som representeras av den angivna [DateTime](./)-instansen till det aktuella objektet. |
| [operator==](./operator==/)(DateTime) const | Avgör om det aktuella objektet och det angivna [DateTime](./)-objektet representerar samma datum- och tidsvärde. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Avgör om det aktuella objektet representerar datum- och tidsvärdet som är senare än värdet som representeras av det angivna [DateTime](./)-objektet. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Avgör om det aktuella objektet representerar datum- och tidsvärdet som är senare än eller samma som värdet som representeras av det angivna [DateTime](./)-objektet. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt med hjälp av kulturspecifik formatinformation. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt med den angivna formatet och kulturspecifik formatinformation. Formatet för strängrepresentationen måste exakt matcha det angivna formatet. Kastar ett undantag om konverteringen misslyckas. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt med de angivna formaten, kulturspecifik formatinformation och stil. Formatet för strängrepresentationen måste exakt matcha ett eller flera av de angivna formaten. Kastar ett undantag om konverteringen misslyckas. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Skapar ett nytt [DateTime](./)-objekt som representerar samma antal tickar som det angivna [DateTime](./)-objektet och representerar lokal tid, UTC-tid eller ingen av dem enligt argumentet **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | Returnerar en ny instans av klassen [DateTime](./) som representerar datum- och tidsvärdet som är resultatet av subtraktion av det angivna tidsintervallet från värdet som representeras av det aktuella objektet. |
| [Subtract](./subtract/)(DateTime) const | Returnerar en instans av klassen [TimeSpan](../timespan/) som representerar tidsintervallet mellan datum- och tidsvärdena som representeras av det aktuella och det angivna objektet. |
| [ToBinary](./tobinary/)() const | Serialiserar det aktuella objektet. |
| [ToFileTime](./tofiletime/)() const | Returnerar ett värde som representerar datum- och tidsvärdet som det aktuella objektet representerar som filtid. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Konverterar datum- och tidsvärdet som det aktuella objektet representerar till filtid UTC. |
| [ToLocalTime](./tolocaltime/)() const | Returnerar en ny instans av klassen [DateTime](./) som representerar datum- och tidsvärdet som det aktuella objektet representerar som lokal tid. |
| [ToLongDateString](./tolongdatestring/)() const | Returnerar en sträng som innehåller den långa datumsträngrepresentationen av det aktuella objektet. |
| [ToLongTimeString](./tolongtimestring/)() const | Returnerar en sträng som innehåller den långa tidssträngrepresentationen av det aktuella objektet. |
| [ToOADate](./tooadate/)() const | Returnerar datum- och tidsvärdet som det aktuella objektet representerar som OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | Returnerar en sträng som innehåller den korta datumsträngrepresentationen av det aktuella objektet. |
| [ToShortTimeString](./toshorttimestring/)() const | Returnerar en sträng som innehåller den korta tidssträngrepresentationen av det aktuella objektet. |
| [ToString](./tostring/)() const | Returnerar strängrepresentationen av datum- och tidsvärdet som det aktuella objektet representerar med de formateringskonventioner som definieras av den aktuella kulturen. |
| [ToString](./tostring/)(const String\&) const | Returnerar en strängrepresentation av datum- och tidsvärdet som det aktuella objektet representerar med det angivna formatet och de formateringskonventioner som definieras av den aktuella kulturen. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Returnerar en strängrepresentation av datum- och tidsvärdet som det aktuella objektet representerar med den angivna formatinformationen. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Returnerar en strängrepresentation av datum- och tidsvärdet som det aktuella objektet representerar med den angivna formatinformationen. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Returnerar en ny instans av klassen [DateTime](./) som representerar datum- och tidsvärdet som det aktuella objektet representerar som UTC. |
| [ToUnixTime](./tounixtime/)() const | Returnerar ett värde som representerar datum- och tidsvärdet som det aktuella objektet representerar som Unix-tid. FÖR INTERNT ANVÄNDANDE. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt med den angivna kulturspecifika formatinformationen och stil. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt med det angivna formatet, kulturspecifik formatinformation och stil. Formatet för strängrepresentationen måste exakt matcha det angivna formatet. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Konverterar den angivna strängrepresentationen av ett datum- och tidsvärde till motsvarande [DateTime](./)-objekt med de angivna formaten, kulturspecifik formatinformation och stil. Formatet för strängrepresentationen måste exakt matcha ett eller flera av de angivna formaten. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Returnerar ett [TypeInfo](../typeinfo/)-objekt som innehåller information om denna klass. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Antalet 100-nanosekund i tidsintervallet mellan det minsta möjliga och största möjliga [DateTime](./)-värdet. |
| static [MaxValue](./maxvalue/) | En instans av klassen [DateTime](./) som representerar det största möjliga datum- och tidsvärdet. |
| static constexpr [MinTicks](./minticks/) | Det minsta antalet tick som en instans av [DateTime](./) klass kan representera. |
| static [MinValue](./minvalue/) | En instans av [DateTime](./) klass som representerar det minsta möjliga datum- och tidsvärdet. |
| static constexpr [TicksPerDay](./ticksperday/) | Antalet tick på en dag. |
| static constexpr [TicksPerHour](./ticksperhour/) | Antalet tick på en timme. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Antalet tick på en mikrosekund. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Antalet tick på en millisekund. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Antalet tick på en minut. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Antalet tick på en sekund. |
| static [UnixEpoch](./unixepoch/) | En instans av [DateTime](./) klass som representerar Unix-epokens start (1970.01.01 00:00:00). |
## Anmärkningar



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Skapa en 'DateTime'-klassinstans.
  DateTime dateTime{1990, 10, 30};

  // Skriv ut instansen i flera format.
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

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
