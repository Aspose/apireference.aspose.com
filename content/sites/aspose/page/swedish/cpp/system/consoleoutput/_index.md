---
title: "System::ConsoleOutput-klass"
linktitle: "ConsoleOutput"
second_title: "Aspose.Page för C++"
description: "System::ConsoleOutput-klass. Representerar standardutmatningsströmmen. Objekt av denna klass bör endast allokeras med hjälp av System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 1500
url: /sv/cpp/system/consoleoutput/
---
## ConsoleOutput class


Representerar standardutmatningsströmmen. Objekt av denna klass bör endast allokeras med hjälp av funktionen [System::MakeObject()](../makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Returnerar alltid ASCII-kodning. |
| [Write](./write/)(bool) override | Skriver ut strängrepresentationen av det angivna bool-värdet till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Skriver ut strängrepresentationen av det angivna objektet till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(char_t) override | Skriver ut det angivna teckenvärdet till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(Decimal) override | Skriver ut strängrepresentationen av [Decimal](../decimal/) värdet till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(double) override | Skriver ut strängrepresentationen av ett dubbelprecision flyttal till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(int32_t) override | Skriver ut strängrepresentationen av ett 32-bitars heltal till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(int64_t) override | Skriver ut strängrepresentationen av ett 64-bitars heltal till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(float) override | Skriver ut strängrepresentationen av ett enkelprecision flyttal till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const String\&) override | Skriver ut det angivna strängobjektet till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(uint32_t) override | Skriver ut strängrepresentationen av ett teckenlöst 32-bitars heltal till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(uint64_t) override | Skriver ut strängrepresentationen av ett teckenlöst 64-bitars heltal till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Skriver ut strängrepresentationen av den angivna teckenarrayen till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Skriver ut strängrepresentationen av ett intervall av värden i den angivna teckenarrayen till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const char_t *) override | Skriver ut den angivna c-strängen till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const TypeInfo\&) override | Skriver ut strängrepresentationen av det angivna [TypeInfo](../typeinfo/) objektet till utmatningsströmmen som representeras av det aktuella objektet. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Skriver ut den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Skriver ut strängrepresentationen av det angivna objektet följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(bool) override | Skriver ut strängrepresentationen av det angivna bool-värdet följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(char_t) override | Skriver ut det angivna teckenvärdet följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(Decimal) override | Skriver ut strängrepresentationen av [Decimal](../decimal/) värdet följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(double) override | Skriver ut strängrepresentationen av ett dubbelprecision flyttal följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(int) override | Skriver ut strängrepresentationen av ett 32-bitars heltal följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(int64_t) override | Skriver ut strängrepresentationen av ett 64-bitars heltal följt av den aktuella radavslutaren till utmatningsströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(float) override | Skriver ut strängrepresentationen av ett enkelprecision flyttal följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const String\&) override | Skriver ut det angivna strängobjektet följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(uint32_t) override | Skriver ut strängrepresentationen av ett osignerat 32-bit heltal följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(uint64_t) override | Skriver ut strängrepresentationen av ett osignerat 64-bit heltal följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Skriver ut strängrepresentationen av den angivna teckenarrayen följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Skriver ut strängrepresentationen av ett intervall av värden i den angivna teckenarrayen följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const char_t *) override | Skriver ut den angivna c-strängen följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Skriver ut strängrepresentationen av det angivna [TypeInfo](../typeinfo/)‑objektet följt av den aktuella radslutet till utströmmen som representeras av det aktuella objektet. |
| [WriteLine](./writeline/)(const char *) |  |
## Se även

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
