---
title: "System::Console‑klass"
linktitle: "Console"
second_title: "Aspose.Page för C++"
description: "System::Console‑klass. Tillhandahåller metoder för att skriva ut data till standardutströmmen. Detta är en statisk typ utan instansfunktioner. Du bör aldrig skapa instanser av den på något sätt i C++."
type: docs
weight: 1400
url: /sv/cpp/system/console/
---
## Console class


Tillhandahåller metoder för att skriva ut data till standardutmatningsströmmen. Detta är en statisk typ utan instansfunktioner. Du bör aldrig skapa instanser av den på något sätt.

```cpp
class Console
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [Beep](./beep/)() | INTE IMPLEMENTERAT. |
| static [get_Error](./get_error/)() | Returnerar en delad pekare som pekar på objektet som representerar standardfelströmmen. |
| static [get_In](./get_in/)() | Returnerar en delad pekare som pekar på objektet som representerar standardindströmmen. |
| static [get_Out](./get_out/)() | Returnerar en delad pekare som pekar på objektet som representerar standardutmatningsströmmen. |
| static [Mute](./mute/)(bool) | Tystar eller återaktiverar standardutmatningsströmmen. |
| static [ReadKey](./readkey/)() | INTE IMPLEMENTERAT. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Tilldelar det angivna objektet till klassens Error‑egenskap. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Sätter In‑egenskapen till det angivna TextReader‑objektet. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Tilldelar det angivna objektet till klassens Out‑egenskap. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Skriver ut strängrepresentationen av det angivna objektet till standardutmatningsströmmen. |
| static [Write](./write/)(bool) | Skriver ut strängrepresentationen av bool‑värdet till standardutmatningsströmmen. |
| static [Write](./write/)(char_t) | Skriver ut det angivna teckenvärdet till standardutmatningsströmmen. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Skriver ut strängrepresentationen av den angivna teckenarrayen till standardutmatningsströmmen. |
| static [Write](./write/)(const Decimal\&) | Skriver ut strängrepresentationen av [Decimal](../decimal/)-värdet till standardutmatningsströmmen. |
| static [Write](./write/)(double) | Skriver ut strängrepresentationen av dubbelprecisionsflyttalvärdet till standardutmatningsströmmen. |
| static [Write](./write/)(float) | Skriver ut strängrepresentationen av enkelprecisionsflyttalvärdet till standardutmatningsströmmen. |
| static [Write](./write/)(int32_t) | Skriver ut strängrepresentationen av 32‑bitars heltalsvärdet till standardutmatningsströmmen. |
| static [Write](./write/)(int64_t) | Skriver ut strängrepresentationen av 64‑bitars heltalsvärdet till standardutmatningsströmmen. |
| static [Write](./write/)(const String\&) | Skriver ut det angivna strängobjektet till standardutmatningsströmmen. |
| static [Write](./write/)(const char_t *) | Skriver ut den angivna c‑strängen till standardutmatningsströmmen. |
| static [Write](./write/)(const TypeInfo\&) | Skriver ut strängrepresentationen av [TypeInfo](../typeinfo/)-värdet till standardutmatningsströmmen. |
| static [Write](./write/)(uint32_t) | Skriver ut strängrepresentationen av osignerat 32‑bitars heltalsvärde till standardutmatningsströmmen. |
| static [Write](./write/)(uint64_t) | Skriver ut strängrepresentationen av osignerat 64‑bitars heltalsvärde till standardutmatningsströmmen. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Skriver ut strängrepresentationen av det angivna intervallet av den angivna teckenarrayen till standardutmatningsströmmen. |
| static [Write](./write/)(const String\&, Args\&&...) | Skriver ut strängrepresentationen av de angivna argumenten formaterade enligt det angivna formatet till standardutmatningsströmmen. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Skriver ut den aktuella radavslutaren till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Skriver ut strängrepresentationen av det angivna objektet följt av den aktuella radavslutaren till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(bool) | Skriver ut strängrepresentationen av bool‑värdet följt av den aktuella radavslutaren till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(char_t) | Skriver ut det angivna teckenvärdet följt av den aktuella radavslutaren till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Skriver ut strängrepresentationen av den angivna teckenarrayen följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const Decimal\&) | Skriver ut strängrepresentationen av [Decimal](../decimal/)‑värdet följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(double) | Skriver ut strängrepresentationen av dubbelprecision flyttalvärde följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(float) | Skriver ut strängrepresentationen av enkelprecision flyttalvärde följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(int32_t) | Skriver ut strängrepresentationen av 32‑bitars heltalsvärde följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(int64_t) | Skriver ut strängrepresentationen av 64‑bitars heltalsvärde följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const String\&) | Skriver ut det angivna strängobjektet följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const char_t *) | Skriver ut den angivna c‑strängen följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Skriver ut strängrepresentationen av [TypeInfo](../typeinfo/)‑värdet följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(uint32_t) | Skriver ut strängrepresentationen av osignerat 32‑bitars heltalsvärde följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(uint64_t) | Skriver ut strängrepresentationen av osignerat 64‑bitars heltalsvärde följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Skriver ut strängrepresentationen av det angivna intervallet av den angivna teckenarrayen följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const Exception\&) | Skriver ut strängrepresentationen av det angivna [Exception](../exception/)‑objektet följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Skriver ut strängrepresentationen av de angivna argumenten formaterade enligt det angivna formatet följt av den aktuella radslutet till standardutmatningsströmmen. |
| static [WriteLine](./writeline/)(const char *) |  |
## Anmärkningar



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Skriv ut hej‑meddelandet.
  Console::WriteLine(u"Hello, world!");

  // Skapa en instans av klassen 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Skriv ut elementen i arrayen.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
